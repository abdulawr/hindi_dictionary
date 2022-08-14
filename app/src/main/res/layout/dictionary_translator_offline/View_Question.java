package ss.technology.hindi_dictionary;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class View_Question extends AppCompatActivity {

    ArrayList<Request_word_container> list;
    RecyclerView view;
    Request_word_List request_word_list;
    TextView show_hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__question);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

         MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) { }
        });

        adContainerView = findViewById(R.id.ad_view_container);
        // Step 1 - Create an AdView and set the ad unit ID on it.
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-7611672890241421/6213533564");
        adContainerView.addView(adView);
        loadBanner();

        show_hide=(TextView) findViewById(R.id.no_data);

        list=new ArrayList<>();
        Request_List();
         view=(RecyclerView) findViewById(R.id.recycleview);


        final SwipeRefreshLayout pullToRefresh = findViewById(R.id.pullToRefresh);
        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {


                try{
                    list.clear();
                    request_word_list.notifyDataSetChanged();
                    Request_List();
                    pullToRefresh.setRefreshing(false);
                }
                catch (Exception e)
                {
                    pullToRefresh.setRefreshing(false);
                    Toast.makeText(View_Question.this, "Empty!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return true;
    }


    void Request_List()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(View_Question.this);
        LayoutInflater inflater = (View_Question.this).getLayoutInflater();
        final View viewss = inflater.inflate(R.layout.loading, null);
        builder.setView(viewss);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        String url="https://sstechnologyapps.000webhostapp.com/request_get.php";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest
                jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response)
            {
                alertDialog.dismiss();
                try {
                    JSONArray array=response.getJSONArray("response");
                    for (int i = 0; i < array.length(); i++)
                    {
                        if(!array.getJSONObject(i).getString("lang2").equals(""))
                        {
                            Request_word_container container=new Request_word_container();
                            container.setWord( array.getJSONObject(i).getString("word"));
                            container.setLang1( array.getJSONObject(i).getString("lang1"));
                            container.setLang2( array.getJSONObject(i).getString("lang2"));
                            container.setId(Integer.parseInt(array.getJSONObject(i).getString("id")));
                            list.add(container);
                        }

                        }

                    if (list.size() > 0)
                    {
                        request_word_list=new Request_word_List(View_Question.this,list);
                        view.setHasFixedSize(true);
                        view.setLayoutManager(new LinearLayoutManager(View_Question.this));
                        view.setAdapter(request_word_list);
                    }
                    else{
                        view.setVisibility(View.GONE);
                        show_hide.setVisibility(View.VISIBLE);
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        alertDialog.dismiss();
                        Toast.makeText(View_Question.this, "Network error close activity and try again.", Toast.LENGTH_SHORT).show();
                    }
                });
        requestQueue.add(jsonObjectRequest);
    }

}

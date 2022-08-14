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

public class View_Answer extends AppCompatActivity {

    ArrayList<View_Ans_Container> list;
    RecyclerView view;
    View_Ans_Adapter adapter;
    TextView show_hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__answer);


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

                try
                {
                    list.clear();
                    adapter.notifyDataSetChanged();
                    Request_List();
                    pullToRefresh.setRefreshing(false);
                }
                catch (Exception e)
                {
                    pullToRefresh.setRefreshing(false);
                    Toast.makeText(View_Answer.this, "Empty!", Toast.LENGTH_SHORT).show();
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
        final String lang= SharePreference_Store.getValue(View_Answer.this);

        AlertDialog.Builder builder = new AlertDialog.Builder(View_Answer.this);
        LayoutInflater inflater = (View_Answer.this).getLayoutInflater();
        final View viewss = inflater.inflate(R.layout.loading, null);
        builder.setView(viewss);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        String url="https://sstechnologyapps.000webhostapp.com/viewans.php";
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
                        if(!array.getJSONObject(i).getString("lang2").equals("") && !array.getJSONObject(i).getString("ans").equals(""))
                        {
                            View_Ans_Container container=new View_Ans_Container();
                            container.setName(array.getJSONObject(i).getString("name"));
                            container.setLang1( array.getJSONObject(i).getString("lang1"));
                            container.setLang2( array.getJSONObject(i).getString("lang2"));
                            container.setAns( array.getJSONObject(i).getString("ans"));
                            container.setDate( array.getJSONObject(i).getString("date"));
                            container.setQuestion( array.getJSONObject(i).getString("word"));
                            list.add(container);
                        }

                    }

                    if (list.size() > 0)
                    {
                        adapter=new View_Ans_Adapter(View_Answer.this,list);
                        view.setHasFixedSize(true);
                        view.setLayoutManager(new LinearLayoutManager(View_Answer.this));
                        view.setAdapter(adapter);
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
                        Toast.makeText(View_Answer.this, "Network error close activity and try again.", Toast.LENGTH_SHORT).show();
                    }
                });
        requestQueue.add(jsonObjectRequest);
    }
}

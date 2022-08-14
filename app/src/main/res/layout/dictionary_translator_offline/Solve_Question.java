package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solve_Question extends AppCompatActivity {

    TextView question,lang1,lang2,submit,error;
    EditText Ans,names;
    String date;
    Request_word_container list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve__question);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        question=(TextView) findViewById(R.id.question);
        lang1=(TextView) findViewById(R.id.lang1);
        lang2=(TextView) findViewById(R.id.lang2);
        Ans=(EditText) findViewById(R.id.ans);
        names=(EditText) findViewById(R.id.name);
        submit=(TextView) findViewById(R.id.submit);
        error=(TextView) findViewById(R.id.error);



        Intent i = getIntent();
        final Request_word_container list = (Request_word_container)i.getSerializableExtra("obj");

        if (list != null)
        {
            question.setText(list.getWord());
            lang1.setText(list.getLang1());
            lang2.setText(list.getLang2());
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String na=names.getText().toString();
                String ans=Ans.getText().toString();

                try{
                    if (!na.equals("") && !ans.equals(""))
                    {
                        date=new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                        Request(list.getWord(),ans,na,list.getLang1(),list.getLang2(),date,String.valueOf(list.getId()));
                    }
                    else {
                        error.setVisibility(View.VISIBLE);
                        error.setText("Fill the form correctly!");
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Solve_Question.this, "Something went wrong please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    // when button is click

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
        {
           finish();
        }
        return true;
    }


    void Request(final String word, final String ans, final String name, final String lang1, final String lang2, final String date, final String id)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Solve_Question.this);
        LayoutInflater inflater = (Solve_Question.this).getLayoutInflater();
        View viewss = inflater.inflate(R.layout.loading, null);
        builder.setView(viewss);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        RequestQueue queue = Volley.newRequestQueue(Solve_Question.this);
        StringRequest sr = new StringRequest(Request.Method.POST,"https://sstechnologyapps.000webhostapp.com/solve.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Ans.getText().clear();
                names.getText().clear();
                Toast.makeText(Solve_Question.this, response, Toast.LENGTH_SHORT).show();
                delete(id,alertDialog);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                alertDialog.dismiss();
                Toast.makeText(Solve_Question.this, "Something went wrong try again.", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("word",word);
                params.put("ans",ans);
                params.put("name",name);
                params.put("lang1",lang1);
                params.put("lang2",lang2);
                params.put("date",date);
                return params;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                params.put("Content-Type","application/x-www-form-urlencoded");
                return params;
            }
        };
        queue.add(sr);
    }

    boolean checkNetwork(Context ctx)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) ctx
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if ((connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE) != null && connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED)
                || (connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI) != null && connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI)
                .getState() == NetworkInfo.State.CONNECTED)) {
            return true;
        } else {
            return false;
        }
    }


    void delete(final String id, final AlertDialog alertDialog) {

        RequestQueue queue = Volley.newRequestQueue(Solve_Question.this);
        StringRequest sr = new StringRequest(Request.Method.POST,"https://sstechnologyapps.000webhostapp.com/delete_entry.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                alertDialog.dismiss();
                finish();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                alertDialog.dismiss();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("id",id);
                return params;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                params.put("Content-Type","application/x-www-form-urlencoded");
                return params;
            }
        };
        queue.add(sr);
    }

}

package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.HashMap;
import java.util.Map;

public class Request_Word extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request__word);

        Bundle intent=getIntent().getExtras();
        if (intent != null)
        {
            Request_Word(null);
        }

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

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }



    public void View_Question(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(Request_Word.this,View_Question.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                Intent intent=new Intent(Request_Word.this,View_Question.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void View_Answer(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(Request_Word.this,View_Answer.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                Intent intent=new Intent(Request_Word.this,View_Answer.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }



    public void Request_Word(View view) {

       AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (this).getLayoutInflater();
        View viewss=inflater.inflate(R.layout.request_world, null);
        builder.setTitle("Request words");
        builder.setMessage("Please enter word you want to request and check your network before submitting the form.");
        builder.setCancelable(false);
        builder.setIcon(R.drawable.vocabulary);
        builder.setView(viewss);
        final AlertDialog alertDialog = builder.create();
        Button save=(Button) viewss.findViewById(R.id.save);
        Button close=(Button ) viewss.findViewById(R.id.close);
        final EditText text = viewss.findViewById(R.id.text);
        final TextView error=(TextView) viewss.findViewById(R.id.error);
        final Spinner lang1=(Spinner) viewss.findViewById(R.id.lang1);
        final Spinner lang2=(Spinner) viewss.findViewById(R.id.lang2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check=checkNetwork(getApplicationContext());
                if (check)
                {
                    String value=text.getText().toString();
                    String l1=lang1.getSelectedItem().toString();
                    String l2=lang2.getSelectedItem().toString();
                    if (value.equals(""))
                    {
                        error.setVisibility(View.VISIBLE);
                    }
                    else {
                        try{
                            insert(value,l1,l2);
                            alertDialog.dismiss();
                        }
                        catch (Exception e){
                            Toast.makeText(Request_Word.this, "Please enter correct word and try again.", Toast.LENGTH_SHORT).show();
                            alertDialog.dismiss();
                        }
                    }
                }
                else {

                    Toast.makeText(Request_Word.this, "Check your network and try again.", Toast.LENGTH_SHORT).show();
                    alertDialog.dismiss();
                }

            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();

    }


    void insert(final String value,final String l1,final String l2) {

        RequestQueue queue = Volley.newRequestQueue(Request_Word.this);
        StringRequest sr = new StringRequest(Request.Method.POST,"https://sstechnologyapps.000webhostapp.com/insert.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Request_Word.this, response, Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Request_Word.this, "Something went wrong try again.", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("word",value);
                params.put("lang1",l1);
                params.put("lang2",l2);
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

}

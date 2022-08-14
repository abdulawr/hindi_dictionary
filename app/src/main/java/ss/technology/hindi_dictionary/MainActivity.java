package ss.technology.hindi_dictionary;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Main_screen_to_recycleview_Activity adapter1;
    RecyclerView recyclerView1;
    private InterstitialAd mInterstitialAd;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

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

        recyclerView1=(RecyclerView) findViewById(R.id.recycleview1);
        ArrayList<String> top_arraylist=new ArrayList<>();
        top_arraylist.add("https://i.ibb.co/7WmpgbR/Image-can-t-be-loaded-Check-internet-connection-2.png");
        top_arraylist.add("https://i.ibb.co/B2c66xg/Image-can-t-be-loaded-Check-internet-connection.png");
        top_arraylist.add("https://i.ibb.co/2MrnT6x/Image-can-t-be-loaded-Check-internet-connection-1.png");
        top_arraylist.add("https://i.ibb.co/XFmh2Gz/Image-can-t-be-loaded-Check-internet-connection.png");
        top_arraylist.add("https://i.ibb.co/9NMvxWV/Image-can-t-be-loaded-Check-internet-connection-1.png");
        top_arraylist.add("https://i.ibb.co/qFkpYHv/Image-can-t-be-loaded-Check-internet-connection-2.png");

        ArrayList<String> top_title=new ArrayList<>();
        top_title.add("Best Offline Dictionary");
        top_title.add("Smart Translator Online");
        top_title.add("Learn Conversation");
        top_title.add("MCQS Quiz");
        top_title.add("Learn Vocabulary");
        top_title.add("Save Favourite Word");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        adapter1=new Main_screen_to_recycleview_Activity (this,top_arraylist,top_title);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(adapter1);



    }

    // Click on top circle icons

    public void Circle_Learn(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity.this,Learn.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity.this,Learn.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }
        });
    }

    public void Circle_Favourite(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            startActivity(new Intent(MainActivity.this,Favourite.class));
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                startActivity(new Intent(MainActivity.this,Favourite.class));
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Click_Vocabulary(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity.this,Vocabulary.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity.this,Vocabulary.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void Click_Idioms(View view) {
        Intent intent=new Intent(MainActivity.this,Phrases_Activity.class);
        startActivity(intent);
    }

    public void Click_Verb_Form(View view) {

        Intent intent =new Intent(MainActivity.this,WebPage_Viewer.class);
        intent.putExtra("links","form_of_verbs");
        intent.putExtra("title","English verbs forms");
        startActivity(intent);
    }

    public void Click_Conversation(View view) {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity.this,Conversation.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity.this,Conversation.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void Contact_us(View view) {

        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{  "tcomprog@gmail.com"});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Write your subject");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Add you message in details");

        emailIntent.setType("message/rfc822");

        try {
            startActivity(Intent.createChooser(emailIntent,
                    "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this,
                    "No email clients installed.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void Privacy(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(getApplicationContext(),Privacy.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(getApplicationContext(),Privacy.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }




    public void Card_Translator(View view) {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(getApplicationContext(),Translator.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(getApplicationContext(),Translator.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Dictionay(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(getApplicationContext(),Dictionary.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(getApplicationContext(),Dictionary.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void Request_Word_feature(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(getApplicationContext(),MCQS.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(getApplicationContext(),MCQS.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    private void loadBanner() {
        // Create an ad request. Check your logcat output for the hashed device ID
        // to get test ads on a physical device, e.g.,
        // "Use AdRequest.Builder.addTestDevice("ABCDE0123") to get test ads on this
        // device."
        AdRequest adRequest =
                new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                        .build();

        AdSize adSize = getAdSize();
        // Step 4 - Set the adaptive ad size on the ad view.
        adView.setAdSize(adSize);

        // Step 5 - Start loading the ad in the background.
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        // Step 2 - Determine the screen width (less decorations) to use for the ad width.
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        // Step 3 - Get adaptive ad size and return for setting on the ad view.
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }

}

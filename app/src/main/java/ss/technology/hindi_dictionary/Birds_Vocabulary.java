package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class Birds_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds__vocabulary);



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

        RecyclerView view=(RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list=new ArrayList<>();


        Data_Container c1 = new Data_Container();
        c1.setEnglish("Crow");
        c1.setHindi("कौआ");
        list.add(c1);

// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Raven");
        c11.setHindi("काला कौआ");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Parrot");
        c12.setHindi("तोता");
        list.add(c12);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Peacock");
        c2.setHindi("मोर");
        list.add(c2);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Sparrow");
        c4.setHindi("गौरैया");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Goose");
        c5.setHindi("बत्तख");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Ostrich");
        c6.setHindi("शुतुरमुर्ग");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Pigeon");
        c7.setHindi("कबूतर");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Turkey");
        c8.setHindi("तुर्की");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Hawk");
        c9.setHindi("बाज़");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Bald eagle");
        c10.setHindi("गंजा ईगल");
        list.add(c10);




        Data_Container c13 = new Data_Container();
        c13.setEnglish("Flamingo");
        c13.setHindi("मराल");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Seagull");
        c14.setHindi("गंगा-चिल्ली");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Swallow");
        c15.setHindi("निगलना");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Blackbird");
        c16.setHindi("ब्लेकबेर्द");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Penguin");
        c17.setHindi("पेंगुइन");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Robin bird");
        c18.setHindi("रॉबिन पक्षी");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Swan");
        c19.setHindi("हंस");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Owl");
        c20.setHindi("उल्लू");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Stork");
        c21.setHindi("सारस");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Woodpecker");
        c22.setHindi("कठफोड़वा");
        list.add(c22);


        adapter=new Phrases_Recycle_Adapter(this, list);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
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

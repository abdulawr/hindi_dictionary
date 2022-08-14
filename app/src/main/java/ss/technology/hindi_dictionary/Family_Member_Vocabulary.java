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

public class Family_Member_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__member__vocabulary);



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



        Data_Container c4 = new Data_Container();
        c4.setEnglish("Grandfather");
        c4.setHindi("दादा");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Grandmother");
        c5.setHindi("दादी मा");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Uncle");
        c6.setHindi("चाचा");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Aunt");
        c7.setHindi("चाची");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Father");
        c8.setHindi("पिता");
        list.add(c8);



        Data_Container c10 = new Data_Container();
        c10.setEnglish("Sister");
        c10.setHindi("बहन");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Brother-in-law");
        c11.setHindi("बहनोई");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Brother");
        c12.setHindi("भाई");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Sister-in-law");
        c13.setHindi("ननद");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Husband");
        c14.setHindi("पति");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Wife");
        c15.setHindi("पत्नी");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Cousin");
        c16.setHindi("चचेरा भाई");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Cousin’s wife");
        c17.setHindi("चचेरे भाई की पत्नी");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Nephew");
        c18.setHindi("भतीजा");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Niece");
        c19.setHindi("भांजी");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Son");
        c20.setHindi("बेटा");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Daughter-in-law");
        c21.setHindi("बहु");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Daughter");
        c22.setHindi("बेटी");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Grandson");
        c23.setHindi("पोता");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Granddaughter");
        c24.setHindi("प्रेमिका");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Girlfriend");
        c25.setHindi("प्रेमिका");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Teen");
        c26.setHindi("सगाई");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Marriage");
        c27.setHindi("सगाई");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Engagement");
        c28.setHindi("सगाई");
        list.add(c28);


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

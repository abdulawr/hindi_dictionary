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

public class Vehicles_Vocablulary extends AppCompatActivity {

    RecyclerView view;
    private FrameLayout adContainerView;
    private AdView adView;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles__vocablulary);


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


        Data_Container c2 = new Data_Container();
        c2.setEnglish("Streetcar");
        c2.setHindi("ट्राम");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Truck");
        c3.setHindi("ट्रक");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Train");
        c4.setHindi("रेल गाडी");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Tractor");
        c5.setHindi("ट्रैक्टर");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Taxi");
        c6.setHindi("टैक्सी");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Subway");
        c7.setHindi("भूमिगत मार्ग");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Rowboat");
        c8.setHindi("नाव");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Motorcycle");
        c9.setHindi("मोटरसाइकिल");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Helicopter");
        c10.setHindi("हेलीकॉप्टर");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Caravan");
        c11.setHindi("कारवां");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Crane");
        c12.setHindi("क्रेन");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Carriage");
        c13.setHindi("गाड़ी");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Bus");
        c14.setHindi("बस");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Boat");
        c15.setHindi("नाव");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Bicycle");
        c16.setHindi("साइकिल");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Ambulance");
        c17.setHindi("रोगी वाहन");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Airplane");
        c18.setHindi("विमान");
        list.add(c18);


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

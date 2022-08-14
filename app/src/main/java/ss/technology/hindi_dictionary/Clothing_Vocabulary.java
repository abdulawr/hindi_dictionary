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

public class Clothing_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing__vocabulary);


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
        c4.setEnglish("Coat");
        c4.setHindi("कोट");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Jeans");
        c5.setHindi("जीन्स");
        list.add(c5);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("T-shirt");
        c1.setHindi("टीशर्ट");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sweater");
        c2.setHindi("स्वेटर");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Jacket");
        c3.setHindi("जैकेट");
        list.add(c3);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Socks");
        c6.setHindi("मोज़े");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Shorts");
        c7.setHindi("निकर");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Tracksuit");
        c8.setHindi("ट्रैक");
        list.add(c8);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Shoes");
        c11.setHindi("जूते");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Skirt");
        c12.setHindi("स्कर्ट");
        list.add(c12);

        Data_Container c9 = new Data_Container();
        c9.setEnglish("Vest");
        c9.setHindi("बनियान");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Pyjamas");
        c10.setHindi("पाजामा");
        list.add(c10);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Dress");
        c13.setHindi("पोशाक");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Heels");
        c14.setHindi("हील");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Tie");
        c15.setHindi("गुलोबन्द");
        list.add(c15);

        Data_Container c20 = new Data_Container();
        c20.setEnglish("Earring");
        c20.setHindi("कान की बाली");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Belt");
        c21.setHindi("बेल्ट");
        list.add(c21);

        Data_Container c16 = new Data_Container();
        c16.setEnglish("Sun hat");
        c16.setHindi("धूप की टोपी");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Scarf");
        c17.setHindi("दुपट्टा");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Glasses");
        c18.setHindi("चश्मा");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Bag");
        c19.setHindi("बैग");
        list.add(c19);


        Data_Container c22 = new Data_Container();
        c22.setEnglish("Necklace");
        c22.setHindi("हार");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Wallet");
        c23.setHindi("बटुआ");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Handkerchief");
        c24.setHindi("रूमाल");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Suit");
        c25.setHindi("सूट");
        list.add(c25);


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

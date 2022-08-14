package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.widget.FrameLayout;

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

public class Animals_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals__vocabulary);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

        RecyclerView view = (RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list = new ArrayList<>();

        Data_Container c10 = new Data_Container();
        c10.setEnglish("Ducks");
        c10.setHindi("बतख");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Pig");
        c11.setHindi("सूअर");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Goat");
        c12.setHindi("बकरा");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Crab");
        c13.setHindi("केकड़ा");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Deer");
        c14.setHindi("हिरन");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Sheep");
        c15.setHindi("भेड़");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Fish");
        c16.setHindi("मछली");
        list.add(c16);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Dog");
        c1.setHindi("कुत्ता");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Puppy");
        c2.setHindi("कुत्ते का बच्चा");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Rabbit");
        c3.setHindi("खरगोश");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Parrot");
        c4.setHindi("तोता");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Cat");
        c5.setHindi("बिल्ली");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Goldfish");
        c6.setHindi("ज़र्द मछली");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Mouse");
        c7.setHindi("माउस");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Hamste");
        c8.setHindi("हम्सटर");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Cow");
        c9.setHindi("गाय");

        list.add(c9);

        Data_Container c17 = new Data_Container();
        c17.setEnglish("Turkey");
        c17.setHindi("तुर्की");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Chicken");
        c18.setHindi("मुर्गी");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Horse");
        c19.setHindi("घोड़ा");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Donkey");
        c20.setHindi("Donkey");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Tiger");
        c21.setHindi("बाघ");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Lion");
        c22.setHindi("सिंह");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Panda");
        c23.setHindi("पांडा");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Elephant");
        c24.setHindi("हाथी");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Bear");
        c25.setHindi("भालू");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Monkey");
        c26.setHindi("बंदर");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Fox");
        c27.setHindi("लोमड़ी");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Hedgehong");
        c28.setHindi("कांटेदार जंगली चूहा");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Camel");
        c29.setHindi("ऊंट");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Buffalo");
        c30.setHindi("भेंस");
        list.add(c30);


// 31 --- 40

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Koala");
        c31.setHindi("कोअला");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Raccoon");
        c32.setHindi("एक प्रकार का जानवर");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Dolphin");
        c33.setHindi("डॉल्फिन");
        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Lizard");
        c34.setHindi("छिपकली");

        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Walrus");
        c35.setHindi("वालरस");
        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Lobster");
        c36.setHindi("झींगा मछली");
        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Coral");
        c37.setHindi("मूंगा");
        list.add(c37);

        Data_Container c38 = new Data_Container();
        c38.setEnglish("Ox");
        c38.setHindi("बैल");
        list.add(c38);


        Data_Container c39 = new Data_Container();
        c39.setEnglish("Shrimp");
        c39.setHindi("झींगा");
        list.add(c39);


        Data_Container c40 = new Data_Container();
        c40.setEnglish("Giraffe");
        c40.setHindi("जिराफ़");
        list.add(c40);



        adapter = new Phrases_Recycle_Adapter(this, list);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

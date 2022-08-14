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

public class Food_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__vocabulary);


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
        c1.setEnglish("Salad");
        c1.setHindi("सलाद");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sandwich");
        c2.setHindi("सैंडविच");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Water");
        c3.setHindi("पानी");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Bread");
        c4.setHindi("रोटी");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Steak");
        c5.setHindi("स्टेक");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Milk");
        c6.setHindi("दूध");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Fish");
        c7.setHindi("मछली");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Ice Cream");
        c8.setHindi("आइसक्रीम");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Tea");
        c9.setHindi("चाय");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Coffee");
        c10.setHindi("कॉफ़ी");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Rice");
        c11.setHindi("चावल");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Spaghetti");
        c12.setHindi("स्पघेटी");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Pizza");
        c13.setHindi("पिज़्ज़ा");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Eggs");
        c14.setHindi("अंडे");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Cheese");
        c15.setHindi("पनीर");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Juice");
        c16.setHindi("रस");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Candy");
        c17.setHindi("कैंडी");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Cookie");
        c18.setHindi("CakeCookie");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Cake");
        c19.setHindi("केक");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Wheat");
        c20.setHindi("गेहूँ");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Salt");
        c21.setHindi("नमक");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Mustard");
        c22.setHindi("सरसों");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Butter");
        c23.setHindi("मक्खन");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Soups");
        c24.setHindi("सूप");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Potato Sticks");
        c25.setHindi("आलू की छड़ें");
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

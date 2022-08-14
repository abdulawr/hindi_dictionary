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

public class Vegetiable_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetiable__vocabulary);

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


        Data_Container c21 = new Data_Container();
        c21.setEnglish("Spring Onions");
        c21.setHindi("वसंत प्याज");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Corn");
        c22.setHindi("मक्का");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Pumpkin");
        c23.setHindi("कद्दू");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Artichoke");
        c24.setHindi("हाथी चक");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Heirloom Tomato");
        c25.setHindi("हीरूम टमाटर");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Kale");
        c26.setHindi("गोभी");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Green bell pepper");
        c27.setHindi("हरी शिमला मिर्च");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Ginger");
        c28.setHindi("अदरक");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Lima Bean");
        c29.setHindi("सेम फली");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Turnip");
        c30.setHindi("शलजम");
        list.add(c30);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Potato");
        c1.setHindi("आलू");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sweet corn");
        c2.setHindi("स्वीट कॉर्न");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Green bean");
        c3.setHindi("हरी फली");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Broccoli");
        c4.setHindi("ब्रोकोली");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Garlic");
        c5.setHindi("लहसुन");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Sweet potato");
        c6.setHindi("शकरकंद");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Carrot");
        c7.setHindi("गाजर");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Cucumber");
        c8.setHindi("खीरा");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Spinach");
        c9.setHindi("पालक");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Onion");
        c10.setHindi("प्याज");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Mushroom");
        c11.setHindi("मशरूम");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Cauliflower");
        c12.setHindi("गोभी");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Pea");
        c13.setHindi("मटर");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Bell pepper");
        c14.setHindi("शिमला मिर्च");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Red bell pepper");
        c15.setHindi("");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Olives");
        c16.setHindi("जैतून");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Cabbage");
        c17.setHindi("पत्ता गोभी");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Avocado");
        c18.setHindi("एवोकाडो");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Celery");
        c19.setHindi("अजवायन");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Beet");
        c20.setHindi("चुकंदर");
        list.add(c20);


// 21 -- 30


// 31 --- 40

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Radish");
        c31.setHindi("मूली");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Arugula");
        c32.setHindi("आर्गुला");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Chili pepper");
        c33.setHindi("लाल मिर्च");
        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Rhubarb");
        c34.setHindi("एक प्रकार का फल");
        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Fennel");
        c35.setHindi("सौंफ");
        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Jackfruit");
        c36.setHindi("कटहल");
        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Radicchio");
        c37.setHindi("radicchio");
        list.add(c37);


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

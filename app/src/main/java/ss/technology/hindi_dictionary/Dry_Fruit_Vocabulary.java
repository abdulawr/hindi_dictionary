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

public class Dry_Fruit_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry__fruit__vocabulary);


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
        c1.setEnglish("Almonds");
        c1.setHindi("???????????????");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Pistachio");
        c2.setHindi("??????????????????");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Walnuts");
        c3.setHindi("???????????????");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Areca Nut");
        c4.setHindi("??????????????????");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Cashew Nut");
        c5.setHindi("????????????");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Raisins");
        c6.setHindi("??????????????????");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Pine nuts");
        c7.setHindi("???????????? ????????????");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Dried Apricot");
        c8.setHindi("???????????? ??????????????????");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Dried Figs");
        c9.setHindi("???????????? ???????????????");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Peanuts");
        c10.setHindi("?????????????????????");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Cantaloupe Seeds");
        c11.setHindi("???????????????????????? ?????????");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Dates Dried");
        c12.setHindi("???????????? ????????????");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Flax Seeds");
        c13.setHindi("???????????? ?????? ?????????");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Chestnut");
        c14.setHindi("?????????????????????");
        list.add(c14);


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

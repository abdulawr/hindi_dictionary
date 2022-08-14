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

public class Disease_Vocabulary extends AppCompatActivity {
    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease__vocabulary);

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

        view=(RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list=new ArrayList<>();

        Data_Container c1=new Data_Container();
        c1.setEnglish("Allergies");
        c1.setHindi("एलर्जी");
        list.add(c1);

        Data_Container c2=new Data_Container();
        c2.setEnglish("Alzheimer's");
        c2.setHindi("भूलने की बीमारी");
        list.add(c2);


        Data_Container c3=new Data_Container();
        c3.setEnglish("Arthritis");
        c3.setHindi("गठिया");
        list.add(c3);


        Data_Container c4=new Data_Container();
        c4.setEnglish("Asthma");
        c4.setHindi("दमा");
        list.add(c4);


        Data_Container c5=new Data_Container();
        c5.setEnglish("Cancer");
        c5.setHindi("कैंसर");
        list.add(c5);


        Data_Container c6=new Data_Container();
        c6.setEnglish("Cholesterol");
        c6.setHindi("कोलेस्ट्रॉल");
        list.add(c6);


        Data_Container c7=new Data_Container();
        c7.setEnglish("Chronic Pain");
        c7.setHindi("पुराना दर्द");
        list.add(c7);


        Data_Container c8=new Data_Container();
        c8.setEnglish("Broken bone");
        c8.setHindi("टूटी हुई हड्डी");
        list.add(c8);


        Data_Container c9=new Data_Container();
        c9.setEnglish("Depression");
        c9.setHindi("डिप्रेशन");
        list.add(c9);


        Data_Container c10=new Data_Container();
        c10.setEnglish("Runny nose");
        c10.setHindi("बहती नाक");
        list.add(c10);


        Data_Container c11=new Data_Container();
        c11.setEnglish("Digestion");
        c11.setHindi("पाचन");
        list.add(c11);

        Data_Container c12=new Data_Container();
        c12.setEnglish("Eyesight");
        c12.setHindi("नज़र");
        list.add(c12);


        Data_Container c13=new Data_Container();
        c13.setEnglish("Hepatitis");
        c13.setHindi("हेपेटाइटिस");
        list.add(c13);


        Data_Container c14=new Data_Container();
        c14.setEnglish("Sunburn");
        c14.setHindi("धूप की कालिमा");
        list.add(c14);


        Data_Container c15=new Data_Container();
        c15.setEnglish("Blood Pressure");
        c15.setHindi("रक्त चापp");
        list.add(c15);


        Data_Container c16=new Data_Container();
        c16.setEnglish("HIV");
        c16.setHindi("एचआईवी");
        list.add(c16);


        Data_Container c17=new Data_Container();
        c17.setEnglish("Thyroid");
        c17.setHindi("थाइरोइड");
        list.add(c17);


        Data_Container c18=new Data_Container();
        c18.setEnglish("Fever");
        c18.setHindi("बुखार");
        list.add(c18);


        Data_Container c19=new Data_Container();
        c19.setEnglish("Flu");
        c19.setHindi("फ़्लू");
        list.add(c19);


        Data_Container c20=new Data_Container();
        c20.setEnglish("Diabetes");
        c20.setHindi("मधुमेह");
        list.add(c20);


        Data_Container c21=new Data_Container();
        c21.setEnglish("Diarrhea");
        c21.setHindi("दस्त");
        list.add(c21);

        Data_Container c22=new Data_Container();
        c22.setEnglish("Gonorrhea");
        c22.setHindi("सूजाक");
        list.add(c22);


        Data_Container c23=new Data_Container();
        c23.setEnglish("Convalescence");
        c23.setHindi("आरोग्यलाभ");
        list.add(c23);


        Data_Container c24=new Data_Container();
        c24.setEnglish("Backache");
        c24.setHindi("पीठ दर्द");
        list.add(c24);


        Data_Container c25=new Data_Container();
        c25.setEnglish("Cough");
        c25.setHindi("खांसी");
        list.add(c25);



        Data_Container c27=new Data_Container();
        c27.setEnglish("Snakebite");
        c27.setHindi("साँप का दंश");
        list.add(c27);


        Data_Container c28=new Data_Container();
        c28.setEnglish("Dizziness");
        c28.setHindi("चक्कर आना");
        list.add(c28);


        Data_Container c29=new Data_Container();
        c29.setEnglish("Nausea");
        c29.setHindi("जी मिचलाना");
        list.add(c29);


        Data_Container c30=new Data_Container();
        c30.setEnglish("Chills");
        c30.setHindi("ठंड लगना");
        list.add(c30);






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

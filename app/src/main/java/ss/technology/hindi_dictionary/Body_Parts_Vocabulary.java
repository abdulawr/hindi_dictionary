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

public class Body_Parts_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body__parts__vocabulary);


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





        Data_Container c9 = new Data_Container();
        c9.setEnglish("Leg");
        c9.setHindi("टांग");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Hand");
        c10.setHindi("हाथ");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Nose");
        c11.setHindi("नाक");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Ear");
        c12.setHindi("कान");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Eye");
        c13.setHindi("आंख");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Foot");
        c14.setHindi("पैर");
        list.add(c14);


        Data_Container c1 = new Data_Container();
        c1.setEnglish("Hair");
        c1.setHindi("बाल");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Eyes");
        c2.setHindi("आंखें");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Mouth");
        c3.setHindi("मुंह");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Arm");
        c4.setHindi("बांह, भुजा");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Shoulder");
        c5.setHindi("कन्धा");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Stomach");
        c6.setHindi("पेट");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Knee");
        c7.setHindi("घुटना");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Throat");
        c8.setHindi("गला");
        list.add(c8);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Face");
        c15.setHindi("चेहरा");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Neck");
        c16.setHindi("गरदन");;
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Beard");
        c17.setHindi("दाढ़ी");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Moustache");
        c18.setHindi("मूंछ");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Hip");
        c19.setHindi("कूल्हा");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Nail");
        c20.setHindi("नाखून");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Lip");
        c21.setHindi("होंठ");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Fist");
        c22.setHindi("मुठ्ठी");
        list.add(c22);

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Face");
        c31.setHindi("चेहरा");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Eyebrow");
        c32.setHindi("भौं");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Tongue");
        c33.setHindi("जीभ");
        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Heart");
        c34.setHindi("ह्रदय");
        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Toe");
        c35.setHindi("पैर की उंगली");
        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Body");
        c36.setHindi("शरीर");
        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Fingers");
        c37.setHindi("अंगुलियाँ");
        list.add(c37);

        Data_Container c38 = new Data_Container();
        c38.setEnglish("Thumb");
        c38.setHindi("अंगूठा");
        list.add(c38);


        Data_Container c39 = new Data_Container();
        c39.setEnglish("Skull");
        c39.setHindi("खोपड़ी");
        list.add(c39);


        Data_Container c40 = new Data_Container();
        c40.setEnglish("Larynx");
        c40.setHindi("कंठ");
        list.add(c40);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Lip");
        c23.setHindi("होंठ");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Blood");
        c24.setHindi("रक्त");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Breast");
        c25.setHindi("स्तन");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Elbow");
        c26.setHindi("कोहनी");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Nave");
        c27.setHindi("नाभि");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Cheek");
        c28.setHindi("गाल");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Ankle");
        c29.setHindi("टखना");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Brain");
        c30.setHindi("दिमाग");
        list.add(c30);


// 31 --- 40





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

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

public class Introduce_yourself extends AppCompatActivity {

    RecyclerView view;
     Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_yourself);


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
        c1.setEnglish("Hello");
        c1.setHindi("नमस्ते");// use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Hi!");
        c2.setHindi("नमस्ते");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("My name is Salman. What's your name?");
        c3.setHindi("मेरा नाम सलमान है। तुम्हारा नाम क्या है?");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("My name is John. Nice to meet you.");
        c4.setHindi("मेरा नाम जॉन है। आपसे मिलकर अच्छा लगा");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("It's a pleasure. This is a great party!");
        c5.setHindi("यह एक खुशी की बात है। यह एक महान पार्टी है!");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes, it is. Where are you from?");
        c6.setHindi("हाँ यही है। आप रहने वाली कहा की है");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("I'm from Islamabad.");
        c7.setHindi("मैं इस्लामाबाद से हूं");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Islamabad? Are you Indian?");
        c8.setHindi("इस्लामाबाद? आप भारतीय हैं");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("No, I'm not Indian. I'm Pakistani.");
        c9.setHindi("नहीं, मैं भारतीय नहीं हूं। मैं पाकिस्तानी हूं");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Oh, you're Pakistani. Sorry about that.");
        c10.setHindi("ओह, तुम पाकिस्तानी हो। उसके लिए माफ़ करना");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("That's OK. Where are you from?");
        c11.setHindi("ठीक है। आप रहने वाली कहा की है");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("I live in London, but I'm not British.");
        c12.setHindi("मैं लंदन में रहता हूं, लेकिन मैं ब्रिटिश नहीं हूं");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("No, what are you?");
        c13.setHindi("नहीं, तुम क्या हो");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Well, my parents were Indian, so I'm Indian, too.");
        c14.setHindi("खैर, मेरे माता-पिता भारतीय थे, इसलिए मैं भी भारतीय हूं");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("That's very interesting. India is a beautiful country.");
        c15.setHindi("यह तो बहुत ही मज़ेदार है। भारत एक खूबसूरत देश है");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you. It is a wonderful place.");
        c16.setHindi("धन्यवाद। यह एक अद्भुत जगह है");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Bye bye, John. Have a nice evening.");
        c17.setHindi("अलविदा, जॉन। आपकी शाम अच्छी बीते");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Thanks, you too!");
        c18.setHindi("आपको भी धन्यवाद");
        list.add(c18);


        adapter=new Phrases_Recycle_Adapter(this,list);
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


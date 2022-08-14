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

public class Restruent extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restruent);


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
        c1.setEnglish("Good evening sir,  Can I help you?");
        c1.setHindi("गुड ईवनिंग सर, कैन आई हेल्प यू");
        // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Can we have a table for three please.?");
        c2.setHindi("क्या हम तीनों के लिए एक टेबल रख सकते हैं");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Please come this way.");
        c3.setHindi("कृपया इस तरफ आएं");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Can I see a menu, please?");
        c4.setHindi("क्या मुझे एक मेनू दिखाई दे सकता है, कृपया");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Certainly, here you are.");
        c5.setHindi("निश्चित रूप से आप यहां हो");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Are you ready to order?");
        c6.setHindi("क्या आप आदेश देने के लिए तैयार हैं");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Yes, we'll have the chicken with rice.");
        c7.setHindi("हाँ, हम चावल के साथ चिकन लेंगे");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Can I get you anything else? Coffee or tea.");
        c8.setHindi("क्या मैं आपके लिए और कुछ लाऊं? कॉफी या चाय");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Yes would like to have a cup of tea.");
        c9.setHindi("हां एक कप चाय पीना चाहूंगा");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Would you like something to drink?");
        c10.setHindi("क्या आप कुछ पीना चाहेंगे");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("No thanks.");
        c11.setHindi("जी नहीं, धन्यवाद");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Can I get you anything else?");
        c12.setHindi("क्या मैं आपके लिए और कुछ लाऊं");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("No thanks. I'd like the check, please.");
        c13.setHindi("जी नहीं, धन्यवाद। मुझे चेक चाहिए, कृपया।");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("That'll be $14.95.");
        c14.setHindi("वह $ 14.95 होगा");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Here you are. Keep the change!");
        c15.setHindi("आप यहाँ हैं। छुट्टे रख लो");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you! Have a good day!");
        c16.setHindi("धन्यवाद! आपका दिन शुभ हो");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Goodbye.");
        c17.setHindi("अलविदा");
        list.add(c17);



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

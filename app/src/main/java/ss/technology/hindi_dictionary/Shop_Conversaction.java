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

public class Shop_Conversaction extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop__conversaction);

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
        c1.setEnglish("May I help you?");
        c1.setHindi("क्या मैं आपकी सहायता कर सकता हूँ");
        // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Yes, I'm looking for a sweater.");
        c2.setHindi("हां, मुझे स्वेटर की तलाश है।");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("What size are you?");
        c3.setHindi("आपका साइज क्या है");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("I'm an extra small.");
        c4.setHindi("मैं एक अतिरिक्त छोटा हूं");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Would you like a plain sweater or something else?​");
        c5.setHindi("क्या आप एक सादा स्वेटर या कुछ और पसंद करेंगे");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("I'm looking for a plain green sweater.");
        c6.setHindi("मैं एक सादे हरे स्वेटर की तलाश में हूं");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("How about this one?");
        c7.setHindi("इसके बारे में क्या खयाल है");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Yes, that's nice. Could I try it on?");
        c8.setHindi("हाँ, यह अच्छा है। क्या मैं इस पर कोशिश कर सकता था");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Certainly, the changing rooms are over there.");
        c9.setHindi("निश्चित रूप से, चेंजिंग रूम वहाँ पर हैं");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish(" Thank you.");
        c10.setHindi("धन्यवाद");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("How does it fit?");
        c11.setHindi("यह फ़िट कैसे होता है");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("It's too large. Do you have a large?");
        c12.setHindi("यह बहुत बड़ा है। क्या आपके पास बड़ा है?");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Yes, here you are. Would you like to try other?");
        c13.setHindi("हां यह लीजिये। क्या आप अन्य प्रयास करना चाहेंगे?");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("No,it`s good for me.");
        c14.setHindi("नहीं, यह मेरे लिए अच्छा है");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Thank you. Have a nice day!");
        c15.setHindi("धन्यवाद। आपका दिन शुभ हो");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you, goodbye.");
        c16.setHindi("धन्यवाद अलविदा");
        list.add(c16);



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

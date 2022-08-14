package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

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

public class Phrases_Activity extends AppCompatActivity {

    RecyclerView view;
    ArrayList<Data_Container> list;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_);

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

        Toast.makeText(this, "Please wait while using pronunciation feature!", Toast.LENGTH_SHORT).show();

        view=(RecyclerView) findViewById(R.id.recycleview);
        list=new ArrayList<>();

        Data_Container container1=new Data_Container();
        container1.setEnglish("A blessing in disguise.");
        container1.setHindi("एक अच्छी बात जो पहली बार में बुरी लग रही थी");
        list.add(container1);


        Data_Container container2=new Data_Container();
        container2.setEnglish("A dime a dozen.");
        container2.setHindi("कुछ सामान्य।");
        list.add(container2);

        Data_Container container3=new Data_Container();
        container3.setEnglish("Better late than never.");
        container3.setHindi("देर से आने के लिए बेहतर है कि बिल्कुल न आएं।");
        list.add(container3);


        Data_Container container4=new Data_Container();
        container4.setEnglish("Bite the bullet.");
        container4.setHindi("कुछ पाने के लिए क्योंकि यह अपरिहार्य है।");
        list.add(container4);


        Data_Container container5=new Data_Container();
        container5.setEnglish("Break a leg.");
        container5.setHindi("सौभाग्य।");
        list.add(container5);

        Data_Container container6=new Data_Container();
        container6.setEnglish("Call it a day.");
        container6.setHindi("किसी चीज पर काम करना बंद करें।");
        list.add(container6);

        Data_Container container7=new Data_Container();
        container7.setEnglish("Cut somebody some slack.");
        container7.setHindi("इतनी आलोचना मत करो।");
        list.add(container7);

        Data_Container container8=new Data_Container();
        container8.setEnglish("Easy does it.");
        container8.setHindi("गति कम करो");
        list.add(container8);

        Data_Container container9=new Data_Container();
        container9.setEnglish("Get out of hand.");
        container9.setHindi("नियंत्रण से बाहर।");
        list.add(container9);


        Data_Container container10=new Data_Container();
        container10.setEnglish("Get your act together.");
        container10.setHindi("बेहतर काम करना या छोड़ना।");
        list.add(container10);



        // ##################### 11-20##################


        Data_Container container11=new Data_Container();
        container11.setEnglish("Give someone the benefit of the doubt.");
        container11.setHindi("भरोसा करो कि कोई क्या कहता है।");
        list.add(container11);

        Data_Container container12=new Data_Container();
        container12.setEnglish("Go back to the drawing board.");
        container12.setHindi("प्रारंभ करें");
        list.add(container12);

        Data_Container container13=new Data_Container();
        container13.setEnglish("Hang in there.");
        container13.setHindi("हार मत मानो।");
        list.add(container13);


        Data_Container container14=new Data_Container();
        container14.setEnglish("Hit the sack.");
        container14.setHindi("सो जाओ।");
        list.add(container14);


        Data_Container container15=new Data_Container();
        container15.setEnglish("It's not rocket science.");
        container15.setHindi("सो जाओ।");
        list.add(container15);

        Data_Container container16=new Data_Container();
        container16.setEnglish("Let someone off the hook.");
        container16.setHindi("किसी चीज के लिए किसी को जिम्मेदार न ठहराना");
        list.add(container16);

        Data_Container container17=new Data_Container();
        container17.setEnglish("Make a long story short.");
        container17.setHindi("कुछ संक्षेप में बताएं।");
        list.add(container17);

        Data_Container container18=new Data_Container();
        container18.setEnglish("Miss the boat.");
        container18.setHindi("बहुत देर हो चुकी है।");
        list.add(container18);

        Data_Container container19=new Data_Container();
        container19.setEnglish("No pain, no gain.");
        container19.setHindi("आपको जो चाहिए उसके लिए काम करना होगा।");
        list.add(container19);


        Data_Container container20=new Data_Container();
        container20.setEnglish("On the ball.");
        container20.setHindi("अच्छा काम कर रहे हैं।");
        list.add(container20);


        // ##################### 21-30##################


        Data_Container container21=new Data_Container();
        container21.setEnglish("Pull someone's leg.");
        container21.setHindi("किसी के साथ मजाक करना।");
        list.add(container21);

        Data_Container container22=new Data_Container();
        container22.setEnglish("Pull yourself together.");
        container22.setHindi("शांत हो जाओ।");
        list.add(container22);

        Data_Container container23=new Data_Container();
        container23.setEnglish("So far so good.");
        container23.setHindi("हालात अब तक ठीक चल रहे हैं।");
        list.add(container23);


        Data_Container container24=new Data_Container();
        container24.setEnglish("Speak of the devil.");
        container24.setHindi("हम जिस व्यक्ति के बारे में बात कर रहे थे, वह दिखा!");
        list.add(container24);


        Data_Container container25=new Data_Container();
        container25.setEnglish("That's the last straw.");
        container25.setHindi("मेरा धैर्य भाग गया है।");
        list.add(container25);

        Data_Container container26=new Data_Container();
        container26.setEnglish("The best of both worlds.");
        container26.setHindi("एक आदर्श स्थिति।");
        list.add(container26);

        Data_Container container27=new Data_Container();
        container27.setEnglish("To get bent out of shape.");
        container27.setHindi("उदास हो जाना।");
        list.add(container27);

        Data_Container container28=new Data_Container();
        container28.setEnglish("To make matters worse.");
        container28.setHindi("एक समस्या और भी बदतर कर दो।");
        list.add(container28);

        Data_Container container29=new Data_Container();
        container29.setEnglish("Under the weather.");
        container29.setHindi("बीमार");
        list.add(container29);


        Data_Container container30=new Data_Container();
        container30.setEnglish("You can say that again.");
        container30.setHindi("यह सच है, मैं सहमत हूँ");
        list.add(container30);


        // ##################### 31-40##################


        Data_Container container31=new Data_Container();
        container31.setEnglish("Your guess is as good as mine.");
        container31.setHindi("मुझे पता नहीं है।");
        list.add(container31);

        Data_Container container32=new Data_Container();
        container32.setEnglish("A penny for your thoughts.");
        container32.setHindi("मुझे बताओ कि तुम क्या सोच रहे हो।");
        list.add(container32);

        Data_Container container33=new Data_Container();
        container33.setEnglish("A perfect storm.");
        container33.setHindi("सबसे खराब स्थिति।");
        list.add(container33);


        Data_Container container34=new Data_Container();
        container34.setEnglish("A picture is worth 1000 words.");
        container34.setHindi("बताने से बेहतर है दिखाना।");
        list.add(container34);


        Data_Container container35=new Data_Container();
        container35.setEnglish("By the skin of your teeth.");
        container35.setHindi("मुश्किल से");
        list.add(container35);

        Data_Container container36=new Data_Container();
        container36.setEnglish("Costs an arm and a leg.");
        container36.setHindi("बहुत महंगा");
        list.add(container36);

        Data_Container container37=new Data_Container();
        container37.setEnglish("Give someone the cold shoulde.");
        container37.setHindi("किसी की उपेक्षा");
        list.add(container37);

        Data_Container container38=new Data_Container();
        container38.setEnglish("Go on a wild goose chase.");
        container38.setHindi("कुछ निरर्थक करने के लिए");
        list.add(container38);

        Data_Container container39=new Data_Container();
        container39.setEnglish("Good things come to those who wait.");
        container39.setHindi("धैर्य रखें");
        list.add(container39);


        Data_Container container40=new Data_Container();
        container40.setEnglish("He's a chip off the old block.");
        container40.setHindi("पुत्र पिता के समान होता है।");
        list.add(container40);




        // ##################### 41-50##################


        Data_Container container41=new Data_Container();
        container41.setEnglish("It ain't over till the fat lady sings.");
        container41.setHindi("यह अभी खत्म नहीं हुआ है");
        list.add(container41);

        Data_Container container42=new Data_Container();
        container42.setEnglish("It's a piece of cake.");
        container42.setHindi("यह आसान है");
        list.add(container42);

        Data_Container container43=new Data_Container();
        container43.setEnglish("Fortune favours the bold.");
        container43.setHindi("जोखिम लें");
        list.add(container43);


        Data_Container container44=new Data_Container();
        container44.setEnglish("Go down in flames.");
        container44.setHindi("शानदार प्रदर्शन किया");
        list.add(container44);


        Data_Container container45=new Data_Container();
        container45.setEnglish("He's off his rocker.");
        container45.setHindi("वह पागल है");
        list.add(container45);


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

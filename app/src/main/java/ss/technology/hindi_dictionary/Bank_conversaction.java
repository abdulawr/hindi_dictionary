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

public class Bank_conversaction extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_conversaction);


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
        c1.setEnglish("Good morning. Can I cash a cheque here?");
        c1.setHindi("शुभ प्रभात। क्या मैं यहां चेक भुना सकता हूं");
        // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Please go to the first counter on the left side.");
        c2.setHindi("कृपया बाईं ओर पहले काउंटर पर जाएं");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Thank you. Is it the teller system there?");
        c3.setHindi("धन्यवाद। क्या यह वहां का टेलर सिस्टम है");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Yes, sir. You will get your money instantly there.");
        c4.setHindi("जी श्रीमान। आपको वहां आपका पैसा तुरंत मिल जाएगा");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Excuse me. I want to get this cheque cashed.");
        c5.setHindi("क्षमा कीजिय। मैं इस चेक को कैश करवाना चाहता हूं");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes sir, please sign on the back of your cheque.");
        c6.setHindi("हां सर, कृपया अपने चेक के पीछे हस्ताक्षर करें");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Ok.! Here you are.");
        c7.setHindi("ठीक।! आप यहाँ हैं");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Just a minute, sir.");
        c8.setHindi("बस एक मिनट, सर");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("I need thousand rupees notes only.");
        c9.setHindi("मुझे हजार रुपए के नोट की ही जरूरत है");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("I am sorry; I have only five hundred rupees notes. If you can wait, I will get some thousand rupees notes as well.");
        c10.setHindi("मुझे क्षमा करें; मेरे पास केवल पांच सौ रुपये के नोट हैं। यदि आप प्रतीक्षा कर सकते हैं, तो मुझे कुछ हजार रुपए के नोट भी मिलेंगे");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Thanks! I won’t like to wait any longer. Five hundred rupees notes are alright with me.");
        c11.setHindi("धन्यवाद! मैं अब और इंतजार नहीं करना चाहता। पांच सौ रुपये के नोट मेरे साथ ठीक हैं");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Here is your cash, sir. Please ensure that you. Have got exactly the right amount.");
        c12.setHindi("यहां आपकी नकदी है, सर। कृपया सुनिश्चित करें कि आप। बिल्कुल सही राशि मिली है");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Thank you. I shall definitely count my money before I leave.");
        c13.setHindi("धन्यवाद। मेरे जाने से पहले मैं अपने पैसे जरूर गिनूंगा");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Thank you very much. Have a nice day, sir.");
        c14.setHindi("आपका बहुत बहुत धन्यवाद। आपका दिन मंगलमय हो सर");
        list.add(c14);


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
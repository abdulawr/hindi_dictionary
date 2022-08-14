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

public class Residance_Conversation extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residance__conversation);


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


        Data_Container c11 = new Data_Container();
        c11.setEnglish(" Good morning, San Felice Hotel. May I help you? ");
        c11.setHindi("सुप्रभात, सैन फेलिस होटल। क्या मैं आपकी सहायता कर सकता हूँ");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Yes. I´d like to book a room, please.");
        c12.setHindi("हाँ। कृपया मुझे कमरा बुक करना पसंद है");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Certainly. When for, sir?");
        c13.setHindi("निश्चित रूप से। जब के लिए, सर");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("March the 23rd.");
        c14.setHindi("23 मार्च को");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("How long will you be staying?");
        c15.setHindi("तुम कितने समय के लिए रहोगे");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Three nights.");
        c16.setHindi("तीन रात");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Would you like a single rooom? ");
        c17.setHindi("क्या आप सिंगल रूम चाहेंगे?");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Yes, please.");
        c18.setHindi("जी कहिये");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Yes, we have that type of room.");
        c19.setHindi("हां, हमारे पास उस प्रकार का कमरा है");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Fine. How much is the charge per night?");
        c20.setHindi("ठीक। प्रति रात कितना चार्ज है");
        list.add(c20);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Would you like breakfast?");
        c1.setHindi("क्या आप नाश्ता पसंद करेंगे?");
        // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("No, thanks.");
        c2.setHindi("जी नहीं, धन्यवाद");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Great. And would you prefer to have a room with a view of the ocean?");
        c3.setHindi("महान। और क्या आप समुद्र के दृश्य के साथ एक कमरा रखना पसंद करेंगे?");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Sure  What’s the rate for the room?");
        c4.setHindi("सुनिश्चित करें कि कमरे के लिए क्या दर है");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Could you tell me your telephone number?");
        c5.setHindi("क्या आप मुझे अपना टेलीफोन नंबर बता सकते हैं");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes, my cell phone number is 555-26386.");
        c6.setHindi("हां, मेरा सेल फोन नंबर 555-26386 है");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("And what is the name of the cardholder?");
        c7.setHindi("और कार्डधारक का नाम क्या है");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Jhon");
        c8.setHindi("जॉन");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Alright, Mr. Jhon, your reservation has been made");
        c9.setHindi("ठीक है, श्रीमान, आपका आरक्षण हो गया है");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Great, thank you so much.");
        c10.setHindi("बहुत बहुत धन्यवाद");
        list.add(c10);



// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("My pleasure. Have a nice day.");
        c21.setHindi("मेरा सौभाग्य। आपका दिन शुभ हो");
        list.add(c21);


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

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

public class Hospital_conversation extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_conversation);


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
        c1.setEnglish("Good morning, Dr. Adnan!");
        c1.setHindi("सुप्रभात, डॉ। अदनान");// use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Good morning! What’s wrong with you?");
        c2.setHindi("शुभ प्रभात! तुम्हें क्या हुआ");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("I have been suffering from headache since yesterday.");
        c3.setHindi("मैं कल से सिरदर्द से पीड़ित हूं");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Do you have any other symptoms?");
        c4.setHindi("क्या आपके कोई अन्य लक्षण हैं");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("No I don`t have.");
        c5.setHindi("नहीं, मेरे पास नहीं है");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Let me check your temperature and blood pressure.");
        c6.setHindi("मुझे अपने तापमान और रक्तचाप की जांच करने दें");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Both temperature and blood pressure are normal.");
        c7.setHindi("तापमान और रक्तचाप दोनों सामान्य हैं");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("So what is the reason of headache.");
        c8.setHindi("तो सिरदर्द का कारण क्या है");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Don`t worry, it cause by burden and anxiety.");
        c9.setHindi("चिंता मत करो, यह बोझ और चिंता के कारण होता है");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Don’t worry, there is nothing serious. I am giving you the medicine.");
        c10.setHindi("चिंता मत करो, कुछ भी गंभीर नहीं है। मैं तुम्हें दवा दे रहा हूं");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Ok doctor.");
        c11.setHindi("ठीक है डॉक्टर साहब");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("I shall recommend at least three days rest for you.");
        c12.setHindi("मैं आपके लिए कम से कम तीन दिनों के आराम की सिफारिश करूंगा");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Would you prepare a medical certificate for me to submit it in my university?");
        c13.setHindi("क्या आप मुझे अपने विश्वविद्यालय में जमा करने के लिए एक चिकित्सा प्रमाण पत्र तैयार करेंगे");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Why not, This is your medical certificate.");
        c14.setHindi("क्यों नहीं, यह आपका मेडिकल सर्टिफिकेट है");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish(" What should I eat doctor?");
        c15.setHindi("मुझे डॉक्टर को क्या खाना चाहिए");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("You can eat anything.");
        c16.setHindi("आप कुछ भी खा सकते हैं");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("How much shall I pay you doctor?");
        c17.setHindi("मैं आपको कितना भुगतान करूंगा डॉक्टर");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("You can pay consultation fee at the reception desk.");
        c18.setHindi("आप स्वागत डेस्क पर परामर्श शुल्क का भुगतान कर सकते हैं");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Thank you so much doctor.");
        c19.setHindi("बहुत बहुत धन्यवाद डॉक्टर साहब");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("You are welcome.");
        c20.setHindi("आपका स्वागत है");
        list.add(c20);

        


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

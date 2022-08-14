package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Vehicles_Vocablulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles__vocablulary);


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


        Data_Container c2 = new Data_Container();
        c2.setEnglish("Streetcar");
        c2.setHindi("ट्राम");
        c2.setUrdu("اسٹریٹ کار");
        c2.setPashto("سټریټ کار");
        c2.setArabic("ترام");
        c2.setFrench("Tramway");
        c2.setGerman("Straßenbahn");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Truck");
        c3.setHindi("ट्रक");
        c3.setUrdu("ٹرک");
        c3.setPashto("ټرک");
        c3.setArabic("شاحنة نقل");
        c3.setFrench("un camion");
        c3.setGerman("LKW");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Train");
        c4.setHindi("रेल गाडी");
        c4.setUrdu("ٹرین");
        c4.setPashto("اورګاډي");
        c4.setArabic("قطار");
        c4.setFrench("Train");
        c4.setGerman("Zug");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Tractor");
        c5.setHindi("ट्रैक्टर");
        c5.setUrdu("ٹریکٹر۔");
        c5.setPashto("ټراکټور");
        c5.setArabic("جرار زراعى");
        c5.setFrench("Tracteur");
        c5.setGerman("Traktor");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Taxi");
        c6.setHindi("टैक्सी");
        c6.setUrdu("ٹیکسی");
        c6.setPashto("ټکسي");
        c6.setArabic("سيارة اجره");
        c6.setFrench("Taxi");
        c6.setGerman("Taxi");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Subway");
        c7.setHindi("भूमिगत मार्ग");
        c7.setUrdu("سب وے۔");
        c7.setPashto("دمځکي لاندی لار");
        c7.setArabic("طرق جانبية");
        c7.setFrench("Métro");
        c7.setGerman("U-Bahn");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Rowboat");
        c8.setHindi("नाव");
        c8.setUrdu("روبوٹ۔");
        c8.setPashto("بېړۍ");
        c8.setArabic("زورق");
        c8.setFrench("Canot à rames");
        c8.setGerman("Ruderboot");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Motorcycle");
        c9.setHindi("मोटरसाइकिल");
        c9.setUrdu("موٹرسائیکل");
        c9.setPashto("موټرسایکل");
        c9.setArabic("دراجة نارية");
        c9.setFrench("Moto");
        c9.setGerman("Motorrad");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Helicopter");
        c10.setHindi("हेलीकॉप्टर");
        c10.setUrdu("ہیلی کاپٹر۔");
        c10.setPashto("چورلکه");
        c10.setArabic("هليكوبتر");
        c10.setFrench("Hélicoptère");
        c10.setGerman("Hubschrauber");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Caravan");
        c11.setHindi("कारवां");
        c11.setUrdu("کاروان۔");
        c11.setPashto("کاروان");
        c11.setArabic("المنزل المتنقل");
        c11.setFrench("Caravane");
        c11.setGerman("Wohnwagen");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Crane");
        c12.setHindi("क्रेन");
        c12.setUrdu("کرین");
        c12.setPashto("کرین");
        c12.setArabic("رافعه");
        c12.setFrench("Grue");
        c12.setGerman("Kran");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Carriage");
        c13.setHindi("गाड़ी");
        c13.setUrdu("گاڑی۔");
        c13.setPashto("ګاډی");
        c13.setArabic("عربه قطار");
        c13.setFrench("Le chariot");
        c13.setGerman("Wagen");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Bus");
        c14.setHindi("बस");
        c14.setUrdu("بس");
        c14.setPashto("بس");
        c14.setArabic("حافلة");
        c14.setFrench("Autobus");
        c14.setGerman("Bus");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Boat");
        c15.setHindi("नाव");
        c15.setUrdu("کشتی");
        c15.setPashto("کښتۍ");
        c15.setArabic("قارب");
        c15.setFrench("Bateau");
        c15.setGerman("Boot");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Bicycle");
        c16.setHindi("साइकिल");
        c16.setUrdu("بائیسکل۔");
        c16.setPashto("بايسکل");
        c16.setArabic("دراجة");
        c16.setFrench("Vélo");
        c16.setGerman("Fahrrad");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Ambulance");
        c17.setHindi("रोगी वाहन");
        c17.setUrdu("ایمبولینس۔");
        c17.setPashto("امبولانس");
        c17.setArabic("سياره اسعاف");
        c17.setFrench("Ambulance");
        c17.setGerman("Krankenwagen");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Airplane");
        c18.setHindi("विमान");
        c18.setUrdu("ہوائی جہاز");
        c18.setPashto("الوتکه");
        c18.setArabic("طائرة");
        c18.setFrench("Avion");
        c18.setGerman("Flugzeug");
        list.add(c18);


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


}

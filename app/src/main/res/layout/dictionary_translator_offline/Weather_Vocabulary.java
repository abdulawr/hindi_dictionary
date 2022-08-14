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

public class Weather_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather__vocabulary);


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

        Data_Container c13 = new Data_Container();
        c13.setEnglish("Spring");
        c13.setHindi("वसंत");
        c13.setUrdu("بہار۔");
        c13.setPashto("پسرلی");
        c13.setArabic("ربيع");
        c13.setFrench("Printemps");
        c13.setGerman("Frühling");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Summer");
        c14.setHindi("गर्मी");
        c14.setUrdu("موسم گرما");
        c14.setPashto("دوبی");
        c14.setArabic("الصيف");
        c14.setFrench("Été");
        c14.setGerman("Sommer");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Winter");
        c15.setHindi("सर्दी");
        c15.setUrdu("موسم سرما");
        c15.setPashto("ژمی");
        c15.setArabic("شتاء");
        c15.setFrench("L'hiver");
        c15.setGerman("Winter");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Autumn");
        c16.setHindi("पतझड़");
        c16.setUrdu("خزاں۔");
        c16.setPashto("منی");
        c16.setArabic("الخريف");
        c16.setFrench("L'automne");
        c16.setGerman("Herbst");
        list.add(c16);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Sunny");
        c1.setHindi("धूप");
        c1.setUrdu("دھوپ");
        c1.setPashto("لمر");
        c1.setArabic("مشمس");
        c1.setFrench("Ensoleillé");
        c1.setGerman("Sonnig");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Rainy");
        c2.setHindi("बरसाती");
        c2.setUrdu("بارش");
        c2.setPashto("باران");
        c2.setArabic("ماطر");
        c2.setFrench("Pluvieux");
        c2.setGerman("Regnerisch");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Cloudy");
        c3.setHindi("धुंधला");
        c3.setUrdu("ابر آلود");
        c3.setPashto("وريځي");
        c3.setArabic("غائم");
        c3.setFrench("Nuageux");
        c3.setGerman("Bewölkt");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Windy");
        c4.setHindi("तूफानी");
        c4.setUrdu("تیز ہوا");
        c4.setPashto("باد لرونکی");
        c4.setArabic("عاصف");
        c4.setFrench("Venteux");
        c4.setGerman("Windig");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Hot");
        c5.setHindi("गरम");
        c5.setUrdu("گرم");
        c5.setPashto("ګرم");
        c5.setArabic("الحار");
        c5.setFrench("Chaud");
        c5.setGerman("Heiß");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Stormy");
        c6.setHindi("तूफ़ानी");
        c6.setUrdu("طوفانی");
        c6.setPashto("طوفاني");
        c6.setArabic("Stürmisch");
        c6.setFrench("Orageux");
        c6.setGerman("Stürmisch");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Cold");
        c7.setHindi("सर्दी");
        c7.setUrdu("سردی");
        c7.setPashto("ساړه");
        c7.setArabic("البرد");
        c7.setFrench("Du froid");
        c7.setGerman("Kalt");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Snowy");
        c8.setHindi("हिमाच्छन्न");
        c8.setUrdu("برفیلی۔");
        c8.setPashto("واوره");
        c8.setArabic("مثلج");
        c8.setFrench("Neigeux");
        c8.setGerman("Schneebedeckt");
        list.add(c8);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Drizzle");
        c10.setHindi("बूंदा बांदी");
        c10.setUrdu("بوندا باندی");
        c10.setPashto("بړوند");
        c10.setArabic("Nieseln");
        c10.setFrench("Bruine");
        c10.setGerman("Nieseln");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Rainbow");
        c11.setHindi("इंद्रधनुष");
        c11.setUrdu("قوس قزح");
        c11.setPashto("رنځور");
        c11.setArabic("قوس المطر");
        c11.setFrench("arc en ciel");
        c11.setGerman("Regenbogen");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Snow");
        c12.setHindi("हिमपात");
        c12.setUrdu("برف۔");
        c12.setPashto("واوره");
        c12.setArabic("ثلج");
        c12.setFrench("Neige");
        c12.setGerman("Schnee");
        list.add(c12);

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

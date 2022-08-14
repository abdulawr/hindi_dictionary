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

public class Color_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color__vocabulary);


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
        c1.setEnglish("Red");
        c1.setHindi("लाल");
        c1.setUrdu("سرخ");
        c1.setPashto("سور");
        c1.setArabic("أحمر");
        c1.setFrench("rouge");
        c1.setGerman("rot");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Orange");
        c2.setHindi("संतरा");
        c2.setUrdu("کینو");
        c2.setPashto("نارنج");
        c2.setArabic("البرتقالي");
        c2.setFrench("Orange");
        c2.setGerman("Orange");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Yellow");
        c3.setHindi("पीला");
        c3.setUrdu("پیلا");
        c3.setPashto("ژیړ");
        c3.setArabic("الأصفر");
        c3.setFrench("Jaune");
        c3.setGerman("Gelb");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Green");
        c4.setHindi("हरा");
        c4.setUrdu("سبز");
        c4.setPashto("شین");
        c4.setArabic("أخضر");
        c4.setFrench("Vert");
        c4.setGerman("Grün");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Blue");
        c5.setHindi("नीला");
        c5.setUrdu("نیلا");
        c5.setPashto("آبي");
        c5.setArabic("أزرق");
        c5.setFrench("Bleu");
        c5.setGerman("Blau");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Purple");
        c6.setHindi("बैंगनी");
        c6.setUrdu("ارغوانی");
        c6.setPashto("ارغواني");
        c6.setArabic("أرجواني");
        c6.setFrench("Violet");
        c6.setGerman("Lila");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Brown");
        c7.setHindi("भूरा");
        c7.setUrdu("براؤن");
        c7.setPashto("نصواري");
        c7.setArabic("بنى");
        c7.setFrench("marron");
        c7.setGerman("Braun");
        list.add(c7);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Magenta");
        c14.setHindi("मैजेंटा");
        c14.setUrdu("میجنٹا");
        c14.setPashto("میګینټا");
        c14.setArabic("أرجواني");
        c14.setFrench("Magenta");
        c14.setGerman("Magenta");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Cyan");
        c15.setHindi("सियान");
        c15.setUrdu("سیان۔");
        c15.setPashto("سيان");
        c15.setArabic("ازرق سماوي");
        c15.setFrench("Cyan");
        c15.setGerman("Cyan");
        list.add(c15);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("White");
        c8.setHindi("सफेद");
        c8.setUrdu("سفید");
        c8.setPashto("سپین");
        c8.setArabic("أبيض");
        c8.setFrench("blanc");
        c8.setGerman("Weiß");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Pink");
        c9.setHindi("गुलाबी");
        c9.setUrdu("گلابی");
        c9.setPashto("ګلابي");
        c9.setArabic("زهري");
        c9.setFrench("Rose");
        c9.setGerman("Rosa");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Grey");
        c10.setHindi("धूसर");
        c10.setUrdu("سرمئی");
        c10.setPashto("خړ");
        c10.setArabic("اللون الرمادي");
        c10.setFrench("Gris");
        c10.setGerman("Grau");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Black");
        c11.setHindi("काली");
        c11.setUrdu("سیاہ");
        c11.setPashto("تور");
        c11.setArabic("أسود");
        c11.setFrench("Noir");
        c11.setGerman("Schwarz");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Violet");
        c12.setHindi("बैंगनी");
        c12.setUrdu("وایلیٹ۔");
        c12.setPashto("وایلیټ");
        c12.setArabic("البنفسجي");
        c12.setFrench("Violet");
        c12.setGerman("Violett");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Silver");
        c13.setHindi("चांदी");
        c13.setUrdu("چاندی");
        c13.setPashto("سلور");
        c13.setArabic("فضة");
        c13.setFrench("argent");
        c13.setGerman("Silber");
        list.add(c13);




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

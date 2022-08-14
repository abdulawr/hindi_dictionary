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

public class Birds_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds__vocabulary);



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
        c1.setEnglish("Crow");
        c1.setHindi("कौआ");
        c1.setUrdu("کوا");
        c1.setPashto("کر");
        c1.setArabic("غراب");
        c1.setFrench("corbeau");
        c1.setGerman("Krähe");
        list.add(c1);

// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Raven");
        c11.setHindi("काला कौआ");
        c11.setUrdu("ریوین۔");
        c11.setPashto("ریوین");
        c11.setArabic("غراب أسود");
        c11.setFrench("Corbeau");
        c11.setGerman("Rabe");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Parrot");
        c12.setHindi("तोता");
        c12.setUrdu("طوطا");
        c12.setPashto("پارچه");
        c12.setArabic("ببغاء");
        c12.setFrench("Perroquet");
        c12.setGerman("Papagei");
        list.add(c12);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Peacock");
        c2.setHindi("मोर");
        c2.setUrdu("مور");
        c2.setPashto("طاووس");
        c2.setArabic("الطاووس");
        c2.setFrench("Paon");
        c2.setGerman("Pfau");
        list.add(c2);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Sparrow");
        c4.setHindi("गौरैया");
        c4.setUrdu("چڑیا");
        c4.setPashto("سپرو");
        c4.setArabic("عصفور");
        c4.setFrench("Moineau");
        c4.setGerman("Spatz");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Goose");
        c5.setHindi("बत्तख");
        c5.setUrdu("ہنس");
        c5.setPashto("بته");
        c5.setArabic("بجعة");
        c5.setFrench("OIE");
        c5.setGerman("Gans");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Ostrich");
        c6.setHindi("शुतुरमुर्ग");
        c6.setUrdu("شوترمرغ۔");
        c6.setPashto("اورتریک");
        c6.setArabic("نعامة");
        c6.setFrench("Autruche");
        c6.setGerman("Strauß");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Pigeon");
        c7.setHindi("कबूतर");
        c7.setUrdu("کبوتر۔");
        c7.setPashto("كوتره");
        c7.setArabic("حمامة");
        c7.setFrench("Pigeon");
        c7.setGerman("Taube");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Turkey");
        c8.setHindi("तुर्की");
        c8.setUrdu("ترکی");
        c8.setPashto("ترکیه");
        c8.setArabic("ديك رومي");
        c8.setFrench("dinde");
        c8.setGerman("Truthahn");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Hawk");
        c9.setHindi("बाज़");
        c9.setUrdu("ہاک");
        c9.setPashto("هاک");
        c9.setArabic("صقر");
        c9.setFrench("faucon");
        c9.setGerman("Falke");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Bald eagle");
        c10.setHindi("गंजा ईगल");
        c10.setUrdu("گنجا عقاب");
        c10.setPashto("بالډ عقاب");
        c10.setArabic("النسر الأصلع");
        c10.setFrench("Aigle chauve");
        c10.setGerman("Weißkopfseeadler");
        list.add(c10);




        Data_Container c13 = new Data_Container();
        c13.setEnglish("Flamingo");
        c13.setHindi("मराल");
        c13.setUrdu("فلیمنگو۔");
        c13.setPashto("فلیمینګو");
        c13.setArabic("البشروس طائر مائي");
        c13.setFrench("Flamant");
        c13.setGerman("Flamingo");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Seagull");
        c14.setHindi("गंगा-चिल्ली");
        c14.setUrdu("سیگل");
        c14.setPashto("سیګل");
        c14.setArabic("نورس طائر مائي");
        c14.setFrench("Mouette");
        c14.setGerman("Möwe");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Swallow");
        c15.setHindi("निगलना");
        c15.setUrdu("نگلنا");
        c15.setPashto("تیرول");
        c15.setArabic("السنونو");
        c15.setFrench("Avaler");
        c15.setGerman("Schlucken");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Blackbird");
        c16.setHindi("ब्लेकबेर्द");
        c16.setUrdu("کوئل");
        c16.setPashto("بلیک برډ");
        c16.setArabic("طائر أسود");
        c16.setFrench("Merle");
        c16.setGerman("Amsel");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Penguin");
        c17.setHindi("पेंगुइन");
        c17.setUrdu("پینگوئین");
        c17.setPashto("پینګوین");
        c17.setArabic("البطريق طائر");
        c17.setFrench("Manchot");
        c17.setGerman("der Pinguin");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Robin bird");
        c18.setHindi("रॉबिन पक्षी");
        c18.setUrdu("رابن پرندہ");
        c18.setPashto("د روبین مرغۍ");
        c18.setArabic("روبن الطيور");
        c18.setFrench("Robin oiseau");
        c18.setGerman("Robin Vogel");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Swan");
        c19.setHindi("हंस");
        c19.setUrdu("سوان");
        c19.setPashto("سوان");
        c19.setArabic("بجعة");
        c19.setFrench("Cygne");
        c19.setGerman("der Schwan");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Owl");
        c20.setHindi("उल्लू");
        c20.setUrdu("اللو");
        c20.setPashto("اوول");
        c20.setArabic("بومة");
        c20.setFrench("Hibou");
        c20.setGerman("Eule");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Stork");
        c21.setHindi("सारस");
        c21.setUrdu("بگلا");
        c21.setPashto("سټورک");
        c21.setArabic("طائر اللقلق");
        c21.setFrench("Cigogne");
        c21.setGerman("Storch");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Woodpecker");
        c22.setHindi("कठफोड़वा");
        c22.setUrdu("ووڈپیکر");
        c22.setPashto("وډپیکر");
        c22.setArabic("نقار الخشب");
        c22.setFrench("Pivert");
        c22.setGerman("Specht");
        list.add(c22);


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

package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Animals_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals__vocabulary);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

        RecyclerView view = (RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list = new ArrayList<>();

        Data_Container c10 = new Data_Container();
        c10.setEnglish("Ducks");
        c10.setHindi("बतख");
        c10.setUrdu("بطخ");
        c10.setPashto("هیلۍ");
        c10.setArabic("بطة");
        c10.setFrench("Cane");
        c10.setGerman("Ente");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Pig");
        c11.setHindi("सूअर");
        c11.setUrdu("پگ");
        c11.setPashto("سور");
        c11.setArabic("خنزير");
        c11.setFrench("Truie");
        c11.setGerman("Schwein");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Goat");
        c12.setHindi("बकरा");
        c12.setUrdu("بکرا۔");
        c12.setPashto("وزه");
        c12.setArabic("خنزير");
        c12.setFrench("Truie");
        c12.setGerman("Schwein");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Crab");
        c13.setHindi("केकड़ा");
        c13.setUrdu("کیکڑے۔");
        c13.setPashto("چنګاښ");
        c13.setArabic("سلطعون");
        c13.setFrench("Crabe");
        c13.setGerman("Krabbe");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Deer");
        c14.setHindi("हिरन");
        c14.setUrdu("ہرن");
        c14.setPashto("هرن");
        c14.setArabic("الغزال");
        c14.setFrench("Biche");
        c14.setGerman("Hirsch");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Sheep");
        c15.setHindi("भेड़");
        c15.setUrdu("بھیڑ۔");
        c15.setPashto("پسه");
        c15.setArabic("خروف");
        c15.setFrench("Brebis");
        c15.setGerman("Schaf");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Fish");
        c16.setHindi("मछली");
        c16.setUrdu("مچھلی");
        c16.setPashto("کب");
        c16.setArabic("سمك");
        c16.setFrench("Poisson");
        c16.setGerman("Fisch");
        list.add(c16);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Dog");
        c1.setHindi("कुत्ता");
        c1.setUrdu("کتا");
        c1.setPashto("سپی");
        c1.setArabic("الكلب");
        c1.setFrench("Chienne");
        c1.setGerman("Hund");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Puppy");
        c2.setHindi("कुत्ते का बच्चा");
        c2.setUrdu("کتے۔");
        c2.setPashto("ګوډاګی");
        c2.setArabic("جرو");
        c2.setFrench("Chiot");
        c2.setGerman("Hündchen");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Rabbit");
        c3.setHindi("खरगोश");
        c3.setUrdu("خرگوش۔");
        c3.setPashto("سوى");
        c3.setArabic("أرنب");
        c3.setFrench("Lapine");
        c3.setGerman("Hase");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Parrot");
        c4.setHindi("तोता");
        c4.setUrdu("طوطا");
        c4.setPashto("پارچه");
        c4.setArabic("ببغاء");
        c4.setFrench("Perroquet");
        c4.setGerman("Papagei");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Cat");
        c5.setHindi("बिल्ली");
        c5.setUrdu("کیٹ");
        c5.setPashto("پيشو");
        c5.setArabic("قط");
        c5.setFrench("Chatte");
        c5.setGerman("Katze");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Goldfish");
        c6.setHindi("ज़र्द मछली");
        c6.setUrdu("گولڈ فش");
        c6.setPashto("زرد کب");
        c6.setArabic("ذهبية");
        c6.setFrench("Poisson rouge");
        c6.setGerman("Goldfisch");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Mouse");
        c7.setHindi("माउस");
        c7.setUrdu("ماؤس");
        c7.setPashto("موږک");
        c7.setArabic("الفأر");
        c7.setFrench("Souris");
        c7.setGerman("Maus");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Hamste");
        c8.setHindi("हम्सटर");
        c8.setUrdu("ہمسٹ");
        c8.setPashto("همسټ");
        c8.setArabic("Hamste");
        c8.setFrench("Hamste");
        c8.setGerman("Hamste");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Cow");
        c9.setHindi("गाय");

        list.add(c9);

        Data_Container c17 = new Data_Container();
        c17.setEnglish("Turkey");
        c17.setHindi("तुर्की");

        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Chicken");
        c18.setHindi("मुर्गी");
        c18.setUrdu("چکن");
        c18.setPashto("چرګه");
        c18.setArabic("دجاج");
        c18.setFrench("poulet");
        c18.setGerman("Hähnchen");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Horse");
        c19.setHindi("घोड़ा");
        c19.setUrdu("گھوڑا");
        c19.setPashto("اسونه");
        c19.setArabic("حصان");
        c19.setFrench("Jument");
        c19.setGerman("Pferd");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Donkey");
        c20.setHindi("Donkey");
        c20.setUrdu("گدھا۔");
        c20.setPashto("خره");
        c20.setArabic("حمار");
        c20.setFrench("Ânesse");
        c20.setGerman("Esel");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Tiger");
        c21.setHindi("बाघ");
        c21.setUrdu("چیتا");
        c21.setPashto("پړانګ");
        c21.setArabic("نمر");
        c21.setFrench("Tigresse");
        c21.setGerman("Tiger");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Lion");
        c22.setHindi("सिंह");
        c22.setUrdu("شیر");
        c22.setPashto("شیر");
        c22.setArabic("أسد");
        c22.setFrench("Lionne");
        c22.setGerman("Löwe");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Panda");
        c23.setHindi("पांडा");
        c23.setUrdu("پانڈا");
        c23.setPashto("پانډا");
        c23.setArabic("الباندا");
        c23.setFrench("Panda");
        c23.setGerman("Panda");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Elephant");
        c24.setHindi("हाथी");
        c24.setUrdu("ہاتھی۔");
        c24.setPashto("هاتۍ");
        c24.setArabic("فيل");
        c24.setFrench("l'éléphant");
        c24.setGerman("Elefant");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Bear");
        c25.setHindi("भालू");
        c25.setUrdu("برداشت کرنا۔");
        c25.setPashto("وږه");
        c25.setArabic("يتحمل");
        c25.setFrench("Ourse");
        c25.setGerman("Bär");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Monkey");
        c26.setHindi("बंदर");
        c26.setUrdu("بندر۔");
        c26.setPashto("بیزو");
        c26.setArabic("قرد");
        c26.setFrench("Guenon");
        c26.setGerman("Affe");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Fox");
        c27.setHindi("लोमड़ी");
        c27.setUrdu("لومڑی");
        c27.setPashto("فاکس");
        c27.setArabic("ثعلب");
        c27.setFrench("Renarde");
        c27.setGerman("Fox");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Hedgehong");
        c28.setHindi("कांटेदार जंगली चूहा");
        c28.setUrdu("ہیج ہاگ۔");
        c28.setPashto("هایجګ");
        c28.setArabic("قنفذ");
        c28.setFrench("Hérissonne");
        c28.setGerman("Igel");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Camel");
        c29.setHindi("ऊंट");
        c29.setUrdu("اونٹ");
        c29.setPashto("اوښ");
        c29.setArabic("جمل");
        c29.setFrench("chameau");
        c29.setGerman("Kamel");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Buffalo");
        c30.setHindi("भेंस");
        c30.setUrdu("بھینس");
        c30.setPashto("alal.");
        c30.setArabic("جاموس");
        c30.setFrench("Bufflonne");
        c30.setGerman("Buffalo");
        list.add(c30);


// 31 --- 40

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Koala");
        c31.setHindi("कोअला");
        c31.setUrdu("کوآلا۔");
        c31.setPashto("کوالا");
        c31.setArabic("الكوال دب أسترالي");
        c31.setFrench("Koala");
        c31.setGerman("Koala");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Raccoon");
        c32.setHindi("एक प्रकार का जानवर");
        c32.setUrdu("ایک قسم کا جانور");
        c32.setPashto("ریکون");
        c32.setArabic("حيوان الراكون");
        c32.setFrench("Raton laveur");
        c32.setGerman("Waschbär");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Dolphin");
        c33.setHindi("डॉल्फिन");

        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Lizard");
        c34.setHindi("छिपकली");

        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Walrus");
        c35.setHindi("वालरस");

        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Lobster");
        c36.setHindi("झींगा मछली");

        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Coral");
        c37.setHindi("मूंगा");

        list.add(c37);

        Data_Container c38 = new Data_Container();
        c38.setEnglish("Ox");
        c38.setHindi("बैल");
        c38.setUrdu("بیل۔");
        c38.setPashto("اکس");
        c38.setArabic("ثور");
        c38.setFrench("Vache");
        c38.setGerman("Ochse");
        list.add(c38);


        Data_Container c39 = new Data_Container();
        c39.setEnglish("Shrimp");
        c39.setHindi("झींगा");
        c39.setUrdu("کیکڑے۔");
        c39.setPashto("چنګاښ");
        c39.setArabic("ثور");
        c39.setFrench("Vache");
        c39.setGerman("Ochse");
        list.add(c39);


        Data_Container c40 = new Data_Container();
        c40.setEnglish("Giraffe");
        c40.setHindi("जिराफ़");
        c40.setUrdu("جراف۔");
        c40.setPashto("جراف");
        c40.setArabic("زرافة");
        c40.setFrench("Giraffe...");
        c40.setGerman("Giraffe");
        list.add(c40);



        adapter = new Phrases_Recycle_Adapter(this, list, false);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


}

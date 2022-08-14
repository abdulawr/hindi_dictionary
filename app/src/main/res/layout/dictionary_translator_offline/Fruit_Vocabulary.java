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

public class Fruit_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit__vocabulary);


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
        c1.setEnglish("Apple");
        c1.setHindi("सेब");
        c1.setUrdu("سیب");
        c1.setPashto("سیب");
        c1.setArabic("تفاحة");
        c1.setFrench("Pomme");
        c1.setGerman("Apfel");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Apricot");
        c2.setHindi("खुबानी");
        c2.setUrdu("خوبانی");
        c2.setPashto("مندته");
        c2.setArabic("مشمش");
        c2.setFrench("Abricot");
        c2.setGerman("Aprikose");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Banana");
        c3.setHindi("केला");
        c3.setUrdu("کیلا");
        c3.setPashto("كيله");
        c3.setArabic("موز");
        c3.setFrench("banane");
        c3.setGerman("Banane");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Black Currant");
        c4.setHindi("ब्लैक करंट");
        c4.setUrdu("کالی کشمش");
        c4.setPashto("تور کرانټ");
        c4.setArabic("الكشمش الأسود");
        c4.setFrench("Cassis");
        c4.setGerman("Schwarze Johannisbeere");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Blueberry");
        c5.setHindi("ब्लूबेरी");
        c5.setUrdu("بلیو بیری");
        c5.setPashto("توت");
        c5.setArabic("توت بري");
        c5.setFrench("Myrtille");
        c5.setGerman("Blaubeere");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Custard apple");
        c6.setHindi("शरीफा");
        c6.setUrdu("شریفہ");
        c6.setPashto("شریفہ");
        c6.setArabic("تفاح الكسترد");
        c6.setFrench("Pomme à la crème");
        c6.setGerman("Pudding Apfel");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Fig");
        c7.setHindi("अंजीर");
        c7.setUrdu("انجیر");
        c7.setPashto("اينځر");
        c7.setArabic("تين");
        c7.setFrench("Figure");
        c7.setGerman("Feige");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Gooseberry");
        c8.setHindi("करौंदा");
        c8.setUrdu("کروندا");
        c8.setPashto("بوزبیری");
        c8.setArabic("عنب الثعلب");
        c8.setFrench("Groseille à maquereau");
        c8.setGerman("Stachelbeere");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Grapes");
        c9.setHindi("अंगूर");
        c9.setUrdu("انگور۔");
        c9.setPashto("انګور");
        c9.setArabic("عنب");
        c9.setFrench("les raisins");
        c9.setGerman("Trauben");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Guava");
        c10.setHindi("अमरूद");
        c10.setUrdu("امرود");
        c10.setPashto("امرود");
        c10.setArabic("جوافة");
        c10.setFrench("Goyave");
        c10.setGerman("Guave");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Jackfruit");
        c11.setHindi("कटहल");
        c11.setUrdu("جیک فروٹ");
        c11.setPashto("جاک فروټ");
        c11.setArabic("الكاكايا");
        c11.setFrench("Jacquier");
        c11.setGerman("Jackfrucht");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Lemon");
        c12.setHindi("नींबू");
        c12.setUrdu("لیموں");
        c12.setPashto("ليمو");
        c12.setArabic("ليمون");
        c12.setFrench("citron");
        c12.setGerman("Zitrone");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Lychee");
        c13.setHindi("लीची");
        c13.setUrdu("لیچی");
        c13.setPashto("لیچي");
        c13.setArabic("ليتشي");
        c13.setFrench("Litchi");
        c13.setGerman("Litschi");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Mango");
        c14.setHindi("आम");
        c14.setUrdu("آم");
        c14.setPashto("آم");
        c14.setArabic("مانجو");
        c14.setFrench("Mangue");
        c14.setGerman("Mango");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Mulberry");
        c15.setHindi("शहतूत");
        c15.setUrdu("مل بیری");
        c15.setPashto("توت");
        c15.setArabic("توت");
        c15.setFrench("Mûre");
        c15.setGerman("Maulbeere");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Orange");
        c16.setHindi("संतरा");
        c16.setUrdu("کینو");
        c16.setPashto("نارنج");
        c16.setArabic("البرتقالي");
        c16.setFrench("Orange");
        c16.setGerman("Orange");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Papaya");
        c17.setHindi("पपीता");
        c17.setUrdu("پپیتا");
        c17.setPashto("پپیتا");
        c17.setArabic("بابايا");
        c17.setFrench("Papaye");
        c17.setGerman("Papaya");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Peach");
        c18.setHindi("आड़ू");
        c18.setUrdu("آڑو");
        c18.setPashto("شفتالو");
        c18.setArabic("خوخ");
        c18.setFrench("Pêche");
        c18.setGerman("Pfirsich");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Pineapple");
        c19.setHindi("अनानास");
        c19.setUrdu("انناس");
        c19.setPashto("انناس");
        c19.setArabic("أناناس");
        c19.setFrench("Ananas");
        c19.setGerman("Ananas");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Pomegranate");
        c20.setHindi("अनार");
        c20.setUrdu("انار");
        c20.setPashto("انار");
        c20.setArabic("رمان");
        c20.setFrench("Grenade");
        c20.setGerman("Granatapfel");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Sweetlime");
        c21.setHindi("मीठा नींबू");
        c21.setUrdu("پیاری۔");
        c21.setPashto("خواږه");
        c21.setArabic("ليمون حلو");
        c21.setFrench("Citron doux");
        c21.setGerman("Süße Limone");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Starfruit");
        c22.setHindi("starfruit");
        c22.setUrdu("ستارہ پھل");
        c22.setPashto("سټار فروټ");
        c22.setArabic("فاكهة النجمة");
        c22.setFrench("Carambole");
        c22.setGerman("Sternfrucht");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Tamarind ");
        c23.setHindi("इमली");
        c23.setUrdu("املی");
        c23.setPashto("تامرند");
        c23.setArabic("تمر هندي");
        c23.setFrench("Tamarin");
        c23.setGerman("Tamarinde");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Water-melon");
        c24.setHindi("तरबूज");
        c24.setUrdu("تربوز");
        c24.setPashto("هيند واڼه");
        c24.setArabic("البطيخ");
        c24.setFrench("Pastèque");
        c24.setGerman("Wassermelone");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Cucumber");
        c25.setHindi("खीरा");
        c25.setUrdu("کھیرا");
        c25.setPashto("بادرنګ");
        c25.setArabic("خيار");
        c25.setFrench("Concombre");
        c25.setGerman("Gurke");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Mulberry");
        c26.setHindi("शहतूत");
        c26.setUrdu("مل بیری");
        c26.setPashto("توت");
        c26.setArabic("توت");
        c26.setFrench("Mûre");
        c26.setGerman("Maulbeere");
        list.add(c26);


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

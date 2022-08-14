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

public class Food_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__vocabulary);


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
        c1.setEnglish("Salad");
        c1.setHindi("सलाद");
        c1.setUrdu("ترکاریاں۔");
        c1.setPashto("سلاد");
        c1.setArabic("سلطة");
        c1.setFrench("salade");
        c1.setGerman("Salat");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sandwich");
        c2.setHindi("सैंडविच");
        c2.setUrdu("سینڈوچ۔");
        c2.setPashto("سانډویچ");
        c2.setArabic("ساندويتش");
        c2.setFrench("Sandwich ");
        c2.setGerman("Sandwich");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Water");
        c3.setHindi("पानी");
        c3.setUrdu("پانی");
        c3.setPashto("اوبه");
        c3.setArabic("ماء");
        c3.setFrench("Eau");
        c3.setGerman("Wasser");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Bread");
        c4.setHindi("रोटी");
        c4.setUrdu("روٹی۔");
        c4.setPashto("ډوډۍ");
        c4.setArabic("خبز");
        c4.setFrench("Pain");
        c4.setGerman("Brot");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Steak");
        c5.setHindi("स्टेक");
        c5.setUrdu("اسٹیک");
        c5.setPashto("سټیک");
        c5.setArabic("شريحة لحم");
        c5.setFrench("Steak");
        c5.setGerman("Steak");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Milk");
        c6.setHindi("दूध");
        c6.setUrdu("دودھ۔");
        c6.setPashto("شيدې");
        c6.setArabic("حليب");
        c6.setFrench("Lait");
        c6.setGerman("Milch");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Fish");
        c7.setHindi("मछली");
        c7.setUrdu("مچھلی");
        c7.setPashto("کب");
        c7.setArabic("سمك");
        c7.setFrench("Poisson");
        c7.setGerman("Fish");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Ice Cream");
        c8.setHindi("आइसक्रीम");
        c8.setUrdu("آئس کریم");
        c8.setPashto("ایسکریم");
        c8.setArabic("بوظة");
        c8.setFrench("Crème glacée");
        c8.setGerman("Eis");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Tea");
        c9.setHindi("चाय");
        c9.setUrdu("چائے۔");
        c9.setPashto("چاى");
        c9.setArabic("شاي");
        c9.setFrench("Tee");
        c9.setGerman("Tee");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Coffee");
        c10.setHindi("कॉफ़ी");
        c10.setUrdu("کافی۔");
        c10.setPashto("کافي");
        c10.setArabic("قهوة");
        c10.setFrench("café");
        c10.setGerman("Kaffee");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Rice");
        c11.setHindi("चावल");
        c11.setUrdu("چاول");
        c11.setPashto("وريجې");
        c11.setArabic("Riz");
        c11.setFrench("Riz");
        c11.setGerman("Reis");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Spaghetti");
        c12.setHindi("स्पघेटी");
        c12.setUrdu("سپتیٹی");
        c12.setPashto("سپاګیټي");
        c12.setArabic("معكرونة");
        c12.setFrench("Spaghetti");
        c12.setGerman("Spaghetti");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Pizza");
        c13.setHindi("पिज़्ज़ा");
        c13.setUrdu("پیزا");
        c13.setPashto("پیزا");
        c13.setArabic("بيتزا");
        c13.setFrench("Pizza");
        c13.setGerman("Pizza");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Eggs");
        c14.setHindi("अंडे");
        c14.setUrdu("انڈے۔");
        c14.setPashto("هګۍ");
        c14.setArabic("بيض");
        c14.setFrench("Des œufs");
        c14.setGerman("Eier");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Cheese");
        c15.setHindi("पनीर");
        c15.setUrdu("پنیر۔");
        c15.setPashto("پنیر");
        c15.setArabic("جبنه");
        c15.setFrench("Fromage");
        c15.setGerman("Käse");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Juice");
        c16.setHindi("रस");
        c16.setUrdu("رس۔");
        c16.setPashto("جوس");
        c16.setArabic("عصير");
        c16.setFrench("jus");
        c16.setGerman("Saft");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Candy");
        c17.setHindi("कैंडी");
        c17.setUrdu("کینڈی");
        c17.setPashto("خواږه");
        c17.setArabic("حلويات");
        c17.setFrench("Bonbons");
        c17.setGerman("Süßigkeiten");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Cookie");
        c18.setHindi("CakeCookie");
        c18.setUrdu("کیک کوکی۔");
        c18.setPashto("کیک کوکی");
        c18.setArabic("بسكويت");
        c18.setFrench("Biscuit");
        c18.setGerman("Plätzchen");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Cake");
        c19.setHindi("केक");
        c19.setUrdu("کیک");
        c19.setPashto("کیک");
        c19.setArabic("كيك");
        c19.setFrench("gâteau");
        c19.setGerman("Kuchen");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Wheat");
        c20.setHindi("गेहूँ");
        c20.setUrdu("گندم۔");
        c20.setPashto("غنم");
        c20.setArabic("قمح");
        c20.setFrench("Blé");
        c20.setGerman("Weizen");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Salt");
        c21.setHindi("नमक");
        c21.setUrdu("نمک");
        c21.setPashto("مالګه");
        c21.setArabic("ملح");
        c21.setFrench("Sel");
        c21.setGerman("Salz");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Mustard");
        c22.setHindi("सरसों");
        c22.setUrdu("سرسوں۔");
        c22.setPashto("سرې");
        c22.setArabic("خردل");
        c22.setFrench("Moutarde");
        c22.setGerman("Senf");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Butter");
        c23.setHindi("मक्खन");
        c23.setUrdu("مکھن۔");
        c23.setPashto("کوچ");
        c23.setArabic("زبدة");
        c23.setFrench("Beurre");
        c23.setGerman("Butter");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Soups");
        c24.setHindi("सूप");
        c24.setUrdu("سوپس۔");
        c24.setPashto("سوپونه");
        c24.setArabic("حساء");
        c24.setFrench("Soupes");
        c24.setGerman("Suppen");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Potato Sticks");
        c25.setHindi("आलू की छड़ें");
        c25.setUrdu("آلو کی لاٹھی۔");
        c25.setPashto("د کچالو ډډونه");
        c25.setArabic("عصي البطاطا");
        c25.setFrench("Bâtons de pomme de terre");
        c25.setGerman("Kartoffelstangen");
        list.add(c25);




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

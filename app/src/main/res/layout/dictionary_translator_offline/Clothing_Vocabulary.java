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

public class Clothing_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing__vocabulary);


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

        Data_Container c4 = new Data_Container();
        c4.setEnglish("Coat");
        c4.setHindi("कोट");
        c4.setUrdu("کوٹ");
        c4.setPashto("کوټ");
        c4.setArabic("معطف");
        c4.setFrench("Manteau");
        c4.setGerman("Mantel");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Jeans");
        c5.setHindi("जीन्स");
        c5.setUrdu("جینس");
        c5.setPashto("جینس");
        c5.setArabic("جينز");
        c5.setFrench("jeans");
        c5.setGerman("Jeans");
        list.add(c5);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("T-shirt");
        c1.setHindi("टीशर्ट");
        c1.setUrdu("ٹی شرٹ");
        c1.setPashto("ټي شرټ");
        c1.setArabic("تي شيرت");
        c1.setFrench("T-shirt");
        c1.setGerman("T-Shirt");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sweater");
        c2.setHindi("स्वेटर");
        c2.setUrdu("سویٹر۔");
        c2.setPashto("سویټر");
        c2.setArabic("سترة");
        c2.setFrench("Chandail");
        c2.setGerman("Sweatshirt");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Jacket");
        c3.setHindi("जैकेट");
        c3.setUrdu("جیکٹ");
        c3.setPashto("جاکټ");
        c3.setArabic("السترة");
        c3.setFrench("Veste");
        c3.setGerman("Jacke");
        list.add(c3);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Socks");
        c6.setHindi("मोज़े");
        c6.setUrdu("موزے۔");
        c6.setPashto("جرابې");
        c6.setArabic("جوارب");
        c6.setFrench("Chaussettes");
        c6.setGerman("Socken");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Shorts");
        c7.setHindi("निकर");
        c7.setUrdu("شارٹس");
        c7.setPashto("شارټس");
        c7.setArabic("السراويل القصيرة");
        c7.setFrench("Short");
        c7.setGerman("Kurze Hose");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Tracksuit");
        c8.setHindi("ट्रैक");
        c8.setUrdu("ٹریکس سوٹ");
        c8.setPashto("ټریکسوټ");
        c8.setArabic("بدلة رياضية");
        c8.setFrench("Survêtement");
        c8.setGerman("Trainingsanzug");
        list.add(c8);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Shoes");
        c11.setHindi("जूते");
        c11.setUrdu("جوتے۔");
        c11.setPashto("بوټونه");
        c11.setArabic("أحذية");
        c11.setFrench("Des chaussures");
        c11.setGerman("Schuhe");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Skirt");
        c12.setHindi("स्कर्ट");
        c12.setUrdu("اسکرٹ");
        c12.setPashto("سکرټ");
        c12.setArabic("تنورة");
        c12.setFrench("Jupe");
        c12.setGerman("Rock");
        list.add(c12);

        Data_Container c9 = new Data_Container();
        c9.setEnglish("Vest");
        c9.setHindi("बनियान");
        c9.setUrdu("بنیان");
        c9.setPashto("واسکټ");
        c9.setArabic("سترة");
        c9.setFrench("Gilet");
        c9.setGerman("Weste");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Pyjamas");
        c10.setHindi("पाजामा");
        c10.setUrdu("پاجامہ۔");
        c10.setPashto("پاجاما");
        c10.setArabic("لباس نوم");
        c10.setFrench("Pyjamas");
        c10.setGerman("Pyjama");
        list.add(c10);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Dress");
        c13.setHindi("पोशाक");
        c13.setUrdu("لباس");
        c13.setPashto("کالي");
        c13.setArabic("فستان");
        c13.setFrench("Robe");
        c13.setGerman("Kleid");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Heels");
        c14.setHindi("हील");
        c14.setUrdu("ہیلس");
        c14.setPashto("ہیلس");
        c14.setArabic("كعوب");
        c14.setFrench("Talons");
        c14.setGerman("Absätze");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Tie");
        c15.setHindi("गुलोबन्द");
        c15.setUrdu("ٹائی۔");
        c15.setPashto("ټی");
        c15.setArabic("ربطة عنق");
        c15.setFrench("Attacher");
        c15.setGerman("Krawatte");
        list.add(c15);

        Data_Container c20 = new Data_Container();
        c20.setEnglish("Earring");
        c20.setHindi("कान की बाली");
        c20.setUrdu("بالی");
        c20.setPashto("غوږوالۍ");
        c20.setArabic("حلق الاذن");
        c20.setFrench("Boucle d'oreille");
        c20.setGerman("Ohrring");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Belt");
        c21.setHindi("बेल्ट");
        c21.setUrdu("بیلٹ");
        c21.setPashto("بیلټ");
        c21.setArabic("حزام");
        c21.setFrench("Ceinture");
        c21.setGerman("Gürtel");
        list.add(c21);

        Data_Container c16 = new Data_Container();
        c16.setEnglish("Sun hat");
        c16.setHindi("धूप की टोपी");
        c16.setUrdu("سورج ٹوپی");
        c16.setPashto("لمر خولۍ");
        c16.setArabic("قبعة الشمس");
        c16.setFrench("chapeau de soleil");
        c16.setGerman("Sonnenhut");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Scarf");
        c17.setHindi("दुपट्टा");
        c17.setUrdu("سکارف");
        c17.setPashto("سکارف");
        c17.setArabic("وشاح");
        c17.setFrench("Écharpe");
        c17.setGerman("Schal");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Glasses");
        c18.setHindi("चश्मा");
        c18.setUrdu("شیشے");
        c18.setPashto("عينکې");
        c18.setArabic("نظارات");
        c18.setFrench("Des lunettes");
        c18.setGerman("Brille");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Bag");
        c19.setHindi("बैग");
        c19.setUrdu("بیگ");
        c19.setPashto("کڅوړه");
        c19.setArabic("كيس");
        c19.setFrench("Sac");
        c19.setGerman("Tasche");
        list.add(c19);


        Data_Container c22 = new Data_Container();
        c22.setEnglish("Necklace");
        c22.setHindi("हार");
        c22.setUrdu("ہار۔");
        c22.setPashto("غاړه");
        c22.setArabic("قلادة");
        c22.setFrench("Collier");
        c22.setGerman("Halskette");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Wallet");
        c23.setHindi("बटुआ");
        c23.setUrdu("پرس");
        c23.setPashto("بټوه");
        c23.setArabic("محفظة نقود");
        c23.setFrench("Portefeuille");
        c23.setGerman("Brieftasche");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Handkerchief");
        c24.setHindi("रूमाल");
        c24.setUrdu("رومال۔");
        c24.setPashto("رومال");
        c24.setArabic("منديل");
        c24.setFrench("Mouchoir");
        c24.setGerman("Taschentuch");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Suit");
        c25.setHindi("सूट");
        c25.setUrdu("سوٹ");
        c25.setPashto("سوټ");
        c25.setArabic("بدلة");
        c25.setFrench("Costume");
        c25.setGerman("Passen");
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

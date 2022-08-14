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

public class Dry_Fruit_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry__fruit__vocabulary);


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
        c1.setEnglish("Almonds");
        c1.setHindi("बादाम");
        c1.setUrdu("بادام");
        c1.setPashto("بادام");
        c1.setArabic("لوز");
        c1.setFrench("Amandes");
        c1.setGerman("Mandeln");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Pistachio");
        c2.setHindi("पिस्ता");
        c2.setUrdu("پستہ");
        c2.setPashto("پسته");
        c2.setArabic("فستق");
        c2.setFrench("Pistache");
        c2.setGerman("Pistazie");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Walnuts");
        c3.setHindi("अखरोट");
        c3.setUrdu("اخروٹ");
        c3.setPashto("اخروټ");
        c3.setArabic("عين الجمل");
        c3.setFrench("Noix");
        c3.setGerman("Walnüsse");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Areca Nut");
        c4.setHindi("सुपारी");
        c4.setUrdu("چھالیہ");
        c4.setPashto("اریکا نټ");
        c4.setArabic("أريكا الجوز");
        c4.setFrench("Noix d'arec");
        c4.setGerman("Arecanuß");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Cashew Nut");
        c5.setHindi("काजू");
        c5.setUrdu("کاجو");
        c5.setPashto("کاجو مغز");
        c5.setArabic("جوز الكاجو");
        c5.setFrench("Noix de cajou");
        c5.setGerman("Cashewnuss");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Raisins");
        c6.setHindi("किशमिश");
        c6.setUrdu("کشمش");
        c6.setPashto("کشمش");
        c6.setArabic("زبيب");
        c6.setFrench("Raisins secs");
        c6.setGerman("Rosinen");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Pine nuts");
        c7.setHindi("पाइन नट्स");
        c7.setUrdu("چلغوزے");
        c7.setPashto("پاین مغز");
        c7.setArabic("الصنوبر والجوز");
        c7.setFrench("pignons de pin");
        c7.setGerman("Pinienkerne");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Dried Apricot");
        c8.setHindi("सूखी खुबानी");
        c8.setUrdu("سوکھی خوبانی");
        c8.setPashto("وچ زرغون");
        c8.setArabic("مشمش مجفف");
        c8.setFrench("Abricot sec");
        c8.setGerman("Getrocknete Aprikose");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Dried Figs");
        c9.setHindi("सूखे अंजीर");
        c9.setUrdu("انجیر");
        c9.setPashto("وچې پګړۍ");
        c9.setArabic("تين مجفف");
        c9.setFrench("Figues sèches");
        c9.setGerman("Getrocknete Feigen");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Peanuts");
        c10.setHindi("मूंगफली");
        c10.setUrdu("مونگفلی /مونگ پھلی");
        c10.setPashto("مونگ");
        c10.setArabic("الفول السوداني");
        c10.setFrench("Cacahuètes");
        c10.setGerman("Erdnüsse");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Cantaloupe Seeds");
        c11.setHindi("केंटालूप बीज");
        c11.setUrdu("خربوزے کےبیج");
        c11.setPashto("د کانټالوپ تخمونه");
        c11.setArabic("بذور الشمام");
        c11.setFrench("Graines de cantaloup");
        c11.setGerman("Cantaloupe Samen");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Dates Dried");
        c12.setHindi("खजूर सूखे");
        c12.setUrdu("چھوارے");
        c12.setPashto("نیټې وچې شوې");
        c12.setArabic("تمور مجففة");
        c12.setFrench("Dates séchées");
        c12.setGerman("Datteln getrocknet");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Flax Seeds");
        c13.setHindi("अलसी का बीज");
        c13.setUrdu("السی");
        c13.setPashto("د زغر تخمونه");
        c13.setArabic("كستناء");
        c13.setFrench("châtaigne");
        c13.setGerman("Kastanie");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Chestnut");
        c14.setHindi("शाहबलूत");
        c14.setUrdu("شاہ بلوط");
        c14.setPashto("Chestnut");
        c14.setArabic("كستناء");
        c14.setFrench("châtaigne");
        c14.setGerman("Kastanie");
        list.add(c14);


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

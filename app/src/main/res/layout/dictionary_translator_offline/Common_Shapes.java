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

public class Common_Shapes extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common__shapes);


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


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Rhombus");
        c9.setHindi("विषमकोण");
        c9.setUrdu("رومبس");
        c9.setPashto("رومبس");
        c9.setArabic("معين هندسي");
        c9.setFrench("Rhombe");
        c9.setGerman("Rhombus");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Square");
        c10.setHindi("वर्ग");
        c10.setUrdu("مربع");
        c10.setPashto("چوکۍ");
        c10.setArabic("ميدان");
        c10.setFrench("Carré");
        c10.setGerman("Quadrat");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Pentagon");
        c11.setHindi("पंचकोण");
        c11.setUrdu("پینٹاگون۔");
        c11.setPashto("پنټاګون");
        c11.setArabic("خماسي الاضلاع");
        c11.setFrench("Pentagone");
        c11.setGerman("Pentagon");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Circle");
        c12.setHindi("वृत्त");
        c12.setUrdu("دائرہ");
        c12.setPashto("حلقه");
        c12.setArabic("دائرة");
        c12.setFrench("Cercle");
        c12.setGerman("Kreis");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Oval");
        c13.setHindi("अंडाकार");
        c13.setUrdu("اوول۔");
        c13.setPashto("اوول");
        c13.setArabic("بيضوي");
        c13.setFrench("ovale");
        c13.setGerman("Oval");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Heart");
        c14.setHindi("दिल");
        c14.setUrdu("دل");
        c14.setPashto("هرات");
        c14.setArabic("قلب");
        c14.setFrench("Cœur");
        c14.setGerman("Herz");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Cross");
        c15.setHindi("पार करना");
        c15.setUrdu("کراس");
        c15.setPashto("کراس");
        c15.setArabic("تعبر");
        c15.setFrench("Traverser");
        c15.setGerman("Kreuz");
        list.add(c15);


        Data_Container c1 = new Data_Container();
        c1.setEnglish("Nonagon");
        c1.setHindi("nonagon");
        c1.setUrdu("نانگون۔");
        c1.setPashto("نونګون");
        c1.setArabic("nonagon");
        c1.setFrench("Nonagone");
        c1.setGerman("Nonagon");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Octagon");
        c2.setHindi("अष्टकोना");
        c2.setUrdu("آکٹگون۔");
        c2.setPashto("اوټاګون");
        c2.setArabic("مثمن");
        c2.setFrench("Octogone");
        c2.setGerman("Achteck");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Heptagon");
        c3.setHindi("सातकोणक");
        c3.setUrdu("ہیپٹون۔");
        c3.setPashto("هیپټګان");
        c3.setArabic("مسبع");
        c3.setFrench("Heptagone");
        c3.setGerman("Heptagon");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Hexagon");
        c4.setHindi("षट्कोण");
        c4.setUrdu("مسدس");
        c4.setPashto("مسدس");
        c4.setArabic("سداسي الزوايا");
        c4.setFrench("Hexagone");
        c4.setGerman("Hexagon");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Triangle");
        c5.setHindi("त्रिभुज");
        c5.setUrdu("مثلث۔");
        c5.setPashto("مثلث");
        c5.setArabic("مثلث");
        c5.setFrench("Triangle");
        c5.setGerman("Dreieck");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Scalene triangle");
        c6.setHindi("विषमबाहु त्रिकोण");
        c6.setUrdu("اسکیلین مثلث");
        c6.setPashto("د سکیلین مثلث");
        c6.setArabic("مثلث مختلف الأضلاع");
        c6.setFrench("Triangle scalène");
        c6.setGerman("Ungleichseitiges Dreieck");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Right triangle");
        c7.setHindi("सही त्रिकोण");
        c7.setUrdu("سیدھی مثلث");
        c7.setPashto("ښی مثلث");
        c7.setArabic("مثلث قائم");
        c7.setFrench("Triangle rectangle");
        c7.setGerman("Rechtwinkliges Dreieck");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Parallelogram");
        c8.setHindi("चतुर्भुज");
        c8.setUrdu("متوازی الاضلاع");
        c8.setPashto("موازي پلگرام");
        c8.setArabic("متوازي الاضلاع");
        c8.setFrench("Parallélogramme");
        c8.setGerman("Parallelogramm");
        list.add(c8);

        Data_Container c16 = new Data_Container();
        c16.setEnglish("Arrow");
        c16.setHindi("तीर");
        c16.setUrdu("یرو");
        c16.setPashto("تیر");
        c16.setArabic("سهم");
        c16.setFrench("Flèche");
        c16.setGerman("Pfeil");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Cube");
        c17.setHindi("घनक्षेत्र");
        c17.setUrdu("مکعب۔");
        c17.setPashto("مکعب");
        c17.setArabic("مكعب");
        c17.setFrench("cube");
        c17.setGerman("Würfel");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Cylinder");
        c18.setHindi("सिलेंडर");
        c18.setUrdu("سلنڈر۔");
        c18.setPashto("سلنډر");
        c18.setArabic("أسطوانة");
        c18.setFrench("Cylindre");
        c18.setGerman("Zylinder");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Star");
        c19.setHindi("तारा");
        c19.setUrdu("ستارہ۔");
        c19.setPashto("ستوری");
        c19.setArabic("نجمة");
        c19.setFrench("Étoile");
        c19.setGerman("Star");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Crescent");
        c20.setHindi("क्रिसेंट");
        c20.setUrdu("کریسنٹ");
        c20.setPashto("کریسسنټ");
        c20.setArabic("هلال");
        c20.setFrench("Croissant");
        c20.setGerman("Halbmond");
        list.add(c20);


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

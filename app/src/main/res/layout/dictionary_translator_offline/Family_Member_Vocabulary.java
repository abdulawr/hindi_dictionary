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

public class Family_Member_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__member__vocabulary);



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
        c4.setEnglish("Grandfather");
        c4.setHindi("दादा");
        c4.setUrdu("دادا۔");
        c4.setPashto("نیکه");
        c4.setArabic("جد");
        c4.setFrench("Grand-père");
        c4.setGerman("Großvater");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Grandmother");
        c5.setHindi("दादी मा");
        c5.setUrdu("دادی");
        c5.setPashto("نیا");
        c5.setArabic("جدة");
        c5.setFrench("Grand-mère");
        c5.setGerman("Oma");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Uncle");
        c6.setHindi("चाचा");
        c6.setUrdu("انکل۔");
        c6.setPashto("تره");
        c6.setArabic("اخو الام");
        c6.setFrench("Oncle");
        c6.setGerman("Onkel");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Aunt");
        c7.setHindi("चाची");
        c7.setUrdu("آنٹی");
        c7.setPashto("ترور");
        c7.setArabic("عمة");
        c7.setFrench("Tante");
        c7.setGerman("Tante");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Father");
        c8.setHindi("पिता");
        c8.setUrdu("باپ");
        c8.setPashto("پلار");
        c8.setArabic("الآب");
        c8.setFrench("Père");
        c8.setGerman("Vater");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Mother");
        c9.setHindi("");
        c9.setUrdu("ماں۔");
        c9.setPashto("مور");
        c9.setArabic("أم");
        c9.setFrench("Mère");
        c9.setGerman("Mutter");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Sister");
        c10.setHindi("बहन");
        c10.setUrdu("بہن");
        c10.setPashto("خور");
        c10.setArabic("أخت");
        c10.setFrench("Sœur");
        c10.setGerman("Schwester");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Brother-in-law");
        c11.setHindi("बहनोई");
        c11.setUrdu("سالہ");
        c11.setPashto("اوښی");
        c11.setArabic("شقيق الزوج");
        c11.setFrench("Beau-frère");
        c11.setGerman("Schwager");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Brother");
        c12.setHindi("भाई");
        c12.setUrdu("بھائی۔");
        c12.setPashto("ورور");
        c12.setArabic("شقيق");
        c12.setFrench("Frère");
        c12.setGerman("Bruder");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Sister-in-law");
        c13.setHindi("ननद");
        c13.setUrdu("سالی");
        c13.setPashto("ښینه");
        c13.setArabic("أخت الزوج أو اخت الزوجة");
        c13.setFrench("Belle-soeur");
        c13.setGerman("Schwägerin");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Husband");
        c14.setHindi("पति");
        c14.setUrdu("شوہر۔");
        c14.setPashto("میړه");
        c14.setArabic("الزوج");
        c14.setFrench("Mari");
        c14.setGerman("Mann");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Wife");
        c15.setHindi("पत्नी");
        c15.setUrdu("بیوی۔");
        c15.setPashto("ښځه");
        c15.setArabic("زوجة");
        c15.setFrench("épouse");
        c15.setGerman("Ehefrau");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Cousin");
        c16.setHindi("चचेरा भाई");
        c16.setUrdu("کزن");
        c16.setPashto("د کاکا، ماما، ترور زوی یا لور");
        c16.setArabic("ولد عم");
        c16.setFrench("Cousin");
        c16.setGerman("Cousin");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Cousin’s wife");
        c17.setHindi("चचेरे भाई की पत्नी");
        c17.setUrdu("کزن کی بیوی");
        c17.setPashto("د تره / لور / لور");
        c17.setArabic("زوجة ابن العم");
        c17.setFrench("La femme de cousin");
        c17.setGerman("Cousins Frau");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Nephew");
        c18.setHindi("भतीजा");
        c18.setUrdu("بھتیجے");
        c18.setPashto("وراره");
        c18.setArabic("ابن شقيق");
        c18.setFrench("Neveu");
        c18.setGerman("Neffe");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Niece");
        c19.setHindi("भांजी");
        c19.setUrdu("بھتیجی");
        c19.setPashto("نیسۍ");
        c19.setArabic("ابنة الاخ");
        c19.setFrench("Nièce");
        c19.setGerman("Nichte");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Son");
        c20.setHindi("बेटा");
        c20.setUrdu("بیٹا۔");
        c20.setPashto("زوی");
        c20.setArabic("ابن");
        c20.setFrench("Fils");
        c20.setGerman("Sohn");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Daughter-in-law");
        c21.setHindi("बहु");
        c21.setUrdu("بہو");
        c21.setPashto("نګور");
        c21.setArabic("ابنة بالنسب");
        c21.setFrench("Belle-fille");
        c21.setGerman("Schwiegertochter");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Daughter");
        c22.setHindi("बेटी");
        c22.setUrdu("بیٹی۔");
        c22.setPashto("لور");
        c22.setArabic("ابنة");
        c22.setFrench("Fille");
        c22.setGerman("Tochter");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Grandson");
        c23.setHindi("पोता");
        c23.setUrdu("پوتا۔");
        c23.setPashto("لمسی");
        c23.setArabic("حفيد");
        c23.setFrench("Petit fils");
        c23.setGerman("Enkel");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Granddaughter");
        c24.setHindi("प्रेमिका");
        c24.setUrdu("گرل فرینڈ");
        c24.setPashto("انجلۍ");
        c24.setArabic("حفيدة");
        c24.setFrench("Petite fille");
        c24.setGerman("Enkelin");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Girlfriend");
        c25.setHindi("प्रेमिका");
        c25.setUrdu("گرل فرینڈ");
        c25.setPashto("انجلۍ");
        c25.setArabic("صديقة");
        c25.setFrench("Petite amie");
        c25.setGerman("Freundin");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Teen");
        c26.setHindi("सगाई");
        c26.setUrdu("مشغولیت۔");
        c26.setPashto("مشغولیت");
        c26.setArabic("في سن المراهقة");
        c26.setFrench("Teen");
        c26.setGerman("Teen");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Marriage");
        c27.setHindi("सगाई");
        c27.setUrdu("مشغولیت۔");
        c27.setPashto("مشغولیت");
        c27.setArabic("زواج");
        c27.setFrench("Mariage");
        c27.setGerman("Ehe");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Engagement");
        c28.setHindi("सगाई");
        c28.setUrdu("مشغولیت۔");
        c28.setPashto("مشغولیت");
        c28.setArabic("الارتباط");
        c28.setFrench("Engagement");
        c28.setGerman("Engagement");
        list.add(c28);


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

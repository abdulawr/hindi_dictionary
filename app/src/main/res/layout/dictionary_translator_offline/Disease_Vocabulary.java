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

public class Disease_Vocabulary extends AppCompatActivity {
    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease__vocabulary);

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

        view=(RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list=new ArrayList<>();

        Data_Container c1=new Data_Container();
        c1.setEnglish("Allergies");
        c1.setHindi("एलर्जी");
        c1.setUrdu("االرجی");
        c1.setPashto("الرجی");
        c1.setArabic("الحساسية");
        c1.setFrench("Les allergies");
        c1.setGerman("Allergien");
        list.add(c1);

        Data_Container c2=new Data_Container();
        c2.setEnglish("Alzheimer's");
        c2.setHindi("भूलने की बीमारी");
        c2.setUrdu("الزائمر");
        c2.setPashto("د الزایمر");
        c2.setArabic("مرض الزهايمر");
        c2.setFrench("alzheimer");
        c2.setGerman("Alzheimer");
        list.add(c2);


        Data_Container c3=new Data_Container();
        c3.setEnglish("Arthritis");
        c3.setHindi("गठिया");
        c3.setUrdu("گٹھیا");
        c3.setPashto("د مفصلونو پاړسوب");
        c3.setArabic("التهاب المفاصل");
        c3.setFrench("Arthrite");
        c3.setGerman("Arthritis");
        list.add(c3);


        Data_Container c4=new Data_Container();
        c4.setEnglish("Asthma");
        c4.setHindi("दमा");
        c4.setUrdu("دمہ");
        c4.setPashto("سالنډۍ");
        c4.setArabic("الربو");
        c4.setFrench("Asthme");
        c4.setGerman("Asthma");
        list.add(c4);


        Data_Container c5=new Data_Container();
        c5.setEnglish("Cancer");
        c5.setHindi("कैंसर");
        c5.setUrdu("کینسر");
        c5.setPashto("سرطان");
        c5.setArabic("سرطان");
        c5.setFrench("Cancer");
        c5.setGerman("Krebs");
        list.add(c5);


        Data_Container c6=new Data_Container();
        c6.setEnglish("Cholesterol");
        c6.setHindi("कोलेस्ट्रॉल");
        c6.setUrdu("کولیسٹرول۔");
        c6.setPashto("کولیسټرول");
        c6.setArabic("كولسترول");
        c6.setFrench("Cholestérol");
        c6.setGerman("Cholesterin");
        list.add(c6);


        Data_Container c7=new Data_Container();
        c7.setEnglish("Chronic Pain");
        c7.setHindi("पुराना दर्द");
        c7.setUrdu("دائمی درد");
        c7.setPashto("اوږد درد");
        c7.setArabic("ألم مزمن");
        c7.setFrench("La douleur chronique");
        c7.setGerman("Chronischer Schmerz");
        list.add(c7);


        Data_Container c8=new Data_Container();
        c8.setEnglish("Broken bone");
        c8.setHindi("टूटी हुई हड्डी");
        c8.setUrdu("ٹوٹی ہوئ ہڈی");
        c8.setPashto("مات شوي هډوکي");
        c8.setArabic("عظم مكسور");
        c8.setFrench("OS cassé");
        c8.setGerman("Gebrochener Knochen");
        list.add(c8);


        Data_Container c9=new Data_Container();
        c9.setEnglish("Depression");
        c9.setHindi("डिप्रेशन");
        c9.setUrdu("ذہنی دباؤ");
        c9.setPashto("خپګان");
        c9.setArabic("كآبة");
        c9.setFrench("Une dépression");
        c9.setGerman("Depression");
        list.add(c9);


        Data_Container c10=new Data_Container();
        c10.setEnglish("Runny nose");
        c10.setHindi("बहती नाक");
        c10.setUrdu("بہتی ہوئی ناک");
        c10.setPashto("بهېدونکې پوزه");
        c10.setArabic("سيلان الأنف");
        c10.setFrench("Nez qui coule");
        c10.setGerman("Laufende Nase");
        list.add(c10);


        Data_Container c11=new Data_Container();
        c11.setEnglish("Digestion");
        c11.setHindi("पाचन");
        c11.setUrdu("عمل انہضام");
        c11.setPashto("هضم");
        c11.setArabic("الهضم");
        c11.setFrench("Digestion");
        c11.setGerman("Verdauung");
        list.add(c11);

        Data_Container c12=new Data_Container();
        c12.setEnglish("Eyesight");
        c12.setHindi("नज़र");
        c12.setUrdu("نظر");
        c12.setPashto("سترګې پټول");
        c12.setArabic("بصر");
        c12.setFrench("Vue");
        c12.setGerman("Sehvermögen");
        list.add(c12);


        Data_Container c13=new Data_Container();
        c13.setEnglish("Hepatitis");
        c13.setHindi("हेपेटाइटिस");
        c13.setUrdu("ہیپاٹائٹس۔");
        c13.setPashto("هيپاټيټس");
        c13.setArabic("التهاب الكبد");
        c13.setFrench("Hépatite");
        c13.setGerman("Hepatitis");
        list.add(c13);


        Data_Container c14=new Data_Container();
        c14.setEnglish("Sunburn");
        c14.setHindi("धूप की कालिमा");
        c14.setUrdu("سنبرن");
        c14.setPashto("لمر");
        c14.setArabic("ضربة شمس");
        c14.setFrench("Coup de soleil");
        c14.setGerman("Sonnenbrand");
        list.add(c14);


        Data_Container c15=new Data_Container();
        c15.setEnglish("Blood Pressure");
        c15.setHindi("रक्त चापp");
        c15.setUrdu("فشار خون");
        c15.setPashto("د وینی فشار");
        c15.setArabic("ضغط الدم");
        c15.setFrench("Pression artérielle");
        c15.setGerman("Blutdruck");
        list.add(c15);


        Data_Container c16=new Data_Container();
        c16.setEnglish("HIV");
        c16.setHindi("एचआईवी");
        c16.setUrdu("ایچ آئی وی");
        c16.setPashto("HIV");
        c16.setArabic("فيروس نقص المناعة البشرية");
        c16.setFrench("HIV");
        c16.setGerman("HIV");
        list.add(c16);


        Data_Container c17=new Data_Container();
        c17.setEnglish("Thyroid");
        c17.setHindi("थाइरोइड");
        c17.setUrdu("تائرائڈ۔");
        c17.setPashto("تایرایډ");
        c17.setArabic("درقي");
        c17.setFrench("Thyroïde");
        c17.setGerman("Schilddrüse");
        list.add(c17);


        Data_Container c18=new Data_Container();
        c18.setEnglish("Fever");
        c18.setHindi("बुखार");
        c18.setUrdu("بخار");
        c18.setPashto("تبه");
        c18.setArabic("حمى");
        c18.setFrench("Fièvre");
        c18.setGerman("Fieber");
        list.add(c18);


        Data_Container c19=new Data_Container();
        c19.setEnglish("Flu");
        c19.setHindi("फ़्लू");
        c19.setUrdu("فلو");
        c19.setPashto("فلو");
        c19.setArabic("أنفلونزا");
        c19.setFrench("Grippe");
        c19.setGerman("Grippe");
        list.add(c19);


        Data_Container c20=new Data_Container();
        c20.setEnglish("Diabetes");
        c20.setHindi("मधुमेह");
        c20.setUrdu("ذیابیطس۔");
        c20.setPashto("د شکرو ناروغي");
        c20.setArabic("داء السكري");
        c20.setFrench("Diabète");
        c20.setGerman("Diabetes");
        list.add(c20);


        Data_Container c21=new Data_Container();
        c21.setEnglish("Diarrhea");
        c21.setHindi("दस्त");
        c21.setUrdu("اسہال");
        c21.setPashto("اسهال");
        c21.setArabic("إسهال");
        c21.setFrench("La diarrhée");
        c21.setGerman("Durchfall");
        list.add(c21);

        Data_Container c22=new Data_Container();
        c22.setEnglish("Gonorrhea");
        c22.setHindi("सूजाक");
        c22.setUrdu("سوزاک");
        c22.setPashto("ګونوریا");
        c22.setArabic("مرض السيلان");
        c22.setFrench("Blennorragie");
        c22.setGerman("Tripper");
        list.add(c22);


        Data_Container c23=new Data_Container();
        c23.setEnglish("Convalescence");
        c23.setHindi("आरोग्यलाभ");
        c23.setUrdu("تعزیت");
        c23.setPashto("قناعت کول");
        c23.setArabic("نقاهة");
        c23.setFrench("Convalescence");
        c23.setGerman("Rekonvaleszenz");
        list.add(c23);


        Data_Container c24=new Data_Container();
        c24.setEnglish("Backache");
        c24.setHindi("पीठ दर्द");
        c24.setUrdu("کمر درد");
        c24.setPashto("د ملا درد");
        c24.setArabic("آلام الظهر");
        c24.setFrench("Mal au dos");
        c24.setGerman("Rückenschmerzen");
        list.add(c24);


        Data_Container c25=new Data_Container();
        c25.setEnglish("Cough");
        c25.setHindi("खांसी");
        c25.setUrdu("کھانسی۔");
        c25.setPashto("ټوخی");
        c25.setArabic("سعال");
        c25.setFrench("La toux");
        c25.setGerman("Husten");
        list.add(c25);



        Data_Container c27=new Data_Container();
        c27.setEnglish("Snakebite");
        c27.setHindi("साँप का दंश");
        c27.setUrdu("سانپ کاٹنے والا");
        c27.setPashto("مار");
        c27.setArabic("لدغات الأفاعي");
        c27.setFrench("Snakebite");
        c27.setGerman("Schlangenbiss");
        list.add(c27);


        Data_Container c28=new Data_Container();
        c28.setEnglish("Dizziness");
        c28.setHindi("चक्कर आना");
        c28.setUrdu("چکر آنا۔");
        c28.setPashto("سرخوږی");
        c28.setArabic("دوخة");
        c28.setFrench("Vertiges");
        c28.setGerman("Schwindel");
        list.add(c28);


        Data_Container c29=new Data_Container();
        c29.setEnglish("Nausea");
        c29.setHindi("जी मिचलाना");
        c29.setUrdu("متلی");
        c29.setPashto("مغز");
        c29.setArabic("غثيان");
        c29.setFrench("La nausée");
        c29.setGerman("Übelkeit");
        list.add(c29);


        Data_Container c30=new Data_Container();
        c30.setEnglish("Chills");
        c30.setHindi("ठंड लगना");
        c30.setUrdu("سردی لگ رہی ہے۔");
        c30.setPashto("سرخوږی");
        c30.setArabic("قشعريرة برد");
        c30.setFrench("Des frissons");
        c30.setGerman("Schüttelfrost");
        list.add(c30);






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

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

public class Body_Parts_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body__parts__vocabulary);


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
        c9.setEnglish("Leg");
        c9.setHindi("टांग");
        c9.setUrdu("ٹانگ");
        c9.setPashto("ٹانگ");
        c9.setArabic("رجل");
        c9.setFrench("Jambe");
        c9.setGerman("Bein");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Hand");
        c10.setHindi("हाथ");
        c10.setUrdu("ہاتھ");
        c10.setPashto("لاس");
        c10.setArabic("يد");
        c10.setFrench("Main");
        c10.setGerman("Hand");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Nose");
        c11.setHindi("नाक");
        c11.setUrdu("ناک");
        c11.setPashto("ناک");
        c11.setArabic("أنف");
        c11.setFrench("Nez");
        c11.setGerman("Nase");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Ear");
        c12.setHindi("कान");
        c12.setUrdu("کان");
        c12.setPashto("کان");
        c12.setArabic("إذن");
        c12.setFrench("Oreille");
        c12.setGerman("Ohr");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Eye");
        c13.setHindi("आंख");
        c13.setUrdu("آنکھ");
        c13.setPashto("سترګې");
        c13.setArabic("عين");
        c13.setFrench("Œil");
        c13.setGerman("Auge");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Foot");
        c14.setHindi("पैर");
        c14.setUrdu("پاؤں");
        c14.setPashto("پښه");
        c14.setArabic("قدم");
        c14.setFrench("Pied");
        c14.setGerman("Fuß");
        list.add(c14);


        Data_Container c1 = new Data_Container();
        c1.setEnglish("Hair");
        c1.setHindi("बाल");
        c1.setUrdu("بال");
        c1.setPashto("ویښتان");
        c1.setArabic("شعر");
        c1.setFrench("Cheveux");
        c1.setGerman("Haar");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Eyes");
        c2.setHindi("आंखें");
        c2.setUrdu("آنکھیں۔");
        c2.setPashto("سترګې");
        c2.setArabic("عيون");
        c2.setFrench("Yeux");
        c2.setGerman("Augen");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Mouth");
        c3.setHindi("मुंह");
        c3.setUrdu("منہ");
        c3.setPashto("خوله");
        c3.setArabic("فم");
        c3.setFrench("Bouche");
        c3.setGerman("Mund");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Arm");
        c4.setHindi("बांह, भुजा");
        c4.setUrdu("بازو");
        c4.setPashto("بازو");
        c4.setArabic("ذراع");
        c4.setFrench("Bras");
        c4.setGerman("Arm");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Shoulder");
        c5.setHindi("कन्धा");
        c5.setUrdu("کندھا");
        c5.setPashto("اوږه");
        c5.setArabic("كتف");
        c5.setFrench("Épaule");
        c5.setGerman("Schulter");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Stomach");
        c6.setHindi("पेट");
        c6.setUrdu("پیٹ");
        c6.setPashto("معده");
        c6.setArabic("معدة");
        c6.setFrench("Estomac");
        c6.setGerman("Bauch");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Knee");
        c7.setHindi("घुटना");
        c7.setUrdu("گھٹنے");
        c7.setPashto("زنګون");
        c7.setArabic("ركبة");
        c7.setFrench("Le genou");
        c7.setGerman("Knie");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Throat");
        c8.setHindi("गला");
        c8.setUrdu("حلق");
        c8.setPashto("ستونی");
        c8.setArabic("حلق");
        c8.setFrench("Gorge");
        c8.setGerman("Kehle");
        list.add(c8);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Face");
        c15.setHindi("चेहरा");
        c15.setUrdu("چہرہ");
        c15.setPashto("چہرہ");
        c15.setArabic("وجه");
        c15.setFrench("Visage");
        c15.setGerman("Gesicht");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Neck");
        c16.setHindi("गरदन");
        c16.setUrdu("گردن");
        c16.setPashto("غاړه");
        c16.setArabic("العنق");
        c16.setFrench("Cou");
        c16.setGerman("Hals");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Beard");
        c17.setHindi("दाढ़ी");
        c17.setUrdu("داڑھی");
        c17.setPashto("ږیره");
        c17.setArabic("لحية");
        c17.setFrench("Barbe");
        c17.setGerman("Bart");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Moustache");
        c18.setHindi("मूंछ");
        c18.setUrdu("مونچھیں");
        c18.setPashto("بریت");
        c18.setArabic("شوارب");
        c18.setFrench("Moustache");
        c18.setGerman("Schnurrbart");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Hip");
        c19.setHindi("कूल्हा");
        c19.setUrdu("ہپ");
        c19.setPashto("هپ");
        c19.setArabic("ورك او نتوء");
        c19.setFrench("hanche");
        c19.setGerman("Hüfte");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Nail");
        c20.setHindi("नाखून");
        c20.setUrdu("کیل۔");
        c20.setPashto("کیل");
        c20.setArabic("مسمار");
        c20.setFrench("Clou");
        c20.setGerman("Nagel");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("Lip");
        c21.setHindi("होंठ");
        c21.setUrdu("ہونٹ");
        c21.setPashto("Lip");
        c21.setArabic("شفة");
        c21.setFrench("Lèvre");
        c21.setGerman("Lippe");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Fist");
        c22.setHindi("मुठ्ठी");
        c22.setUrdu("لومړی");
        c22.setPashto("لومړی");
        c22.setArabic("قبضة");
        c22.setFrench("Poing");
        c22.setGerman("Faust");
        list.add(c22);

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Face");
        c31.setHindi("चेहरा");
        c31.setUrdu("چہرہ");
        c31.setPashto("مخ");
        c31.setArabic("وجه");
        c31.setFrench("Visage");
        c31.setGerman("Gesicht");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Eyebrow");
        c32.setHindi("भौं");
        c32.setUrdu("ابرو۔");
        c32.setPashto("سترګې");
        c32.setArabic("حاجب العين");
        c32.setFrench("Sourcil");
        c32.setGerman("Augenbraue");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Tongue");
        c33.setHindi("जीभ");
        c33.setUrdu("زبان");
        c33.setPashto("ژبه");
        c33.setArabic("لسان");
        c33.setFrench("Langue");
        c33.setGerman("Zunge");
        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Heart");
        c34.setHindi("ह्रदय");
        c34.setUrdu("دل");
        c34.setPashto("هرات");
        c34.setArabic("Cœur");
        c34.setFrench("Cœur");
        c34.setGerman("Herz");
        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Toe");
        c35.setHindi("पैर की उंगली");
        c35.setUrdu("پیر");
        c35.setPashto("پیر");
        c35.setArabic("إصبع قدم");
        c35.setFrench("Doigt de pied");
        c35.setGerman("Zehe");
        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Body");
        c36.setHindi("शरीर");
        c36.setUrdu("جسم");
        c36.setPashto("بدن");
        c36.setArabic("الجسم");
        c36.setFrench("Corps");
        c36.setGerman("Körper");
        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Fingers");
        c37.setHindi("अंगुलियाँ");
        c37.setUrdu("انگلیاں");
        c37.setPashto("ګوتې");
        c37.setArabic("أصابع");
        c37.setFrench("Doigts");
        c37.setGerman("Finger");
        list.add(c37);

        Data_Container c38 = new Data_Container();
        c38.setEnglish("Thumb");
        c38.setHindi("अंगूठा");
        c38.setUrdu("انگوٹھا۔");
        c38.setPashto("ګوتې");
        c38.setArabic("إبهام اليد");
        c38.setFrench("Pouce");
        c38.setGerman("Daumen");
        list.add(c38);


        Data_Container c39 = new Data_Container();
        c39.setEnglish("Skull");
        c39.setHindi("खोपड़ी");
        c39.setUrdu("کھوپڑی");
        c39.setPashto("خولۍ");
        c39.setArabic("جمجمة");
        c39.setFrench("Crâne");
        c39.setGerman("Schädel");
        list.add(c39);


        Data_Container c40 = new Data_Container();
        c40.setEnglish("Larynx");
        c40.setHindi("कंठ");
        c40.setUrdu("Larynx");
        c40.setPashto("Larynx");
        c40.setArabic("حنجرة");
        c40.setFrench("Larynx");
        c40.setGerman("Larynx");
        list.add(c40);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Lip");
        c23.setHindi("होंठ");
        c23.setUrdu("ہونٹ");
        c23.setPashto("شونډي");
        c23.setArabic("شفة");
        c23.setFrench("Lèvre");
        c23.setGerman("Lippe");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Blood");
        c24.setHindi("रक्त");
        c24.setUrdu("خون");
        c24.setPashto("وینه");
        c24.setArabic("دم");
        c24.setFrench("Du sang");
        c24.setGerman("Blut");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Breast");
        c25.setHindi("स्तन");
        c25.setUrdu("چھاتی");
        c25.setPashto("سينه");
        c25.setArabic("ثدي");
        c25.setFrench("Sein");
        c25.setGerman("Brust");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Elbow");
        c26.setHindi("कोहनी");
        c26.setUrdu("کہنی");
        c26.setPashto("کیلی");
        c26.setArabic("كوع");
        c26.setFrench("Coude");
        c26.setGerman("Ellbogen");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Nave");
        c27.setHindi("नाभि");
        c27.setUrdu("نیوی");
        c27.setPashto("نیوی");
        c27.setArabic("صحن الكنيسة");
        c27.setFrench("Nef");
        c27.setGerman("Kirchenschiff");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Cheek");
        c28.setHindi("गाल");
        c28.setUrdu("گال۔");
        c28.setPashto("ګال");
        c28.setArabic("الخد");
        c28.setFrench("Joue");
        c28.setGerman("Wange");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Ankle");
        c29.setHindi("टखना");
        c29.setUrdu("ٹخن");
        c29.setPashto("زنګون");
        c29.setArabic("الكاحل");
        c29.setFrench("La cheville");
        c29.setGerman("Knöchel");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Brain");
        c30.setHindi("दिमाग");
        c30.setUrdu("دماغ");
        c30.setPashto("دماغ");
        c30.setArabic("دماغ");
        c30.setFrench("Cerveau");
        c30.setGerman("Gehirn");
        list.add(c30);


// 31 --- 40





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

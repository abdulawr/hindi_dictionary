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

public class Emotion_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion__vocabulary);


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
        c1.setEnglish("Love");
        c1.setHindi("प्रेम");
        c1.setUrdu("محبت");
        c1.setPashto("مينه");
        c1.setArabic("حب");
        c1.setFrench("L'amour");
        c1.setGerman("Liebe");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Satisfaction");
        c2.setHindi("संतुष्टि");
        c2.setUrdu("اطمینان۔");
        c2.setPashto("رضایت");
        c2.setArabic("رضا");
        c2.setFrench("la satisfaction");
        c2.setGerman("Befriedigung");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Sadness");
        c3.setHindi("उदासी");
        c3.setUrdu("اداسی");
        c3.setPashto("خفګان");
        c3.setArabic("حزن");
        c3.setFrench("Tristesse");
        c3.setGerman("Traurigkeit");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Romance");
        c4.setHindi("रोमांस");
        c4.setUrdu("رومانس");
        c4.setPashto("رومانس");
        c4.setArabic("رومانسي");
        c4.setFrench("Romance");
        c4.setGerman("Romantik");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Hate");
        c5.setHindi("नफ़रत");
        c5.setUrdu("سے نفرت");
        c5.setPashto("کرکه");
        c5.setArabic("اكرهه");
        c5.setFrench("Haine");
        c5.setGerman("Hass");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Nostalgia");
        c6.setHindi("विषाद");
        c6.setUrdu("پرانی یادوں");
        c6.setPashto("زنګ وهل");
        c6.setArabic("Nostalgie");
        c6.setFrench("Nostalgie");
        c6.setGerman("Nostalgie");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Joy");
        c7.setHindi("हर्ष");
        c7.setUrdu("خوشی");
        c7.setPashto("خوشحاله");
        c7.setArabic("فرح");
        c7.setFrench("Joie");
        c7.setGerman("Freude");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Interest");
        c8.setHindi("ब्याज");
        c8.setUrdu("دلچسپی");
        c8.setPashto("سود");
        c8.setArabic("فائدة");
        c8.setFrench("L'intérêt");
        c8.setGerman("Interesse");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Fear");
        c9.setHindi("डर");
        c9.setUrdu("خوف۔");
        c9.setPashto("ویره");
        c9.setArabic("خوف");
        c9.setFrench("Peur");
        c9.setGerman("Angst");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Excitement");
        c10.setHindi("उत्साह");
        c10.setUrdu("جوش و خروش");
        c10.setPashto("حوصله");
        c10.setArabic("إثارة");
        c10.setFrench("Excitation");
        c10.setGerman("Aufregung");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Disgust");
        c11.setHindi("घृणा");
        c11.setUrdu("نفرت۔");
        c11.setPashto("کرکه");
        c11.setArabic("الاشمئزاز");
        c11.setFrench("Dégoûter");
        c11.setGerman("Der Ekel");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Confusion");
        c12.setHindi("उलझन");
        c12.setUrdu("الجھن۔");
        c12.setPashto("ګډوډي");
        c12.setArabic("ارتباك");
        c12.setFrench("Confusion");
        c12.setGerman("Verwechslung");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Boredom");
        c13.setHindi("उदासी");
        c13.setUrdu("غضب۔");
        c13.setPashto("غضب");
        c13.setArabic("ملل");
        c13.setFrench("Ennui");
        c13.setGerman("Langeweile");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Anxiety");
        c14.setHindi("चिंता");
        c14.setUrdu("بےچینی۔");
        c14.setPashto("اضطراب");
        c14.setArabic("القلق");
        c14.setFrench("Anxiété");
        c14.setGerman("Angst");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Admiration");
        c15.setHindi("प्रशंसा");
        c15.setUrdu("تعریف");
        c15.setPashto("ستاینه");
        c15.setArabic("إعجاب");
        c15.setFrench("Admiration");
        c15.setGerman("Bewunderung");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Friendship");
        c16.setHindi("मित्रता");
        c16.setUrdu("دوستی۔");
        c16.setPashto("ملګرتیا");
        c16.setArabic("صداقة");
        c16.setFrench("Relation amicale");
        c16.setGerman("Freundschaft");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Anger");
        c17.setHindi("गुस्सा");
        c17.setUrdu("غصہ۔");
        c17.setPashto("غوسه");
        c17.setArabic("غضب");
        c17.setFrench("Colère");
        c17.setGerman("Zorn");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Surprise");
        c18.setHindi("आश्चर्य");
        c18.setUrdu("حیرت۔");
        c18.setPashto("حیرانتیا");
        c18.setArabic("مفاجأة");
        c18.setFrench("Surprise");
        c18.setGerman("Überraschung");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Trust");
        c19.setHindi("विश्वास");
        c19.setUrdu("اعتماد۔");
        c19.setPashto("باور");
        c19.setArabic("ثقة");
        c19.setFrench("Confiance");
        c19.setGerman("Vertrauen");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Proud");
        c20.setHindi("गर्व");
        c20.setUrdu("فخر ہے۔");
        c20.setPashto("ویاړ");
        c20.setArabic("فخور");
        c20.setFrench("Fier");
        c20.setGerman("Stolz");
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

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

public class Vegetiable_Vocabulary extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetiable__vocabulary);

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


        Data_Container c21 = new Data_Container();
        c21.setEnglish("Spring Onions");
        c21.setHindi("वसंत प्याज");
        c21.setUrdu("بہار پیاز۔");
        c21.setPashto("د پسرلی پیاز");
        c21.setArabic("البصل الأخضر");
        c21.setFrench("Oignons de printemps");
        c21.setGerman("Frühlingszwiebeln");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Corn");
        c22.setHindi("मक्का");
        c22.setUrdu("مکئی");
        c22.setPashto("جوار");
        c22.setArabic("حبوب ذرة");
        c22.setFrench("Blé");
        c22.setGerman("Mais");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Pumpkin");
        c23.setHindi("कद्दू");
        c23.setUrdu("قددو");
        c23.setPashto("کدو");
        c23.setArabic("يقطين");
        c23.setFrench("Citrouille");
        c23.setGerman("Kürbis");
        list.add(c23);


        Data_Container c24 = new Data_Container();
        c24.setEnglish("Artichoke");
        c24.setHindi("हाथी चक");
        c24.setUrdu("آرٹچیک۔");
        c24.setPashto("آرټیکیک");
        c24.setArabic("خرشوف");
        c24.setFrench("Artichaut");
        c24.setGerman("Artischocke");
        list.add(c24);


        Data_Container c25 = new Data_Container();
        c25.setEnglish("Heirloom Tomato");
        c25.setHindi("हीरूम टमाटर");
        c25.setUrdu("وارث ٹماٹر۔");
        c25.setPashto("د وارثوم تومات");
        c25.setArabic("الإرث الطماطم");
        c25.setFrench("Tomate héritage");
        c25.setGerman("Erbstück Tomate");
        list.add(c25);


        Data_Container c26 = new Data_Container();
        c26.setEnglish("Kale");
        c26.setHindi("गोभी");
        c26.setUrdu("کالے۔");
        c26.setPashto("کالا");
        c26.setArabic("كرنب");
        c26.setFrench("chou frisé");
        c26.setGerman("Grünkohl");
        list.add(c26);


        Data_Container c27 = new Data_Container();
        c27.setEnglish("Green bell pepper");
        c27.setHindi("हरी शिमला मिर्च");
        c27.setUrdu("ہری گھنٹی مرچ۔");
        c27.setPashto("شنه مرچ");
        c27.setArabic("الفلفل الأخضر");
        c27.setFrench("Poivron vert");
        c27.setGerman("Grüne Paprika");
        list.add(c27);

        Data_Container c28 = new Data_Container();
        c28.setEnglish("Ginger");
        c28.setHindi("अदरक");
        c28.setUrdu("ادرک");
        c28.setPashto("ادرک");
        c28.setArabic("زنجبيل");
        c28.setFrench("Gingembre");
        c28.setGerman("Ingwer");
        list.add(c28);


        Data_Container c29 = new Data_Container();
        c29.setEnglish("Lima Bean");
        c29.setHindi("सेम फली");
        c29.setUrdu("لیما بین۔");
        c29.setPashto("لیما لوبیا");
        c29.setArabic("فاصوليا بيضاء");
        c29.setFrench("Haricot de Lima");
        c29.setGerman("Limabohne");
        list.add(c29);


        Data_Container c30 = new Data_Container();
        c30.setEnglish("Turnip");
        c30.setHindi("शलजम");
        c30.setUrdu("شلجم");
        c30.setPashto("شاليد");
        c30.setArabic("لفت نبات");
        c30.setFrench("Navet");
        c30.setGerman("Steckrübe");
        list.add(c30);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Potato");
        c1.setHindi("आलू");
        c1.setUrdu("آلو۔");
        c1.setPashto("کچالو");
        c1.setArabic("البطاطس");
        c1.setFrench("Patate");
        c1.setGerman("Kartoffel");
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Sweet corn");
        c2.setHindi("स्वीट कॉर्न");
        c2.setUrdu("میٹھی مکئی");
        c2.setPashto("خواږه جوار");
        c2.setArabic("فشار الذرة الحلوة");
        c2.setFrench("Le maïs sucré");
        c2.setGerman("Zuckermais");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Green bean");
        c3.setHindi("हरी फली");
        c3.setUrdu("سبز سیم");
        c3.setPashto("شنه لوبیا");
        c3.setArabic("فاصوليا خضراء");
        c3.setFrench("Haricot vert");
        c3.setGerman("Grüne Bohne");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Broccoli");
        c4.setHindi("ब्रोकोली");
        c4.setUrdu("بروکولی۔");
        c4.setPashto("ګوپی");
        c4.setArabic("بروكلي");
        c4.setFrench("brocoli");
        c4.setGerman("Brokkoli");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Garlic");
        c5.setHindi("लहसुन");
        c5.setUrdu("لہسن۔");
        c5.setPashto("ووږه");
        c5.setArabic("ثوم");
        c5.setFrench("Ail");
        c5.setGerman("Knoblauch");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Sweet potato");
        c6.setHindi("शकरकंद");
        c6.setUrdu("شکر قندی");
        c6.setPashto("خواږه کچالو");
        c6.setArabic("بطاطا حلوة");
        c6.setFrench("Süßkartoffel...");
        c6.setGerman("Süßkartoffel");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Carrot");
        c7.setHindi("गाजर");
        c7.setUrdu("گاجر");
        c7.setPashto("گاجر");
        c7.setArabic("جزرة");
        c7.setFrench("Carotte");
        c7.setGerman("Karotte");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Cucumber");
        c8.setHindi("खीरा");
        c8.setUrdu("کھیرا");
        c8.setPashto("بادرنګ");
        c8.setArabic("خيار");
        c8.setFrench("Concombre");
        c8.setGerman("Gurke");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Spinach");
        c9.setHindi("पालक");
        c9.setUrdu("پالک۔");
        c9.setPashto("پالک");
        c9.setArabic("سبانخ");
        c9.setFrench("épinard");
        c9.setGerman("Spinat");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Onion");
        c10.setHindi("प्याज");
        c10.setUrdu("پیاز");
        c10.setPashto("پیاز");
        c10.setArabic("بصلة");
        c10.setFrench("Zwiebel");
        c10.setGerman("Zwiebel");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Mushroom");
        c11.setHindi("मशरूम");
        c11.setUrdu("مشروم");
        c11.setPashto("مشروم");
        c11.setArabic("فطر");
        c11.setFrench("Champignon");
        c11.setGerman("Pilz");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Cauliflower");
        c12.setHindi("गोभी");
        c12.setUrdu("گوبھی۔");
        c12.setPashto("ګوبی");
        c12.setArabic("قرنبيط");
        c12.setFrench("choufleur");
        c12.setGerman("Blumenkohl");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Pea");
        c13.setHindi("मटर");
        c13.setUrdu("مٹر");
        c13.setPashto("م Peaه");
        c13.setArabic("بازيلا");
        c13.setFrench("Pois");
        c13.setGerman("Erbse");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Bell pepper");
        c14.setHindi("शिमला मिर्च");
        c14.setUrdu("بیل کالی مرچ۔");
        c14.setPashto("بیل مرچ");
        c14.setArabic("جرس الفلفل");
        c14.setFrench("poivron");
        c14.setGerman("Paprika");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Red bell pepper");
        c15.setHindi("");
        c15.setUrdu("سرخ گھنٹی مرچ۔");
        c15.setPashto("سره مرچ");
        c15.setArabic("الفلفل الأحمر");
        c15.setFrench("rote Paprika...");
        c15.setGerman("rote Paprika");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Olives");
        c16.setHindi("जैतून");
        c16.setUrdu("زیتون۔");
        c16.setPashto("زیتون");
        c16.setArabic("زيتون");
        c16.setFrench("Olives");
        c16.setGerman("Oliven");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Cabbage");
        c17.setHindi("पत्ता गोभी");
        c17.setUrdu("گوبھی");
        c17.setPashto("کباب");
        c17.setArabic("الكرنب");
        c17.setFrench("Chou");
        c17.setGerman("Kohl");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Avocado");
        c18.setHindi("एवोकाडो");
        c18.setUrdu("ایواکاڈو");
        c18.setPashto("ایوکوډو");
        c18.setArabic("أفوكادو");
        c18.setFrench("Avocat");
        c18.setGerman("Avocado");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Celery");
        c19.setHindi("अजवायन");
        c19.setUrdu("اجوائن۔");
        c19.setPashto("سیلوری");
        c19.setArabic("كرفس");
        c19.setFrench("Céleri");
        c19.setGerman("Sellerie");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Beet");
        c20.setHindi("चुकंदर");
        c20.setUrdu("چقندر");
        c20.setPashto("چوغندر");
        c20.setArabic("الشمندر");
        c20.setFrench("Betterave");
        c20.setGerman("Zuckerrüben");
        list.add(c20);


// 21 -- 30


// 31 --- 40

        Data_Container c31 = new Data_Container();
        c31.setEnglish("Radish");
        c31.setHindi("मूली");
        c31.setUrdu("راشد");
        c31.setPashto("رنګه");
        c31.setArabic("فجل");
        c31.setFrench("Un radis");
        c31.setGerman("Rettich");
        list.add(c31);

        Data_Container c32 = new Data_Container();
        c32.setEnglish("Arugula");
        c32.setHindi("आर्गुला");
        c32.setUrdu("اروگولا۔");
        c32.setPashto("چه په شنه خوړل کیږۍ یو ډول سابه");
        c32.setArabic("جرجير");
        c32.setFrench("Roquette");
        c32.setGerman("Rucola");
        list.add(c32);


        Data_Container c33 = new Data_Container();
        c33.setEnglish("Chili pepper");
        c33.setHindi("लाल मिर्च");
        c33.setUrdu("لال مرچ");
        c33.setPashto("شنه مرجک");
        c33.setArabic("فلفل حار");
        c33.setFrench("Piment");
        c33.setGerman("Chilischote");
        list.add(c33);


        Data_Container c34 = new Data_Container();
        c34.setEnglish("Rhubarb");
        c34.setHindi("एक प्रकार का फल");
        c34.setUrdu("روبرب۔");
        c34.setPashto("روبرب");
        c34.setArabic("راوند");
        c34.setFrench("Rhubarbe");
        c34.setGerman("Rhabarber");
        list.add(c34);


        Data_Container c35 = new Data_Container();
        c35.setEnglish("Fennel");
        c35.setHindi("सौंफ");
        c35.setUrdu("سونف۔");
        c35.setPashto("سونف");
        c35.setArabic("الشمرة");
        c35.setFrench("Fenouil");
        c35.setGerman("Fenchel");
        list.add(c35);


        Data_Container c36 = new Data_Container();
        c36.setEnglish("Jackfruit");
        c36.setHindi("कटहल");
        c36.setUrdu("جیک فروٹ");
        c36.setPashto("جاک فروټ");
        c36.setArabic("الكاكايا");
        c36.setFrench("Jacquier");
        c36.setGerman("Jackfrucht");
        list.add(c36);


        Data_Container c37 = new Data_Container();
        c37.setEnglish("Radicchio");
        c37.setHindi("radicchio");
        c37.setUrdu("ریڈیکیو");
        c37.setPashto("رادیکیو");
        c37.setArabic("أحمر قرمزي");
        c37.setFrench("Radicchio");
        c37.setGerman("Radicchio");
        list.add(c37);


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

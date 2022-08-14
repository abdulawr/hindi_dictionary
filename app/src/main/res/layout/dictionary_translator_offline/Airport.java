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

public class Airport extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport);


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
        c1.setEnglish("Good afternoon! Where are you flying to today? ");
        c1.setHindi("नमस्कार! आज आप कहां उड़ रहे हैं");
        c1.setUrdu("ماسپېښين مو نېکمرغه! نن ته کوم ځای ته پرواز کوی؟...");
        c1.setPashto("ماسپېښين مو نېکمرغه! نن ته کوم ځای ته پرواز کوی؟");
        c1.setArabic("مساء الخير! إلى أين أنت ذاهب إلى اليوم؟");
        c1.setFrench("Bonne après-midi! Où vas-tu aujourd'hui");
        c1.setGerman("Guten Tag! Wohin fliegst du heute?");
        c1.setMean("Agent");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Berlin, Germany.");
        c2.setHindi("बर्लिन, जर्मनी");
        c2.setUrdu("برلین ، جرمني...");
        c2.setPashto("برلین ، جرمني");
        c2.setArabic("برلين، ألمانيا");
        c2.setFrench("Berlin, Allemagne");
        c2.setGerman("Berlin, Deutschland");
        c2.setMean("Jhon");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("May I have your passport, please? ");
        c3.setHindi("मेरे पास आपका पासपोर्ट है, कृपया");
        c3.setUrdu("براہ کرم ، میں آپ کا پاسپورٹ لے سکتا ہوں");
        c3.setPashto("هیله کوم ، زه ستاسو پاسپورت واخلم");
        c3.setArabic("هل لي جواز سفرك من فضلك؟");
        c3.setFrench("Puis-je avoir votre passeport, s'il vous plaît?");
        c3.setGerman("Darf ich bitte Ihren Reisepass haben?");
        c3.setMean("Agent");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Here you go.");
        c4.setHindi("हेयर यू गो");
        c4.setUrdu("یہاں تم جاؤ۔");
        c4.setPashto("وشو ته تلای شی");
        c4.setArabic("ها أنت ذا");
        c4.setFrench("Voici");
        c4.setGerman("Bitte schön");
        c4.setMean("Jhon");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Are you checking any bags?");
        c5.setHindi("क्या आप कोई बैग चेक कर रहे हैं");
        c5.setUrdu("کیا آپ کسی بھی تھیلے کی جانچ کررہے ہیں؟");
        c5.setPashto("ایا تاسو کومه کڅوړه ګورئ؟");
        c5.setArabic("هل تحقق أي أكياس");
        c5.setFrench("Vérifiez-vous des sacs");
        c5.setGerman("Überprüfst du irgendwelche Taschen?");
        c5.setMean("Jhon");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Just this one.");
        c6.setHindi("सिर्फ यह एक");
        c6.setUrdu("بس یہ ایک");
        c6.setPashto("بس دا یو");
        c6.setArabic("هذه فقط");
        c6.setFrench("Juste celui-là");
        c6.setGerman("Nur diese eine");
        c6.setMean("Agent");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("OK, please place your bag on the scale.");
        c7.setHindi("ठीक है, कृपया अपने बैग को पैमाने पर रखें");
        c7.setUrdu("ٹھیک ہے ، براہ کرم اپنا بیگ پیمانے پر رکھیں۔");
        c7.setPashto("سمه ده ، مهرباني وکړئ خپله کڅوړه په پیمانه کې ځای په ځای کړئ");
        c7.setArabic("حسنا ، يرجى وضع حقيبتك على نطاق واسع");
        c7.setFrench("OK, veuillez placer votre sac sur la balance");
        c7.setGerman("OK, bitte legen Sie Ihre Tasche auf die Waage");
        c7.setMean("Jhon");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Did you pack your bags yourself?");
        c8.setHindi("क्या आपने अपने बैग खुद पैक किए");
        c8.setUrdu("کیا آپ نے اپنا سامان خود پیک کیا؟");
        c8.setPashto("ایا تاسو خپل کڅوړه پخپله بسته کړل؟");
        c8.setArabic("هل قمت بتعبئة حقائبك بنفسك");
        c8.setFrench("Avez-vous fait vos bagages vous-même");
        c8.setGerman("Hast du deine Taschen selbst gepackt");
        c8.setMean("Agent");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Yes.");
        c9.setHindi("हाँ");
        c9.setUrdu("جی ہاں");
        c9.setPashto("هو");
        c9.setArabic("نعم");
        c9.setFrench("Oui");
        c9.setGerman("Ja");
        c9.setMean("Jhon");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Are you carrying any firearms or flammable materials?");
        c10.setHindi("क्या आप कोई आग्नेयास्त्र या ज्वलनशील पदार्थ ले जा रहे हैं");
        c10.setUrdu("کیا آپ کوئی آتشیں اسلحہ یا آتش گیر مادے لے کر جارہے ہیں؟");
        c10.setPashto("ایا تاسو کوم ډول اور وژونکي یا اور اخیستونکي توکي وړئ؟");
        c10.setArabic("هل تحمل أي أسلحة نارية أو مواد قابلة للاشتعال");
        c10.setFrench("Portez-vous des armes à feu ou des matériaux inflammables");
        c10.setGerman("Tragen Sie Schusswaffen oder brennbare Materialien");
        c10.setMean("Agent");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("No");
        c11.setHindi("नहीं");
        c11.setUrdu("نہیں");
        c11.setPashto("نه");
        c11.setArabic("لا");
        c11.setFrench("Non");
        c11.setGerman("Nein");
        c11.setMean("Jhon");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Has your luggage been in your possession at all times?");
        c12.setHindi("क्या आपका सामान हर समय आपके कब्जे में रहा है");
        c12.setUrdu("کیا آپ کا سامان ہر وقت آپ کے قبضہ میں ہے؟");
        c12.setPashto("ایا ستاسو سامان هر وخت ستاسو په ملکیت کې و؟");
        c12.setArabic("هل كانت أمتعتك في حوزتك في جميع الأوقات؟");
        c12.setFrench("Vos bagages ont-ils toujours été en votre possession?");
        c12.setGerman("War Ihr Gepäck immer in Ihrem Besitz?");
        c12.setMean("Agent");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Yes");
        c13.setHindi("हाँ");
        c13.setUrdu("جی ہاں");
        c13.setPashto("هو");
        c13.setArabic("نعم");
        c13.setFrench("Oui");
        c13.setGerman("Ja");
        c13.setMean("Jhon");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Has anyone given you anything to carry on the flight? ");
        c14.setHindi("क्या किसी ने आपको उड़ान भरने के लिए कुछ दिया है?");
        c14.setUrdu("کیا کسی نے آپ کو پرواز میں لے جانے کے لئے کچھ دیا ہے؟");
        c14.setPashto("ایا چا تاسو ته په الوتنه کې د تګ لپاره څه درکړل؟");
        c14.setArabic("هل أعطاك أي شخص أي شيء لمواصلة الرحلة");
        c14.setFrench("Quelqu'un vous a-t-il donné quoi que ce soit pour continuer le vol?");
        c14.setGerman("Hat dir jemand etwas gegeben, um den Flug fortzusetzen?");
        c14.setMean("Agent");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("No");
        c15.setHindi("नहीं");
        c15.setUrdu("نہیں");
        c15.setPashto("نه");
        c15.setArabic("لا");
        c15.setFrench("Non");
        c15.setGerman("Nein");
        c15.setMean("Jhon");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Would you like chicken or pasta?");
        c16.setHindi("क्या आप चिकन या पास्ता पसंद करेंगे?");
        c16.setUrdu("کیا آپ مرغی یا پاستا پسند کریں گے؟");
        c16.setPashto("ایا تاسو چرګ یا پاستا غواړئ");
        c16.setArabic("هل تريد الدجاج أو المعكرونة");
        c16.setFrench("Voulez-vous du poulet ou des pâtes");
        c16.setGerman("Möchten Sie Hühnchen oder Nudeln?");
        c16.setMean("Flight attendant");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish(" I’ll have the chicken.");
        c17.setHindi("मेरे पास चिकन है");
        c17.setUrdu("میرے پاس مرغی ہے۔");
        c17.setPashto("زه چرګ لرم");
        c17.setArabic("سآخذ الدجاج");
        c17.setFrench("Je vais avoir le poulet");
        c17.setGerman("Ich werde das Huhn haben");
        c17.setMean("Jhon");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Anything to drink?");
        c18.setHindi("कुछ भी पीने के लिए");
        c18.setUrdu("پینے کے لیے کچھ بھی");
        c18.setPashto("څه څښل");
        c18.setArabic("هل لديك شيء للشرب");
        c18.setFrench("Quelque chose à boire");
        c18.setGerman("Etwas zu trinken");
        c18.setMean("Flight attendant");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("What kind of soda do you have?");
        c19.setHindi("आपके पास किस तरह का सोडा है");
        c19.setUrdu("آپ کو کس طرح کا سوڈا ہے؟");
        c19.setPashto("What kind of soda do you have");
        c19.setArabic("أي نوع من الصودا لديك");
        c19.setFrench("Quel genre de soda avez-vous");
        c19.setGerman("Welche Art von Soda hast du?");
        c19.setMean("Jhon");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Coke, Diet Coke, Sprite, Orange");
        c20.setHindi("कोक, डाइट कोक, स्प्राइट, ऑरेंज");
        c20.setUrdu("کوک ، د رژیم کوک ، سپریټ ، نارنج");
        c20.setPashto("کوک ، د رژیم کوک ، سپریټ ، نارنج");
        c20.setArabic("فحم الكوك ، حمية الكوك ، العفريت ، البرتقال");
        c20.setFrench("Coke, Coke Diète, Sprite, Orange");
        c20.setGerman("Cola, Diät Cola, Sprite, Orange");
        c20.setMean("Flight attendant");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("A Diet Coke, no ice, please.");
        c21.setHindi("एक आहार कोक, कोई बर्फ, कृपया");
        c21.setUrdu("برائے مہربانی ایک ڈائیٹ کوک ، آئس آئس نہیں۔");
        c21.setPashto("مهرباني وکړئ یو رژیم کوک ، نه یخ");
        c21.setArabic("حمية الكوك ، لا الجليد ، من فضلك");
        c21.setFrench("Un Coca Light, pas de glace, s'il vous plaît");
        c21.setGerman("Eine Diät-Cola, bitte kein Eis");
        c21.setMean("Jhon");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Here you go.");
        c22.setHindi("हेयर यू गो");
        c22.setUrdu("یہاں تم جاؤ۔");
        c22.setPashto("وشو ته تلای شی");
        c22.setArabic("ها أنت ذا");
        c22.setFrench("Voici");
        c22.setGerman("Bitte schön");
        c22.setMean("Flight attendant");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Thank you!");
        c23.setHindi("धन्यवाद!");
        c23.setUrdu("آپ کا شکریہ!");
        c23.setPashto("مننه!");
        c23.setArabic("شكرا!");
        c23.setFrench("Je vous remercie!");
        c23.setGerman("Danke!");
        c23.setMean("Jhon");
        list.add(c23);



        adapter=new Phrases_Recycle_Adapter(this,list);
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

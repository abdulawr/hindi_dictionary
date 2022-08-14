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

public class Restruent extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restruent);


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
        c1.setEnglish("Good evening sir,  Can I help you?");
        c1.setHindi("गुड ईवनिंग सर, कैन आई हेल्प यू");
        c1.setUrdu("گڈ ایوننگ سر ، کیا میں آپ کی مدد کرسکتا ہوں؟");
        c1.setPashto("ماښام مو په خیر");
        c1.setArabic("مساء الخير سيدي ، هل يمكنني مساعدتك");
        c1.setFrench("Bonsoir monsieur, puis-je vous aider");
        c1.setGerman("Guten Abend Herr, kann ich Ihnen helfen");
        c1.setMean("Waiter");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Can we have a table for three please.?");
        c2.setHindi("क्या हम तीनों के लिए एक टेबल रख सकते हैं");
        c2.setUrdu("کیا ہم تینوں کے ل a میز بناسکتے ہیں؟");
        c2.setPashto("ایا موږ کولی شو د دریو لپاره میز ونیسو؟");
        c2.setArabic("يمكن أن لدينا طاولة لثلاثة من فضلك");
        c2.setFrench("Pouvons-nous avoir une table pour trois s'il vous plaît");
        c2.setGerman("Können wir bitte einen Tisch für drei Personen haben?");
        c2.setMean("Jhon");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Please come this way.");
        c3.setHindi("कृपया इस तरफ आएं");
        c3.setUrdu("برائے مہربانی اس طرح آجائیں۔");
        c3.setPashto("مهرباني وکړئ دې لارې ته راشئ");
        c3.setArabic("يرجى تأتي بهذه الطريقة");
        c3.setFrench("S'il vous plaît venez de cette façon");
        c3.setGerman("Bitte kommen Sie hier entlang");
        c3.setMean("Waiter");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Can I see a menu, please?");
        c4.setHindi("क्या मुझे एक मेनू दिखाई दे सकता है, कृपया");
        c4.setUrdu("کیا میں مینو دیکھ سکتا ہوں؟");
        c4.setPashto("مهرباني وکړئ ، زه مینو لیدلی شم؟");
        c4.setArabic("هل يمكنني رؤية قائمة من فضلك");
        c4.setFrench("Puis-je voir un menu, s'il vous plaît");
        c4.setGerman("Kann ich bitte ein Menü sehen?");
        c4.setMean("Jhon");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Certainly, here you are.");
        c5.setHindi("निश्चित रूप से आप यहां हो");
        c5.setUrdu("یقینا، ، آپ یہاں ہیں۔");
        c5.setPashto("خامخا ، تاسو دلته یاست");
        c5.setArabic("بالتأكيد ، أنت هنا");
        c5.setFrench("Certainement, vous êtes ici");
        c5.setGerman("Sicher, hier bist du");
        c5.setMean("Waiter");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Are you ready to order?");
        c6.setHindi("क्या आप आदेश देने के लिए तैयार हैं");
        c6.setUrdu("کیا آپ آرڈر کرنے کے لئے تیار ہیں؟");
        c6.setPashto("ایا تاسو آرډر ته چمتو یاست؟");
        c6.setArabic("Êtes-vous prêt à commander...");
        c6.setFrench("Êtes-vous prêt à commander");
        c6.setGerman("Sind Sie bereit zu Bestellen");
        c6.setMean("Waiter");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Yes, we'll have the chicken with rice.");
        c7.setHindi("हाँ, हम चावल के साथ चिकन लेंगे");
        c7.setUrdu("ہاں ، ہمارے پاس چاول کے ساتھ مرغی ہوگا۔");
        c7.setPashto("هو ، موږ به چرګان د وريجو سره وکړو");
        c7.setArabic("نعم ، سيكون لدينا الدجاج مع الأرز");
        c7.setFrench("Oui, nous aurons le poulet avec du riz");
        c7.setGerman("Ja, wir werden das Huhn mit Reis haben");
        c7.setMean("Jhon");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Can I get you anything else? Coffee or tea.");
        c8.setHindi("क्या मैं आपके लिए और कुछ लाऊं? कॉफी या चाय");
        c8.setUrdu("کیا میں اپ کے لئے کچھ اور لاسکتا ہوں؟ کافی یا چائے۔");
        c8.setPashto("ایا زه کولی شم تاسو ته بل څه راوړم؟ کافي یا چای");
        c8.setArabic("هل أحضر لك شيئا آخر؟ القهوة أو الشاي");
        c8.setFrench("Puis-je vous offrir quelque chose d'autre? Café ou thé");
        c8.setGerman("Darf es sonst noch etwas sein? Kaffee oder Tee");
        c8.setMean("Waiter");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Yes would like to have a cup of tea.");
        c9.setHindi("हां एक कप चाय पीना चाहूंगा");
        c9.setUrdu("ہاں چائے کا کپ پینا پسند کریں گے۔");
        c9.setPashto("هو غواړئ چې یوه پیاله چای ولرئ");
        c9.setArabic("نعم أود الحصول على كوب من الشاي");
        c9.setFrench("Oui aimerais avoir une tasse de thé");
        c9.setGerman("Ja, ich hätte gerne eine Tasse Tee");
        c9.setMean("Jhon");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Would you like something to drink?");
        c10.setHindi("क्या आप कुछ पीना चाहेंगे");
        c10.setUrdu("آپ کچھ پینا پسند کریں گے");
        c10.setPashto("غواړي څه وڅښي");
        c10.setArabic("هل تحب ان تشرب شيئا");
        c10.setFrench("Voulez-vous boire quelque chose");
        c10.setGerman("Möchten Sie etwas zu trinken");
        c10.setMean("Waiter");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("No thanks.");
        c11.setHindi("जी नहीं, धन्यवाद");
        c11.setUrdu("نہیں شکریہ");
        c11.setPashto("نه مننه");
        c11.setArabic("لا شكرا");
        c11.setFrench("Non merci");
        c11.setGerman("Nein Danke");
        c11.setMean("Jhon");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Can I get you anything else?");
        c12.setHindi("क्या मैं आपके लिए और कुछ लाऊं");
        c12.setUrdu("کیا میں اپ کے لئے کچھ اور لاسکتا ہوں");
        c12.setPashto("ایا زه تاسو ته بل څه راوړم؟");
        c12.setArabic("هل أحضر لك شيئا آخر");
        c12.setFrench("Puis-je vous offrir quelque chose d'autre");
        c12.setGerman("Darf es sonst noch etwas sein");
        c12.setMean("Waiter");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("No thanks. I'd like the check, please.");
        c13.setHindi("जी नहीं, धन्यवाद। मुझे चेक चाहिए, कृपया।");
        c13.setUrdu("نہیں شکریہ. براہ کرم مجھے چیک کرنا چاہئے۔");
        c13.setPashto("نه مننه. مهرباني وکړئ ، زه چیک غواړم.");
        c13.setArabic("لا شكرا. أود الشيك ، من فضلك");
        c13.setFrench("Non merci. Je voudrais le chèque, s'il vous plait");
        c13.setGerman("Nein Danke. Ich hätte gerne den Scheck, bitte");
        c13.setMean("Jhon");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("That'll be $14.95.");
        c14.setHindi("वह $ 14.95 होगा");
        c14.setUrdu("وہ 14.95 ڈالر ہو گا۔");
        c14.setPashto("دا به. 14.95 وي");
        c14.setArabic("هذا سوف يكون 14.95 دولار");
        c14.setFrench("Ça va être 14,95 $");
        c14.setGerman("Das sind 14,95 Dollar");
        c14.setMean("Waiter");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Here you are. Keep the change!");
        c15.setHindi("आप यहाँ हैं। छुट्टे रख लो");
        c15.setUrdu("آپ یہاں ہیں تبدیلی رکھیں۔");
        c15.setPashto("دلته تاسو یاست. بقایه ستا شوه");
        c15.setArabic("Vous voilà. Gardez la monnaie...");
        c15.setFrench("Vous voilà. Gardez la monnaie");
        c15.setGerman("Hier sind Sie ja. Das Rückgeld behalten");
        c15.setMean("Jhon");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you! Have a good day!");
        c16.setHindi("धन्यवाद! आपका दिन शुभ हो");
        c16.setUrdu("آپ کا شکریہ! آپ کا دن اچھا گزرا۔");
        c16.setPashto("مننه! ورځ مو نیکمرغه");
        c16.setArabic("شكرا! اتمنى لك يوم جيد");
        c16.setFrench("Je vous remercie! Bonne journée");
        c16.setGerman("Danke! Haben Sie einen guten Tag");
        c16.setMean("Waiter");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Goodbye.");
        c17.setHindi("अलविदा");
        c17.setUrdu("خدا حافظ");
        c17.setPashto("خداى پامان");
        c17.setArabic("وداعا");
        c17.setFrench("Au revoir");
        c17.setGerman("Auf Wiedersehen");
        c17.setMean("Jhon");
        list.add(c17);



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

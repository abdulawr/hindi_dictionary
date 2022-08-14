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

public class Shop_Conversaction extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop__conversaction);

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
        c1.setEnglish("May I help you?");
        c1.setHindi("क्या मैं आपकी सहायता कर सकता हूँ");
        c1.setUrdu("کیا میں آپ کی مدد کرسکتاہوں");
        c1.setPashto("ایا زه له تاسو سره مرسته کولی شم");
        c1.setArabic("هل لى أن أساعدك");
        c1.setFrench("Puis-je vous aider");
        c1.setGerman("Kann ich dir helfen");
        c1.setMean("Salesperson");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Yes, I'm looking for a sweater.");
        c2.setHindi("ہاں ، میں سویٹر ڈھونڈ رہا ہوں۔");
        c2.setUrdu("ہاں ، میں سویٹر ڈھونڈ رہا ہوں۔");
        c2.setPashto("هو ، زه سویټر لټوم");
        c2.setArabic("نعم ، أنا أبحث عن سترة");
        c2.setFrench("Oui, je cherche un pull");
        c2.setGerman("Ja, ich suche einen Pullover");
        c2.setMean("Shan");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("What size are you?");
        c3.setHindi("आपका साइज क्या है");
        c3.setUrdu("آپ کا سائز کیا ہے");
        c3.setPashto("ستا اندازه څومره ده");
        c3.setArabic("ما حجم انت");
        c3.setFrench("Quelle taille êtes-vous");
        c3.setGerman("Welche Größe hast du");
        c3.setMean("Salesperson");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("I'm an extra small.");
        c4.setHindi("मैं एक अतिरिक्त छोटा हूं");
        c4.setUrdu("میں ایک اضافی چھوٹا ہوں۔");
        c4.setPashto("زه یو اضافي کوچنی یم");
        c4.setArabic("أنا صغير جدا");
        c4.setFrench("Je suis un petit extra");
        c4.setGerman("Ich bin extra klein");
        c4.setMean("Shan");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Would you like a plain sweater or something else?​");
        c5.setHindi("क्या आप एक सादा स्वेटर या कुछ और पसंद करेंगे");
        c5.setUrdu("کیا آپ سادہ سویٹر یا کوئی اور چیز پسند کریں گے؟");
        c5.setPashto("ایا تاسو ساده سویټر یا بل څه غواړئ؟");
        c5.setArabic("هل ترغب في سترة بسيطة أو أي شيء آخر");
        c5.setFrench("Voulez-vous un pull uni ou autre chose");
        c5.setGerman("Möchten Sie einen einfachen Pullover oder etwas anderes");
        c5.setMean("Salesperson");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("I'm looking for a plain green sweater.");
        c6.setHindi("मैं एक सादे हरे स्वेटर की तलाश में हूं");
        c6.setUrdu("میں ایک سادہ سا سبز سویٹر ڈھونڈ رہا ہوں۔");
        c6.setPashto("زه د شنه شنه سویټر په لټه کې یم");
        c6.setArabic("أنا أبحث عن سترة خضراء واضحة");
        c6.setFrench("Je cherche un pull uni vert");
        c6.setGerman("Ich suche einen schlichten grünen Pullover");
        c6.setMean("Shan");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("How about this one?");
        c7.setHindi("इसके बारे में क्या खयाल है");
        c7.setUrdu("اس کے بارے میں کیا خیال ہے");
        c7.setPashto("د دې په اړه څنګه");
        c7.setArabic("ماذا عن هذا");
        c7.setFrench("Celui-ci, ça va");
        c7.setGerman("Wie wäre es mit diesem");
        c7.setMean("Salesperson");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Yes, that's nice. Could I try it on?");
        c8.setHindi("हाँ, यह अच्छा है। क्या मैं इस पर कोशिश कर सकता था");
        c8.setUrdu("ہاں ، یہ اچھی بات ہے۔ کیا میں اس پر کوشش کرسکتا ہوں؟");
        c8.setPashto("هو ، دا ښه دی. ایا زه په دې هڅه کولی شم");
        c8.setArabic("نعم هذا لطيف. هل يمكن أن أجربه على");
        c8.setFrench("Oui c'est bien. Puis-je l'essayer?");
        c8.setGerman("Ja das ist schön Könnte ich es anprobieren");
        c8.setMean("Shan");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Certainly, the changing rooms are over there.");
        c9.setHindi("निश्चित रूप से, चेंजिंग रूम वहाँ पर हैं");
        c9.setUrdu("یقینی طور پر ، تبدیل کرنے والے کمرے وہاں ختم ہوچکے ہیں۔");
        c9.setPashto("خامخا ، د بدلولو خونه هلته دي");
        c9.setArabic("بالتأكيد ، غرف تغيير الملابس موجودة هناك");
        c9.setFrench("Certes, les vestiaires sont là-bas");
        c9.setGerman("Natürlich sind die Umkleidekabinen dort drüben");
        c9.setMean("Salesperson");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish(" Thank you.");
        c10.setHindi("धन्यवाद");
        c10.setUrdu("شکریہ");
        c10.setPashto("مننه");
        c10.setArabic("شكرا");
        c10.setFrench("Je vous remercie");
        c10.setGerman("Danke");
        c10.setMean("Shan");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("How does it fit?");
        c11.setHindi("यह फ़िट कैसे होता है");
        c11.setUrdu("یہ کیسے موزوں ہوگا");
        c11.setPashto("دا څنګه مناسب دی");
        c11.setArabic("كيف يصلح");
        c11.setFrench("Comment ça se met");
        c11.setGerman("Wie passt es");
        c11.setMean("Salesperson");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("It's too large. Do you have a large?");
        c12.setHindi("यह बहुत बड़ा है। क्या आपके पास बड़ा है?");
        c12.setUrdu("یہ بہت بڑی ہے۔ کیا آپ کے پاس بڑا ہے؟");
        c12.setPashto("دا ډیر غټ دی. ایا تاسو لوی لرئ؟");
        c12.setArabic("انها كبيرة جدا. هل لديك كبير");
        c12.setFrench("C'est trop grand. Avez-vous un grand");
        c12.setGerman("Es ist zu groß. Hast du eine große");
        c12.setMean("Shan");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Yes, here you are. Would you like to try other?");
        c13.setHindi("हां यह लीजिये। क्या आप अन्य प्रयास करना चाहेंगे?");
        c13.setUrdu("ہاں تم یہاں ہو. کیا آپ دوسری کوشش کرنا چاہیں گے؟");
        c13.setPashto("هو ، تاسو دلته یاست. ایا تاسو غواړئ چې نورې هڅه وکړئ");
        c13.setArabic("نعم ها أنت ذا. هل ترغب في تجربة أخرى");
        c13.setFrench("Oui vous y êtes. Voulez-vous essayer d'autres");
        c13.setGerman("Ja hier sind Sie. Möchten Sie andere ausprobieren?");
        c13.setMean("Salesperson");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("No,it`s good for me.");
        c14.setHindi("नहीं, यह मेरे लिए अच्छा है");
        c14.setUrdu("نہیں ، یہ میرے لئے اچھا ہے۔");
        c14.setPashto("نه ، دا زما لپاره ښه دی");
        c14.setArabic("لا ، هذا جيد بالنسبة لي");
        c14.setFrench("Non, c'est bon pour moi");
        c14.setGerman("Nein, das tut mir gut");
        c14.setMean("Shan");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("Thank you. Have a nice day!");
        c15.setHindi("धन्यवाद। आपका दिन शुभ हो");
        c15.setUrdu("شکریہ آپ کا دن اچھا گزرا");
        c15.setPashto("مننه. ښه ورځ ولرئ");
        c15.setArabic("شكرا. أتمنى لك نهارا سعيد");
        c15.setFrench("Je vous remercie. Bonne journée");
        c15.setGerman("Danke. Einen schönen Tag noch");
        c15.setMean("Salesperson");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you, goodbye.");
        c16.setHindi("धन्यवाद अलविदा");
        c16.setUrdu("شکریہ خدا حافظ");
        c16.setPashto("مننه د خدای په امان");
        c16.setArabic("شكرا مع السلامة");
        c16.setFrench("Merci, au revoir");
        c16.setGerman("Danke. Auf Wiedersehen");
        c16.setMean("Shan");
        list.add(c16);



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

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

public class Introduce_yourself extends AppCompatActivity {

    RecyclerView view;
     Phrases_Recycle_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_yourself);


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
        c1.setEnglish("Hello");
        c1.setHindi("नमस्ते");
        c1.setUrdu("ہیلو");
        c1.setPashto("سلام");
        c1.setArabic("مرحبا");
        c1.setFrench("Salut");
        c1.setGerman("Hallo");
        c1.setMean("Salman");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Hi!");
        c2.setHindi("नमस्ते");
        c2.setUrdu("ہائے");
        c2.setPashto("سلام");
        c2.setArabic("مرحبا");
        c2.setFrench("salut");
        c2.setGerman("Hallo");
        c2.setMean("John");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("My name is Salman. What's your name?");
        c3.setHindi("मेरा नाम सलमान है। तुम्हारा नाम क्या है?");
        c3.setUrdu("میرا نام سلمان ہے۔ آپ کا نام کیا ہے؟");
        c3.setPashto("زما نوم سلمان دی. ستا څه نوم دی؟");
        c3.setArabic("اسمي سلمان ما اسمك");
        c3.setFrench("Je m'appelle Salman. Comment tu t'appelles");
        c3.setGerman("Ich heiße salman Wie heißen Sie");
        c3.setMean("Salman");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("My name is John. Nice to meet you.");
        c4.setHindi("मेरा नाम जॉन है। आपसे मिलकर अच्छा लगा");
        c4.setUrdu("میرا نام جان ہے۔ آپ سے مل کر خوشی ہوئی");
        c4.setPashto("زما نوم جان دی. په لیدو مو خوښ شوم");
        c4.setArabic("اسمي جون. تشرفت بمقابلتك");
        c4.setFrench("Mon nom est John. Ravi de vous rencontrer");
        c4.setGerman("Mein Name ist John. Freut mich, dich kennenzulernen");
        c4.setMean("John");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("It's a pleasure. This is a great party!");
        c5.setHindi("यह एक खुशी की बात है। यह एक महान पार्टी है!");
        c5.setUrdu("یہ ایک خوشی ہے. یہ ایک زبردست پارٹی ہے!");
        c5.setPashto("دا خوشحالي ده. دا عالي ګوند دی! ");
        c5.setArabic("إنه لمن دواعي سروري. هذه حفلة عظيمه");
        c5.setFrench("C'est un plaisir. C'est une super soirée");
        c5.setGerman("Es ist ein Vergnügen. Das ist eine tolle Party");
        c5.setMean("Salman");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes, it is. Where are you from?");
        c6.setHindi("हाँ यही है। आप रहने वाली कहा की है");
        c6.setUrdu("ہاں ، یہ ہے۔ آپ کہاں سے ہیں");
        c6.setPashto("بلې همداسې ده. تاسې د کوم ځای یاست");
        c6.setArabic("نعم إنه كذلك. من أي بلد أنت");
        c6.setFrench("Oui, ça l'est. D'où êtes-vous");
        c6.setGerman("Ja ist es. Woher kommst du");
        c6.setMean("John");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("I'm from Islamabad.");
        c7.setHindi("मैं इस्लामाबाद से हूं");
        c7.setUrdu("میں اسلام آباد سے ہوں۔");
        c7.setPashto("زه د اسلام آباد یم");
        c7.setArabic("انا من اسلام اباد");
        c7.setFrench("Je suis d'Islamabad");
        c7.setGerman("Ich komme aus Islamabad");
        c7.setMean("Salman");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Islamabad? Are you Indian?");
        c8.setHindi("इस्लामाबाद? आप भारतीय हैं");
        c8.setUrdu("اسلام آباد۔ کیا آپ ہندوستانی ہیں؟");
        c8.setPashto("اسلام آباد؟ ایا تاسو هندي یاست؟");
        c8.setArabic("اسلام اباد؟ هل انت هندية");
        c8.setFrench("Islamabad? Etes vous indien");
        c8.setGerman("Islamabad? Bist du Inder?");
        c8.setMean("John");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("No, I'm not Indian. I'm Pakistani.");
        c9.setHindi("नहीं, मैं भारतीय नहीं हूं। मैं पाकिस्तानी हूं");
        c9.setUrdu("نہیں ، میں ہندوستانی نہیں ہوں۔ میں پاکستانی ہوں");
        c9.setPashto("نه ، زه هندي نه یم. زه پاکستانی یم");
        c9.setArabic("لا ، أنا لست هنديًا. ط م الباكستاني");
        c9.setFrench("Non, je ne suis pas indien. Je suis pakistanais");
        c9.setGerman("Nein, ich bin kein Inder. Ich bin Pakistani");
        c9.setMean("Salman");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Oh, you're Pakistani. Sorry about that.");
        c10.setHindi("ओह, तुम पाकिस्तानी हो। उसके लिए माफ़ करना");
        c10.setUrdu("اوہ ، تم پاکستانی ہو۔ اس کے لئے معذرت");
        c10.setPashto("اوه ، تاسو پاکستانی یاست. بښنه غواړم پدې اړه");
        c10.setArabic("أوه ، أنت باكستاني. اسف بشأن ذلك");
        c10.setFrench("Oh, vous êtes pakistanais. Désolé pour ça");
        c10.setGerman("Oh, du bist Pakistaner. Das tut mir leid");
        c10.setMean("John");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("That's OK. Where are you from?");
        c11.setHindi("ठीक है। आप रहने वाली कहा की है");
        c11.setUrdu("ٹھیک ہے. آپ کہاں سے ہیں");
        c11.setPashto("سمه ده. تاسې د کوم ځای یاست");
        c11.setArabic("هذا حسن. من أي بلد أنت");
        c11.setFrench("C'est bon. D'où êtes-vous");
        c11.setGerman("Das ist okay. Woher kommst du");
        c11.setMean("Salman");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("I live in London, but I'm not British.");
        c12.setHindi("मैं लंदन में रहता हूं, लेकिन मैं ब्रिटिश नहीं हूं");
        c12.setUrdu("میں لندن میں رہتا ہوں ، لیکن میں برطانوی نہیں ہوں۔");
        c12.setPashto("زه په لندن کې اوسیږم ، خو زه بریتانیا نه یم");
        c12.setArabic("أعيش في لندن ، لكنني لست بريطانيًا");
        c12.setFrench("J'habite à Londres, mais je ne suis pas britannique");
        c12.setGerman("Ich lebe in London, aber ich bin kein Brite");
        c12.setMean("John");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("No, what are you?");
        c13.setHindi("नहीं, तुम क्या हो");
        c13.setUrdu("نہیں تم کیا ہو");
        c13.setPashto("نه ، ته څه یې؟");
        c13.setArabic("لا ، ما أنت؟");
        c13.setFrench("Non, tu es quoi");
        c13.setGerman("Nein, was bist du?");
        c13.setMean("Salman");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Well, my parents were Indian, so I'm Indian, too.");
        c14.setHindi("खैर, मेरे माता-पिता भारतीय थे, इसलिए मैं भी भारतीय हूं");
        c14.setUrdu("ٹھیک ہے ، میرے والدین ہندوستانی تھے ، لہذا میں بھی ہندوستانی ہوں۔");
        c14.setPashto("ښه ، زما مور او پلار هندي وو ، نو زه هم هندي یم");
        c14.setArabic("حسنًا ، كان والداي هنديين ، لذا فأنا هندي أيضًا");
        c14.setFrench("Eh bien, mes parents étaient indiens, donc je suis indien aussi");
        c14.setGerman("Nun, meine Eltern waren Inder, also bin ich auch Inder");
        c14.setMean("John");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("That's very interesting. India is a beautiful country.");
        c15.setHindi("यह तो बहुत ही मज़ेदार है। भारत एक खूबसूरत देश है");
        c15.setUrdu("یہ بہت دلچسپ ہے۔ ہندوستان ایک خوبصورت ملک ہے۔");
        c15.setPashto("دا ډیر په زړه پوری دی. هندوستان یو ښکلی هیواد دی");
        c15.setArabic("هذا مثير جدا للاهتمام. الهند بلد جميل");
        c15.setFrench("C'est très intéressant. L'Inde est un pays magnifique");
        c15.setGerman("Das ist sehr interessant. Indien ist ein wunderschönes Land");
        c15.setMean("Salman");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Thank you. It is a wonderful place.");
        c16.setHindi("धन्यवाद। यह एक अद्भुत जगह है");
        c16.setUrdu("شکریہ یہ ایک حیرت انگیز جگہ ہے۔");
        c16.setPashto("مننه. دا یو په زړه پوری ځای دی");
        c16.setArabic("شكرا. انه مكان رائع");
        c16.setFrench("Je vous remercie. C'est un endroit merveilleux");
        c16.setGerman("Danke. Es ist ein wundervoller Ort");
        c16.setMean("John");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Bye bye, John. Have a nice evening.");
        c17.setHindi("अलविदा, जॉन। आपकी शाम अच्छी बीते");
        c17.setUrdu("الوداع ، جان۔ شام بخیر");
        c17.setPashto("د خدای په امان ، جان. ښه ماښام ولرئ");
        c17.setArabic("وداعا ، جون. عمت مساء");
        c17.setFrench("Au revoir, John. Passez une bonne soirée");
        c17.setGerman("Tschüss, John. Hab einen schönen Abend");
        c17.setMean("Salman");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Thanks, you too!");
        c18.setHindi("आपको भी धन्यवाद");
        c18.setUrdu("آپ کا بھی شکریہ");
        c18.setPashto("مننه ، تاسو هم");
        c18.setArabic("شكرا لك ايضا");
        c18.setFrench("Merci à toi aussi");
        c18.setGerman("Danke dir auch");
        c18.setMean("John");
        list.add(c18);


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

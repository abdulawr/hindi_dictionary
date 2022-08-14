package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Phrases_Activity extends AppCompatActivity {

    RecyclerView view;
    ArrayList<Data_Container> list;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_);

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

        Toast.makeText(this, "Please wait while using pronunciation feature!", Toast.LENGTH_SHORT).show();

        view=(RecyclerView) findViewById(R.id.recycleview);
        list=new ArrayList<>();

        Data_Container container1=new Data_Container();
        container1.setEnglish("A blessing in disguise.");
        container1.setMean("A good thing that seemed bad at first.");
        container1.setHindi("एक अच्छी बात जो पहली बार में बुरी लग रही थी");
        container1.setArabic("والشيء الجيد الذي بدا سيئا في البداية.");
        container1.setUrdu("ایک اچھی چیز جو پہلے بری لگتی تھی۔");
        container1.setPashto("یو ښه شی چې په پیل کې خراب ښکاري");
        container1.setFrench("Une bonne chose qui semblait mauvaise au début");
        container1.setGerman("Eine gute Sache, die zuerst schlecht schien");
        list.add(container1);


        Data_Container container2=new Data_Container();
        container2.setEnglish("A dime a dozen.");
        container2.setMean("Something common.");
        container2.setHindi("कुछ सामान्य।");
        container2.setArabic("شيء شائع.");
        container2.setUrdu("کچھ عام۔");
        container2.setPashto("یو څه عام.");
        container2.setFrench("Quelque chose de commun.");
        container2.setGerman("Etwas allgemeines.");
        list.add(container2);

        Data_Container container3=new Data_Container();
        container3.setEnglish("Better late than never.");
        container3.setMean("Better to arrive late than not to come at all.");
        container3.setHindi("देर से आने के लिए बेहतर है कि बिल्कुल न आएं।");
        container3.setArabic("من الأفضل أن تصل متأخرة عن عدم الحضور على الإطلاق.");
        container3.setUrdu("بالکل نہ آنے سے دیر سے پہنچنا بہتر ہے۔");
        container3.setPashto("ښه نه دا چې ناوخته راورسیږي بلکه نه راځي.");
        container3.setFrench("Mieux vaut arriver en retard que de ne pas venir du tout.");
        container3.setGerman("Besser spät als gar nicht.");
        list.add(container3);


        Data_Container container4=new Data_Container();
        container4.setEnglish("Bite the bullet.");
        container4.setMean("To get something over with because it is inevitable.");
        container4.setHindi("कुछ पाने के लिए क्योंकि यह अपरिहार्य है।");
        container4.setArabic("للحصول على شيء مع لأنه لا مفر منه.");
        container4.setUrdu("اس کے ساتھ کچھ حاصل کرنا کیونکہ یہ ناگزیر ہے۔");
        container4.setPashto("د دې سره یو څه ترلاسه کول ځکه چې دا ناگزیر دی.");
        container4.setFrench("En finir avec quelque chose parce que c'est inévitable.");
        container4.setGerman("Etwas hinter sich zu bringen, weil es unvermeidlich ist.");
        list.add(container4);


        Data_Container container5=new Data_Container();
        container5.setEnglish("Break a leg.");
        container5.setMean("Good luck.");
        container5.setHindi("सौभाग्य।");
        container5.setArabic("حظا سعيدا.");
        container5.setUrdu("اچھی قسمت.");
        container5.setPashto("ښه چانس.");
        container5.setFrench("Bonne chance.");
        container5.setGerman("Viel Glück.");
        list.add(container5);

        Data_Container container6=new Data_Container();
        container6.setEnglish("Call it a day.");
        container6.setMean("Stop working on something.");
        container6.setHindi("किसी चीज पर काम करना बंद करें।");
        container6.setArabic("التوقف عن العمل على شيء ما.");
        container6.setUrdu("کسی چیز پر کام کرنا چھوڑ دو۔");
        container6.setPashto("په یو څه کار کول ودروئ.");
        container6.setFrench("Arrête de travailler sur quelque chose.");
        container6.setGerman("Hör auf, an etwas zu arbeiten.");
        list.add(container6);

        Data_Container container7=new Data_Container();
        container7.setEnglish("Cut somebody some slack.");
        container7.setMean("Don't be so critical.");
        container7.setHindi("इतनी आलोचना मत करो।");
        container7.setArabic("لا تكون حرجة للغاية.");
        container7.setUrdu("اتنا تنقید نہ کریں۔");
        container7.setPashto("دومره انتقاد مه کوه.");
        container7.setFrench("Ne soyez pas si critique.");
        container7.setGerman("Sei nicht so kritisch.");
        list.add(container7);

        Data_Container container8=new Data_Container();
        container8.setEnglish("Easy does it.");
        container8.setMean("Slow down");
        container8.setHindi("गति कम करो");
        container8.setArabic("ابطئ");
        container8.setUrdu("آہستہ کرو۔");
        container8.setPashto("ورو کېدل");
        container8.setFrench("Ralentir");
        container8.setGerman("Langsamer");
        list.add(container8);

        Data_Container container9=new Data_Container();
        container9.setEnglish("Get out of hand.");
        container9.setMean("Get out of control.");
        container9.setHindi("नियंत्रण से बाहर।");
        container9.setArabic("يخرج عن السيطرة.");
        container9.setUrdu("قابو سے باہر ہو جاؤ۔");
        container9.setPashto("د کنټرول څخه راووځئ.");
        container9.setFrench("Sois hors de contrôle.");
        container9.setGerman("Außer Kontrolle geraten.");
        list.add(container9);


        Data_Container container10=new Data_Container();
        container10.setEnglish("Get your act together.");
        container10.setMean("Work better or leave.");
        container10.setHindi("बेहतर काम करना या छोड़ना।");
        container10.setArabic("العمل بشكل أفضل أو المغادرة.");
        container10.setUrdu("بہتر کام کریں یا روانہ ہوں۔");
        container10.setPashto("ښه کار وکړئ یا پریږدئ.");
        container10.setFrench("Travaillez mieux ou partez.");
        container10.setGerman("Besser arbeiten oder gehen.");
        list.add(container10);



        // ##################### 11-20##################


        Data_Container container11=new Data_Container();
        container11.setEnglish("Give someone the benefit of the doubt.");
        container11.setMean("Trust what someone says.");
        container11.setHindi("भरोसा करो कि कोई क्या कहता है।");
        container11.setArabic("ثق بما يقوله شخص ما.");
        container11.setUrdu("بھروسہ کرو کوئی کہتا ہے۔");
        container11.setPashto("باور وکړئ څه چې وايي.");
        container11.setFrench("Faites confiance à ce que quelqu'un dit.");
        container11.setGerman("Vertraue dem, was jemand sagt.");
        list.add(container11);

        Data_Container container12=new Data_Container();
        container12.setEnglish("Go back to the drawing board.");
        container12.setMean("Start over.");
        container12.setHindi("प्रारंभ करें");
        container12.setArabic("ابدأ من جديد");
        container12.setUrdu("پھر سے شروع");
        container12.setPashto("له سره پیل کول");
        container12.setFrench("Recommencer");
        container12.setGerman("Von vorn anfangen");
        list.add(container12);

        Data_Container container13=new Data_Container();
        container13.setEnglish("Hang in there.");
        container13.setMean("Don't give up.");
        container13.setHindi("हार मत मानो।");
        container13.setArabic("لا تستسلم.");
        container13.setUrdu("ہمت نہ ہارنا۔");
        container13.setPashto("مه تسلیمیږه");
        container13.setFrench("N'abandonne pas.");
        container13.setGerman("Gib nicht auf.");
        list.add(container13);


        Data_Container container14=new Data_Container();
        container14.setEnglish("Hit the sack.");
        container14.setMean("Go to sleep.");
        container14.setHindi("सो जाओ।");
        container14.setArabic("اذهب إلى النوم.");
        container14.setUrdu("سونے جائیں.");
        container14.setPashto("ویده شه.");
        container14.setFrench("Va te coucher.");
        container14.setGerman("Geh schlafen.");
        list.add(container14);


        Data_Container container15=new Data_Container();
        container15.setEnglish("It's not rocket science.");
        container15.setMean("It's not complicated.");
        container15.setHindi("सो जाओ।");
        container15.setArabic("اذهب إلى النوم.");
        container15.setUrdu("سونے جائیں.");
        container15.setPashto("ویده شه.");
        container15.setFrench("Va te coucher.");
        container15.setGerman("Geh schlafen.");
        list.add(container15);

        Data_Container container16=new Data_Container();
        container16.setEnglish("Let someone off the hook.");
        container16.setMean("To not hold someone responsible for something.");
        container16.setHindi("किसी चीज के लिए किसी को जिम्मेदार न ठहराना");
        container16.setArabic("لعدم تحمل شخص مسؤول عن شيء ما");
        container16.setUrdu("کسی کو کسی چیز کے لئے ذمہ دار نہ ٹھہرانا۔");
        container16.setPashto("د یو چا لپاره د یو چا مسؤل نه نیول");
        container16.setFrench("Ne pas tenir quelqu'un responsable de quelque chose");
        container16.setGerman("Jemanden nicht für etwas verantwortlich machen");
        list.add(container16);

        Data_Container container17=new Data_Container();
        container17.setEnglish("Make a long story short.");
        container17.setMean("Tell something briefly.");
        container17.setHindi("कुछ संक्षेप में बताएं।");
        container17.setArabic("قل شيئا لفترة وجيزة.");
        container17.setUrdu("کچھ مختصر بتاؤ۔");
        container17.setPashto("یو څه لنډ ووایاست.");
        container17.setFrench("Dis quelque chose brièvement.");
        container17.setGerman("Erzählen Sie kurz etwas.");
        list.add(container17);

        Data_Container container18=new Data_Container();
        container18.setEnglish("Miss the boat.");
        container18.setMean("It's too late.");
        container18.setHindi("बहुत देर हो चुकी है।");
        container18.setArabic("فوات الاوان.");
        container18.setUrdu("یہ بہت دیر ہو چکی ہے.");
        container18.setPashto("ډیر ناوخته دی");
        container18.setFrench("C'est trop tard.");
        container18.setGerman("Es ist zu spät.");
        list.add(container18);

        Data_Container container19=new Data_Container();
        container19.setEnglish("No pain, no gain.");
        container19.setMean("You have to work for what you want.");
        container19.setHindi("आपको जो चाहिए उसके लिए काम करना होगा।");
        container19.setArabic("عليك أن تعمل من أجل ما تريد.");
        container19.setUrdu("آپ اپنی مرضی کے لئے کام کرنا ہے۔");
        container19.setPashto("تاسو باید د هغه څه لپاره کار وکړئ چې تاسو یې غواړئ.");
        container19.setFrench("Vous devez travailler pour ce que vous voulez.");
        container19.setGerman("Sie müssen für das arbeiten, was Sie wollen.");
        list.add(container19);


        Data_Container container20=new Data_Container();
        container20.setEnglish("On the ball.");
        container20.setMean("Doing a good job.");
        container20.setHindi("अच्छा काम कर रहे हैं।");
        container10.setArabic("القيام بعمل جيد.");
        container20.setUrdu("اچھا کام کرنا۔");
        container20.setPashto("ښه دنده ترسره کول.");
        container20.setFrench("Faire du bon travail.");
        container20.setGerman("Einen guten Job machen.");
        list.add(container20);


        // ##################### 21-30##################


        Data_Container container21=new Data_Container();
        container21.setEnglish("Pull someone's leg.");
        container21.setMean("To joke with someone.");
        container21.setHindi("किसी के साथ मजाक करना।");
        container21.setArabic("إلى المزاح مع شخص ما.");
        container21.setUrdu("کسی کے ساتھ مذاق کرنا۔");
        container21.setPashto("د چا سره ټوکې کول.");
        container21.setFrench("Blague à quelqu'un.");
        container21.setGerman("Mit jemandem scherzen.");
        list.add(container21);

        Data_Container container22=new Data_Container();
        container22.setEnglish("Pull yourself together.");
        container22.setMean("Calm down.");
        container22.setHindi("शांत हो जाओ।");
        container22.setArabic("اهدأ.");
        container22.setUrdu("پرسکون ہوجاؤ۔");
        container22.setPashto("ارام شی.");
        container22.setFrench("Calmez-vous.");
        container22.setGerman("Beruhigen.");
        list.add(container22);

        Data_Container container23=new Data_Container();
        container23.setEnglish("So far so good.");
        container23.setMean("Things are going well so far.");
        container23.setHindi("हालात अब तक ठीक चल रहे हैं।");
        container23.setArabic("الأمور تسير على ما يرام حتى الآن.");
        container23.setUrdu("اب تک حالات ٹھیک ہورہے ہیں۔");
        container23.setPashto("تر دې دمه کارونه په ښه توګه روان دي.");
        container23.setFrench("Les choses vont bien jusqu'à présent.");
        container23.setGerman("Die Dinge laufen soweit gut.");
        list.add(container23);


        Data_Container container24=new Data_Container();
        container24.setEnglish("Speak of the devil.");
        container24.setMean("The person we were just talking about showed up!");
        container24.setHindi("हम जिस व्यक्ति के बारे में बात कर रहे थे, वह दिखा!");
        container24.setArabic("الشخص الذي كنا نتحدث عنه فقط ظهر!");
        container24.setUrdu("ہم جس شخص کے بارے میں بات کر رہے تھے وہ ظاہر ہوا!");
        container24.setPashto("هغه سړی چې موږ یې یوازې خبرې کولې په ډاګه شوې!");
        container24.setFrench("La personne dont nous parlions s'est présentée!");
        container24.setGerman("Die Person, über die wir gerade gesprochen haben, ist aufgetaucht!");
        list.add(container24);


        Data_Container container25=new Data_Container();
        container25.setEnglish("That's the last straw.");
        container25.setMean("My patience has run out.");
        container25.setHindi("मेरा धैर्य भाग गया है।");
        container25.setArabic("لقد نفد صبري.");
        container25.setUrdu("میرا صبر ختم ہوچکا ہے۔");
        container25.setPashto("زما صبر ختم شو.");
        container25.setFrench("Ma patience est à bout.");
        container25.setGerman("Meine Geduld ist erschöpft.");
        list.add(container25);

        Data_Container container26=new Data_Container();
        container26.setEnglish("The best of both worlds.");
        container26.setMean("An ideal situation.");
        container26.setHindi("एक आदर्श स्थिति।");
        container26.setArabic("وضع مثالي.");
        container26.setUrdu("ایک مثالی صورتحال۔");
        container26.setPashto("یو مثالی وضعیت.");
        container26.setFrench("Une situation idéale");
        container26.setGerman("Eine ideale Situation.");
        list.add(container26);

        Data_Container container27=new Data_Container();
        container27.setEnglish("To get bent out of shape.");
        container27.setMean("To get upset.");
        container27.setHindi("उदास हो जाना।");
        container27.setArabic("حتى تنزعج.");
        container27.setUrdu("پریشان ہونا۔");
        container27.setPashto("خپه کیدل");
        container27.setFrench("Se fâcher.");
        container27.setGerman("Wütend werden.");
        list.add(container27);

        Data_Container container28=new Data_Container();
        container28.setEnglish("To make matters worse.");
        container28.setMean("Make a problem worse.");
        container28.setHindi("एक समस्या और भी बदतर कर दो।");
        container28.setArabic("اجعل المشكلة أسوأ.");
        container28.setUrdu("پریشانی کو مزید خراب کردیں۔");
        container28.setPashto("ستونزه نوره هم خرابه کړه.");
        container28.setFrench("Aggraver un problème.");
        container28.setGerman("Machen Sie ein Problem noch schlimmer.");
        list.add(container28);

        Data_Container container29=new Data_Container();
        container29.setEnglish("Under the weather.");
        container29.setMean("Sick");
        container29.setHindi("बीमार");
        container29.setArabic("مرض");
        container29.setUrdu("بیمار");
        container29.setPashto("ناروغ");
        container29.setFrench("Malade");
        container29.setGerman("Krank");
        list.add(container29);


        Data_Container container30=new Data_Container();
        container30.setEnglish("You can say that again.");
        container30.setMean("That's true, I agree.");
        container30.setHindi("यह सच है, मैं सहमत हूँ");
        container30.setArabic("هذا صحيح ، أنا أوافق");
        container30.setUrdu("یہ سچ ہے ، میں اتفاق کرتا ہوں۔");
        container30.setPashto("دا ریښتیا ده ، زه موافق یم");
        container30.setFrench("C'est vrai, je suis d'accord");
        container30.setGerman("Das stimmt, ich stimme zu");
        list.add(container30);


        // ##################### 31-40##################


        Data_Container container31=new Data_Container();
        container31.setEnglish("Your guess is as good as mine.");
        container31.setMean("I have no idea.");
        container31.setHindi("मुझे पता नहीं है।");
        container31.setArabic("ليس لدي فكره.");
        container31.setUrdu("مجھے کوئی اندازہ نہیں.");
        container31.setPashto("زه هیڅ مفکوره نلرم.");
        container31.setFrench("Je n'ai aucune idée.");
        container31.setGerman("Ich habe keine Ahnung.");
        list.add(container31);

        Data_Container container32=new Data_Container();
        container32.setEnglish("A penny for your thoughts.");
        container32.setMean("Tell me what you're thinking.");
        container32.setHindi("मुझे बताओ कि तुम क्या सोच रहे हो।");
        container32.setArabic("قل لي ما كنت تفكر.");
        container32.setUrdu("مجھے بتائیں کہ آپ کیا سوچ رہے ہیں۔");
        container32.setPashto("ما ته ووایاست چې تاسو څه فکر کوئ.");
        container32.setFrench("Dis moi ce que tu penses.");
        container32.setGerman("Sag mir, was du denkst.");
        list.add(container32);

        Data_Container container33=new Data_Container();
        container33.setEnglish("A perfect storm.");
        container33.setMean("The worst possible situation.");
        container33.setHindi("सबसे खराब स्थिति।");
        container33.setArabic("بدترین ممکن صورتحال");
        container33.setUrdu("بدترین ممکن صورتحال");
        container33.setPashto("بدترین ممکن وضعیت.");
        container33.setFrench("la pire situation possible.");
        container33.setGerman("die schlimmste mögliche Situation.");
        list.add(container33);


        Data_Container container34=new Data_Container();
        container34.setEnglish("A picture is worth 1000 words.");
        container34.setMean("Better to show than tell.");
        container34.setHindi("बताने से बेहतर है दिखाना।");
        container34.setArabic("أفضل لإظهار من اقول.");
        container34.setUrdu("بتانے سے بہتر ہے۔");
        container34.setPashto("د ویلو څخه ښه ښودل.");
        container34.setFrench("Mieux vaut montrer que dire.");
        container34.setGerman("Besser zeigen als erzählen.");
        list.add(container34);


        Data_Container container35=new Data_Container();
        container35.setEnglish("By the skin of your teeth.");
        container35.setMean("Just barely.");
        container35.setHindi("मुश्किल से");
        container35.setArabic("بالكاد");
        container35.setUrdu("صرف بمشکل۔");
        container35.setPashto("یوازې");
        container35.setFrench("À peine");
        container35.setGerman("Gerade so");
        list.add(container35);

        Data_Container container36=new Data_Container();
        container36.setEnglish("Costs an arm and a leg.");
        container36.setMean("Very expensive");
        container36.setHindi("बहुत महंगा");
        container36.setArabic("غالي جدا");
        container36.setUrdu("بہت مہنگی");
        container36.setPashto("ډیر ګران");
        container36.setFrench("Très cher");
        container36.setGerman("Sehr teuer");
        list.add(container36);

        Data_Container container37=new Data_Container();
        container37.setEnglish("Give someone the cold shoulde.");
        container37.setMean("Ignore someone");
        container37.setHindi("किसी की उपेक्षा");
        container37.setArabic("تجاهل شخص ما");
        container37.setUrdu("کسی کو نظرانداز کریں۔");
        container37.setPashto("له چا سترګې پټې کړئ");
        container37.setFrench("Ignorer quelqu'un");
        container37.setGerman("Ignoriere jemanden");
        list.add(container37);

        Data_Container container38=new Data_Container();
        container38.setEnglish("Go on a wild goose chase.");
        container38.setMean("To do something pointless.");
        container38.setHindi("कुछ निरर्थक करने के लिए");
        container38.setArabic("لفعل شيء لا طائل منه");
        container38.setUrdu("بے مقصد کچھ کرنا۔");
        container38.setPashto("بې معنی کار کول");
        container38.setFrench("Faire quelque chose d'inutile");
        container38.setGerman("Etwas Sinnloses tun");
        list.add(container38);

        Data_Container container39=new Data_Container();
        container39.setEnglish("Good things come to those who wait.");
        container39.setMean("Be patient");
        container39.setHindi("धैर्य रखें");
        container39.setArabic("كن صبورا");
        container39.setUrdu("صبر کرو");
        container39.setPashto("د زغم څښتن و اوسه");
        container39.setFrench("Sois patient");
        container39.setGerman("Sei geduldig");
        list.add(container39);


        Data_Container container40=new Data_Container();
        container40.setEnglish("He's a chip off the old block.");
        container40.setMean("The son is like the father.");
        container40.setHindi("पुत्र पिता के समान होता है।");
        container40.setArabic("الابن مثل الاب.");
        container40.setUrdu("بیٹا باپ کی طرح ہے۔");
        container40.setPashto("زوی د پلار په څیر دی.");
        container40.setFrench("Le fils est comme le père.");
        container40.setGerman("Der Sohn ist wie der Vater.");
        list.add(container40);




        // ##################### 41-50##################


        Data_Container container41=new Data_Container();
        container41.setEnglish("It ain't over till the fat lady sings.");
        container41.setMean("This isn't over yet.");
        container41.setHindi("यह अभी खत्म नहीं हुआ है");
        container41.setArabic("هذا لم ينته بعد");
        container41.setUrdu("یہ ابھی ختم نہیں ہوا ہے۔");
        container41.setPashto("دا لا نه دی ختم شوی");
        container41.setFrench("Ce n'est pas fini");
        container41.setGerman("Das ist noch nicht vorbei");
        list.add(container41);

        Data_Container container42=new Data_Container();
        container42.setEnglish("It's a piece of cake.");
        container42.setMean("It's easy.");
        container42.setHindi("यह आसान है");
        container42.setArabic("من السهل");
        container42.setUrdu("یہ آسان ہے");
        container42.setPashto("دا اسانه ده");
        container42.setFrench("C'est facile");
        container42.setGerman("Es ist einfach");
        list.add(container42);

        Data_Container container43=new Data_Container();
        container43.setEnglish("Fortune favours the bold.");
        container43.setMean("Take risks");
        container43.setHindi("जोखिम लें");
        container43.setArabic("يخاطر");
        container43.setUrdu("رسک لیں۔");
        container43.setPashto("خطرات واخلئ");
        container43.setFrench("Prendre des risques");
        container43.setGerman("Risiken eingehen");
        list.add(container43);


        Data_Container container44=new Data_Container();
        container44.setEnglish("Go down in flames.");
        container44.setMean("Fail spectacularly.");
        container44.setHindi("शानदार प्रदर्शन किया");
        container44.setArabic("فشل مذهلة");
        container44.setUrdu("حیرت انگیز طور پر ناکام");
        container44.setPashto("په لیدو کې ناکام");
        container44.setFrench("Échec spectaculaire");
        container44.setGerman("Scheitern Sie spektakulär");
        list.add(container44);


        Data_Container container45=new Data_Container();
        container45.setEnglish("He's off his rocker.");
        container45.setMean("He's crazy.");
        container45.setHindi("वह पागल है");
        container45.setArabic("وہ پاگل ہے۔");
        container45.setUrdu("وہ پاگل ہے۔");
        container45.setPashto("هغه لیونی دی");
        container45.setFrench("Il est fou");
        container45.setGerman("Er ist verrückt");
        list.add(container45);


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

    @Override
    protected void onDestroy() {
        adapter.isEnglis().stop();
        adapter.isEnglis().shutdown();

        adapter.isHindi().stop();
        adapter.isHindi().shutdown();

        adapter.isFrench().stop();
        adapter.isFrench().shutdown();

        adapter.isGermen().stop();
        adapter.isGermen().shutdown();

        super.onDestroy();
    }
}

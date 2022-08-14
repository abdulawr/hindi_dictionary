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

public class Hospital_conversation extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_conversation);


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
        c1.setEnglish("Good morning, Dr. Adnan!");
        c1.setHindi("सुप्रभात, डॉ। अदनान");
        c1.setUrdu("صبح بخیر ، ڈاکٹر عدنان۔");
        c1.setPashto("سهار مو پخیر ، ډاکټر عدنان");
        c1.setArabic("صباح الخير يا دكتور عدنان");
        c1.setFrench("Bonjour, Dr. Adnan");
        c1.setGerman("Guten Morgen, Dr. Adnan");
        c1.setMean("Mr. Salman");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Good morning! What’s wrong with you?");
        c2.setHindi("शुभ प्रभात! तुम्हें क्या हुआ");
        c2.setUrdu("صبح بخیر! آپ کے ساتھ مسئلہ کیا ہے");
        c2.setPashto("سهار مو پخير! څه شی دی په تا سره");
        c2.setArabic("صباح الخير! ما مشكلتك؟");
        c2.setFrench("Guten Morgen! Was fehlt dir?...");
        c2.setGerman("Guten Morgen! Was fehlt dir?");
        c2.setMean("Dr. Adnan");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("I have been suffering from headache since yesterday.");
        c3.setHindi("میں کل سے ہی سر درد میں مبتلا ہوں۔");
        c3.setUrdu("میں کل سے ہی سر درد میں مبتلا ہوں۔");
        c3.setPashto("زه له پرون راهیسې د سر درد لرم");
        c3.setArabic("لقد كنت أعاني من الصداع منذ يوم أمس.");
        c3.setFrench("Je souffre de maux de tête depuis hier.");
        c3.setGerman("لقد كنت أعاني من الصداع منذ يوم أمس.");
        c3.setMean("Mr. Salman");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Do you have any other symptoms?");
        c4.setHindi("क्या आपके कोई अन्य लक्षण हैं");
        c4.setUrdu("کیا آپ کو کوئی اور علامات ہیں؟");
        c4.setPashto("ایا تاسو کوم بل نښې لری؟");
        c4.setArabic("هل لديك أي أعراض أخرى");
        c4.setFrench("Avez-vous d'autres symptômes");
        c4.setGerman("Haben Sie andere Symptome?");
        c4.setMean("Dr. Adnan");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("No I don`t have.");
        c5.setHindi("नहीं, मेरे पास नहीं है");
        c5.setUrdu("نہیں میرے پاس نہیں ہے۔");
        c5.setPashto("نه زه نه لرم");
        c5.setArabic("لا ليس لدي");
        c5.setFrench("Non je n'ai pas");
        c5.setGerman("Nein, habe ich nicht");
        c5.setMean("Mr. Salman");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Let me check your temperature and blood pressure.");
        c6.setHindi("");
        c6.setUrdu("");
        c6.setPashto("");
        c6.setArabic("اسمحوا لي أن تحقق درجة الحرارة وضغط الدم");
        c6.setFrench("Laissez-moi vérifier votre température et votre pression artérielle");
        c6.setGerman("Lassen Sie mich Ihre Temperatur und Ihren Blutdruck überprüfen");
        c6.setMean("Dr. Adnan");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Both temperature and blood pressure are normal.");
        c7.setHindi("तापमान और रक्तचाप दोनों सामान्य हैं");
        c7.setUrdu("درجہ حرارت اور بلڈ پریشر دونوں معمول کے ہیں۔");
        c7.setPashto("د تودوخې او وینې فشار دواړه نورمال دي");
        c7.setArabic("كل من درجة الحرارة وضغط الدم طبيعية");
        c7.setFrench("La température et la pression artérielle sont normales");
        c7.setGerman("Sowohl Temperatur als auch Blutdruck sind normal");
        c7.setMean("Mr. Salman");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("So what is the reason of headache.");
        c8.setHindi("तो सिरदर्द का कारण क्या है");
        c8.setUrdu("تو سر درد کی وجہ کیا ہے؟");
        c8.setPashto("نو د سر درد لامل څه دی");
        c8.setArabic("فما سبب الصداع");
        c8.setFrench("Alors, quelle est la raison du mal de tête");
        c8.setGerman("Also, was ist der Grund für Kopfschmerzen");
        c8.setMean("Dr. Adnan");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Don`t worry, it cause by burden and anxiety.");
        c9.setHindi("चिंता मत करो, यह बोझ और चिंता के कारण होता है");
        c9.setUrdu("فکر نہ کریں ، یہ بوجھ اور پریشانی کی وجہ سے ہے۔");
        c9.setPashto("اندیښنه مه کوئ ، دا د بار او اضطراب لامل کیږي");
        c9.setArabic("لا تقلق ، فهي تسبب العبء والقلق");
        c9.setFrench("Ne vous inquiétez pas, cela cause de la charge et de l'anxiété");
        c9.setGerman("Mach dir keine Sorgen, es verursacht durch Last und Angst");
        c9.setMean("Mr. Salman");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Don’t worry, there is nothing serious. I am giving you the medicine.");
        c10.setHindi("चिंता मत करो, कुछ भी गंभीर नहीं है। मैं तुम्हें दवा दे रहा हूं");
        c10.setUrdu("پریشان نہ ہوں ، کوئی سنجیدہ بات نہیں ہے۔ میں آپ کو دوائی دے رہا ہوں۔");
        c10.setPashto("اندیښنه مه کوئ ، هیڅ جدي خبره نده زه درته دوا درکوم");
        c10.setArabic("لا تقلق ، لا يوجد شيء خطير. أنا أعطيك الدواء");
        c10.setFrench("Ne vous inquiétez pas, il n’ya rien de grave. Je te donne le médicament");
        c10.setGerman("Keine Sorge, es gibt nichts Ernstes. Ich gebe dir die Medizin");
        c10.setMean("Dr. Adnan");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Ok doctor.");
        c11.setHindi("ठीक है डॉक्टर साहब");
        c11.setUrdu("ٹھیک ہے ڈاکٹر۔");
        c11.setPashto("سمه ده ډاکټر");
        c11.setArabic("طيب دكتور");
        c11.setFrench("Ok docteur");
        c11.setGerman("Ok, Doktor");
        c11.setMean("Mr. Salman");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("I shall recommend at least three days rest for you.");
        c12.setHindi("मैं आपके लिए कम से कम तीन दिनों के आराम की सिफारिश करूंगा");
        c12.setUrdu("میں آپ کے لئے کم سے کم تین دن آرام کی سفارش کروں گا۔");
        c12.setPashto("زه به ستاسو لپاره لږترلږه درې ورځې آرام وړاندیز وکړم");
        c12.setArabic("سأوصي بالراحة لمدة ثلاثة أيام على الأقل لك");
        c12.setFrench("Je recommanderai au moins trois jours de repos pour vous");
        c12.setGerman("Ich empfehle Ihnen mindestens drei Ruhetage");
        c12.setMean("Dr. Adnan");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Would you prepare a medical certificate for me to submit it in my university?");
        c13.setHindi("क्या आप मुझे अपने विश्वविद्यालय में जमा करने के लिए एक चिकित्सा प्रमाण पत्र तैयार करेंगे");
        c13.setUrdu("کیا آپ میری یونیورسٹی میں جمع کروانے کے لئے میڈیکل سرٹیفکیٹ تیار کریں گے؟");
        c13.setPashto("ایا تاسو زما لپاره طبي سند چمتو کوئ چې دا زما په پوهنتون کې وسپارئ");
        c13.setArabic("هل ستقوم بإعداد شهادة طبية لي لتقديمها في جامعتي؟");
        c13.setFrench("Würden Sie ein ärztliches Attest vorbereiten, damit ich es an meiner Universität einreichen kann?");
        c13.setGerman("Würden Sie ein ärztliches Attest vorbereiten, damit ich es an meiner Universität einreichen kann?");
        c13.setMean("Mr. Salman");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Why not, This is your medical certificate.");
        c14.setHindi("क्यों नहीं, यह आपका मेडिकल सर्टिफिकेट है");
        c14.setUrdu("کیوں نہیں ، یہ آپ کا میڈیکل سرٹیفکیٹ ہے۔");
        c14.setPashto("ولې نه ، دا ستاسو طبي سند دی");
        c14.setArabic("لماذا لا ، هذه هي شهادتك الطبية");
        c14.setFrench("Pourquoi pas, c'est votre certificat médical");
        c14.setGerman("Warum nicht? Dies ist Ihr ärztliches Attest");
        c14.setMean("Dr. Adnan");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish(" What should I eat doctor?");
        c15.setHindi("मुझे डॉक्टर को क्या खाना चाहिए");
        c15.setUrdu("مجھے ڈاکٹر کیا کھانا چاہئے؟");
        c15.setPashto("څه باید ډاکټر وخورم؟");
        c15.setArabic("ماذا يجب أن آكل الطبيب");
        c15.setFrench("Que devrais-je manger docteur");
        c15.setGerman("Was soll ich essen, Doktor?");
        c15.setMean("Mr. Salman");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("You can eat anything.");
        c16.setHindi("आप कुछ भी खा सकते हैं");
        c16.setUrdu("تم کچھ بھی کھا سکتے ہو۔");
        c16.setPashto("تاسو هرڅه کولی شی وخوری");
        c16.setArabic("يمكنك أن تأكل أي شيء");
        c16.setFrench("Vous pouvez manger n'importe quoi");
        c16.setGerman("Du kannst alles essen");
        c16.setMean("Dr. Adnan");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("How much shall I pay you doctor?");
        c17.setHindi("मैं आपको कितना भुगतान करूंगा डॉक्टर");
        c17.setUrdu("میں آپ کو ڈاکٹر کو کتنا معاوضہ دوں؟");
        c17.setPashto("ډاکټر ته څومره پیسې درکړم؟");
        c17.setArabic("كم يجب أن أدفع لك الطبيب");
        c17.setFrench("Combien dois-je vous payer docteur");
        c17.setGerman("Wie viel soll ich dir bezahlen, Doktor?");
        c17.setMean("Mr. Salman");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("You can pay consultation fee at the reception desk.");
        c18.setHindi("आप स्वागत डेस्क पर परामर्श शुल्क का भुगतान कर सकते हैं");
        c18.setUrdu("آپ استقبالیہ ڈیسک پر مشورے کی فیس ادا کرسکتے ہیں۔");
        c18.setPashto("تاسو کولی شئ د استوګنې په میز کې د مشورې فیس ورکړئ");
        c18.setArabic("يمكنك دفع رسوم الاستشارة في مكتب الاستقبال");
        c18.setFrench("Vous pouvez payer les frais de consultation à la réception");
        c18.setGerman("Sie können die Beratungsgebühr an der Rezeption bezahlen");
        c18.setMean("Dr. Adnan");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Thank you so much doctor.");
        c19.setHindi("बहुत बहुत धन्यवाद डॉक्टर साहब");
        c19.setUrdu("بہت بہت شکریہ ڈاکٹر");
        c19.setPashto("ډیره مننه ډاکټر");
        c19.setArabic("شكرا لك يا دكتور");
        c19.setFrench("Merci beaucoup docteur");
        c19.setGerman("Vielen Dank, Herr Doktor");
        c19.setMean("Mr. Salman");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("You are welcome.");
        c20.setHindi("आपका स्वागत है");
        c20.setUrdu("آپکا خیر مقدم ہے");
        c20.setPashto("هر کله راشې");
        c20.setArabic("مرحبا بك");
        c20.setFrench("Je vous en prie");
        c20.setGerman("Bitte schön");
        c20.setMean("Dr. Adnan");
        list.add(c20);

        


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

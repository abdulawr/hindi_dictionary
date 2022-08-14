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

public class Bank_conversaction extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_conversaction);


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
        c1.setEnglish("Good morning. Can I cash a cheque here?");
        c1.setHindi("शुभ प्रभात। क्या मैं यहां चेक भुना सकता हूं");
        c1.setUrdu("صبح بخیر. کیا میں یہاں چیک کیش کر سکتا ہوں؟");
        c1.setPashto("سهار مو پخير. ایا زه کولای شم دلته چیک چیک کړم");
        c1.setArabic("صباح الخير. هل يمكنني صرف شيك هنا");
        c1.setFrench("Bonjour. Puis-je encaisser un chèque ici");
        c1.setGerman("Guten Morgen. Kann ich hier einen Scheck einlösen?");
        c1.setMean("Jhon");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Please go to the first counter on the left side.");
        c2.setHindi("कृपया बाईं ओर पहले काउंटर पर जाएं");
        c2.setUrdu("براہ کرم بائیں طرف کے پہلے کاؤنٹر پر جائیں۔");
        c2.setPashto("مهرباني وکړئ کی counter اړخ ته لومړي کاونټر ته لاړشئ");
        c2.setArabic("يرجى الذهاب إلى العداد الأول على الجانب الأيسر");
        c2.setFrench("S'il vous plaît aller au premier comptoir sur le côté gauche");
        c2.setGerman("Bitte gehen Sie zum ersten Schalter auf der linken Seite");
        c2.setMean("Counter clerk");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Thank you. Is it the teller system there?");
        c3.setHindi("धन्यवाद। क्या यह वहां का टेलर सिस्टम है");
        c3.setUrdu("شکریہ کیا یہ وہاں کا ٹیلر سسٹم ہے؟");
        c3.setPashto("مننه. ایا دا د ټیلر سیسټم دی؟");
        c3.setArabic("شكرا. هل هو نظام الصراف هناك");
        c3.setFrench("Je vous remercie. Est-ce le système de guichet ici");
        c3.setGerman("Danke. Ist es das Kassensystem dort?");
        c3.setMean("Jhon");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Yes, sir. You will get your money instantly there.");
        c4.setHindi("जी श्रीमान। आपको वहां आपका पैसा तुरंत मिल जाएगा");
        c4.setUrdu("جی سر. آپ کو وہاں فوری طور پر آپ کی رقم مل جائے گی۔");
        c4.setPashto("هو ، جناب. تاسو به هلته خپلې پیسې په فوري توګه ترلاسه کړئ");
        c4.setArabic("نعم سيدي. سوف تحصل على أموالك على الفور هناك");
        c4.setFrench("Oui monsieur. Vous obtiendrez votre argent instantanément là-bas");
        c4.setGerman("Jawohl. Sie werden Ihr Geld sofort dort bekommen");
        c4.setMean("Counter clerk");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Excuse me. I want to get this cheque cashed.");
        c5.setHindi("क्षमा कीजिय। मैं इस चेक को कैश करवाना चाहता हूं");
        c5.setUrdu("معاف کیجئے گا. میں اس چیک کو کیش کروانا چاہتا ہوں۔");
        c5.setPashto("بخښنه غواړم. زه غواړم چې دا چیک چیک کړم");
        c5.setArabic("عفوا. أريد الحصول على هذا الشيك صرفه");
        c5.setFrench("Pardon. Je veux faire encaisser ce chèque");
        c5.setGerman("Entschuldigen Sie. Ich möchte, dass dieser Scheck eingelöst wird");
        c5.setMean("Jhon");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes sir, please sign on the back of your cheque.");
        c6.setHindi("हां सर, कृपया अपने चेक के पीछे हस्ताक्षर करें");
        c6.setUrdu("ہاں جناب ، براہ کرم اپنے چیک کے پیچھے سائن کریں۔");
        c6.setPashto("هو سر ، مهرباني وکړئ د خپل چیک په شا لاسلیک کړئ");
        c6.setArabic("نعم سيدي ، يرجى تسجيل الدخول على ظهر الشيك");
        c6.setFrench("Oui monsieur, veuillez signer au verso de votre chèque");
        c6.setGerman("Ja, Sir, bitte unterschreiben Sie auf der Rückseite Ihres Schecks");
        c6.setMean("Counter clerk");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("Ok.! Here you are.");
        c7.setHindi("ठीक।! आप यहाँ हैं");
        c7.setUrdu("ٹھیک ہے.! آپ یہاں ہیں");
        c7.setPashto("سمه ده.! دلته تاسو یاست");
        c7.setArabic("حسنا.! ها انت");
        c7.setFrench("D'accord.! Vous voilà");
        c7.setGerman("Okay.! Hier sind Sie ja");
        c7.setMean("Jhon");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Just a minute, sir.");
        c8.setHindi("बस एक मिनट, सर");
        c8.setUrdu("ایک منٹ ، جناب۔");
        c8.setPashto("یوازې یوه دقیقه ، صاحب");
        c8.setArabic("دقيقة فقط يا سيدي");
        c8.setFrench("Juste une minute, monsieur");
        c8.setGerman("Nur eine Minute, Sir");
        c8.setMean("Counter clerk");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("I need thousand rupees notes only.");
        c9.setHindi("मुझे हजार रुपए के नोट की ही जरूरत है");
        c9.setUrdu("مجھے صرف ہزار روپے کے نوٹ کی ضرورت ہے۔");
        c9.setPashto("زه یوازې د زره روپیو نوټونو ته اړتیا لرم");
        c9.setArabic("J'ai besoin de milliers de roupies seulement");
        c9.setFrench("J'ai besoin de milliers de roupies seulement");
        c9.setGerman("Ich brauche nur tausend Rupien Banknoten");
        c9.setMean("Jhon");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("I am sorry; I have only five hundred rupees notes. If you can wait, I will get some thousand rupees notes as well.");
        c10.setHindi("मुझे क्षमा करें; मेरे पास केवल पांच सौ रुपये के नोट हैं। यदि आप प्रतीक्षा कर सकते हैं, तो मुझे कुछ हजार रुपए के नोट भी मिलेंगे");
        c10.setUrdu("میں معافی چاہتا ہوں؛ میرے پاس صرف پانچ سو روپے کے نوٹ ہیں۔ اگر آپ انتظار کرسکتے ہیں تو مجھے کچھ ہزار روپے کے نوٹ بھی مل جائیں گے۔");
        c10.setPashto("زه بخښنه غواړم؛ زه فقط پنځه سوه روپۍ نوټونه لرم که تاسو انتظار کولی شئ ، زه به د زرو زرو روپیو نوټونه هم واخلم");
        c10.setArabic("أنا أسف؛ لدي فقط خمسمائة روبية الملاحظات. إذا كنت تستطيع الانتظار ، فسوف أحصل على بعض آلاف روبية الملاحظات.");
        c10.setFrench("Je suis désolé; Je n'ai que cinq cents roupies. Si vous pouvez attendre, j'aurai aussi quelques milliers de roupies.");
        c10.setGerman("Tut mir leid; Ich habe nur fünfhundert Rupien. Wenn Sie warten können, bekomme ich auch ein paar tausend Rupien.");
        c10.setMean("Counter clerk");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("Thanks! I won’t like to wait any longer. Five hundred rupees notes are alright with me.");
        c11.setHindi("धन्यवाद! मैं अब और इंतजार नहीं करना चाहता। पांच सौ रुपये के नोट मेरे साथ ठीक हैं");
        c11.setUrdu("شکریہ! مجھے مزید انتظار کرنا پسند نہیں ہوگا۔ میرے ساتھ پانچ سو روپے کے نوٹ ٹھیک ہیں۔");
        c11.setPashto("مننه! زه نه غواړم نور انتظار وکړم د پنځه سوه روپیو نوټونه زما سره ښه دي");
        c11.setArabic("شكر! لا أرغب في الانتظار لفترة أطول. خمسمائة روبية تلاحظ بخير معي");
        c11.setFrench("Merci! Je n’aimerais plus attendre plus longtemps. Les billets de cinq cents roupies me vont bien");
        c11.setGerman("Vielen Dank! Ich möchte nicht länger warten. Fünfhundert Rupien-Scheine sind bei mir in Ordnung");
        c11.setMean("Jhon");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Here is your cash, sir. Please ensure that you. Have got exactly the right amount.");
        c12.setHindi("यहां आपकी नकदी है, सर। कृपया सुनिश्चित करें कि आप। बिल्कुल सही राशि मिली है");
        c12.setUrdu("جناب آپ کا نقد یہ ہے۔ براہ کرم یقینی بنائیں کہ آپ۔ بالکل ٹھیک رقم مل گئی ہے۔");
        c12.setPashto("دلته ستا نغدي ده. مهرباني وکړئ ډاډ ترلاسه کړئ چې تاسو. سمه اندازه پیسې ترلاسه کړې");
        c12.setArabic("هنا هو النقدية الخاصة بك ، يا سيدي. يرجى التأكد من ذلك. لقد حصلت بالضبط المبلغ المناسب");
        c12.setFrench("Voici votre argent, monsieur. S'il vous plaît assurez-vous que vous. Ont exactement le bon montant");
        c12.setGerman("Hier ist Ihr Geld, Sir. Bitte stellen Sie sicher, dass Sie. Habe genau die richtige Menge bekommen");
        c12.setMean("Counter clerk");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Thank you. I shall definitely count my money before I leave.");
        c13.setHindi("धन्यवाद। मेरे जाने से पहले मैं अपने पैसे जरूर गिनूंगा");
        c13.setUrdu("شکریہ میں جانے سے پہلے اپنے پیسے ضرور گنوں گا۔");
        c13.setPashto("مننه. زه به حتما زه پریږدم مخکې زما پیسې حساب کړم");
        c13.setArabic("شكرا. سأحسب بالتأكيد أموالي قبل أن أغادر.");
        c13.setFrench("Je vous remercie. Je vais certainement compter mon argent avant de partir.");
        c13.setGerman("Danke. Ich werde auf jeden Fall mein Geld zählen, bevor ich gehe.");
        c13.setMean("Jhon");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Thank you very much. Have a nice day, sir.");
        c14.setHindi("आपका बहुत बहुत धन्यवाद। आपका दिन मंगलमय हो सर");
        c14.setUrdu("بہت بہت شکریہ. جناب ، آپ کا دن اچھا گزرا۔");
        c14.setPashto("ډیره مننه. ښاغلیه ښه ورځ ولرئ");
        c14.setArabic("شكرا جزيلا لك. أتمنى لك يوماً سعيداً يا سيدي");
        c14.setFrench("Merci beaucoup. Passez une bonne journée, monsieur");
        c14.setGerman("Vielen Dank. Ich wünsche Ihnen einen schönen Tag, Sir");
        c14.setMean("Counter clerk");
        list.add(c14);


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
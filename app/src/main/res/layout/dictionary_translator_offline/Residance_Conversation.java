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

public class Residance_Conversation extends AppCompatActivity {

    RecyclerView view;
    Phrases_Recycle_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residance__conversation);


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


        Data_Container c11 = new Data_Container();
        c11.setEnglish(" Good morning, San Felice Hotel. May I help you? ");
        c11.setHindi("सुप्रभात, सैन फेलिस होटल। क्या मैं आपकी सहायता कर सकता हूँ");
        c11.setUrdu("گڈ مارننگ ، سان فیلس ہوٹل۔ کیا میں آپ کی مدد کرسکتاہوں");
        c11.setPashto("سهار مو پخیر ، سان فیلس هوټل. ایا زه له تاسو سره مرسته کولی شم");
        c11.setArabic("صباح الخير ، فندق سان فيليس. هل لى أن أساعدك");
        c11.setFrench("Bonjour, Hôtel San Felice. Puis-je vous aider");
        c11.setGerman("Guten Morgen, San Felice Hotel. Kann ich dir helfen");
        c11.setMean("Receptionist");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Yes. I´d like to book a room, please.");
        c12.setHindi("हाँ। कृपया मुझे कमरा बुक करना पसंद है");
        c12.setUrdu("جی ہاں. براہ کرم ، میں ایک کمرہ بکنا چاہتا ہوں۔");
        c12.setPashto("هو. مهربانی وکړه ، زه یوه کوټه بکوم");
        c12.setArabic("نعم. من فضلك، أود حجز حجرة");
        c12.setFrench("Oui. Je voudrais réserver une chambre, s'il vous plaît");
        c12.setGerman("Ja. Ich würde gerne ein Zimmer buchen");
        c12.setMean("John");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Certainly. When for, sir?");
        c13.setHindi("निश्चित रूप से। जब के लिए, सर");
        c13.setUrdu("یقینا. جب کے لئے ، جناب");
        c13.setPashto("خامخا کله چې ، لپاره");
        c13.setArabic("من المؤكد. عندما ل ، يا سيدي");
        c13.setFrench("Certainement. Pour quand, monsieur");
        c13.setGerman("Bestimmt. Wann denn, Sir");
        c13.setMean("Receptionist");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("March the 23rd.");
        c14.setHindi("23 मार्च को");
        c14.setUrdu("23 مارچ۔");
        c14.setPashto("د مارچ 23");
        c14.setArabic("مارس 23rd");
        c14.setFrench("Le 23 mars");
        c14.setGerman("23. März");
        c14.setMean("John");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("How long will you be staying?");
        c15.setHindi("तुम कितने समय के लिए रहोगे");
        c15.setUrdu("آپ کب تک قیام کریں گے۔");
        c15.setPashto("تاسو به څومره وخت پاتې شئ؟");
        c15.setArabic("كم من الوقت سوف تبقى");
        c15.setFrench("Combien de temps vas-tu rester");
        c15.setGerman("Wie lang wirst du bleiben");
        c15.setMean("Receptionist");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Three nights.");
        c16.setHindi("तीन रात");
        c16.setUrdu("تین رات۔");
        c16.setPashto("درې شپې");
        c16.setArabic("ثلاث ليال");
        c16.setFrench("Trois nuits");
        c16.setGerman("Drei Nächte");
        c16.setMean("John");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish("Would you like a single rooom? ");
        c17.setHindi("क्या आप सिंगल रूम चाहेंगे?");
        c17.setUrdu("کیا آپ ایک کمرہ پسند کریں گے؟");
        c17.setPashto("ایا ته یوه خونه غواړی؟");
        c17.setArabic("هل تريد غرفة فردية؟");
        c17.setFrench("Voulez-vous une chambre simple");
        c17.setGerman("Möchten Sie ein Einzelzimmer?");
        c17.setMean("Receptionist");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Yes, please.");
        c18.setHindi("जी कहिये");
        c18.setUrdu("جی ہاں برائے مہربانی");
        c18.setPashto("هو لورېينه وکړه");
        c18.setArabic("نعم من فضلك.");
        c18.setFrench("Oui s'il vous plaît.");
        c18.setGerman("Ja bitte.");
        c18.setMean("John");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("Yes, we have that type of room.");
        c19.setHindi("हां, हमारे पास उस प्रकार का कमरा है");
        c19.setUrdu("ہاں ، ہمارے پاس اس طرح کا کمرہ ہے۔");
        c19.setPashto("هو ، موږ دا ډول خونه لرو");
        c19.setArabic("نعم ، لدينا هذا النوع من الغرف");
        c19.setFrench("Oui, nous avons ce type de chambre");
        c19.setGerman("Ja, wir haben diesen Zimmertyp");
        c19.setMean("Receptionist");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Fine. How much is the charge per night?");
        c20.setHindi("ठीक। प्रति रात कितना चार्ज है");
        c20.setUrdu("ٹھیک. فی رات کتنا چارج ہے؟");
        c20.setPashto("ښه د یوې شپې لګښت څومره دی؟");
        c20.setArabic("غرامة. كم تبلغ تكلفة الليلة الواحدة");
        c20.setFrench("Bien. Combien coûte la charge par nuit");
        c20.setGerman("Fein. Wie hoch ist die Gebühr pro Nacht?");
        c20.setMean("John");
        list.add(c20);

        Data_Container c1 = new Data_Container();
        c1.setEnglish("Would you like breakfast?");
        c1.setHindi("क्या आप नाश्ता पसंद करेंगे?");
        c1.setUrdu("کیا آپ ناشتہ پسند کریں گے؟");
        c1.setPashto("ایا ته سباناری خوښوې؟");
        c1.setArabic("هل تود الحصول على فطور");
        c1.setFrench("Voulez-vous le petit déjeuner");
        c1.setGerman("Möchtest Du Frühstück");
        c1.setMean("Receptionist");    // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("No, thanks.");
        c2.setHindi("जी नहीं, धन्यवाद");
        c2.setUrdu("نہیں شکریہ");
        c2.setPashto("نه مننه");
        c2.setArabic("لا شكرا");
        c2.setFrench("Non merci");
        c2.setGerman("Nein Danke");
        c2.setMean("John");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("Great. And would you prefer to have a room with a view of the ocean?");
        c3.setHindi("महान। और क्या आप समुद्र के दृश्य के साथ एक कमरा रखना पसंद करेंगे?");
        c3.setUrdu("زبردست. اور کیا آپ سمندر کو دیکھنے کے لئے کمرہ رکھنا پسند کریں گے؟");
        c3.setPashto("غوره. او ایا تاسو غوره ګ ؟ئ چې د سمندر لید سره کوټه ولرئ؟");
        c3.setArabic("عظيم. وتفضل أن يكون لديك غرفة تطل على المحيط");
        c3.setFrench("Génial. Et préféreriez-vous avoir une chambre avec vue sur l'océan");
        c3.setGerman("Toll. Und möchten Sie lieber ein Zimmer mit Meerblick haben?");
        c3.setMean("Receptionist");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Sure  What’s the rate for the room?");
        c4.setHindi("सुनिश्चित करें कि कमरे के लिए क्या दर है");
        c4.setUrdu("یقین ہے کہ کمرے کی شرح کیا ہے۔");
        c4.setPashto("ډاډه اوسئ چې د کوټې نرخ څومره دی");
        c4.setArabic("بالتأكيد ما هو سعر الغرفة");
        c4.setFrench("Sure Quel est le tarif de la chambre?");
        c4.setGerman("Klar, wie hoch ist der Zimmerpreis?");
        c4.setMean("John");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Could you tell me your telephone number?");
        c5.setHindi("क्या आप मुझे अपना टेलीफोन नंबर बता सकते हैं");
        c5.setUrdu("کیا آپ مجھے اپنا ٹیلیفون نمبر بتاسکتے ہیں؟");
        c5.setPashto("کولی شی ماته د خپل تلیفون شمیره ووایی؟");
        c5.setArabic("هل يمكن أن تخبرني رقم هاتفك");
        c5.setFrench("Pourriez-vous me dire votre numéro de téléphone");
        c5.setGerman("Können Sie mir Ihre Telefonnummer mitteilen?");
        c5.setMean("Receptionist");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Yes, my cell phone number is 555-26386.");
        c6.setHindi("हां, मेरा सेल फोन नंबर 555-26386 है");
        c6.setUrdu("ہاں ، میرا سیل فون نمبر 555-26386 ہے۔");
        c6.setPashto("هو ، زما د ګرځنده تلیفون شمیره 555-26386 ده");
        c6.setArabic("نعم ، رقم هاتفي الخلوي هو 555-26386");
        c6.setFrench("Oui, mon numéro de téléphone cellulaire est 555-26386");
        c6.setGerman("Ja, meine Handynummer ist 555-26386");
        c6.setMean("John");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("And what is the name of the cardholder?");
        c7.setHindi("और कार्डधारक का नाम क्या है");
        c7.setUrdu("اور کارڈ ہولڈر کا نام کیا ہے؟");
        c7.setPashto("او د کارت لرونکي نوم څه دی");
        c7.setArabic("وما هو اسم حامل البطاقة");
        c7.setFrench("Et quel est le nom du titulaire de la carte");
        c7.setGerman("Und wie heißt der Karteninhaber?");
        c7.setMean("Receptionist");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Jhon");
        c8.setHindi("जॉन");
        c8.setUrdu("جھون۔");
        c8.setPashto("جهن");
        c8.setArabic("جون");
        c8.setFrench("Jhon");
        c8.setGerman("Jhon");
        c8.setMean("john");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Alright, Mr. Jhon, your reservation has been made");
        c9.setHindi("ठीक है, श्रीमान, आपका आरक्षण हो गया है");
        c9.setUrdu("ٹھیک ہے ، مسٹر جھن ، آپ کا ریزرویشن ہوگیا ہے۔");
        c9.setPashto("سمه ده ، ښاغلي جهن ، ستاسو تحفظات شوي دي");
        c9.setArabic("حسنًا ، السيد جون ، لقد تم الحجز");
        c9.setFrench("Bon, M. Jhon, votre réservation a été faite");
        c9.setGerman("Okay, Mr. Jhon, Ihre Reservierung wurde gemacht");
        c9.setMean("Receptionist");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Great, thank you so much.");
        c10.setHindi("बहुत बहुत धन्यवाद");
        c10.setUrdu("بہت اچھا ، آپ کا بہت بہت شکریہ");
        c10.setPashto("عالي ، له تاسو څخه ډیره مننه");
        c10.setArabic("عظيم شكرا جزيلا لك");
        c10.setFrench("Super, merci beaucoup");
        c10.setGerman("Super, vielen Dank");
        c10.setMean("John");
        list.add(c10);



// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("My pleasure. Have a nice day.");
        c21.setHindi("मेरा सौभाग्य। आपका दिन शुभ हो");
        c21.setUrdu("میری خوش قسمتی ہے. آپ کا دن اچھا گزرا");
        c21.setPashto("زما خوښي ده. ښه ورځ ولرئ");
        c21.setArabic("من دواعي سروري. أتمنى لك نهارا سعيد");
        c21.setFrench("Mon plaisir. Bonne journée");
        c21.setGerman("Gern geschehen. Einen schönen Tag noch");
        c21.setMean("Receptionist");
        list.add(c21);


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

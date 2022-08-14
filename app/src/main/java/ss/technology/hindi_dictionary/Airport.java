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


        RecyclerView view=(RecyclerView) findViewById(R.id.recycleview);
        ArrayList<Data_Container> list=new ArrayList<>();


        Data_Container c1 = new Data_Container();
        c1.setEnglish("Good afternoon! Where are you flying to today? ");
        c1.setHindi("नमस्कार! आज आप कहां उड़ रहे हैं");
          // use for name
        list.add(c1);

        Data_Container c2 = new Data_Container();
        c2.setEnglish("Berlin, Germany.");
        c2.setHindi("बर्लिन, जर्मनी");
        list.add(c2);


        Data_Container c3 = new Data_Container();
        c3.setEnglish("May I have your passport, please? ");
        c3.setHindi("मेरे पास आपका पासपोर्ट है, कृपया");
        list.add(c3);


        Data_Container c4 = new Data_Container();
        c4.setEnglish("Here you go.");
        c4.setHindi("हेयर यू गो");
        list.add(c4);


        Data_Container c5 = new Data_Container();
        c5.setEnglish("Are you checking any bags?");
        c5.setHindi("क्या आप कोई बैग चेक कर रहे हैं");
        list.add(c5);


        Data_Container c6 = new Data_Container();
        c6.setEnglish("Just this one.");
        c6.setHindi("सिर्फ यह एक");
        list.add(c6);


        Data_Container c7 = new Data_Container();
        c7.setEnglish("OK, please place your bag on the scale.");
        c7.setHindi("ठीक है, कृपया अपने बैग को पैमाने पर रखें");
        list.add(c7);

        Data_Container c8 = new Data_Container();
        c8.setEnglish("Did you pack your bags yourself?");
        c8.setHindi("क्या आपने अपने बैग खुद पैक किए");
        list.add(c8);


        Data_Container c9 = new Data_Container();
        c9.setEnglish("Yes.");
        c9.setHindi("हाँ");
        list.add(c9);


        Data_Container c10 = new Data_Container();
        c10.setEnglish("Are you carrying any firearms or flammable materials?");
        c10.setHindi("क्या आप कोई आग्नेयास्त्र या ज्वलनशील पदार्थ ले जा रहे हैं");
        list.add(c10);


// 11 to 20


        Data_Container c11 = new Data_Container();
        c11.setEnglish("No");
        c11.setHindi("नहीं");
        list.add(c11);

        Data_Container c12 = new Data_Container();
        c12.setEnglish("Has your luggage been in your possession at all times?");
        c12.setHindi("क्या आपका सामान हर समय आपके कब्जे में रहा है");
        list.add(c12);


        Data_Container c13 = new Data_Container();
        c13.setEnglish("Yes");
        c13.setHindi("हाँ");
        list.add(c13);


        Data_Container c14 = new Data_Container();
        c14.setEnglish("Has anyone given you anything to carry on the flight? ");
        c14.setHindi("क्या किसी ने आपको उड़ान भरने के लिए कुछ दिया है?");
        list.add(c14);


        Data_Container c15 = new Data_Container();
        c15.setEnglish("No");
        c15.setHindi("नहीं");
        list.add(c15);


        Data_Container c16 = new Data_Container();
        c16.setEnglish("Would you like chicken or pasta?");
        c16.setHindi("क्या आप चिकन या पास्ता पसंद करेंगे?");
        list.add(c16);


        Data_Container c17 = new Data_Container();
        c17.setEnglish(" I’ll have the chicken.");
        c17.setHindi("मेरे पास चिकन है");
        list.add(c17);

        Data_Container c18 = new Data_Container();
        c18.setEnglish("Anything to drink?");
        c18.setHindi("कुछ भी पीने के लिए");
        list.add(c18);


        Data_Container c19 = new Data_Container();
        c19.setEnglish("What kind of soda do you have?");
        c19.setHindi("आपके पास किस तरह का सोडा है");
        list.add(c19);


        Data_Container c20 = new Data_Container();
        c20.setEnglish("Coke, Diet Coke, Sprite, Orange");
        c20.setHindi("कोक, डाइट कोक, स्प्राइट, ऑरेंज");
        list.add(c20);


// 21 -- 30

        Data_Container c21 = new Data_Container();
        c21.setEnglish("A Diet Coke, no ice, please.");
        c21.setHindi("एक आहार कोक, कोई बर्फ, कृपया");
        list.add(c21);

        Data_Container c22 = new Data_Container();
        c22.setEnglish("Here you go.");
        c22.setHindi("हेयर यू गो");
        list.add(c22);


        Data_Container c23 = new Data_Container();
        c23.setEnglish("Thank you!");
        c23.setHindi("धन्यवाद!");
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

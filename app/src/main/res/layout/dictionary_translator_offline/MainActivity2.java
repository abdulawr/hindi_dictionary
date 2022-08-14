package ss.technology.hindi_dictionary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Main_screen_to_recycleview_Activity adapter1;
    RecyclerView recyclerView1;
    final String PREFS_NAME = "MyPrefsFile";;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        recyclerView1=(RecyclerView) findViewById(R.id.recycleview1);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings.getBoolean("my_first_time", true)) {
            First_time_Language();
            settings.edit().putBoolean("my_first_time", false).commit();
        }

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        // ++++++++++++ To Image recycleview start +++++++++++++++++++++++
        ArrayList<String> top_arraylist=new ArrayList<>();
        top_arraylist.add("https://i.ibb.co/R9L3w9y/Image-can-t-be-loaded-Check-internet-connection-3.png");
        top_arraylist.add("https://i.ibb.co/PzT6003/Image-can-t-be-loaded-Check-internet-connection.png");
        top_arraylist.add("https://i.ibb.co/C6phf5B/Image-can-t-be-loaded-Check-internet-connection-2.png");
        top_arraylist.add("https://i.ibb.co/6vjsWQb/Image-can-t-be-loaded-Check-internet-connection-3.png");
        top_arraylist.add("https://i.ibb.co/8XvcGKY/Image-can-t-be-loaded-Check-internet-connection.png");
        top_arraylist.add("https://i.ibb.co/pf1kgJd/Image-can-t-be-loaded-Check-internet-connection-1.png");
        top_arraylist.add("https://i.ibb.co/YRQsXyB/Image-can-t-be-loaded-Check-internet-connection-2.png");

        ArrayList<String> top_title=new ArrayList<>();
        top_title.add("Best Offline Dictionary");
        top_title.add("Smart Translator Online");
        top_title.add("Learn Conversation");
        top_title.add("Request New Word");
        top_title.add("Multi Languages Support");
        top_title.add("Learn Vocabulary");
        top_title.add("Save Favourite Word");

       adapter1=new Main_screen_to_recycleview_Activity (this,top_arraylist,top_title);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(adapter1);

        // ++++++++++++ To Image recycleview end +++++++++++++++++++++++


    }


    //############### Main Section ####################33
    // click on circle icone of change language
    public void Circle_change_language(View view) {
        Show_change_Language_Dialoge.change(this);
    }

    // click on circle icon of the Learn
    public void Circle_change_Learn(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,Learn.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,Learn.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }
        });
    }

    // click on circle icon of the Favourite
    public void Circle_change_Favourite(View view) {

        Intent intent=new Intent(MainActivity2.this,Favourite.class);
        startActivity(intent);
    }

    // click on card dictionary in the main section
    public void Card_Dictiony(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,Dictionary.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,Dictionary.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }
        });

    }

    // click on card translator in the main section
    public void Card_Translator(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,Translation.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,Translation.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }
        });

    }

    //**********************  Learning Section ***********************

    public void Click_Vocabulary(View view) {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,Vocabulary.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,Vocabulary.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void Click_Idioms(View view) {
        startActivity(new Intent(this,Phrases_Activity.class));
    }

    public void Click_Conversation(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,Conversation.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,Conversation.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public void Click_Verb_Form(View view) {
        Intent intent =new Intent(getApplicationContext(),WebPage_Viewer.class);
        intent.putExtra("links","form_of_verbs");
        intent.putExtra("title","English verbs forms");
        startActivity(intent);
    }

    //++++++++++++++++++  Feature Section ++++++++++++++++++++++++++++

    public void Change_language_feature(View view) {
        Show_change_Language_Dialoge.change(this);
    }

    public void Request_Word_feature(View view) {
        startActivity(new Intent(this,Request_Word.class));
    }

    // ====================== About App section click ==============================

    public void Contact_us(View view) {
        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{  "tcomprog@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Write your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Add you message in details");

        emailIntent.setType("message/rfc822");

        try {
            startActivity(Intent.createChooser(emailIntent,
                    "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity2.this,
                    "No email clients installed.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void Trending_Word(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent=new Intent(MainActivity2.this,View_Answer.class);
            startActivity(intent);
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent=new Intent(MainActivity2.this,View_Answer.class);
                startActivity(intent);
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });


    }

    public void More_Apps(View view) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7653535067649018697")));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7653535067649018697")));
        }
    }

    public void Rate_Us(View view) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ss.technology.hindi_dictionary")));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ss.technology.hindi_dictionary")));
        }
    }

    public void Privacy(View view) {
        Intent intent=new Intent(getApplicationContext(),Privacy.class);
        startActivity(intent);
    }

    public void Close_App(View view) {
        Ratting_Us();
    }


    void First_time_Language()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        LayoutInflater inflater =LayoutInflater.from(MainActivity2.this);
        View viewss=inflater.inflate(R.layout.first_time_change_language, null);
        builder.setCancelable(false);
        builder.setView(viewss);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button save=(Button) viewss.findViewById(R.id.save);
       final Spinner spinner=(Spinner) viewss.findViewById(R.id.spinner);
       save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinner.getSelectedItem().toString().toLowerCase();
                SharePreference_Store.setValue(text,MainActivity2.this);
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    void Ratting_Us()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        LayoutInflater inflater =LayoutInflater.from(MainActivity2.this);
        View viewss=inflater.inflate(R.layout.rating_activity, null);
        builder.setCancelable(true);
        builder.setView(viewss);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button save=(Button) viewss.findViewById(R.id.rating);
        Button close=(Button) viewss.findViewById(R.id.close);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ss.technology.hindi_dictionary")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ss.technology.hindi_dictionary")));
                }
                alertDialog.dismiss();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
                alertDialog.dismiss();
            }
        });

        alertDialog.show();


    }

    @Override
    public void onBackPressed() {
        Ratting_Us();
    }
}

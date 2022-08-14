package ss.technology.hindi_dictionary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

public class MCQS extends AppCompatActivity {

    TextView question,ans1,ans2,ans3,ans4,timer,q_number_show;
    TextToSpeech english_speech,hindi_speech;
    Helper helper;
    String correctans;
    int correct=0;
    int wrong=0;
    int question_no=1;
    final int total=41;
    CountDownTimer cdt;
    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mcqs);

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

      /*   MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) { }
        });

        adContainerView = findViewById(R.id.ad_view_container);
        // Step 1 - Create an AdView and set the ad unit ID on it.
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-7611672890241421/6213533564");
        adContainerView.addView(adView);
        loadBanner();*/

        helper=(Helper) Helper.getInstance(this);
        helper.open();
        question=(TextView) findViewById(R.id.question);
        ans1=(TextView) findViewById(R.id.ans1);
        ans2=(TextView) findViewById(R.id.ans2);
        ans3=(TextView) findViewById(R.id.ans3);
        ans4=(TextView) findViewById(R.id.ans4);
        timer=(TextView) findViewById(R.id.timer);
        q_number_show=(TextView) findViewById(R.id.q_number_show);
        q_number_show.setText(question_no+"/"+(total-1));
        english_speech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    english_speech.setLanguage(Locale.UK);
                }
            }
        });
        hindi_speech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    hindi_speech.setLanguage(new Locale("hi","IN"));
                }
            }
        });


        cdt = new CountDownTimer(61000, 1000) {

            public void onTick(long millisUntilFinished) {
             timer.setText(String.valueOf(millisUntilFinished / 1000));
            }

            public void onFinish() {
               Question();
            }
        }.start();

        Question();

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans1.getText().toString().equals(correctans))
                {
                    correct++;
                    ans1.setBackgroundColor(Color.parseColor("#32D684"));
                }
               else if(!ans1.getText().toString().equals(correctans))
                {
                    wrong++;
                    ans1.setBackgroundColor(Color.parseColor("#FE7F65"));

                    if(ans2.getText().toString().equals(correctans))
                    {
                        ans2.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans3.getText().toString().equals(correctans))
                    {
                        ans3.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans4.getText().toString().equals(correctans))
                    {
                        ans4.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                }

                Hand_Delay();
            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans2.getText().toString().equals(correctans))
                {
                    correct++;
                    ans2.setBackgroundColor(Color.parseColor("#32D684"));
                }
                else if(!ans2.getText().toString().equals(correctans))
                {
                    wrong++;
                    ans2.setBackgroundColor(Color.parseColor("#FE7F65"));

                    if(ans1.getText().toString().equals(correctans))
                    {
                        ans1.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans3.getText().toString().equals(correctans))
                    {
                        ans3.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans4.getText().toString().equals(correctans))
                    {
                        ans4.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                }
                Hand_Delay();
            }
        });

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans3.getText().toString().equals(correctans))
                {
                    correct++;
                    ans3.setBackgroundColor(Color.parseColor("#32D684"));
                }
                else if(!ans3.getText().toString().equals(correctans))
                {
                    wrong++;
                    ans3.setBackgroundColor(Color.parseColor("#FE7F65"));

                    if(ans2.getText().toString().equals(correctans))
                    {
                        ans2.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans1.getText().toString().equals(correctans))
                    {
                        ans1.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans4.getText().toString().equals(correctans))
                    {
                        ans4.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                }
                Hand_Delay();
            }
        });

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans4.getText().toString().equals(correctans))
                {
                    correct++;
                    ans4.setBackgroundColor(Color.parseColor("#32D684"));
                }
                else if(!ans4.getText().toString().equals(correctans))
                {
                    wrong++;
                    ans4.setBackgroundColor(Color.parseColor("#FE7F65"));

                    if(ans2.getText().toString().equals(correctans))
                    {
                        ans2.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans3.getText().toString().equals(correctans))
                    {
                        ans3.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                    else if(ans1.getText().toString().equals(correctans))
                    {
                        ans1.setBackgroundColor(Color.parseColor("#32D684"));
                    }
                }
                Hand_Delay();
            }
        });


    }


    // Bottom section
    public void Skip(View view) {
        Question();
    }

    public void Result(View view) {
        showResult(total,correct,wrong);
    }


    //return random number
    public int random()
    {
        Random rand = new Random();
        return (rand.nextInt(35000)+1);
    }
    // Ask question
    public void Question()
    {
        ans1.setBackgroundColor(Color.parseColor("#ffffff"));
        ans2.setBackgroundColor(Color.parseColor("#ffffff"));
        ans3.setBackgroundColor(Color.parseColor("#ffffff"));
        ans4.setBackgroundColor(Color.parseColor("#ffffff"));

        String questionss = "";

        if (question_no <= total && question_no <= 20)
        {
            cdt.cancel();
            cdt.start();
            int id=random();
            Cursor cursor=helper.getQuestion(id);
            ArrayList<String> list=new ArrayList<>();
            if (cursor.moveToFirst()) {
                questionss=cursor.getString(cursor.getColumnIndex("english")).toLowerCase();
                question.setText("Q "+question_no+": "+cursor.getString(cursor.getColumnIndex("english")).toLowerCase());
                english_speech.speak(cursor.getString(cursor.getColumnIndex("english")).toLowerCase(),TextToSpeech.QUEUE_FLUSH,null);
                correctans=cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase();
                while (!cursor.isAfterLast()) {
                    list.add(cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase());
                    cursor.moveToNext();
                }
                Collections.shuffle(list);
                ans1.setText(list.get(0));
                ans2.setText(list.get(1));
                ans3.setText(list.get(2));
                ans4.setText(list.get(3));
                cursor.close();
            }
            q_number_show.setText(question_no+"/"+(total-1));
            question_no++;
        }

        if (question_no <= total && question_no > 20)
        {
            cdt.cancel();
            cdt.start();
            int id=random();
            Cursor cursor=helper.getQuestion(id);
            ArrayList<String> list=new ArrayList<>();
            if (cursor.moveToFirst()) {
                questionss=cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase();
                question.setText("Q "+question_no+": "+cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase());
                hindi_speech.speak(cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase(),TextToSpeech.QUEUE_FLUSH,null);
                correctans=cursor.getString(cursor.getColumnIndex("english")).toLowerCase();
                while (!cursor.isAfterLast()) {
                    list.add(cursor.getString(cursor.getColumnIndex("english")).toLowerCase());
                    cursor.moveToNext();
                }
                Collections.shuffle(list);
                ans1.setText(list.get(0));
                ans2.setText(list.get(1));
                ans3.setText(list.get(2));
                ans4.setText(list.get(3));
                cursor.close();
            }
            q_number_show.setText(question_no+"/"+(total-1));
            question_no++;
        }
        else if (question_no > total){
            showResult(total,correct,wrong);
        }

    }

    void Hand_Delay(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               Question();
            }
        }, 500);
    }


    void showResult(int total, final int corrects, final int wrongs)
    {
        adContainerView.setVisibility(View.GONE);
        cdt.cancel();
        AlertDialog.Builder builder = new AlertDialog.Builder(MCQS.this);
        LayoutInflater inflater =LayoutInflater.from(MCQS.this);
        View viewss=inflater.inflate(R.layout.result, null);
        builder.setCancelable(false);
        builder.setView(viewss);
        Button save=(Button) viewss.findViewById(R.id.rating);
        Button close=(Button) viewss.findViewById(R.id.close);
        TextView totals=(TextView) viewss.findViewById(R.id.total);
        TextView correct_=(TextView) viewss.findViewById(R.id.correct);
        TextView wrong_=(TextView) viewss.findViewById(R.id.wrong);
        totals.setText(String.valueOf(total));
        correct_.setText(String.valueOf(corrects));
        wrong_.setText(String.valueOf(wrongs));
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.setText("0");
                question_no=1;
                correct=0;
                wrong=0;
                Question();
                alertDialog.dismiss();
                adContainerView.setVisibility(View.VISIBLE);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        showResult(total,correct,wrong);
    }


    private void loadBanner() {
        // Create an ad request. Check your logcat output for the hashed device ID
        // to get test ads on a physical device, e.g.,
        // "Use AdRequest.Builder.addTestDevice("ABCDE0123") to get test ads on this
        // device."
        AdRequest adRequest =
                new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                        .build();

        AdSize adSize = getAdSize();
        // Step 4 - Set the adaptive ad size on the ad view.
        adView.setAdSize(adSize);

        // Step 5 - Start loading the ad in the background.
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        // Step 2 - Determine the screen width (less decorations) to use for the ad width.
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        // Step 3 - Get adaptive ad size and return for setting on the ad view.
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }

    @Override
    protected void onDestroy() {
        cdt.cancel();
        super.onDestroy();
    }
}
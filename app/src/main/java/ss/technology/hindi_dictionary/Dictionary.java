package ss.technology.hindi_dictionary;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

public class Dictionary extends AppCompatActivity {

    TextView defination, antonym;
    ImageView voice_image;
    New_Data_Container container;
    private InterstitialAd mInterstitialAd;
    SearchView searchView;
    SimpleCursorAdapter suggestionAdapter;
    Helper helper;
    TextView english,meaning;
    RecyclerView view;
    Synonyns_Adapter adapter;
    ArrayList<String> synonyns_list;
    ImageView top_image,image_favourite,hindi_image,english_image;
    TextToSpeech english_speech,hindi_speech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dictionary);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        english=(TextView) findViewById(R.id.english);
        meaning=(TextView) findViewById(R.id.meaning);
        hindi_image=(ImageView) findViewById(R.id.hindi_image);
        image_favourite = (ImageView) findViewById(R.id.image_favourite);
        defination = (TextView) findViewById(R.id.defination);
        antonym = (TextView) findViewById(R.id.antonym);
        english_image=(ImageView) findViewById(R.id.english_image);
        helper=(Helper) Helper.getInstance(this);
        top_image=(ImageView) findViewById(R.id.top_image);
        helper.open();

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

        english_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english_speech.speak(container.getEnglish(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        hindi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindi_speech.speak(container.getMean(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        view=(RecyclerView) findViewById(R.id.recycleview);
        synonyns_list=new ArrayList<>();

        searchView = (SearchView) findViewById(R.id.searchview);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
                searchView.setIconifiedByDefault(false);
                int id = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
                TextView textView = (TextView) searchView.findViewById(id);
               // textView.setTextColor(Color.parseColor("#607D8B"));

            }
        });


        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_screen);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.clearFocus();// clear searchview focus
            }
        });


        voice_image = (ImageView) findViewById(R.id.voice_image);
        voice_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        "Speach Prompt");
                try {
                    startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Speach does not supported!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        container = new New_Data_Container();
        // set languages area
        //show_Languages();
        // set when app is first time run
       FirstTimeRun();


        image_favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (container != null) {
                    //helper.open();
                    boolean check = helper.Add_Fovourite(container.getEnglish(), container.getMean());
                    Toast.makeText(Dictionary.this, "Added successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //+++++++++++++++++++++++++++++++++++++++++++++++++

        final String[] from = new String[]{"english"};
        final int[] to = new int[]{R.id.suggestion_text};

        suggestionAdapter = new SimpleCursorAdapter(Dictionary.this,
                R.layout.suggestion_row, null, from, to, 0) {
            @Override
            public void changeCursor(Cursor cursor) {
                super.swapCursor(cursor);
            }

        };
        searchView.setSuggestionsAdapter(suggestionAdapter);


        searchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            @Override
            public boolean onSuggestionClick(int position) {

                // Add clicked text to search box
                CursorAdapter ca = searchView.getSuggestionsAdapter();
                Cursor cursor = ca.getCursor();
                cursor.moveToPosition(position);
                String clicked_word = cursor.getString(cursor.getColumnIndex("english"));
                searchView.setQuery(clicked_word.toLowerCase(), false);

                //search.setQuery("",false);

                searchView.clearFocus();
                searchView.setFocusable(false);

                setSearchResult(clicked_word);

                return true;
            }

            @Override
            public boolean onSuggestionSelect(int position) {
                // Your code here
                return true;
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String text = searchView.getQuery().toString();
                helper.open();
                Cursor c = helper.getMeaning(text);
                if (c.getCount() == 0) {
                    searchView.setQuery("", false);

                    AlertDialog.Builder builder = new AlertDialog.Builder(Dictionary.this);
                    builder.setTitle("Word Not Found");
                    builder.setMessage("Please search again or Try the free Translatore");

                    builder.setPositiveButton("Try Agrain",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // positive button logic
                                }
                            });

                    builder.setNegativeButton("Search online",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    searchView.clearFocus();
                                    if(checkNetwork(Dictionary.this))
                                    {
                                        Intent intent=new Intent(getApplicationContext(),Translator.class);
                                        startActivity(intent);
                                    }
                                    else{
                                        Toast.makeText(Dictionary.this, "First Enable Mobile data or Wifi", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                    AlertDialog dialog = builder.create();
                    // display dialog
                    dialog.show();
                } else {
                    //search.setQuery("",false);
                    searchView.clearFocus();
                    searchView.setFocusable(false);
                    setSearchResult(text);

                }

                return false;
            }


            @Override
            public boolean onQueryTextChange(final String s) {

                searchView.setIconifiedByDefault(false); //Give Suggestion list margins
                helper.open();
                Cursor cursorSuggestion = helper.getSuggestion(s);
                suggestionAdapter.changeCursor(cursorSuggestion);

                return false;
            }

        });


        //++++++++++++++++++++++++++++++++++++++++++++++++
    }


    //++++++++++++++++++++++  Top icons click ++++++++++++++++++++++++

    public void Top_Learn(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            startActivity(new Intent(Dictionary.this,Learn.class));
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                startActivity(new Intent(Dictionary.this,Learn.class));
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    public void Top_Favourite(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            startActivity(new Intent(Dictionary.this,Favourite.class));
        }

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();

                startActivity(new Intent(Dictionary.this,Favourite.class));
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

    }


    // The function is use to check the network
    boolean checkNetwork(Context ctx)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) ctx
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if ((connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE) != null && connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED)
                || (connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI) != null && connectivityManager
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI)
                .getState() == NetworkInfo.State.CONNECTED)) {
            return true;
        } else {
            return false;
        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1 : {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    //searchView.setText(result.get(0));
                    searchView.setQuery(result.get(0), true);
                }
                break;
            }

        }
    }


    int random()
    {
        Random rand = new Random();
        return (rand.nextInt(30000)+1);
    }


    void FirstTimeRun()
    {
        int id=random();

        try {
            // helper.open();
            Cursor cursor=helper.getRandomWord(id);
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    container.setEnglish(cursor.getString(cursor.getColumnIndex("english")).toLowerCase());
                    container.setMean(cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase());
                    english.setText(container.getEnglish());
                    meaning.setText(container.getMean());
                    defination.setText(cursor.getString(cursor.getColumnIndex("definition")).toLowerCase());
                    setSyn(cursor.getString(cursor.getColumnIndex("synonyms")).toLowerCase());
                    antonym.setText(cursor.getString(cursor.getColumnIndex("antonyms")).toLowerCase());
                    cursor.moveToNext();
                }

                cursor.close();
            }
        }
        catch (Exception e)
        {
            container.setEnglish("Learn");
            english.setText(container.getEnglish());
            container.setMean("सीखना");
            meaning.setText(container.getMean());
            defination.setText("gain or acquire knowledge of or skill in (something) by study, experience, or being taught.");
            setSyn("apprehend, comprehend, grasp, know, understand.");
            antonym.setText("None");
        }

    }

    // The function is use to set Search Result

    void setSearchResult(String search) {
        try {
            // helper.open();
            Cursor cursor=helper.getMeaning(search);
            if (cursor.getCount() > 0) {
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        container.setEnglish(cursor.getString(cursor.getColumnIndex("english")).toLowerCase());
                        container.setMean(cursor.getString(cursor.getColumnIndex("hindi")).toLowerCase());
                        english.setText(container.getEnglish());
                        meaning.setText(container.getMean());
                        defination.setText(cursor.getString(cursor.getColumnIndex("definition")).toLowerCase());
                        setSyn(cursor.getString(cursor.getColumnIndex("synonyms")).toLowerCase());
                        antonym.setText(cursor.getString(cursor.getColumnIndex("antonyms")).toLowerCase());
                        cursor.moveToNext();
                    }

                    cursor.close();
                }
            }
            else {
                Toast.makeText(this, "The word is not found", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "The word is not found", Toast.LENGTH_SHORT).show();
        }
    }

    void setSyn(String text)
    {
        synonyns_list.clear();
        String[] ar=text.split(",");
        Collections.addAll(synonyns_list,ar);
        if (!synonyns_list.isEmpty())
        {
            adapter=new Synonyns_Adapter(synonyns_list,this);
            view.setHasFixedSize(true);
            view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            view.setAdapter(adapter);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        String ulr[]={
                "https://i.ibb.co/r0fnWS7/Untitled-design-2.png",
                "https://i.ibb.co/7W5yP6j/Untitled-design.png",
                "https://i.ibb.co/F0JmmB0/Untitled-design-2.png",
                "https://i.ibb.co/Wccm1MJ/Untitled-design.png",
                "https://i.ibb.co/ZNnZXMy/1.png",
                "https://i.ibb.co/Wg0PmJS/2.png",
                "https://i.ibb.co/VmrqnNG/3.png",
                "https://i.ibb.co/hs1Zhny/Untitled-design-1.png",
                "https://i.ibb.co/Xbf2htp/Untitled-design-1.png",
                "https://i.ibb.co/SNvGY6Q/Untitled-design.png"
        };
        Random rand=new Random();
        int loc=rand.nextInt(10);
        if(checkNetwork(Dictionary.this))
        {
            Picasso.with(Dictionary.this).load(ulr[loc]).into(top_image);
        }

    }

    public void Definition_Click(View view) {
        english_speech.speak(defination.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
    }

    public void Antonyms_Click(View view) {
        english_speech.speak(antonym.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        hindi_speech.shutdown();
        super.onDestroy();
    }
}

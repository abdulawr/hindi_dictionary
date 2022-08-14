package ss.technology.hindi_dictionary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.translate.AmazonTranslateAsyncClient;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Locale;

public class Translator extends AppCompatActivity {

    TextView displayResult;
    String word,meaning;
    final String PREFS_NAME = "MyPrefsFile";
    String kk,ll;
    TextToSpeech english_speech,hindi_speech;
    String lan;
    Helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        displayResult=(TextView) findViewById(R.id.displayResult);
        english_speech=new TextToSpeech(Translator.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    english_speech.setLanguage(Locale.UK);
                }
            }
        });

        hindi_speech=new TextToSpeech(Translator.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    hindi_speech.setLanguage(new Locale("hi","IN"));
                }
            }
        });
        helper=Helper.getInstance(this);
        helper.open();;

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings.getBoolean("my_first_time", true)) {
            request_SS();
            settings.edit().putBoolean("my_first_time", false).commit();
        }

        SetKey();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.translaction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        } else if (id == R.id.fav) {
            Intent intent=new Intent(getApplicationContext(),Transl_Fav.class);
            startActivity(intent);
        }
        return true;
    }

    public void English_Input(View view) {

        lan="hi";
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en");
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

    public void Hindi_Input(View view) {
        lan="en";
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "hi_IN");
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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1 : {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    word=result.get(0);
                    try{
                        if(!kk.equals("") && !ll.equals(""))
                        {
                            ResquestWorld(kk,ll,word,lan);
                        }

                        else {
                            SetKey();
                        }
                    }
                    catch (Exception e)
                    {
                        ResquestWorld(kk,ll,word,lan);
                    }

                }
                break;
            }

        }
    }


    public void Copy_Text(View view) {

        ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(displayResult.getText());
    }

    public void Favourite_click(View view) {

        if(word!=null && meaning!=null)
        {
            helper.open();
            boolean check=helper.history(word,meaning);
            if(check){
                Toast.makeText(Translator.this, "Successfully added!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Translator.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(Translator.this, "The view is empty!", Toast.LENGTH_SHORT).show();
        }

    }

    void setKeyToPreference(String AccessKeyId,String AWSSecretKey)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("AccessKeyId", AccessKeyId);
        editor.putString("SecretKey", AWSSecretKey);
        editor.commit();
    }


    void request_SS()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Translator.this);
        LayoutInflater inflater = (Translator.this).getLayoutInflater();
        View viewss = inflater.inflate(R.layout.loading, null);
        builder.setView(viewss);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();

        String url="https://sstechnologyapps.000webhostapp.com/getdata.php";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest
                jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response)
            {
                alertDialog.dismiss();
                try {
                    JSONArray array=response.getJSONArray("response");
                    for (int i = 0; i < array.length(); i++)
                    {
                        setKeyToPreference(array.getJSONObject(i).getString("AccessKeyId"),array.getJSONObject(i).getString("SecretKey"));
                        kk = array.getJSONObject(i).getString("AccessKeyId");
                        ll = array.getJSONObject(i).getString("SecretKey");
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        alertDialog.dismiss();
                        Toast.makeText(Translator.this, "Network error close activity and try again.", Toast.LENGTH_SHORT).show();
                    }
                });
        requestQueue.add(jsonObjectRequest);
    }

    void SetKey()
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        kk=preferences.getString("AccessKeyId", null);
        ll=preferences.getString("SecretKey", null);
        if (kk==null && ll==null)
        {
            request_SS();
        }
    }


    void ResquestWorld(final String kk,final String ll,final String word,final String lang)
    {
        try {

            if (!word.equals("")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Translator.this);
                LayoutInflater inflater = (Translator.this).getLayoutInflater();
                View viewss = inflater.inflate(R.layout.loading, null);
                builder.setView(viewss);
                builder.setCancelable(false);
                final AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.show();

                AWSCredentials awsCredentials = new AWSCredentials() {
                    @Override
                    public String getAWSAccessKeyId() {
                        return kk;
                    }

                    @Override
                    public String getAWSSecretKey() {
                        return ll;
                    }
                };
                AmazonTranslateAsyncClient translateAsyncClient = new AmazonTranslateAsyncClient(awsCredentials);
                TranslateTextRequest translateTextRequest = new TranslateTextRequest()
                        .withText(word)
                        .withSourceLanguageCode("auto")
                        .withTargetLanguageCode(lang);
                translateAsyncClient.translateTextAsync(translateTextRequest, new AsyncHandler<TranslateTextRequest, TranslateTextResult>() {
                    @Override
                    public void onError(Exception e) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                displayResult.setText(word);
                            }
                        });
                        alertDialog.dismiss();
                    }

                    @Override
                    public void onSuccess(TranslateTextRequest request, final TranslateTextResult translateTextResult) {
                        alertDialog.dismiss();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (lang == "hi")
                                {
                                    hindi_speech.speak(translateTextResult.getTranslatedText(),TextToSpeech.QUEUE_FLUSH,null);
                                }
                                else if (lang == "en")
                                {
                                    english_speech.speak(translateTextResult.getTranslatedText(),TextToSpeech.QUEUE_FLUSH,null);
                                }
                                displayResult.setText(translateTextResult.getTranslatedText());
                                meaning = translateTextResult.getTranslatedText();
                            }
                        });
                    }
                });
            } else {
                Toast.makeText(Translator.this, "Pleae try again!", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Please check internet connection", Toast.LENGTH_SHORT).show();
        }

    }


    public void Share_Text(View view) {

        if(meaning != null && word != null)
        {
            Intent txtIntent = new Intent(android.content.Intent.ACTION_SEND);
            txtIntent .setType("text/plain");
            txtIntent .putExtra(android.content.Intent.EXTRA_SUBJECT, word);
            txtIntent .putExtra(android.content.Intent.EXTRA_TEXT, meaning);
            startActivity(Intent.createChooser(txtIntent ,"Share"));
        }
        else{
            Toast.makeText(this, "The view is empty.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        hindi_speech.shutdown();
        english_speech.shutdown();
        super.onDestroy();
    }
}

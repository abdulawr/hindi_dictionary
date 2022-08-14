package ss.technology.hindi_dictionary;

import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Locale;

public class Translation extends AppCompatActivity {

   Spinner languages,lang2;
    FloatingActionButton sendText,enter_clear,inputVoic,float_copy,fav_floating;
    EditText inputValues;
    TextView result;
    words_Container container;
    Helper helper;
    String word;
    String kk;
    String ll;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        languages = (Spinner) findViewById(R.id.spinner);
        lang2 = (Spinner) findViewById(R.id.spinner1);
        // Setting value on spinner
        result=(TextView) findViewById(R.id.result);

        sendText = (FloatingActionButton) findViewById(R.id.sendText);
        enter_clear=(FloatingActionButton) findViewById(R.id.enter_clear);
        inputValues=(EditText) findViewById(R.id.edittext);
        inputVoic=(FloatingActionButton) findViewById(R.id.inputvoice);
        float_copy=(FloatingActionButton) findViewById(R.id.float_copy);
        fav_floating=(FloatingActionButton) findViewById(R.id.fav_floating);
        helper=Helper.getInstance(this);
        helper.open();;

        float_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
                    cm.setText(result.getText());

            }
        });

        request_SS();


        // use to submitted the input and print the result
        sendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo all main task here

                   //----------------------------------------------------------------

                     if(!kk.equals("") && !ll.equals(""))
                     {
                         ResquestWorld(kk,ll);
                     }

                     else {
                         request_SS();
                         ResquestWorld(kk,ll);
                     }


                //----------------------------------------------------------------

            }
        });

        fav_floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String word=container.getWord();
                String mean=container.getMeaning();
                if(word!=null && mean!=null)
                {
                 helper.open();
                 boolean check=helper.history(word,mean);
                 if(check){
                     Toast.makeText(Translation.this, "Successfully added!", Toast.LENGTH_SHORT).show();
                 }
                 else{
                     Toast.makeText(Translation.this, "Try again!", Toast.LENGTH_SHORT).show();
                 }
                }
                else
                {
                    Toast.makeText(Translation.this, "The view is empty!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // use to clear enter text
        enter_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputValues.getText().toString().equals("")) {
                    inputValues.getText().clear();
                    result.setText("");
                    result.setHint("Result will be show here....");
                } else {
                    Toast.makeText(Translation.this, "Already clear!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Sending Request for input sound
        inputVoic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedLang=lang2.getSelectedItem().toString().toLowerCase();
                String lang="";
                if(selectedLang.equals("german"))
                {
                    lang="de";
                }
                else if(selectedLang.equals("chinese"))
                {
                    lang="zh";
                }
                else if(selectedLang.equals("spanish"))
                {
                    lang="es";
                }
                else if(selectedLang.equals("portuguese"))
                {
                    lang="pt";
                }

                else if(selectedLang.equals("urdu"))
                {
                    lang="ur_PK";
                }
                else if(selectedLang.equals("pashto"))
                {
                    lang="ps_PK";
                }
                else if(selectedLang.equals("bengali"))
                {
                    lang="bn";
                }
                else{
                    lang=String.valueOf(selectedLang.charAt(0))+String.valueOf(selectedLang.charAt(1));
                }

                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, lang);
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

    void hideKeyboard() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {

            View view = this.getCurrentFocus();
            if (view != null) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                try {
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                } catch (Exception e) {

                }

            }
        }

        else
        {
            getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
            );
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
                   inputValues.setText(result.get(0));
                    if(!kk.equals("") && !ll.equals(""))
                    {
                        ResquestWorld(kk,ll);
                    }

                    else {
                        request_SS();
                        ResquestWorld(kk,ll);
                    }

                    // ResquestWorld(kk,ll);
                    // todo Add directed translation through voice
                }
                break;
            }

        }
    }


    void ResquestWorld(final String kk,final String ll)
    {
        hideKeyboard(); // use for hiding keyboard
        String selectedLang=languages.getSelectedItem().toString().toLowerCase();
        String lang="";
        if(selectedLang.equals("german"))
        {
            lang="de";
        }
        else if(selectedLang.equals("chinese"))
        {
            lang="zh";
        }
        else if(selectedLang.equals("spanish"))
        {
            lang="es";
        }
        else if(selectedLang.equals("portuguese"))
        {
            lang="pt";
        }

        else if(selectedLang.equals("pashto"))
        {
            lang="ps";
        }
        else if(selectedLang.equals("bengali"))
        {
            lang="bn";
        }
        else{
            lang=String.valueOf(selectedLang.charAt(0))+String.valueOf(selectedLang.charAt(1));
        }


        word=inputValues.getText().toString();
        if(!word.equals("")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Translation.this);
            LayoutInflater inflater = (Translation.this).getLayoutInflater();
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
                    container = new words_Container();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            result.setText(word);
                        }
                    });
                    container.setMeaning(word);
                    container.setWord(word);
                    alertDialog.dismiss();
                }

                @Override
                public void onSuccess(TranslateTextRequest request, final TranslateTextResult translateTextResult) {
                    alertDialog.dismiss();
                    container = new words_Container();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            result.setText(translateTextResult.getTranslatedText());
                            Speed(translateTextResult.getTranslatedText());
                        }
                    });
                    container.setMeaning(translateTextResult.getTranslatedText());
                    container.setWord(word);
                }
            });
        }

        else
        {
            Toast.makeText(Translation.this, "Please enter text!", Toast.LENGTH_SHORT).show();
        }

    }

    void request_SS()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Translation.this);
        LayoutInflater inflater = (Translation.this).getLayoutInflater();
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
                        Toast.makeText(Translation.this, "Network error close activity and try again.", Toast.LENGTH_SHORT).show();
                    }
                });
        requestQueue.add(jsonObjectRequest);
    }



    String Langage1()
    {
        String selectedLang=languages.getSelectedItem().toString().toLowerCase();
        String lang="";
        if(selectedLang.equals("german"))
        {
            lang="de";
        }
        else if(selectedLang.equals("chinese"))
        {
            lang="zh";
        }
        else if(selectedLang.equals("spanish"))
        {
            lang="es";
        }
        else if(selectedLang.equals("portuguese"))
        {
            lang="pt";
        }

        else if(selectedLang.equals("urdu"))
        {
            lang="ur_PK";
        }
        else if(selectedLang.equals("pashto"))
        {
            lang="ps_PK";
        }
        else if(selectedLang.equals("bengali"))
        {
            lang="bn";
        }
        else{
            lang=String.valueOf(selectedLang.charAt(0))+String.valueOf(selectedLang.charAt(1));
        }

        return lang;
    }

    void Speed(String word)
    {
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(new Locale(Langage1()));
                }
            }
        });
        t1.speak(word, TextToSpeech.QUEUE_FLUSH, null);
    }


    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onDestroy();
    }

}

package ss.technology.hindi_dictionary;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class Phrases_Recycle_Adapter extends RecyclerView.Adapter<Phrases_Recycle_Adapter.View_Holder> {

   private Context context;
   private ArrayList<Data_Container> list=new ArrayList<>();
   private TextToSpeech english_speech,hindi_speech,frech_speech,german_speech;
    Boolean check;
    String language;


     Phrases_Recycle_Adapter(Context context, ArrayList<Data_Container> list,Boolean check) {
        this.context = context;
        this.list = list;
        this.check=check;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.phrases_view, parent, false);
        View_Holder viewH = new View_Holder(listItem,context);
        return viewH;
    }

    @Override
    public void onBindViewHolder(@NonNull final View_Holder holder, int position) {

        language=SharePreference_Store.getValue(context);
        final Data_Container data=list.get(position);
        holder.number.setText(String.valueOf((position+1)));

        if (check)
        {
            holder.linearLayout.setVisibility(View.GONE);
            holder.mean_text.setText(data.getMean());
        }

        switch (language)
        {
            case "english":{
                All(holder);
                holder.english.setVisibility(View.VISIBLE);
                holder.english.setText(data.getEnglish());
                break;
            }

            case "hindi":{
                Hindi(holder);
                holder.english.setText(data.getEnglish());
                holder.hindi.setText(data.getHindi());
                break;
            }

            case "urdu":{
                Urdu(holder);
                holder.english.setText(data.getEnglish());
                holder.urdu.setText(data.getUrdu());
                break;
            }

            case "german":{
                German(holder);
                holder.english.setText(data.getEnglish());
                holder.german.setText(data.getGerman());
                break;
            }

            case "french":{
                French(holder);
                holder.english.setText(data.getEnglish());
                holder.french.setText(data.getFrench());
                break;
            }

            case "pashto":{
                Pashto(holder);
                holder.english.setText(data.getEnglish());
                holder.pashto.setText(data.getPashto());
                break;
            }

            case "arabic":{
                Arabic(holder);
                holder.english.setText(data.getEnglish());
                holder.arabic.setText(data.getArabic());
                break;
            }
        }

        //######################################################################
        // Speech object creation area

        english_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    english_speech.setLanguage(Locale.UK);
                }
            }
        });

        frech_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    frech_speech.setLanguage(Locale.FRENCH);
                }
            }
        });

        german_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    german_speech.setLanguage(Locale.GERMAN);
                }
            }
        });

        hindi_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
               if (status != TextToSpeech.ERROR)
                {
                    hindi_speech.setLanguage(new Locale("hi","IN"));
                }

            }
        });

        //##########################################################################
        // onclick listen area code

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english_speech.speak(data.getEnglish(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        // english button lcick
        holder.english_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english_speech.speak(data.getEnglish(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        holder.french_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frech_speech.speak(data.getFrench(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        // hindi button click
        holder.hindi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindi_speech.speak(data.getHindi(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        holder.german_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                german_speech.speak(data.getGerman(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class View_Holder extends RecyclerView.ViewHolder {

        TextView number,english,urdu,pashto,hindi,french,german,arabic,mean_text;
        ImageView image;
        Button english_button,french_button,german_button,hindi_button;
        LinearLayout linearLayout,urdu_lay,pashto_lay,hindi_lay,arabic_lay,german_lay,french_lay;


        public View_Holder(@NonNull View itemView,Context context) {
            super(itemView);

            number=itemView.findViewById(R.id.number);
            english=itemView.findViewById(R.id.english_text);
            urdu=itemView.findViewById(R.id.urdu_text);
            pashto=itemView.findViewById(R.id.pashto_text);
            hindi=itemView.findViewById(R.id.hindi_text);
            french=itemView.findViewById(R.id.french_text);
            german=itemView.findViewById(R.id.german_text);
            arabic=itemView.findViewById(R.id.arabic_text);
            image=itemView.findViewById(R.id.image);
            mean_text=itemView.findViewById(R.id.mean_text);
            linearLayout=itemView.findViewById(R.id.main_layout);

            english_button=itemView.findViewById(R.id.english_button);
            hindi_button=itemView.findViewById(R.id.hindi_button);
            french_button=itemView.findViewById(R.id.french_button);
            german_button=itemView.findViewById(R.id.german_button);

            urdu_lay=(LinearLayout) itemView.findViewById(R.id.urdu);
            pashto_lay=(LinearLayout) itemView.findViewById(R.id.pashto);
            hindi_lay=(LinearLayout) itemView.findViewById(R.id.hindi);
            arabic_lay=(LinearLayout) itemView.findViewById(R.id.arabic);
            german_lay=(LinearLayout) itemView.findViewById(R.id.german);
            french_lay=(LinearLayout) itemView.findViewById(R.id.french);


        }
    }

   public  TextToSpeech isEnglis()
    {
        return english_speech;
    }

    public  TextToSpeech isHindi()
    {
        return hindi_speech;
    }

   public  TextToSpeech isFrench()
    {
        return frech_speech;
    }

    public  TextToSpeech isGermen()
    {
        return german_speech;
    }

    // Setting visiabality

    void All(View_Holder holder)
    {

    }

    void Urdu(View_Holder holder){
        holder.urdu_lay.setVisibility(View.VISIBLE);
    }

    void Pashto(View_Holder holder){
        holder.pashto_lay.setVisibility(View.VISIBLE);
    }


    void Arabic(View_Holder holder){
        holder.arabic_lay.setVisibility(View.VISIBLE);
    }

    void Hindi(View_Holder holder){
        holder.hindi_lay.setVisibility(View.VISIBLE);
    }

    void French(View_Holder holder){
        holder.french_lay.setVisibility(View.VISIBLE);
    }

    void German(View_Holder holder){
        holder.german_lay.setVisibility(View.VISIBLE);
    }
}

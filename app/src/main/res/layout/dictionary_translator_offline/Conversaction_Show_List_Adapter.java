package ss.technology.hindi_dictionary;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class Phrases_Recycle_Adapter extends RecyclerView.Adapter<Phrases_Recycle_Adapter.view_Holder> {

  Context context;
  ArrayList<Data_Container> list;
    Boolean check;
    TextToSpeech speech;

    public Phrases_Recycle_Adapter(Context context, ArrayList<Data_Container> list,Boolean check) {
        this.context = context;
        this.list = list;
        this.check=check;
    }

    @NonNull
    @Override
    public view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.conservation_show_list_adapter,parent,false);
        return new Phrases_Recycle_Adapter.view_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_Holder holder, final int position) {

        String language=SharePreference_Store.getValue(context);
        final Data_Container data=list.get(position);
        holder.english_Text.setText(data.getEnglish());

        if (check)
        {
            holder.name.setVisibility(View.VISIBLE);
            holder.name.setText(data.getMean());
        }

        speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    speech.setLanguage(Locale.UK);
                }
            }
        });

       holder.image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               speech.speak(data.getEnglish(),TextToSpeech.QUEUE_FLUSH,null);
           }
       });

        switch (language){
            case "english":{
                holder.english_Text.setVisibility(View.VISIBLE);
                holder.english_Text.setText(data.getEnglish());

                break;
            }
            case "hindi":{
                holder.hindi.setVisibility(View.VISIBLE);
                holder.hindi_Text.setText(data.getHindi());
                break;
            }
            case "urdu":{
                holder.urdu.setVisibility(View.VISIBLE);
                holder.urdu_Text.setText(data.getUrdu());
                break;
            }
            case "german":{
                holder.german.setVisibility(View.VISIBLE);
                holder.german_Text.setText(data.getGerman());
                break;
            }
            case "french":{
                holder.french.setVisibility(View.VISIBLE);
                holder.french_Text.setText(data.getFrench());
                break;
            }
            case "pashto":{
                holder.pashto.setVisibility(View.VISIBLE);
                holder.pashto_Text.setText(data.getPashto());
                break;
            }
            case "arabic":{
                holder.arabic.setVisibility(View.VISIBLE);
                holder.arabic_Text.setText(data.getArabic());
                break;
            }
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class view_Holder extends RecyclerView.ViewHolder {

        LinearLayout english,urdu,arabic,hindi,pashto,german,french;
        TextView english_Text,urdu_Text,pashto_Text,hindi_Text,german_Text,french_Text,arabic_Text,name;
        ImageView image;

        public view_Holder(@NonNull View itemView) {
            super(itemView);

            english=(LinearLayout) itemView.findViewById(R.id.english);
            urdu=(LinearLayout) itemView.findViewById(R.id.urdu);
            hindi=(LinearLayout) itemView.findViewById(R.id.hindi);
            arabic=(LinearLayout) itemView.findViewById(R.id.arabic);
            pashto=(LinearLayout) itemView.findViewById(R.id.pashto);
            german=(LinearLayout) itemView.findViewById(R.id.german);
            french=(LinearLayout) itemView.findViewById(R.id.french);

            english_Text=(TextView) itemView.findViewById(R.id.english_text);
            urdu_Text=(TextView) itemView.findViewById(R.id.urdu_text);
            pashto_Text=(TextView) itemView.findViewById(R.id.pashto_text);
            arabic_Text=(TextView) itemView.findViewById(R.id.arabic_text);
            hindi_Text=(TextView) itemView.findViewById(R.id.hindi_text);
            french_Text=(TextView) itemView.findViewById(R.id.french_text);
            german_Text=(TextView) itemView.findViewById(R.id.german_text);
            name=(TextView) itemView.findViewById(R.id.name);
            image=(ImageView) itemView.findViewById(R.id.image);


        }
    }
}

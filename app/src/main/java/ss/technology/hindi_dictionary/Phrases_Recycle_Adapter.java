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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class Phrases_Recycle_Adapter extends RecyclerView.Adapter<Phrases_Recycle_Adapter.View_Holder> {

   private Context context;
   private ArrayList<Data_Container> list=new ArrayList<>();
   private TextToSpeech english_speech,hindi_speech;


     Phrases_Recycle_Adapter(Context context, ArrayList<Data_Container> list) {
        this.context = context;
        this.list = list;
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

        final Data_Container data=list.get(position);
        holder.english_text.setText(data.getEnglish());
        holder.hindi_text.setText(data.getHindi());
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

        hindi_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
               if (status != TextToSpeech.ERROR)
                {
                    hindi_speech.setLanguage(new Locale("hi","IN"));
                }
            }
        });

        // english button lcick
        holder.english_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                english_speech.speak(data.getEnglish(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        holder.hindi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindi_speech.speak(data.getHindi(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class View_Holder extends RecyclerView.ViewHolder {

      TextView english_text,hindi_text;
      ImageView english_image,hindi_image;

        public View_Holder(@NonNull View itemView,Context context) {
            super(itemView);
            english_image=(ImageView) itemView.findViewById(R.id.english_image);
            hindi_image=(ImageView) itemView.findViewById(R.id.hindi_image);
            english_text=(TextView) itemView.findViewById(R.id.english_text);
            hindi_text=(TextView) itemView.findViewById(R.id.hindi_text);
        }
    }

}

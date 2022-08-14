package ss.technology.hindi_dictionary;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class Synonyns_Adapter extends RecyclerView.Adapter<Synonyns_Adapter.Holder> {

    ArrayList<String> list;
    Context context;
    TextToSpeech english_speech;

    public Synonyns_Adapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.synonyns_adapter, parent, false);

        return new Holder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.num.setText(String.valueOf((position+1)));
        holder.word.setText(list.get(position));

        english_speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    english_speech.setLanguage(Locale.UK);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView num,word;

        public Holder(@NonNull View itemView) {
            super(itemView);

            num=(TextView) itemView.findViewById(R.id.num);
            word=(TextView) itemView.findViewById(R.id.word);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            english_speech.speak(list.get(getLayoutPosition()),TextToSpeech.QUEUE_FLUSH,null);
        }
    }
}

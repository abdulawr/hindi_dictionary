package ss.technology.hindi_dictionary;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class fav_Adapter extends RecyclerView.Adapter<fav_Adapter.view_Holder> {

    Context context;
    ArrayList<words_Container> list;
    TextToSpeech speech;

    public fav_Adapter(Context context, ArrayList<words_Container> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.fav_adapter,parent,false);
        return new fav_Adapter.view_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_Holder holder, final int position) {
        final words_Container data=list.get(position);
        speech=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                {
                    speech.setLanguage(Locale.UK);
                }
            }
        });
        holder.word.setText(data.getWord());
        holder.mean.setText(data.getMeaning());
        holder.voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speech.speak(data.getWord(),TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class view_Holder extends RecyclerView.ViewHolder{
        TextView word,mean;
        ImageView voice;

        public view_Holder(@NonNull View itemView) {
            super(itemView);

            word=(TextView) itemView.findViewById(R.id.word);
            mean=(TextView) itemView.findViewById(R.id.mean);
            voice=(ImageView) itemView.findViewById(R.id.image);
        }
    }
}

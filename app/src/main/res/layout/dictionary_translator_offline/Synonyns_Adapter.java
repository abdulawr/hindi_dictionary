package ss.technology.hindi_dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Synonyns_Adapter extends RecyclerView.Adapter<Synonyns_Adapter.Holder> {

    ArrayList<String> list;
    Context context;

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

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView num,word;

        public Holder(@NonNull View itemView) {
            super(itemView);

            num=(TextView) itemView.findViewById(R.id.num);
            word=(TextView) itemView.findViewById(R.id.word);
        }
    }
}

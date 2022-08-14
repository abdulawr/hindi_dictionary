package ss.technology.hindi_dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class View_Ans_Adapter extends RecyclerView.Adapter<View_Ans_Adapter.View_Holder> {

    Context context;
    ArrayList<View_Ans_Container> list;

    public View_Ans_Adapter(Context context, ArrayList<View_Ans_Container> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.view_ans_adapter, parent, false);
        return new View_Holder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {

        View_Ans_Container data=list.get(position);

        if (!data.getName().equals("") && !data.getDate().equals("") && !data.getLang1().equals("")) {

            holder.name.setText("By : "+data.getName());
            holder.date.setText("Date : "+data.getDate());
            holder.lang1.setText(data.getLang1());
            holder.lang2.setText(data.getLang2());
            holder.lang1_text.setText(data.getQuestion());
            holder.lang2_text.setText(data.getAns());

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class View_Holder extends RecyclerView.ViewHolder {

    TextView name,date,lang1,lang2,lang1_text,lang2_text;

    public View_Holder(@NonNull View itemView) {
        super(itemView);

        name=(TextView) itemView.findViewById(R.id.name);
        date=(TextView) itemView.findViewById(R.id.date);
        lang1=(TextView) itemView.findViewById(R.id.lang1);
        lang2=(TextView) itemView.findViewById(R.id.lang2);
        lang1_text=(TextView) itemView.findViewById(R.id.lang1_text);
        lang2_text=(TextView) itemView.findViewById(R.id.lang2_text);
    }
}

}

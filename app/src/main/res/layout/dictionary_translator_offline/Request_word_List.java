package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Request_word_List extends RecyclerView.Adapter<Request_word_List.View_Holder> {

  Context context;
  ArrayList<Request_word_container> containers;

    public Request_word_List(Context context, ArrayList<Request_word_container> containers) {
        this.context = context;
        this.containers = containers;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.request_word_list,parent,false);
        return new View_Holder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {

        Request_word_container list=containers.get(position);

        if (!list.getWord().equals("") && !list.getLang1().equals(""))
        {
            holder.word.setText(list.getWord());
            holder.lang1.setText(list.getLang1());
            holder.lang2.setText(list.getLang2());
        }


    }

    @Override
    public int getItemCount() {
        return containers.size();
    }

    class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView word,lang1,lang2;

        public View_Holder(@NonNull View itemView, Context context) {
            super(itemView);
            word=itemView.findViewById(R.id.word);
            lang1=itemView.findViewById(R.id.lang1);
            lang2=itemView.findViewById(R.id.lang2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
          Request_word_container list=containers.get(getLayoutPosition());
            Intent intent=new Intent(context,Solve_Question.class);
            intent.putExtra("obj",list);
            context.startActivity(intent);
        }
    }

}

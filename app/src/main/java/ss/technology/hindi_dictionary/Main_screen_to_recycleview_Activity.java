package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Main_screen_to_recycleview_Activity extends RecyclerView.Adapter<Main_screen_to_recycleview_Activity.view_Holder> {

    ArrayList<String> list;
    ArrayList<String> list2;
    Context context;

    public Main_screen_to_recycleview_Activity(Context context, ArrayList<String> list, ArrayList<String> list2) {
        this.list = list;
        this.context=context;
        this.list2=list2;
    }

    @NonNull
    @Override
    public view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.main_screen_to_recycleview_layout,parent,false);
        return new view_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final view_Holder holder, int position) {

        holder.error.setText(list2.get(position));
        Picasso.with(context).load(list.get(position)).into(holder.imageView, new com.squareup.picasso.Callback() {
            @Override
            public void onSuccess() {
            holder.progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError() {
                holder.imageView.setImageResource(R.drawable.error_image);
             holder.progressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class view_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView error;
        ProgressBar progressBar;

       public view_Holder(@NonNull final View itemView) {
           super(itemView);

           imageView=(ImageView) itemView.findViewById(R.id.image);
           error=(TextView) itemView.findViewById(R.id.error);
           progressBar=(ProgressBar) itemView.findViewById(R.id.progress);

           itemView.setOnClickListener(this);
       }

        @Override
        public void onClick(View v) {

           int id=getLayoutPosition();

           switch (id)
           {
               case 0:
                   context.startActivity(new Intent(context,Dictionary.class));
                   break;
               case 1:
                   context.startActivity(new Intent(context,Translator.class));
                   break;
               case 2:
                   context.startActivity(new Intent(context,Conversation.class));
                   break;
               case 3:
                   Intent intent=new Intent(context,MCQS.class);
                   context.startActivity(intent);
                   break;
               case 4:
                   context.startActivity(new Intent(context,Vocabulary.class));
                   break;
               case 5:
                  context.startActivity(new Intent(context,Favourite.class));
                   break;

           }

        }
    }
}

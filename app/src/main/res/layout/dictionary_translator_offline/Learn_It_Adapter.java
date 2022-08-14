package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class Learn_It_Adapter extends RecyclerView.Adapter<Learn_It_Adapter.view_holder> {

    Context context;
    String [] tit;

    public Learn_It_Adapter(Context context,String[] tit) {
        this.context = context;
        this.tit = tit;
    }


    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.learn_it_adapter_view,parent,false);
        return new Learn_It_Adapter.view_holder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {
      holder.textView.setText(tit[position]);
    }

    @Override
    public int getItemCount() {
        return tit.length;
    }

    class view_holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        private InterstitialAd mInterstitialAd;

        public view_holder(@NonNull View itemView,Context context) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);
            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }

        @Override
        public void onClick(View v) {
         int id=getLayoutPosition();
         if (id == 0)
         {
             if (mInterstitialAd.isLoaded()) {
                 mInterstitialAd.show();
             } else {
                 Intent intent=new Intent(context,Vocabulary.class);
                 context.startActivity(intent);
             }

             mInterstitialAd.setAdListener(new AdListener(){
                 @Override
                 public void onAdClosed() {
                     super.onAdClosed();

                     Intent intent=new Intent(context,Vocabulary.class);
                     context.startActivity(intent);
                     mInterstitialAd.loadAd(new AdRequest.Builder().build());
                 }
             });

         }
         else if (id == 1)
         {
             Intent intent=new Intent(context,Phrases_Activity.class);
             context.startActivity(intent);
         }
         else if (id == 2)
         {
             if (mInterstitialAd.isLoaded()) {
                 mInterstitialAd.show();
             } else {
                 Intent intent=new Intent(context,Conversation.class);
                 context.startActivity(intent);
             }

             mInterstitialAd.setAdListener(new AdListener(){
                 @Override
                 public void onAdClosed() {
                     super.onAdClosed();

                     Intent intent=new Intent(context,Conversation.class);
                     context.startActivity(intent);
                     mInterstitialAd.loadAd(new AdRequest.Builder().build());
                 }
             });

         }
         else if (id == 3)
         {
             Intent intent =new Intent(context,WebPage_Viewer.class);
             intent.putExtra("links","form_of_verbs");
             intent.putExtra("title","English verbs forms");
             context.startActivity(intent);
         }
        }
    }
}

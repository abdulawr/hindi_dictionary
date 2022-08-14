package ss.technology.hindi_dictionary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

public class Linear_Recycler_view_Adapter extends RecyclerView.Adapter<Linear_Recycler_view_Adapter.View_Holder> {

    private Context context;
    public  ArrayList<String> titles=new ArrayList<>();
   public ArrayList<String> details=new ArrayList<>();


    public Linear_Recycler_view_Adapter(Context context, ArrayList<String> title, ArrayList<String> details) {
        this.context = context;
        this.titles = title;
        this.details = details;

    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.linar_recyclerview_view, parent, false);

        return new Linear_Recycler_view_Adapter.View_Holder(listItem,context);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, final int position) {
       holder.title.setText(titles.get(position));
       holder.detail.setText(details.get(position));

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title,detail;
        ImageView imageView;
        private InterstitialAd mInterstitialAd;

        public View_Holder(@NonNull View itemView,Context context) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            detail=itemView.findViewById(R.id.detail);
            imageView=itemView.findViewById(R.id.image);

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
           int id=getLayoutPosition();

           switch (id)
           {
               case 0:{

                   Intent intent=new Intent(context,Disease_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 1:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Animals_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Animals_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }

               case 2:{
                   Intent intent=new Intent(context,Birds_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 3:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Body_Parts_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Body_Parts_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }


               case 4:{
                   Intent intent=new Intent(context,Clothing_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 5:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Color_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Color_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }

               case 6:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Common_Shapes.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Common_Shapes.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }

               case 7:{
                   Intent intent=new Intent(context,Emotion_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 8:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Family_Member_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Family_Member_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }


               case 9:{
                   Intent intent=new Intent(context,Food_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 10:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Fruit_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Fruit_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }

               case 11:{
                   Intent intent=new Intent(context,Dry_Fruit_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 12:{
                   Intent intent=new Intent(context,Weather_Vocabulary.class);
                   context.startActivity(intent);
                   break;
               }

               case 13:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Vegetiable_Vocabulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Vegetiable_Vocabulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }


               case 14:{
                   if (mInterstitialAd.isLoaded()) {
                       mInterstitialAd.show();
                   } else {
                       Intent intent=new Intent(context,Vehicles_Vocablulary.class);
                       context.startActivity(intent);
                   }

                   mInterstitialAd.setAdListener(new AdListener(){
                       @Override
                       public void onAdClosed() {
                           super.onAdClosed();

                           Intent intent=new Intent(context,Vehicles_Vocablulary.class);
                           context.startActivity(intent);
                           mInterstitialAd.loadAd(new AdRequest.Builder().build());
                       }
                   });

                   break;
               }
           }
        }
    }

}

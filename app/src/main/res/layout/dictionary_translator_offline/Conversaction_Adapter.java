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

import java.util.ArrayList;

public class Conversaction_Adapter extends RecyclerView.Adapter<Conversaction_Adapter.view_Holder> {

    ArrayList<String> title;
    ArrayList<String> image_title;
    Context context;

    public Conversaction_Adapter(ArrayList<String> title, ArrayList<String> image_title, Context context) {
        this.title = title;
        this.image_title = image_title;
        this.context = context;
    }

    @NonNull
    @Override
    public view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.conversation_adapter_view,parent,false);
        return new view_Holder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull view_Holder holder, int position) {
    holder.title.setText(title.get(position));
    holder.sub.setText("Learn conversation about "+image_title.get(position));
    }

    @Override
    public int getItemCount() {
        return title.size();
    }


    class view_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title,sub;
        private InterstitialAd mInterstitialAd;

        public view_Holder(@NonNull View itemView,Context context) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            sub=(TextView) itemView.findViewById(R.id.sub);
            itemView.setOnClickListener(this);

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-7611672890241421/7035467122");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }



        @Override
        public void onClick(View v) {

            int id=getLayoutPosition();

            switch (id)
            {
                case 0:{

                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent intent=new Intent(context,Introduce_yourself.class);
                        context.startActivity(intent);
                    }

                    mInterstitialAd.setAdListener(new AdListener(){
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();

                            Intent intent=new Intent(context,Introduce_yourself.class);
                            context.startActivity(intent);
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }
                    });

                    break;
                }
                case 1:{

                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent intent=new Intent(context,Residance_Conversation.class);
                        context.startActivity(intent);
                    }

                    mInterstitialAd.setAdListener(new AdListener(){
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();

                            Intent intent=new Intent(context,Residance_Conversation.class);
                            context.startActivity(intent);
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }
                    });

                    break;
                }
                case 2:{
                    Intent intent=new Intent(context,Hospital_conversation.class);
                    context.startActivity(intent);
                    break;
                }
                case 3:{
                    Intent intent=new Intent(context,Restruent.class);
                    context.startActivity(intent);
                    break;
                }
                case 4:{
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent intent=new Intent(context,Shop_Conversaction.class);
                        context.startActivity(intent);
                    }

                    mInterstitialAd.setAdListener(new AdListener(){
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();

                            Intent intent=new Intent(context,Shop_Conversaction.class);
                            context.startActivity(intent);
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }
                    });

                    break;
                }
                case 5:{
                    Intent intent=new Intent(context,Airport.class);
                    context.startActivity(intent);
                    break;
                }
                case 6:{
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent intent=new Intent(context,Bank_conversaction.class);
                        context.startActivity(intent);
                    }

                    mInterstitialAd.setAdListener(new AdListener(){
                        @Override
                        public void onAdClosed() {
                            super.onAdClosed();

                            Intent intent=new Intent(context,Bank_conversaction.class);
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

package ss.technology.hindi_dictionary;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Vocabulary extends AppCompatActivity {

    RecyclerView recyclerView;
    Linear_Recycler_view_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

         MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) { }
        });

        adContainerView = findViewById(R.id.ad_view_container);
        // Step 1 - Create an AdView and set the ad unit ID on it.
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-7611672890241421/6213533564");
        adContainerView.addView(adView);
        loadBanner();


        recyclerView=(RecyclerView) findViewById(R.id.recycleview);
        ArrayList<String> title=new ArrayList<>();
        ArrayList<String> details=new ArrayList<>();

        title.add("Disease");
        details.add("Disease names in multiple languages");

        title.add("Animals");
        details.add("Animals names in multiple languages");

        title.add("Birds");
        details.add("Birds names in multiple languages");

        title.add("Body Parts");
        details.add("Body Parts names in multiple languages");

        title.add("Clothing");
        details.add("Clothing names in multiple languages");

        title.add("Colors");
        details.add("Colors names in multiple languages");

        title.add("Common Shapes");
        details.add("Shapes names in multiple languages");

        title.add("Emotion");
        details.add("Emotion names in multiple languages");


        title.add("Family Members");
        details.add("Family names in multiple languages");

        title.add("Food");
        details.add("Food names in multiple languages");

        title.add("Fruit");
        details.add("Fruit names in multiple languages");

        title.add("Dry Fruit");
        details.add("Dry Fruit names in multiple languages");

        title.add("Weather");
        details.add("Weather names in multiple languages");

        title.add("Vegetables");
        details.add("Vegetables names in multiple languages");

        title.add("Vehicles");
        details.add("Vehicles names in multiple languages");

         adapter=new Linear_Recycler_view_Adapter(this,title,details);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

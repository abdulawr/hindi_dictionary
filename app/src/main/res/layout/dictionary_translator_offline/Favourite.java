package ss.technology.hindi_dictionary;

import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Favourite extends AppCompatActivity {

   RecyclerView view;
    fav_Adapter adapter;
    TextView no_data;
    Helper helper;
    ArrayList<words_Container> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);


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

        helper=Helper.getInstance(this);
        helper.open();
        view=(RecyclerView) findViewById(R.id.recycleview);
        no_data=(TextView) findViewById(R.id.no_data);
        list=new ArrayList<>();

        try {
            Cursor cursor = helper.get_Favourite();
            if (cursor != null && cursor.getCount() > 0) {
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        String data = cursor.getString(cursor.getColumnIndex("english"));
                        words_Container c2 = new words_Container();
                        c2.setWord(cursor.getString(cursor.getColumnIndex("english")));
                        c2.setMeaning(cursor.getString(cursor.getColumnIndex("meaning")));
                        list.add(c2);
                        cursor.moveToNext();
                    }
                }
                ShowList();
                cursor.close();
            } else {
                view.setVisibility(View.GONE);
                no_data.setVisibility(View.VISIBLE);
            }
            cursor.close();
        }
        catch (Exception e)
        {
            view.setVisibility(View.GONE);
            no_data.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        getMenuInflater().inflate(R.menu.favourite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        else if (item.getItemId() == R.id.delete)
        {
            try{
                helper.delete_Favourite();
                int size = list.size();
                list.clear();
                adapter.notifyDataSetChanged();
                no_data.setVisibility(View.VISIBLE);
            }
            catch (Exception e)
            {
                Toast.makeText(this, "The Favourite list is clear already.", Toast.LENGTH_SHORT).show();
            }

        }

        return super.onOptionsItemSelected(item);
    }

    void ShowList()
    {
        adapter=new fav_Adapter(this,list);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);
    }

}

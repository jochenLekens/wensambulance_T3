package android.a.ambulancewens.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.a.ambulancewens.R;
import android.a.ambulancewens.adapters.RecyclerViewAdapter;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mDates  = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<String> mLocations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.fillDummyData();
        this.initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mDates, mTimes, mLocations, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public void fillDummyData(){
        mDates.add("19 januari 2020");
        mDates.add("20 januari 2020");
        mDates.add("21 januari 2020");
        mTimes.add("08:00 - 19:00");
        mTimes.add("12:00 - 20:00");
        mTimes.add("09:00 - 12:00");
        mLocations.add("Hasselt - Kempische Steenweg 13");
        mLocations.add("Hasselt - Kerkstraat 3");
        mLocations.add("Leuven - Vrijheidslaan 15");
    }
}

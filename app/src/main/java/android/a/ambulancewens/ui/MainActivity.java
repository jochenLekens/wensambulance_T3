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
    }
}

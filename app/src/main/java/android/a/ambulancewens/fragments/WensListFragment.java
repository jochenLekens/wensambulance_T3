package android.a.ambulancewens.fragments;


import android.a.ambulancewens.adapters.RecyclerViewAdapter;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.a.ambulancewens.R;
import android.widget.Button;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WensListFragment extends Fragment {

    private ArrayList<String> mDates  = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<String> mLocations = new ArrayList<>();
    private RecyclerView recyclerView;

    public WensListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wens_list, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        this.fillDummyData();
        this.initRecyclerView();

        return view;
    }

    private void initRecyclerView() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mDates, mTimes, mLocations, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
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

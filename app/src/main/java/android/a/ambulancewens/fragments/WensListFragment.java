package android.a.ambulancewens.fragments;


import android.a.ambulancewens.adapters.RecyclerViewAdapter;
import android.a.ambulancewens.data.model.Wish;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.a.ambulancewens.R;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

        this.initRecyclerView();
        return view;
    }

    private void initRecyclerView() {
        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        WishRepository repo = new WishRepository(db);

        repo.storeDummyDate();

        ArrayList<Wish> test = repo.retrieve();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), repo.retrieve());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}

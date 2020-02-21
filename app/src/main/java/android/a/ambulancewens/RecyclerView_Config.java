package android.a.ambulancewens;

import android.a.ambulancewens.adapters.RecyclerViewAdapter;
import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView_Config {
    private Context mContext;
    private RecyclerViewAdapter mWensAdapter;
     public  void setConfig(RecyclerView recyclerView, Context context, List<Wens> wensen, List<String> keys){
         mContext=context;
         ArrayList<String> mDates  = new ArrayList<>();
         ArrayList<String> mTimes = new ArrayList<>();
         ArrayList<String> mLocations = new ArrayList<>();

         for (Wens wens : wensen){
             mDates.add(wens.getDate());
             mTimes.add(wens.getTime());
             mLocations.add(wens.getLocation());
         }
         mWensAdapter = new RecyclerViewAdapter(mDates,mTimes,mLocations,mContext);
         recyclerView.setLayoutManager(new LinearLayoutManager(context));
         recyclerView.setAdapter(mWensAdapter);
     }
}

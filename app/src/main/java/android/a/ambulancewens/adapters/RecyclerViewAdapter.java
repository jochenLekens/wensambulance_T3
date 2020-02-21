package android.a.ambulancewens.adapters;

import android.a.ambulancewens.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private static final int REQUEST_CALL = 1;

    private ArrayList<String> mDates  = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<String> mLocations = new ArrayList<>();
    private Context mContext;



    public RecyclerViewAdapter(ArrayList<String> mDates, ArrayList<String> mTimes, ArrayList<String> mLocations, Context mContext) {
        this.mDates = mDates;
        this.mTimes = mTimes;
        this.mLocations = mLocations;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        holder.date.setText(mDates.get(position));
        holder.times.setText(mTimes.get(position));
        holder.locations.setText(mLocations.get(position));
        Log.d(TAG, "onBindViewHolder: " + mDates.get(position));
    }

    public static int getResId(String resName, Class<?> c) {

        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getItemCount() {
        return mTimes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout store_popup;
        TextView date;
        TextView times;
        TextView locations;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.datumTextView);
            times = itemView.findViewById(R.id.OpeningTodayTextview);
            locations = itemView.findViewById(R.id.locationTextView);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }
}

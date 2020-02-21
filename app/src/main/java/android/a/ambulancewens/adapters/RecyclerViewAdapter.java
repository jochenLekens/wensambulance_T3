package android.a.ambulancewens.adapters;

import android.a.ambulancewens.R;
import android.a.ambulancewens.data.model.Wish;
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

    private ArrayList<Wish> wishes;
    private Context context;



    public RecyclerViewAdapter(Context context, ArrayList<Wish> wishes) {
        this.context = context;
        this.wishes = wishes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.date.setText(wishes.get(position).getDatum().toString());
        holder.locations.setText(wishes.get(position).getLocatie());
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
        return wishes.size();
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

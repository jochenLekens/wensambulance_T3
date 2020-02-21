package android.a.ambulancewens;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDBHelper {
    private FirebaseDatabase mDB;
    private DatabaseReference mRef;
    private List<Wens> wensen = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<Wens> wensen, List<String> keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public FirebaseDBHelper() {
        mDB= FirebaseDatabase.getInstance();
        mRef=mDB.getReference("wensen");

    }

    public void readWensen(final DataStatus dataStatus){
        mRef.addValueEventListener((new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                wensen.clear();
                List<String> keys = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    Wens wens = keyNode.getValue(Wens.class);
                    wensen.add(wens);
                }
                dataStatus.DataIsLoaded(wensen,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        }));
    }
}

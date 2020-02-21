package android.a.ambulancewens.fragments;

import android.a.ambulancewens.data.model.Wish;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.Date;

public class WishRepository {
    DatabaseReference db;
    Boolean saved = null;
    ArrayList<Wish> wishes = new ArrayList<>();

    public WishRepository(DatabaseReference db) {
        this.db = db;
    }

    public Boolean save(Wish wish){
        if(wish == null){
            saved = false;
        } else {
            try {
                db.child("Wish").push().setValue(wish);
                saved = true;
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        return saved;
    }

    public ArrayList<Wish> retrieve(){
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return wishes;
    }

    private void fetchData(DataSnapshot dataSnapshot)
    {
        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
            Wish wish = ds.getValue(Wish.class);
            wishes.add(wish);
        }
    }

    public void storeDummyDate(){
        for(int i = 1; i < 10; i++) {
            Date date = new Date();

            Wish wish = new Wish("Wens: " + i, date, "Hasselt");

            db.child("wensen").setValue(wish);
        }
    }
}

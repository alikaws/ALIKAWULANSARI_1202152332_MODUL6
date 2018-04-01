package com.example.alita_pc.alika_1202152332_modul6.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
/**
 * Created by Alita-pc on 4/1/2018.
 */

public class MyPostFragment extends PostListFragment {
    public MyPostFragment() {}



    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}

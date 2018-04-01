package com.example.alita_pc.alika_1202152332_modul6.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
/**
 * Created by Alita-pc on 4/1/2018.
 */

public class MyTopPostFragment extends PostListFragment{
    public MyTopPostFragment() {}



    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // [START my_top_posts_query]

        // My top posts by number of stars

        String myUserId = getUid();

        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)

                .orderByChild("starCount");

        // [END my_top_posts_query]



        return myTopPostsQuery;

    }
}

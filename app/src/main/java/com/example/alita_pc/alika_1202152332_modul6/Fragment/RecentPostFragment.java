package com.example.alita_pc.alika_1202152332_modul6.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
/**
 * Created by Alita-pc on 4/1/2018.
 */

public class RecentPostFragment extends PostListFragment{
    public RecentPostFragment(){}

    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // [START recent_posts_query]

        // Last 100 posts, these are automatically the 100 most recent

        // due to sorting by push() keys

        Query recentPostsQuery = databaseReference.child("posts")

                .limitToFirst(100);

        // [END recent_posts_query]



        return recentPostsQuery;

    }
}

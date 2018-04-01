package com.example.alita_pc.alika_1202152332_modul6.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alita_pc.alika_1202152332_modul6.R;
import com.example.alita_pc.alika_1202152332_modul6.Model.Post;
/**
 * Created by Alita-pc on 4/1/2018.
 */

public class PostViewHolder extends RecyclerView.ViewHolder{
    public TextView titleView;

    public TextView authorView;

    public ImageView starView;

    public TextView numStarsView;

    public TextView bodyView;



    public PostViewHolder(View itemView) {

        super(itemView);



        titleView = itemView.findViewById(R.id.judul_post);

        authorView = itemView.findViewById(R.id.post_author);

        starView = itemView.findViewById(R.id.star);

        numStarsView = itemView.findViewById(R.id.post_starts);

        bodyView = itemView.findViewById(R.id.post_body);

    }



    public void bindToPost(Post post, View.OnClickListener starClickListener) {

        titleView.setText(post.title);

        authorView.setText(post.author);

        numStarsView.setText(String.valueOf(post.starCount));

        bodyView.setText(post.body);



        starView.setOnClickListener(starClickListener);

    }
}

package com.example.alita_pc.alika_1202152332_modul6.Model;

import com.google.firebase.database.IgnoreExtraProperties;
/**
 * Created by Alita-pc on 4/1/2018.
 */

@IgnoreExtraProperties
public class User {
    public String username;

    public String email;



    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }



    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}

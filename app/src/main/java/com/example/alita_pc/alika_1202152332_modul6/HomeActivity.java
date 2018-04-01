package com.example.alita_pc.alika_1202152332_modul6;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.alita_pc.alika_1202152332_modul6.Fragment.MyPostFragment;
import com.example.alita_pc.alika_1202152332_modul6.Fragment.MyTopPostFragment;
import com.example.alita_pc.alika_1202152332_modul6.Fragment.RecentPostFragment;
import com.google.firebase.auth.FirebaseAuth;


public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "Home";

    private FragmentPagerAdapter mPagerAdapter;

    private ViewPager mViewPager;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {

            private final Fragment[] mFragments = new Fragment[] {

                    new RecentPostFragment(),
                    new MyPostFragment(),
                    new MyTopPostFragment(),

            };

            private final String[] mFragmentNames = new String[] {

                    getString(R.string.heading_recent),
                    getString(R.string.heading_my_posts),
                    getString(R.string.heading_my_top_posts)

            };

            @Override

            public Fragment getItem(int position) {

                return mFragments[position];
            }

            @Override
            public int getCount() {
                return mFragments.length;

            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mFragmentNames[position];
            }
        };

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // Button launches NewPostActivity
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, PostFoto.class));

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.logout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, LoginActivity.class));
            finish();

            return true;

        } else {

            return super.onOptionsItemSelected(item);

        }

    }

}
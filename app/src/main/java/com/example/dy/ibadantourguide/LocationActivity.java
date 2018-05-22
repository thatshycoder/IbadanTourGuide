package com.example.dy.ibadantourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_fragment);

        // set up viewpager
        ViewPager viewPager = findViewById(R.id.viewpager);

        // set up category adapter for fragment
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        // get the first fragment to show
        String fragmentToStart = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);

        // add category adapter as viewpager adapter
        viewPager.setAdapter(categoryAdapter);

        // setup tab
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        switch (fragmentToStart) {
            case "food":
                viewPager.setCurrentItem(0);
                break;
            case "hotel":
                viewPager.setCurrentItem(1);
                break;
            case "movies":
                viewPager.setCurrentItem(2);
                break;
            case "mall":
                viewPager.setCurrentItem(3);
                break;
            default:
                viewPager.setCurrentItem(4);
                break;
        }
    }
}

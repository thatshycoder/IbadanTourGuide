package com.example.dy.ibadantourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Category adapter, serves contents to viewpager
 */

public class CategoryAdapter extends FragmentStatePagerAdapter {

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FoodFragment();

            case 1:
                return new HotelFragment();

            case 2:
                return new MoviesFragment();

            case 3:
                return new ShoppingFragment();

            default:
                return new ParkFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Food";
            case 1:
                return "Hotel";
            case 2:
                return "Movies";
            case 3:
                return "Mall";
            default:
                return "Park";
        }
    }
}

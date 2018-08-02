package com.saree3.hajjhackathon.saree3app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 1;

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BarcodeFragment barcodeFragment = new BarcodeFragment();
                return barcodeFragment;
            default:
                return null;
        }

    }
}

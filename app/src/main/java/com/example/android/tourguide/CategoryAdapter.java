package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sivasathivelkandasamy on 2016-10-26.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context tgContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        tgContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new HeritageFragment();
            case 1:
                return new BeachFragment();
            case 2:
                return new WorshipFragment();
            case 3:
                return new ExperienceFragment();
            case 4:
                return new NearByFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Heritage";
            case 1:
                return "Beaches";
            case 2:
                return "Temples";
            case 3:
                return "Experience";
            case 4:
                return "NearBy";
        }
        return null;
    }
}

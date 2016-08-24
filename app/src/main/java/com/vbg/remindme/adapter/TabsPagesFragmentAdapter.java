package com.vbg.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vbg.remindme.fragments.ExampleFragment;

/**
 * Created by bo0mka on 24.08.16.
 */
public class TabsPagesFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagesFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[]{
                "Tab 1",
                "Напоминание",
                "Tab 2"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: ExampleFragment.getInstance();
                break;
            case 1: ExampleFragment.getInstance();
                break;
            case 2: ExampleFragment.getInstance();
                break;
            case 3: ExampleFragment.getInstance();
        }
        return ExampleFragment.getInstance();
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}

package com.vbg.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vbg.remindme.R;
import com.vbg.remindme.dto.RemindDTO;
import com.vbg.remindme.fragments.BirthdayFragment;
import com.vbg.remindme.fragments.HistoryFragment;
import com.vbg.remindme.fragments.IdeasFragment;
import com.vbg.remindme.fragments.ToDoFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bo0mka on 24.08.16.
 */
public class TabsPagesFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, Fragment> tabs = new HashMap<>();
    private Context context;
    private List<RemindDTO> dtoList;
    private  HistoryFragment historyFragment;

    public TabsPagesFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.dtoList = new ArrayList<>();
        this.context = context;
        initTabMap();

    }

    public void setData(List<RemindDTO> list){
        dtoList = list;
        historyFragment.refreshData(list);
    }

    @Override
    public Fragment getItem(int position) {

       return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title;
        switch (position)
        {
            case 0:  title = context.getString(R.string.history);
                break;
            case 1: title = context.getString(R.string.ideas);
                break;
            case 2: title = context.getString(R.string.todo);
                break;
            case 3: title = context.getString(R.string.birthday);
                break;
            default:
                title = "s";
                break;

        }
        return title;
    }

    private void initTabMap() {
        historyFragment = HistoryFragment.newInstance(context, dtoList);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.newInstance());
        tabs.put(2, ToDoFragment.newInstance());
        tabs.put(3, BirthdayFragment.newInstance());
    }
}

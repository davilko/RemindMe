package com.vbg.remindme.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vbg.remindme.R;

/**
 * Created by bo0mka on 26.08.16.
 */
public class BirthdayFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_example, container, false);
    }

    public static BirthdayFragment newInstance() {
        BirthdayFragment myFragment = new BirthdayFragment();
        Bundle args = new Bundle();
        myFragment.setArguments(args);
        return myFragment;
    }
}

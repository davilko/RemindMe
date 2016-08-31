package com.vbg.remindme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vbg.remindme.R;
import com.vbg.remindme.adapter.RemindAdapter;
import com.vbg.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bo0mka on 26.08.16.
 */
public class HistoryFragment extends Fragment {

   private View view;
    private List<RemindDTO> data;
    private Context context;
    private RemindAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_history, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflater.getContext()));
        adapter = new RemindAdapter(data);
        recyclerView.setAdapter(adapter);

        return view;
    }



    public static HistoryFragment newInstance(Context context, List<RemindDTO> list) {
        HistoryFragment myFragment = new HistoryFragment();

        Bundle args = new Bundle();
        myFragment.setArguments(args);
        myFragment.setContext(context);
        myFragment.setData(list);

        return myFragment;
    }

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void refreshData(List<RemindDTO> dtoList){
        adapter.setData(dtoList);
        adapter.notifyDataSetChanged();
    }
}

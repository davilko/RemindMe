package com.vbg.remindme.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vbg.remindme.R;
import com.vbg.remindme.dto.RemindDTO;

import java.util.List;

/**
 * Created by bo0mka on 26.08.16.
 */
public class RemindAdapter extends RecyclerView.Adapter<RemindAdapter.RemindViewHolder> {

    List<RemindDTO> data;

    public RemindAdapter(List<RemindDTO> data) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);
        return  new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {
        holder.title.setText(data.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<RemindDTO> dtoList) {
        data = dtoList;
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView title;

        public RemindViewHolder(View itemView) {
            super(itemView);

           title = (TextView)itemView.findViewById(R.id.title);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }
}

package com.design_thinking.visibility_demo.adapter;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.design_thinking.visibility_demo.adapter.items.Holder;
import com.design_thinking.visibility_demo.adapter.items.VisibilityItem;

import java.util.List;
import com.design_thinking.salubrious.R;

/**
 * Created by danylo.volokh on 06.01.2016.
 */

public class VisibilityUtilsAdapter extends RecyclerView.Adapter<Holder> {

    private final List<VisibilityItem> mList;

    public VisibilityUtilsAdapter(List<VisibilityItem> list) {
        mList = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.visibility_adapter_item, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = view.getResources().getDisplayMetrics().widthPixels;
        return new Holder(view);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        VisibilityItem item = mList.get(position);
        item.onBindViewHolder(holder, position);
    }

}

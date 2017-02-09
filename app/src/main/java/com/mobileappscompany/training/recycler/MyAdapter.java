package com.mobileappscompany.training.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ferna on 2/9/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyVH> {
    private String[] mData;

    public class MyVH extends RecyclerView.ViewHolder{
        public TextView mTV;

        public MyVH(View itemView) {
            super(itemView);
            mTV = (TextView) itemView.findViewById(R.id.textView);
        }
    }

    public MyAdapter(String[] mData) {
        this.mData = mData;
    }

    @Override
    public MyVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new MyVH(v);
    }

    @Override
    public void onBindViewHolder(MyVH holder, int position) {
        holder.mTV.setText(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

}

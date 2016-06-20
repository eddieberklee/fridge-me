package com.compscieddy.fridgeme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lollo on 2016/6/19.
 */

public class RecipesListAdapter extends RecyclerView.Adapter<RecipesListAdapter.ViewHolder> {
    public RecipesListAdapter() {
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recipes_list_item,viewGroup,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
//        viewHolder.mTextView.setText(datas[position]);
    }
    @Override
    public int getItemCount() {
        return 6;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view){
            super(view);
        }
    }
}

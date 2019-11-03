package com.mainor.fibonacciinclass;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class FibonacciAdapter extends RecyclerView.Adapter<FibonacciAdapter.FibonacciViewHolder>{

    ArrayList<Long> list ;

    private LayoutInflater mInflater;

@NonNull
    @Override
    public FibonacciViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View mItemView = mInflater.inflate(R.layout.fibonaccilist_item, parent, false);
    return new FibonacciViewHolder(mItemView, this);
}


    @Override
    public void onBindViewHolder(@NonNull FibonacciViewHolder holder, int position) {
    list.size();


        Long mCurrent = list.get(position);
        if (mCurrent % 2 == 0){
            holder.wordItemView.setBackgroundColor(Color.WHITE);
            holder.wordItemView.setText( (position+1) + ". " +String.valueOf(mCurrent));
        } else {
            holder.wordItemView.setBackgroundColor(Color.GRAY);
            holder.wordItemView.setText( (position+1) + ". " +String.valueOf(mCurrent));
        }




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class FibonacciViewHolder extends RecyclerView.ViewHolder{
         TextView wordItemView;
         FibonacciAdapter mAdapter;
        public FibonacciViewHolder(@NonNull View itemView, FibonacciAdapter adapter) {
            super(itemView);
            wordItemView = (TextView) itemView.findViewById(R.id.word);
            this.mAdapter = adapter;


        }
    }
    public FibonacciAdapter(Context context, ArrayList<Long> wordList) {
        mInflater = LayoutInflater.from(context);
        this.list = wordList;
    }


}

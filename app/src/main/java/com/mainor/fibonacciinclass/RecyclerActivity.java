package com.mainor.fibonacciinclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mainor.fibonacciinclass.FibonacciGenerator;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private FibonacciAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();
        int input = bundle.getInt("Input");


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mAdapter = new FibonacciAdapter(this, FibonacciGenerator.getFibonacciNums(input) );
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }


}

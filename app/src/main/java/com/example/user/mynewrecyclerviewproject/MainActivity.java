package com.example.user.mynewrecyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started."); //to know that everything started okay.

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg"); //change it to firebase link.
        // if image in drawable >> ImageView.setImageDrawable(getResources().getDrawable(R.drawable.*whatever your file name is));﻿
        mNames.add("Nature and stuff #1");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg"); //change it to firebase link.
        mNames.add("Nature and stuff #2");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg"); //change it to firebase link.
        mNames.add("Nature and stuff #3");

        //call recyclerview method
        initRecyclerView();

    }

    //create a method for setting up our recycler view
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        //create our widget
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //create our recyclerview adapter object
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);

        //set the adapter to the recyclerview
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}

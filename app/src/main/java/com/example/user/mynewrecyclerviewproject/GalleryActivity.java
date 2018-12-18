package com.example.user.mynewrecyclerviewproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by USER on 9/9/2018.
 */

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started."); //activity started.

    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intent");

        //always check if the intent has any extras before you actually try to get the extras.
        // Otherwise, your app will crash if you try to get the extras.
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url"); //putting it inside if statement >> prevents it from crashing
            String imageNames = getIntent().getStringExtra("image_name");


        }
    }

    private void setImage(String imageUrl, String imageNames){
        Log.d(TAG, "setImage: setting image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageNames);

    }
}

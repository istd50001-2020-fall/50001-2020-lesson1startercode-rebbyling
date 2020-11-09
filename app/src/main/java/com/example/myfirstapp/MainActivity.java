package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //TODO 1.2 Instance variables are declared for you, please import the libraries
    ArrayList<Integer> images;
    Button charaButton, snorlax;
    ImageView charaImage;
    int count = 0;
    Random r = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1.3 Instantiate An ArrayList object
        images = new ArrayList<Integer>();
        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.nemo);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.snorlax);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.yoda);
        //TODO 1.5 Get references to the charaButton and charaImage widgets using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);
        //TODO 1.6 For charaButton, invoke the setOnClickListener method
        //TODO 1.7 Create an anonymous class which implements View.OnClickListener interface
        //TODO 1.8 Within onClick, write code to randomly select an image ID from the ArrayList and display it in the ImageView
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = r.nextInt(10); //getting a random integer
                int id = images.get(i); //must get the resource id from the arraylist images
                charaImage.setImageResource(id);
            }
        });
        //TODO 1.9 [On your own] Create another button, which when clicked, will cause one image to always be displayed
        snorlax = findViewById(R.id.snorlaxbutton);

        snorlax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = images.get(7);
                charaImage.setImageResource(id);
            }
        });

    }
}

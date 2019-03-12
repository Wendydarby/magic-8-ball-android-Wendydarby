package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


   // ImageView ballDisplay = findViewById(R.id.image_eightBall);


  final int ballArray[] = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.askButton);

         myButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 askBall();
             }
         });


        }


    private void  askBall() {
        Random random;

        random = new Random();
        int number = random.nextInt(5);
        Log.d("MagicEight"," number is "+number);
        final  ImageView ballDisplay = findViewById(R.id.image_eightBall);
        ballDisplay.setImageResource(ballArray[number]);

    }

}

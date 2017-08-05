package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballImage = (ImageView) findViewById(R.id.image_ball);
        final Button button = (Button) findViewById(R.id.button_roll);
        final Random randGen = new Random();
        final int[] balls = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand = randGen.nextInt(5);
                ballImage.setImageResource(balls[rand]);
            }
        });
    }
}

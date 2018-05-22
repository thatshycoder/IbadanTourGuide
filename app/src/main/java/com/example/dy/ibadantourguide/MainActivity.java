package com.example.dy.ibadantourguide;

import android.content.Intent;;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Ibadan Tour Guide app
 * @author shycoder
 * @author uri https://shycoder.com
 */

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this, LocationActivity.class);

        LinearLayout food = findViewById(R.id.food);
        LinearLayout hotel = findViewById(R.id.hotel);
        LinearLayout movies = findViewById(R.id.movies);
        LinearLayout mall = findViewById(R.id.mall);
        TableRow park = findViewById(R.id.park);

        // get the location activity and display food fragment first
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(EXTRA_MESSAGE, "food");
                startActivity(intent);
            }
        });

        // get the location activity and display hotel fragment first
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(EXTRA_MESSAGE, "hotel");
                startActivity(intent);
            }
        });

        // get the location activity and display movies fragment first
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(EXTRA_MESSAGE, "movies");
                startActivity(intent);
            }
        });

        // get the location activity and display mall fragment first
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(EXTRA_MESSAGE, "mall");
                startActivity(intent);
            }
        });

        // get the location activity and display park fragment first
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(EXTRA_MESSAGE, "park");
                startActivity(intent);
            }
        });


    }
}

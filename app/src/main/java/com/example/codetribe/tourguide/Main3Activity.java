package com.example.codetribe.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent =getIntent();
        Tour tour=(Tour) intent.getSerializableExtra("name");
        TextView tv4,tv6;
        tv4= (TextView) findViewById(R.id.textView4);
        tv6= (TextView) findViewById(R.id.textView6);

        ImageView imageView;
        imageView= (ImageView) findViewById(R.id.imageView2);
      //  tv4.setText(tour.getName());
        tv6.setText(tour.getDescription());
      //  imageView.setImageResource(tour.getImage());


    }
}

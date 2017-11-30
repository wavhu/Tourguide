package com.example.codetribe.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    public ContentAdapter contentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=(RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Tour> tourList=new ArrayList<>();

        Tour tour =new Tour();
        tour.setName("kueger");
        tour.setDescription("Game Resort");
        tour.setImage(R.drawable.giraffe);
        tourList.add(tour);

        Tour tour2 =new Tour();
        tour2.setName("acccoo");
        tour2.setDescription("ACCOMODATION");
        tour2.setImage(R.drawable.treehouse);
        tourList.add(tour2);

        Tour tour3 =new Tour();
        tour3.setName("gffggh");
        tour3.setDescription("DIRECTION");
        tour3.setImage(R.drawable.treehouse);
        tourList.add(tour3);

        contentAdapter=new ContentAdapter(this,tourList);
        recyclerView.setAdapter(contentAdapter);
    }
}

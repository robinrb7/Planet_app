package com.example.mainplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<Planet> planetArrayList;
private  customAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        planetArrayList = new ArrayList<>();

        Planet planet1 = new Planet("Mercury","0",R.drawable.mercury);
        Planet planet2 = new Planet("Venus","0",R.drawable.img);
        Planet planet3 = new Planet("Earth","1",R.drawable.img_1);
        Planet planet4 = new Planet("Mars","2",R.drawable.img_2);
        Planet planet5 = new Planet("Jupiter","95",R.drawable.img_3);
        Planet planet6 = new Planet("Saturn","146",R.drawable.img_4);
        Planet planet7 = new Planet("Uranus","28",R.drawable.img_5);
        Planet planet8 = new Planet("Neptune","16",R.drawable.img_6);

        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);

        adapter = new customAdapter(planetArrayList,MainActivity.this);
        listView.setAdapter(adapter);

    }
}
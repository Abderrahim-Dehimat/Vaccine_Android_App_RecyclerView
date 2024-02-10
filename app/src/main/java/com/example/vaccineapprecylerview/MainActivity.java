package com.example.vaccineapprecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<VaccineModelClass> data;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        data = new ArrayList<>();
        data.add(new VaccineModelClass(R.drawable.vaccine1, "Hipatitis B vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine4, "Tetanus vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine5, "Pneumococcal vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine6, "Rotavirus vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine7, "Measles vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine8, "Cholera vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine9, "Covid-19 vaccine"));
        data.add(new VaccineModelClass(R.drawable.vaccine1, "Test"));
        data.add(new VaccineModelClass(R.drawable.vaccine1, "Test"));
        data.add(new VaccineModelClass(R.drawable.vaccine1, "Test"));

        adapter = new CustomAdapter(data);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

    }
}
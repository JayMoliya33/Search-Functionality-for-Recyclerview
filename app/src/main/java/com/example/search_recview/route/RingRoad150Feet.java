package com.example.search_recview.route;

import android.os.Bundle;

import com.example.search_recview.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RingRoad150Feet extends AppCompatActivity {

    public RecyclerView recyclerView;
    public MyAdapters adapter;
    public List<MyModel> modelitems = new ArrayList<>();

    Toolbar toolbar;
    SearchView searchview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ringroad_150feet);

            toolbar = findViewById(R.id.toolbar150feet);
            toolbar.setTitle("150 Feet Ring Road Crossing");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); //backbutton

            recyclerView = (RecyclerView) findViewById(R.id.recyclerview150feet);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            MyModel model = new MyModel("46","Saurashtra University to Ratanpar Village");
            modelitems.add(model);

            model = new MyModel("46","Ratanpar Village to Saurashtra University");
            modelitems.add(model);

            adapter = new MyAdapters(this,modelitems);
            recyclerView.setAdapter(adapter);

        }
}

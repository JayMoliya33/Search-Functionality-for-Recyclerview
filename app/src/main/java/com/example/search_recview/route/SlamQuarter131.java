package com.example.search_recview.route;

import android.os.Bundle;

import com.example.search_recview.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SlamQuarter131 extends AppCompatActivity {

    public RecyclerView recyclerView;
    public MyAdapters adapter;
    public List<MyModel> modelitems = new ArrayList<>();

    Toolbar toolbar;
    SearchView searchview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slam_quarter_131);

        toolbar = findViewById(R.id.toolbar131);
        toolbar.setTitle("Slam Quarter 131");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //backbutton

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview131);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
      //  recyclerView.setItemAnimator(new DefaultItemAnimator());


        MyModel model = new MyModel("19","131 Slam Quarter to Vavdi Gam");
        modelitems.add(model);

        model = new MyModel("19","Vavdi Gam to 131 Slam Quarter");
        modelitems.add(model);

        adapter = new MyAdapters(this,modelitems);
        recyclerView.setAdapter(adapter);

    }




}

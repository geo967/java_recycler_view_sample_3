package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<Names> list=new ArrayList<>();
    NewAdapter newAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new Names("item1"));
        list.add(new Names("item2"));
        list.add(new Names("item3"));
        list.add(new Names("item4"));
        list.add(new Names("item5"));
        list.add(new Names("item6"));
        list.add(new Names("item7"));
        list.add(new Names("item8"));
        list.add(new Names("item9"));
        list.add(new Names("item10"));
        list.add(new Names("item11"));
        list.add(new Names("item12"));
        list.add(new Names("item13"));
        list.add(new Names("item14"));
        list.add(new Names("item15"));
        list.add(new Names("item16"));
        list.add(new Names("item17"));
        list.add(new Names("item18"));
        list.add(new Names("item19"));
        list.add(new Names("item20"));
        list.add(new Names("item21"));

        recycler=findViewById(R.id.new_recycler);
        newAdapter=new NewAdapter(list);

        recycler.setHasFixedSize(true);

        //GridLayoutManager layoutManager=new GridLayoutManager(this,2);
         LinearLayoutManager layoutManager=new LinearLayoutManager(this);
      //  layoutManager.setOrientation(RecyclerView.VERTICAL);
       // StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(layoutManager);

        recycler.setAdapter(newAdapter);


    }
}
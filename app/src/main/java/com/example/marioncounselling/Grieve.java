package com.example.marioncounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Grieve extends AppCompatActivity {

    private List<General> generalList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GeneralAdapter generalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grieve);

        recyclerView = findViewById(R.id.recycler_view1);

        generalAdapter= new GeneralAdapter(generalList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(generalAdapter);

        prepareQuoteData();


    }

    private void prepareQuoteData(){
        General general = new General("1. Your grief path is yours alone, and no one else can walk it, and no one else can understand it.");
        generalList.add(general);

        general = new General("2. There is a sacredness in tears. They are not the mark of weakness, but of power. They speak more eloquently than ten thousand tongues. They are the messengers of overwhelming grief, of deep contrition, and of unspeakable love.");
        generalList.add(general);

        general = new General("3. Friendship improves happiness and abates misery, by the doubling of our joy and the dividing of our grief.");
        generalList.add(general);

        general = new General("4. Grief can take care if itself, but to get the full value of a joy you must have somebody to divide it with.\n" +
                "I learned that, with grief, you have to take it one day at a time and learn how to find the happiness amid the heartbreak");
        generalList.add(general);

        general = new General("5. Grief changes shape, but it never ends");
        generalList.add(general);

        general = new General("6. People in grief need someone to walk with them without judging them.");
        generalList.add(general);


    }



}

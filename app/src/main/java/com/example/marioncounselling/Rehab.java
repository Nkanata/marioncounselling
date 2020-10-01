package com.example.marioncounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Rehab extends AppCompatActivity {

    private List<General> generalList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GeneralAdapter generalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehab);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        generalAdapter= new GeneralAdapter(generalList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(generalAdapter);

        prepareQuoteData();

    }
    public void prepareQuoteData(){

        General general = new General("1. Money doesn't mind if we say it's evil, it goes from strength to strength. It's a fiction, an addiction, and a tacit conspiracy. Martin Amis");
        generalList.add(general);

        general = new General("2. Smile in the mirror. Do that every morning and you'll start to see a big difference in your life.");
        generalList.add(general);

        general = new General("3. Just living is not enough... one must have sunshine, freedom, and a little flower");
        generalList.add(general);

        general = new General("4. What you feel inside reflects on your face. So be happy and positive all the time");
        generalList.add(general);

        general = new General("5. No one is immune from addiction; it afflicts people of all ages, races, classes, and professions.");
        generalList.add(general);
    }
}

package com.example.marioncounselling;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class General12 extends AppCompatActivity {

    private List<General> generalList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GeneralAdapter generalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general12);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        generalAdapter= new GeneralAdapter(generalList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(generalAdapter);

        prepareQuoteData();

    }
    private void prepareQuoteData(){
        General general = new General("Because of your smile, you make life more beautiful");
        generalList.add(general);

        general = new General("Lighten up, just enjoy life, smile more, laugh more, and don't get so worked up about things.");
        generalList.add(general);

        general = new General("3.Live life to the fullest, and focus on the positive");
        generalList.add(general);

         general = new General("4.Only I can change my life. No one can do it for me.");
        generalList.add(general);

        general = new General("5.Happiness is a choice. You can choose to be happy. There's going to be stress in life, but it's your choice whether you let it affect you or not.");
        generalList.add(general);

        general = new General("6.Remember your dreams and fight for them. You must know what you want from life. There is just one thing that makes your dream become impossible: the fear of failure.");
        generalList.add(general);

        general = new General("7.Education is the key to success in life, and teachers make a lasting impact in the lives of their students.");
        generalList.add(general);

        general= new General("Each life is made up of mistakes and learning, waiting and growing, practicing patience and being persistent.");
        generalList.add(general);

        general = new General("Loneliness is my least favorite thing about life. The thing that I'm most worried about is just " +
                "being alone without anybody to care for or someone who will care for me.");
        generalList.add(general);

        general = new General("10.Smiling is definitely one of the best beauty remedies. If you have a good sense of humour and a good approach to life, that's beautiful.");
        generalList.add(general);

        general = new General("11: Everyone has a purpose in life and a unique talent to give to others. And when we blend this unique talent with service to others, we experience the ecstasy and exultation of own spirit, which is the ultimate goal of all goals");
        generalList.add(general);

        general = new General("12: Life is a journey that must be travelled no matter how bad the roads and accommodation");
        generalList.add(general);

        general = new General("13.Life is tough, and things don't always work out well, but we should be brave and go on with our live.");
        generalList.add(general);

        general = new General("Many of life's failures are people who did not realize how close they were to success when they gave u");
        generalList.add(general);

        general = new General("15.Life is basically a sum of all the choices you make. The better your choices, the better opportunity to lead a happy life. ");
        generalList.add(general);


        generalAdapter.notifyDataSetChanged();




    }

}

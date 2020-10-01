package com.example.marioncounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Family extends AppCompatActivity {

    private List<General> generalList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GeneralAdapter generalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        generalAdapter= new GeneralAdapter(generalList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(generalAdapter);

        prepareQuoteData();

    }

    public void prepareQuoteData(){
        General general = new General("1. Peace is the beauty of life. It is sunshine. It is the smile of a child, the love of a mother, the joy of a father, the togetherness of a family. It is the advancement of man, the victory of a just cause, the triumph of truth");
        generalList.add(general);

        general = new General("2. Knowledge is power. Information is liberating. Education is the premise of progress, in every society, in every family.");
        generalList.add(general);

        general = new General("3. The memories we make with our family are everything.");
        generalList.add(general);

        general = new General("4. Family is a unique gift that needs to be appreciated and treasured, even when they're driving you crazy. As much as they make you mad, interrupt you, annoy you, curse at you, try to control you, these are the people who know you the best and who love you");
        generalList.add(general);

        general = new General("5. The bond that links your true family is not one of blood, but of respect and joy in each other's life.");
        generalList.add(general);

        general = new General("6. A real man loves his wife, and places his family as the most important thing in life. Nothing has brought me more peace and content in life than simply being a good husband and father.");
        generalList.add(general);

        general = new General("7. Don't worry about the pressure or the responsibility. Just live in it, have fun, and when everything seems to be going right, just stay humble and remember your family.");
        generalList.add(general);

        general = new General("8. Nothing is better than going home to family and eating good food and relaxing.");
        generalList.add(general);

        general = new General("9. I walk in a space of gratitude. I'm so grateful to God for blessing me with an amazing family and the opportunity to do what I love.");
        generalList.add(general);

        general = new General("10. You need a strong family because at the end, they will love you and support you unconditionally.");
        generalList.add(general);
    }
}

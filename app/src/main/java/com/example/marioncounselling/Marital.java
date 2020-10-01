package com.example.marioncounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Marital extends AppCompatActivity {

    private List<General> generalList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GeneralAdapter generalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marital);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        generalAdapter= new GeneralAdapter(generalList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(generalAdapter);

        prepareQuoteData();
    }

    public void prepareQuoteData(){
        General general = new General("1. Happy is the man who finds a true friend, and far happier is he who finds that true friend in his wife");
        generalList.add(general);

        general = new General("2. The secret of a happy marriage is finding the right person. You know they're right if you love to be with them all the time.");
        generalList.add(general);

        general = new General("3. My most brilliant achievement was my ability to be able to persuade my wife to marry me.");
        generalList.add(general);

        general = new General("4. Marriage is a commitment for life. It is a permanent, lifelong relationship");
        generalList.add(general);

        general = new General("5. By all means, marry. If you get a good wife, you'll become happy; if you get a bad one, you'll become a philosopher.");
        generalList.add(general);

        general = new General("6. In a happy marriage it is the wife who provides the climate, the husband the landscape");
        generalList.add(general);

        general = new General("7. A marriage doesn't have to be perfect, but you can be perfect for each other.");
        generalList.add(general);

        general = new General("8. No man succeeds without a good woman behind him. Wife or mother, if it is both, he is twice blessed indeed.");
        generalList.add(general);
    }
}

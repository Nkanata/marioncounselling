package com.example.guidanceandcounselling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView welcomeText = findViewById(R.id.welcomeText);
        String text = new StringBuilder().append("Welcome to Guidance and Cousellling \n").append("click 'next' to continue ").toString();
        welcomeText.setText(text);


        Button nextbtn = (Button) findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextpage = new Intent(getApplicationContext(), LoginPage.class);
                startActivity(nextpage);
            }
        });
    }
}

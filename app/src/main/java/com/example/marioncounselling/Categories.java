package com.example.marioncounselling;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class Categories extends AppCompatActivity {
    public static final String GOOGLE_ACCOUNT = "google_account";

    private TextView profileName, profileEmail;
    public GoogleSignInClient googleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        profileName = findViewById(R.id.profile_text);
        profileEmail = findViewById(R.id.profile_email);
        setDataOnView();


        RadioButton teenbtn = findViewById(R.id.genbtn);
        teenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), General12.class);
                startActivity(nextPage);
            }
        });

        RadioButton familybtn = findViewById(R.id.familybtn);
        familybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Family.class);
                startActivity(nextPage);
            }
        });
        RadioButton rehabbtn = findViewById(R.id.rehabbtn);
        rehabbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Rehab.class);
                startActivity(nextPage);
            }
        });
        RadioButton grievebtn = findViewById(R.id.grievebtn);
        grievebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Grieve.class);
                startActivity(nextPage);
            }
        });
        RadioButton maritalbtn = findViewById(R.id.maritalbtn);
        maritalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Marital.class);
                startActivity(nextPage);
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextpage = new Intent(getApplicationContext(), Subscription.class);
                startActivity(nextpage);
            }
        });
    }

    private void setDataOnView() {
        GoogleSignInAccount googleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
        profileName.setText(googleSignInAccount.getDisplayName());
        profileEmail.setText(googleSignInAccount.getEmail());
    }

}

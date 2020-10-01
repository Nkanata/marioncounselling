package com.example.marioncounselling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Feedback extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        TextView preview = findViewById(R.id.preview);
        final TextView display = findViewById(R.id.display);
        final EditText comments = findViewById(R.id.comments);




        String text = "Your Feedback is highly Valued.\n Comment Below.";
        preview.setText(text);



        Button send = findViewById(R.id.sendbtn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = comments.getText().toString();
                display.setText(value);

                Toast.makeText(Feedback.this,"Comments Sent",Toast.LENGTH_LONG).show();
            }
        });


    }

}

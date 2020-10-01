package com.example.marioncounselling;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Subscription extends AppCompatActivity {
    static final int REQUEST_VIDEO_CAPTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
        final String phone = "254723811830";



        String text = "Welcome to Our Subscription Page.\n"+"Use lipa na M-pesa Paybill Number xxx xxx, and your account number is your email \n Your Subscription Will give you access to our Counsellors " +
                "Everyday and they help you fully and give you courage and momentum you need to go through the day, through a call, video call or Chats.";



        TextView subscriptiontext = findViewById(R.id.subscriptiontext);
        subscriptiontext.setText(text);

        FloatingActionButton call = findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: +"+ phone));
                startActivity(intent);


            }





        });


        FloatingActionButton chat = findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smsNumber = phone + "@s.whatsapp.net";
                Uri uri = Uri.parse("smsto:" + smsNumber);
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.putExtra("jid", smsNumber);
                i.setPackage("com.whatsapp");
                startActivity(i);


            }
        });

        FloatingActionButton videocall = findViewById(R.id.videocall);
        videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dispatchTakeVideoIntent();

                Context context = getApplicationContext();
                CharSequence text = "Connecting To Our Servers........";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();



            }
        });


       /* Button schedule = findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getSupportFragmentManager(), "timePicker");

            }
        });*/


       Button feedback =findViewById(R.id.feedback);
       feedback.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent nextpage = new  Intent(getApplicationContext(), Feedback.class);
               startActivity(nextpage);
           }
       });







    }
    private void dispatchTakeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }
}





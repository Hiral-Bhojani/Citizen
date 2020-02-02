package com.example.citizen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button=findViewById(R.id.Appointment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(),Appointment.class);
                startActivity(activity2Intent);
            }
        });

        button=findViewById(R.id.Complaint);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), File_complaint.class);
                startActivity(activity2Intent);
            }
        });

        button=findViewById(R.id.Recruit_form);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Recruitment_Form.class);
                startActivity(activity2Intent);
            }
        });

        button=findViewById(R.id.R_NOC);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(),Request_NOC.class);
                startActivity(activity2Intent);
            }
        });

        button=findViewById(R.id.Req_resourceallocate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(),Request_resource_allocate.class);
                startActivity(activity2Intent);
            }
        });

        button=findViewById(R.id.Track_complain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(),Track_complaint.class);
                startActivity(activity2Intent);
            }
        });
    }
}
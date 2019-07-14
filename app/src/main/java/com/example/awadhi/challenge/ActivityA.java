package com.example.awadhi.challenge;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {
    Button button,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        button=findViewById(R.id.about);
        profile=findViewById(R.id.profile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alc=new Intent(getApplicationContext(),about.class);
                startActivity(alc);
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile=new Intent(getApplicationContext(),profile.class);
                startActivity(profile);
            }
        });

    }
}

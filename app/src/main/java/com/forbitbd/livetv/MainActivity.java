package com.forbitbd.livetv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnlive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlive = findViewById(R.id.live);
        btnlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RTMPPlayerActivity.class);
                intent.putExtra("VIDEO_URL", "rtmp://forbit.tech/live/sohel2178");
                startActivity(intent);
            }
        });
    }
}
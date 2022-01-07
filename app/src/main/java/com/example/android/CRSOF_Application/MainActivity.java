package com.example.android.CRSOF_Application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button enc,dec,use;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        enc = findViewById(R.id.encd);
        dec = findViewById(R.id.decd);
        use = findViewById(R.id.use);
        enc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent temp = new Intent(MainActivity.this,Encoder.class);
                temp.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(temp);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temp = new Intent(MainActivity.this,Decoder.class);
                startActivity(temp);
            }
        });
        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temp = new Intent(MainActivity.this,usebutton.class);
                startActivity(temp);
            }
        });


    }


}

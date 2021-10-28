package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        ImageButton btbk3 = findViewById(R.id.btbk3);

        btbk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl3 = new Intent(getBaseContext(), Tela3.class);

                startActivity(tl3);
            }
        });

        Button btn_cm = findViewById(R.id.btn_cm);

        btn_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl6 = new Intent(getBaseContext(), Tela6.class);

                startActivity(tl6);
            }
        });
    }
}
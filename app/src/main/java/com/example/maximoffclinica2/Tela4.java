package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        ImageButton btbk2 = findViewById(R.id.btbk3);

        btbk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl2 = new Intent(getBaseContext(), Tela2.class);

                startActivity(tl2);
            }
        });

        Button btn_7 = findViewById(R.id.btn_7);

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl6 = new Intent(getBaseContext(), Tela6.class);

                startActivity(tl6);
            }
        });
    }
}
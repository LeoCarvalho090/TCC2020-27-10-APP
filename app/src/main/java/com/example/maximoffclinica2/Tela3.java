package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_tela3);
        Button bt6 = findViewById(R.id.btn_6);
        Button btbk2 = findViewById(R.id.btn_4);

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl5 = new Intent(getBaseContext(), Tela5.class);

                startActivity(tl5);

            }
        });

        ImageButton btbk = findViewById(R.id.btbk);

        btbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tli = new Intent(getBaseContext(), MainActivity.class);

                startActivity(tli);

            }
        });

        Button btn_5 = findViewById(R.id.btn_5);

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl6 = new Intent(getBaseContext(), Tela6.class);

                startActivity(tl6);
            }
        });
    }
}
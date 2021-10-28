package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Button bt4 = findViewById(R.id.btn_4);

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl4 = new Intent(getBaseContext(), Tela4.class);

                startActivity(tl4);
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

        Button btn_3 = findViewById(R.id.btn_3);

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl6 = new Intent(getBaseContext(), Tela6.class);

                startActivity(tl6);
            }
        });
    }
}

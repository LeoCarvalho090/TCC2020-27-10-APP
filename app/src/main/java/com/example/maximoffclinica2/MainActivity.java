package com.example.maximoffclinica2;

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
        Button bt1 = findViewById(R.id.btn_1);
        Button bt2 = findViewById(R.id.btn_2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl1 = new Intent(getBaseContext(), Tela2.class);

                startActivity(tl1);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl2 = new Intent(getBaseContext(), Tela3.class);

                startActivity(tl2);
            }
        });
    }
}
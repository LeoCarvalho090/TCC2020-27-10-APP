package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.maximoffclinica2.ui.home.HomeViewModel;

public class Tela6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        Button btnlgn = findViewById(R.id.btnlgn);

        btnlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl7 = new Intent(getBaseContext(), Tela7.class);

                startActivity(tl7);
            }
        });
    }
}




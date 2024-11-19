package com.example.studyplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);


        final Button suba = findViewById(R.id.sub);
        final Button subbb = findViewById(R.id.subb);
        final Button subcc = findViewById(R.id.subc);
        final Button subdd = findViewById(R.id.subd);
        final Button subee = findViewById(R.id.sube);


        suba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sub.this, SubCn.class);

                startActivity(intent);

            }
        });
        subbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sub.this, subSe.class);

                startActivity(intent);

            }
        });
        subcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sub.this, subdwm.class);

                startActivity(intent);

            }
        });
        subdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sub.this, subip.class);

                startActivity(intent);

            }
        });
        subee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sub.this, subtcs.class);

                startActivity(intent);

            }
        });


    }
}
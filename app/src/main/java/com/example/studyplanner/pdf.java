package com.example.studyplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pdf);
        Button button = findViewById(R.id.viewPDF);
        Button btnpdfa = findViewById(R.id.btnpdfa);
        Button btnpdfb = findViewById(R.id.btnpdfb);
        Button btnpdfc = findViewById(R.id.btnpdfc);
        Button btnpdfd = findViewById(R.id.btnpdfd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cnnotes.class);
                intent.putExtra("cnpdf","https://file-examples.com/storage/fee7a7e285671bd4a9d4d9d/2017/10/file-sample_150kB.pdf");
                startActivity(intent);
            }
        });
        btnpdfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), dwmnotes.class);
                intent.putExtra("dwmpdf","https://file-examples.com/storage/fee7a7e285671bd4a9d4d9d/2017/10/file-sample_150kB.pdf");
                startActivity(intent);
            }
        });
        btnpdfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cnnotes.class);
                intent.putExtra("cnpdf","https://file-examples.com/storage/fee7a7e285671bd4a9d4d9d/2017/10/file-example_PDF_500_kB.pdf");
                startActivity(intent);
            }
        });
        btnpdfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cnnotes.class);
                intent.putExtra("cnpdf","https://file-examples.com/storage/fee7a7e285671bd4a9d4d9d/2017/10/file-sample_150kB.pdf");
                startActivity(intent);
            }
        });
        btnpdfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cnnotes.class);
                intent.putExtra("cnpdf","https://file-examples.com/storage/fee7a7e285671bd4a9d4d9d/2017/10/file-sample_150kB.pdf");
                startActivity(intent);
            }
        });
    }
}
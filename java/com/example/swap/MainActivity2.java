package com.example.swap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView res;
    String fst,scd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        fst = intent.getStringExtra("firstword");
        scd = intent.getStringExtra("secondword");
        res = findViewById(R.id.Result);
        if (scd.equals(fst)) {
            res.setText("THE SAME");
        } else {
            res.setText("NOT THE SAME");
        }
    }
}
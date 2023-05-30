package com.example.swap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button swap,check;
    EditText first,second;
    String fst,scd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swap = findViewById(R.id.btnSwap);
        check = findViewById(R.id.btnCheck);
        first = findViewById(R.id.First);
        second = findViewById(R.id.Second);

        swap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                swapper();
            }
        });
        check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checker();
            }
        });
    }
    public void swapper(){
        fst = first.getText().toString();
        scd = second.getText().toString();

        first.setText(scd);
        second.setText(fst);
    }
    public void checker(){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("firstword",first.getText().toString());
        intent.putExtra("secondword",second.getText().toString());
        startActivity(intent);
}
}
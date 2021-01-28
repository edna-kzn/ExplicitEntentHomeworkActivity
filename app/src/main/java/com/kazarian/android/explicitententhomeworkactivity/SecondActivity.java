package com.kazarian.android.explicitententhomeworkactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView name = findViewById(R.id.txtName);
        TextView family = findViewById(R.id.txtFamily);
        TextView age = findViewById(R.id.txtAge);
        Button btnedit = findViewById(R.id.btnEdit);
        Button btnsave = findViewById(R.id.btnSave);

        Intent intent1to2_destination = getIntent();
        String nameshow = intent1to2_destination.getStringExtra("name");
        String familyshow = intent1to2_destination.getStringExtra("family");
        String ageshow = intent1to2_destination.getStringExtra("age");


        name.setText(nameshow);
        family.setText(familyshow);
        age.setText(ageshow);

        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameback = name.getText().toString();
                String familyback = family.getText().toString();
                String ageback = age.getText().toString();

                Intent intent2to1_origin = new Intent();
                intent2to1_origin.putExtra("name", nameback);
                intent2to1_origin.putExtra("family", familyback);
                intent2to1_origin.putExtra("age", ageback);
                setResult(Activity.RESULT_OK, intent2to1_origin);

                finish();


            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameforsave = name.getText().toString();
                String familyforsave = family.getText().toString();
                String ageforsave = age.getText().toString();

                getSharedPreferences("moshakhasat", Context.MODE_PRIVATE).edit().putString("name", nameforsave);
                getSharedPreferences("moshakhasat", Context.MODE_PRIVATE).edit().putString("famili", familyforsave);
                getSharedPreferences("moshakhasat", Context.MODE_PRIVATE).edit().putString("age", ageforsave);

                Toast.makeText(SecondActivity.this, "data is saved in Moshakhasat file", Toast.LENGTH_LONG).show();

            }
        });

    }
}
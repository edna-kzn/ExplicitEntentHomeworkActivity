package com.kazarian.android.explicitententhomeworkactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtname = findViewById(R.id.edtName);
        EditText edtfamily = findViewById(R.id.edtFamily);
        EditText edtage = findViewById(R.id.edtAge);

        Button btnokay = findViewById(R.id.btnOkay);

        btnokay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtname.getText().toString();
                String family = edtfamily.getText().toString();
                String age = edtage.getText().toString();

                Intent intent1to2_origin = new Intent(MainActivity.this, SecondActivity.class);
                intent1to2_origin.putExtra("name", name);
                intent1to2_origin.putExtra("family", family);
                intent1to2_origin.putExtra("age", age);

                startActivityForResult(intent1to2_origin, 256);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 256){
            if (resultCode == Activity.RESULT_OK){
                String name = data.getStringExtra("name");
                String family = data.getStringExtra("family");
                String age = data.getStringExtra("age");

                EditText edtname = findViewById(R.id.edtName);
                EditText edtfamily = findViewById(R.id.edtFamily);
                EditText edtage = findViewById(R.id.edtAge);

                edtname.setText(name);
                edtfamily.setText(family);
                edtage.setText(age);
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
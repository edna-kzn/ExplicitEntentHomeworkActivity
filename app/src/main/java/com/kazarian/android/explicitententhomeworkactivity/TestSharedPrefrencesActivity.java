package com.kazarian.android.explicitententhomeworkactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestSharedPrefrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_prefrences);

        Button btnsave = findViewById(R.id.btnSave);
        EditText edtname = findViewById(R.id.edtname2);
        TextView txtname = findViewById(R.id.txtName);

        String name = getSharedPreferences("Sematech", Context.MODE_PRIVATE).getString("name", "name is not abailable");
        txtname.setText(name);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtname.getText().toString();
                getSharedPreferences("Sematech", Context.MODE_PRIVATE).edit().putString("name", name).apply();
            }
        });
    }
}
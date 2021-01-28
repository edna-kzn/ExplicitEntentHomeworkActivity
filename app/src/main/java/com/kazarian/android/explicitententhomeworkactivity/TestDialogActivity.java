package com.kazarian.android.explicitententhomeworkactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dialog);

        Button btnalertdialog = findViewById(R.id.btnAlertDialog);
        Button btndialogactivity = findViewById(R.id.btnOpenDialogActivity);

        btndialogactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestDialogActivity.this, TestDialogThemeActivity.class);
                startActivity(intent);
            }
        });

        btnalertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog mydialog = new AlertDialog.Builder(TestDialogActivity.this)
                        .setTitle("Dialog title")
                        .setMessage("are you sure?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "YES is Presed", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "NO is Presed", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNeutralButton("i dont know", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "I dont know button is pressed", Toast.LENGTH_LONG).show();
                            }
                        }).create();
                mydialog.show();
            }
        });
    }
}
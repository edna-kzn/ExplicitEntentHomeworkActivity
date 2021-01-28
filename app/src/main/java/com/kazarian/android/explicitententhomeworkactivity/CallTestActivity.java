package com.kazarian.android.explicitententhomeworkactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CallTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_test);

        EditText edtphonenumber = findViewById(R.id.edtPhoneNumber);
        Button btncall = findViewById(R.id.btnCall);


        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber = edtphonenumber.getText().toString();
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:" + phonenumber));
                startActivity(callintent);
            }

        });
    }
}
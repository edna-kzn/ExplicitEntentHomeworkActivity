package com.kazarian.android.explicitententhomeworkactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class KebabMenuHomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebab_menu_homework);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.homework_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.First_intent_with_setresult:
                Intent intent_setresult = new Intent(KebabMenuHomeworkActivity.this, MainActivity.class);
                startActivity(intent_setresult);
                break;

            case R.id.Second_implicite_open_dial:
                Intent intent_dial = new Intent(KebabMenuHomeworkActivity.this, CallTestActivity.class);
                startActivity(intent_dial);
                break;

            case R.id.Third_notification:
                Intent intent_notification = new Intent(KebabMenuHomeworkActivity.this, TestNotificationActivity.class);
                startActivity(intent_notification);
                break;

            case R.id.Forth_get_contact_permision:
                Intent intent_permision = new Intent(KebabMenuHomeworkActivity.this, TestPermisionActivity.class);
                startActivity(intent_permision);
                break;
                
        }
        return super.onOptionsItemSelected(item);
    }

    Boolean isBackPressed = false;
    @Override
    public void onBackPressed() {
        if (isBackPressed == true){
            super.onBackPressed();
        }
        else{
            isBackPressed = true;
            Toast.makeText(KebabMenuHomeworkActivity.this, "Press back again", Toast.LENGTH_LONG).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    isBackPressed = false;
                }
            }, 2500);

        }

    }
}
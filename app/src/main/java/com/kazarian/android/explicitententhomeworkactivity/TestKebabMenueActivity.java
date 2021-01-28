package com.kazarian.android.explicitententhomeworkactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TestKebabMenueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_kebab_menue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.FirstItem:
                Toast.makeText(TestKebabMenueActivity.this, "first item is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.SecondItem:
                Toast.makeText(TestKebabMenueActivity.this, "second item is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.ThirdItem:
                Toast.makeText(TestKebabMenueActivity.this, "third item is selected", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
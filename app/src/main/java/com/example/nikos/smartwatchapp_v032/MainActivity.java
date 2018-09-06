package com.example.nikos.smartwatchapp_v032;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.drop_down_menu,menu);
       return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.main){
            startActivity(new Intent(this,MainActivity.class));
        }
        else if(item.getItemId() == R.id.training){
            startActivity(new Intent(this,Training.class));
        }
        else if(item.getItemId() == R.id.personalinfo){
            startActivity(new Intent(this,Personalinfo.class));
        }
        else if(item.getItemId() == R.id.about){
            startActivity(new Intent(this,About.class));
        }
        return super.onOptionsItemSelected(item);
    }
}

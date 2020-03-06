package com.example.projektix;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listofdays);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(com.example.projektix.MainActivity.DAYS, 0);


    }
}
package com.example.projektix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projektix.Day;
import com.example.projektix.DayList;
import com.example.projektix.R;

public class MainActivity extends AppCompatActivity {
    public static final String DAYS = "passing days";
    ListView lv;
    //Kunhan testailen
    //Testi 1
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<Day>(
                this,
                android.R.layout.simple_list_item_1,
                DayList.getInstance().Days));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(MainActivity.this,
                        DayInfo.class);
                nextActivity.putExtra(DAYS, i);
                startActivity(nextActivity);
            }
        });
    }
}
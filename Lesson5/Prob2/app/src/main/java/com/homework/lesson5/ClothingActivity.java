package com.homework.lesson5;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ClothingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
        ActionBar aBar = getSupportActionBar();
        aBar.setTitle("Clothing Category");

        ListView clothingListview = findViewById(R.id.clothing_listview);
        String[] values = getResources().getStringArray(R.array.arr_clothing);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, values);
        clothingListview.setAdapter(arrayAdapter);
        clothingListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You have been chosen " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

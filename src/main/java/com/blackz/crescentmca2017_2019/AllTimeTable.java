package com.blackz.crescentmca2017_2019;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class AllTimeTable extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

     Spinner spinner;
    String[] mons, tues, weds, thus, fris;

    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_time_table);
        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> arrayAdapter;
        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.tt,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);

    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        str = adapterView.getItemAtPosition(i).toString();


        Snackbar.make(view,"Time table for "+str,Snackbar.LENGTH_SHORT).setAction(null,null).show();
        ListView listView = (ListView) findViewById(R.id.list_item);

        mons = getResources().getStringArray(R.array.mon);
        tues = getResources().getStringArray(R.array.tue);
        weds = getResources().getStringArray(R.array.wed);
        thus = getResources().getStringArray(R.array.thu);
        fris = getResources().getStringArray(R.array.fri);
        ArrayAdapter<String> arrayAdapter1;

        if (i == 0) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mons);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 1) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tues);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 2) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, weds);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 3) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thus);
            listView.setAdapter(arrayAdapter1);

        }
        if (i == 4) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fris);
            listView.setAdapter(arrayAdapter1);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}

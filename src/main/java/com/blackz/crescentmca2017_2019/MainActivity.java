package com.blackz.crescentmca2017_2019;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Context context = this;
    String[] mons, tues, weds, thus, fris,hols;
    Button button;
    View view ;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkUser();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        adapterView.getItemAtPosition(i);
    }

    public void setTimeTable() {
        GregorianCalendar calendar = new GregorianCalendar();

        int i = calendar.get(Calendar.DAY_OF_WEEK);
        final Dialog  dialog = new Dialog(context);
        dialog.setContentView(R.layout.list_time_table);
        dialog.setTitle("Todays Time Table");
        dialog.show();

        ListView listView = dialog.findViewById(R.id.list_item);
        mons = getResources().getStringArray(R.array.mon);
        tues = getResources().getStringArray(R.array.tue);
        weds = getResources().getStringArray(R.array.wed);
        thus = getResources().getStringArray(R.array.thu);
        fris = getResources().getStringArray(R.array.fri);
        hols = getResources().getStringArray(R.array.hol);

        ArrayAdapter<String> arrayAdapter1;

        if (i == 2) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mons);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 3) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tues);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 4) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, weds);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 5) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thus);
            listView.setAdapter(arrayAdapter1);
        }
        if (i == 6) {
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fris);
            listView.setAdapter(arrayAdapter1);
        }

        if (i == 1 || i == 7)
        {
            Toast.makeText(this,"Holiday",Toast.LENGTH_LONG).show();
            arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hols);
            listView.setAdapter(arrayAdapter1);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void today(View view)
    {
        setTimeTable();
    }

    public void allT(View view)
    {
        Intent intent = new Intent(MainActivity.this,AllTimeTable.class);
        startActivity(intent);
    }


    public void about(View view)
    {
        Intent intent = new Intent(MainActivity.this,About.class);
        startActivity(intent);
    }


    public void newsA(View view)
    {
        Intent intent = new Intent(MainActivity.this,Download.class);
        startActivity(intent);
    }

    private void checkUser(){
        String str,srn;
        SharedPreferences sharedPreferences = getSharedPreferences("login",Context.MODE_PRIVATE);
        srn = sharedPreferences.getString("rrn","");
        str = sharedPreferences.getString("name","");
        view = findViewById(R.id.mSnackbar);
        Snackbar.make(view,"Hey "+str,Snackbar.LENGTH_SHORT).setAction(null,null).show();
        button = (Button) findViewById(R.id.updateRep);

        try {
            if(str.equals(""))
            {
                Intent intent = new Intent(MainActivity.this,StartScreen.class);
                startActivity(intent);
                finish();
            }

            int i = Integer.parseInt(srn);
            if(i == 14 || i == 34)
            {
            button.setVisibility(View.VISIBLE);
            }

        }catch (NumberFormatException e)
        {

        }

        }

        public void repUpdate(View view)
        {
            Intent intent = new Intent(MainActivity.this,UpdateScreen.class);
            startActivity(intent);
            finish();
        }
}

package com.blackz.crescentmca2017_2019;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UpdateScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    DatabaseReference databaseReference;
    EditText editText;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_screen);
    spinner = (Spinner)findViewById(R.id.mSpinner);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        editText = (EditText)findViewById(R.id.upnews);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this,R.array.sub,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    str =  adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    Toast.makeText(getApplicationContext(),"Select a subject",Toast.LENGTH_SHORT).show();
    }

    public void updateSub(View view)
    {
        String loc = editText.getText().toString();
        databaseReference.child("main").child(str).setValue(loc);
        view = findViewById(R.id.mSnackbar);
        Snackbar.make(view,str+" Updated Sucessfully",Snackbar.LENGTH_SHORT).setAction(null,null).show();
    }
}

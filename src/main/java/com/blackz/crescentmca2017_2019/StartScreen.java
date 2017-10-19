package com.blackz.crescentmca2017_2019;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;

public class StartScreen extends Activity {
    Intent intent;
    SharedPreferences sharedPreferences;
    Context context = this;
    public static final String login = "login";
    public static final String rrn = "rrn";
    public static final String name = "name";
    EditText editText,editText2;

    View vw;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    sharedPreferences = getSharedPreferences(login,Context.MODE_PRIVATE);
        checkLogin();
        vw = findViewById(R.id.mSnackbar);
    }

    public void loGin(View view)
    {
        editText = findViewById(R.id.rrn);
        editText2 = findViewById(R.id.lol);
        String s = editText.getText().toString();
        String na = editText2.getText().toString();

        if(s.equals("") || na.equals("")) {
            Snackbar.make(vw,"Please Check Your Details",Snackbar.LENGTH_SHORT).setAction(null,null).show();
        }
        else{
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(rrn, s);
            editor.putString(name,na);
            editor.apply();
            intent = new Intent(context, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void checkLogin(){
        str = sharedPreferences.getString(rrn,"");

        try {
            int i = Integer.parseInt(str);
            if (i< 107 ) {
                intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();

            } else {
                Snackbar.make(vw,"Please Enter Your Details",Snackbar.LENGTH_SHORT).setAction(null,null).show();
            }
        }catch (NumberFormatException nfe)
        {
           // Snackbar.make(vw,"Please Enter Your Details",Snackbar.LENGTH_SHORT).setAction(null,null).show();
        }
    }


}

package com.blackz.crescentmca2017_2019;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void fb(View view){
        String url = "https://m.facebook.com/jahabar.shaik";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void uh(View view){

        String url = "http://unknownhackzz.blogspot.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void wa(View view){
        Intent send = new Intent();
        send.setAction(Intent.ACTION_SEND);
        send.putExtra(Intent.EXTRA_TEXT,"II MCA App Is ____?");
        send.setType("text/plain");

        try {
            send.setPackage("com.whatsapp");
            startActivity(send);
        }catch (Exception e)
        {
            Toast.makeText(this,"Whatsapp Not Installed On Your Phone",Toast.LENGTH_SHORT).show();
        }



    }
}

package com.blackz.crescentmca2017_2019;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Download extends AppCompatActivity {

    DatabaseReference databaseReference;
    TextView txt,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;

   public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
    databaseReference  = FirebaseDatabase.getInstance().getReference();
    txt =(TextView)findViewById(R.id.small1);
        txt1 =(TextView)findViewById(R.id.small2);
        txt2 =(TextView)findViewById(R.id.small3);
        txt3 =(TextView)findViewById(R.id.small4);
        txt4 =(TextView)findViewById(R.id.small5);
        txt5 =(TextView)findViewById(R.id.small6);
        txt6 =(TextView)findViewById(R.id.small7);
        txt7 =(TextView)findViewById(R.id.small8);
        txt8 =(TextView)findViewById(R.id.small9);
        txt9 = (TextView)findViewById(R.id.genSm);

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);

        View view = findViewById(R.id.mSnackbar);
        Snackbar.make(view,"Make Sure You Have Internet Connection !",Snackbar.LENGTH_SHORT).setAction("Okay",null).show();

        databaseReference.child("main").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Nope no = dataSnapshot.getValue(Nope.class);
                String s = no.getGeneralInfo();
                txt9.setText(s);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    public void big1(View view){

        txt.setVisibility(View.VISIBLE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
            @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                  Nope no = dataSnapshot.getValue(Nope.class);
                    s = no.getOOAD();
                  txt.setText(s);
              }

              @Override
              public void onCancelled(DatabaseError databaseError) {

            }
        }
        );

    }
    public void big2(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.VISIBLE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
         @Override
         public void onDataChange(DataSnapshot dataSnapshot) {
             Nope no = dataSnapshot.getValue(Nope.class);
             String s = no.getIJP();
             txt1.setText(s);
         }

         @Override
         public void onCancelled(DatabaseError databaseError) {

         }
         }
        );
    }
    public void big3(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.VISIBLE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
              @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                  Nope no = dataSnapshot.getValue(Nope.class);
                  s = no.getTCPIP();
                  txt2.setText(s);
              }

              @Override
              public void onCancelled(DatabaseError databaseError) {

              }
          }
        );
    }
    public void big4(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.VISIBLE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
                                                                  @Override
               public void onDataChange(DataSnapshot dataSnapshot) {
                   Nope no = dataSnapshot.getValue(Nope.class);
                   s = no.getNS();
                   txt3.setText(s);
               }

               @Override
               public void onCancelled(DatabaseError databaseError) {

               }
           }
        );
    }
    public void big5(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.VISIBLE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Nope no = dataSnapshot.getValue(Nope.class);
                    s = no.getCC();
                    txt4.setText(s);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            }
        );
    }
    public void big6(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.VISIBLE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
              @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                  Nope no = dataSnapshot.getValue(Nope.class);
                  s = no.getRMT();
                  txt5.setText(s);
              }

              @Override
              public void onCancelled(DatabaseError databaseError) {

              }
                                                              }
        );
    }
    public void big7(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.VISIBLE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Nope no = dataSnapshot.getValue(Nope.class);
                    s = no.getOL();
                    txt6.setText(s);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            }
        );
    }
    public void big8(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.VISIBLE);
        txt8.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
                                                                  @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Nope no = dataSnapshot.getValue(Nope.class);
                        s = no.getJL();
                        txt7.setText(s);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                                                              }
        );
    }
    public void big9(View view){

        txt.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        txt8.setVisibility(View.VISIBLE);
        txt9.setVisibility(View.GONE);
        databaseReference.child("main").addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                 Nope no = dataSnapshot.getValue(Nope.class);
                 s = no.getCL();
                 txt8.setText(s);
             }

             @Override
             public void onCancelled(DatabaseError databaseError) {

                                                                  }
                                                              }
        );
    }

public void gen(View view)
{

    txt9.setVisibility(View.VISIBLE);

}

}

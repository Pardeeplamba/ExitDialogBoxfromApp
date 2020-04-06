package com.example.exitdialogboxfromapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button ;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
       // getSupportActionBar().hide();
      //  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button =(Button) findViewById(R.id.button);
        builder=new AlertDialog.Builder(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

reuse();
            }

        });

    }
    public void reuse()
    {
        builder.setMessage("Want To Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                                Toast.makeText(getApplicationContext(), "tapped Yes", Toast.LENGTH_SHORT).show();

                            }
                        }
                )
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Tapped No", Toast.LENGTH_SHORT).show();

                    }
                });


        AlertDialog dialog = builder.create();
        dialog.setTitle("Alert Dialog Box");
        dialog.setIcon(R.drawable.ic_add_alert_black_24dp);
        dialog.show();
    }



    @Override
    public  void onBackPressed() {
        builder.setMessage("Want To Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                                Toast.makeText(getApplicationContext(), "tapped Yes", Toast.LENGTH_SHORT).show();

                            }
                        }
                )
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Tapped No", Toast.LENGTH_SHORT).show();

                    }
                });


        AlertDialog dialog = builder.create();
        dialog.setTitle("Alert Dialog Box");
        dialog.setIcon(R.drawable.ic_add_alert_black_24dp);
        dialog.show();




    }










}

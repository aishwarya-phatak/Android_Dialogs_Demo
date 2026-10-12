package com.example.android_dialogs_demo;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog,btnDatePickerDialog,btnTimePickerDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews(){
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnDatePickerDialog = findViewById(R.id.btnDatePickerDialog);
        btnTimePickerDialog = findViewById(R.id.btnTimePickerDialog);

        btnAlertDialog.setOnClickListener(new MyBtnAlertDialogClickListener());
        btnDatePickerDialog.setOnClickListener(new MyBtnDatePickerDialogClickListener());
        btnTimePickerDialog.setOnClickListener(new MyBtnTimePickerDialogClickListener());
    }


    public class MyBtnAlertDialogClickListener implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);
            alertDialogBuilder.setTitle("Exam Submission");
            alertDialogBuilder.setMessage("Do you really want to submit the exam?");
            alertDialogBuilder.setNegativeButton("Cancel",new MyDialogNegativeBtnClickListener());
            alertDialogBuilder.setPositiveButton("Yes",new MyDialogPositiveBtnClickListener());
            alertDialogBuilder.setNeutralButton("Ok", new MyDialogNeutralBtnClickListener());
            alertDialogBuilder.create();
            alertDialogBuilder.show();
        }
    }

    public class MyDialogNegativeBtnClickListener implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.e("tag", "Negative Btn of Alert Dialog clicked -- i: " + i);
        }
    }

    public class MyDialogPositiveBtnClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.e("tag", " Positive Btn of Alert Dialog clicked -- i: " + i);
        }
    }

    public class MyDialogNeutralBtnClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.e("tag", " Neutral Btn of Alert Dialog clicked -- i: " + i);
        }
    }

    public class MyBtnDatePickerDialogClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

        }
    }

    public class MyBtnTimePickerDialogClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

        }
    }
}
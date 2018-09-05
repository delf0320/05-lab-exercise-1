package com.boston.ui_input_controls;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UI_Input_Control extends AppCompatActivity {

    private String[] CourseSpinner = {
            "ABM",
            "BSIT",
            "BSCoE",
            "BSMT",
            "MSIT",
            "MSCS",

    };

    private View.OnClickListener clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Toast.makeText(UI_Input_Control.this, "Record Submitted", Toast.LENGTH_LONG).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui__input__control);
        getSupportActionBar().setTitle("SHS Student Registration");

        ArrayList<String> courseDataSet = new ArrayList<String>(Arrays.asList(CourseSpinner));

        Spinner studentsSpinner = findViewById(R.id.course_spinner);
        CourseAdapter adapter = new CourseAdapter(this, R.layout.activity_spinner, courseDataSet);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        studentsSpinner.setAdapter(adapter);

        Button ordinaryButton = findViewById(R.id.submit);
        ordinaryButton.setOnClickListener(clickListener);
    }


}

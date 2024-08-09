package com.example.dbdemo;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class C extends AppCompatActivity {
    EditText ed;
    EditText ed1;
    String name;
    String roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragement_c);
        ed= findViewById(R.id.editTextText);
        name= ed.getText().toString();
        ed1= findViewById(R.id.editTextText2);
        roll= ed1.getText().toString();

    }
}

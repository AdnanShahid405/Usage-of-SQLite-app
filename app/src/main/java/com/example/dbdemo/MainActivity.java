package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dbdemo.data.MyDbHandler;
import com.example.dbdemo.model.Contact;
import com.example.dbdemo.C;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHandler db= new MyDbHandler(MainActivity.this);

        Contact first= new Contact();

        first.setRollNumber("090078601");
        first.setName("ADNAN");
        db.addContact(first);
    }

}
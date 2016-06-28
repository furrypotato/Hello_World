package com.helloworld.furry.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelloWorld extends AppCompatActivity {
    String loveslou = "Testing this one";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_hello_world);
    }
}

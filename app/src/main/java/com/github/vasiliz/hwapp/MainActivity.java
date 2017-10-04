package com.github.vasiliz.hwapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //some comment
    }


    @Override
    protected void onStart() {
        super.onStart();

        //add some comment
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void forRebase() {
        //example
        //two comment
        //three
    }

}

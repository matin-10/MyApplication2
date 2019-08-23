package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag:"MYTAG",msg:"on create step");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag:"MYTAG",msg:"on Start step");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag:"MYTAG",msg:"on Resume step");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag:"MYTAG",msg:"on Pause step");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag:"MYTAG",msg:"on Stop step");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag:"MYTAG",msg:"on Destroy step");
    }
}
package com.example.entec01.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity was created");
        if(savedInstanceState != null) {
            int score = savedInstanceState.getInt("SCORE");
            Log.d(TAG, "Retrieved score: " + score);
            Toast.makeText(this, "Your score is "+ score, Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity was started");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "The activity has been restarted");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.d(TAG, "The MainActivity was resumed");
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "The activity has been paused");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "The activity has been stopped");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "The activity has benn destroyed");
        super.onDestroy();
    }


    protected void onSaveInstanceState(Bundle instanceState) {

        instanceState.putInt("SCORE", 345);

        super.onSaveInstanceState(instanceState);
    }

    public void go2ButtonClicked(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("SCORE", 34543);
        startActivity(intent);
    }


}

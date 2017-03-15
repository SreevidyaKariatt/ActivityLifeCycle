package com.example.sreevidyak.activitylifecycledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button mButtonClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Log.i(TAG, "Inside onCreate");
    }

    private void initViews() {
        mButtonClick = (Button)findViewById(R.id.btn_click);
        mButtonClick.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Inside onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Inside onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Inside onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Inside onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Inside onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Inside onDestroy()");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_click:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;

        }
    }
}

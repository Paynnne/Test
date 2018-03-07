package com.vayne.lifecycle.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.vayne.lifecycle.R;


public class MainBActivity extends AppCompatActivity {

    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        Log.e("Life_Cycle", "------B:onCreate");

        btnB = (Button) findViewById(R.id.activity_main_a_btnb);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainBActivity.this, MainAActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life_Cycle", "------B:onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Life_Cycle", "------B:onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life_Cycle", "------B:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life_Cycle", "------B:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life_Cycle", "------B:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life_Cycle", "------B:onDestroy");
    }
}

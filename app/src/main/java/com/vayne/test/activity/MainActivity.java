package com.vayne.test.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.vayne.test.R;
import com.vayne.test.route.RouteIntentUtils;

public class MainActivity extends AppCompatActivity {

    private Button btnLifecycle;
    private Button btnRedHeart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLifecycle = (Button) findViewById(R.id.activity_main_lifecycle);
        btnRedHeart = (Button) findViewById(R.id.activity_main_redheart);

        btnLifecycle.setOnClickListener(view -> {
            RouteIntentUtils.startLifecycle();
        });

        btnRedHeart.setOnClickListener(view -> {
            RouteIntentUtils.startRedHeart();
        });


    }


}

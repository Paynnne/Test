package com.vayne.redheart.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.vayne.redheart.R;

@Route(path = "/redheart_customheart/redheart_customheart_activity")
public class CustomHeartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redheart_activity_customheart);
    }
}

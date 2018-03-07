package com.vayne.redheart.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.vayne.redheart.R;

import java.util.Random;

import tyrantgit.widget.HeartLayout;

@Route(path = "/redheart_heartlayout/redheart_heartlayout_activity")
public class HeartLayoutActivity extends AppCompatActivity {

    private Random mRandom = new Random();
    private HeartLayout heartLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redheart_activity_heartlayout);
        heartLayout = (HeartLayout) findViewById(R.id.redheart_activity_heartlayout_heartlayout);
        imageView= (ImageView) findViewById(R.id.redheart_activity_heartlayout_btn);


        imageView.setOnClickListener(view -> {
            heartLayout.addHeart(randomColor());
        });

//        heartLayout.addHeart(randomColor(),heartResId,heartBorderResId);
    }

    private int randomColor() {
        return Color.rgb(mRandom.nextInt(255), mRandom.nextInt(255), mRandom.nextInt(255));
    }
}

package com.vayne.redheart.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.vayne.redheart.R;
import com.vayne.redheart.route.RouteIntentUtils;

/**
 * @Author: chupengda
 * @CreateDate: 2018/2/27
 * @Description: 心形屏幕点击效果
 */

@Route(path = "/redheart_main/redheart_main_activity")
public class MainActivity extends AppCompatActivity {

    private Button btnHeartlayout;
    private Button btnCustomHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redheart_activity_main);
        btnHeartlayout = (Button) findViewById(R.id.redheart_activity_main_btnheartlayout);
        btnCustomHeart = (Button) findViewById(R.id.redheart_activity_main_btncustomheart);

        btnCustomHeart.setVisibility(View.GONE);

        btnHeartlayout.setOnClickListener(view -> {
            RouteIntentUtils.startHeartLayoutActivity();
        });

        btnCustomHeart.setOnClickListener(view -> {
            RouteIntentUtils.startCustomHeartActivity();
        });


    }
}

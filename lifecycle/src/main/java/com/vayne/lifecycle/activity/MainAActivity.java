package com.vayne.lifecycle.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.vayne.lifecycle.R;
import com.vayne.lifecycle.fragment.AFragment;
import com.vayne.lifecycle.fragment.BFragment;


@Route(path = "/lifecycle_mainaa/lifecycle_mainaa_activity")
public class MainAActivity extends AppCompatActivity {

    private Button btnB, btnCreateFragemtn, btnAFragmrnt, btnBFragment;

    private AFragment aFragment;
    private BFragment bFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a);
        Log.e("Life_Cycle", "------A:onCreate");

        btnB = (Button) findViewById(R.id.activity_main_a_btna);
        btnCreateFragemtn = (Button) findViewById(R.id.activity_main_a_btncreate_fragment);
        btnAFragmrnt = (Button) findViewById(R.id.activity_main_a_btnafragment);
        btnBFragment = (Button) findViewById(R.id.activity_main_a_btnbfragment);


        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAActivity.this, MainBActivity.class);
                startActivity(intent);
            }
        });

        btnCreateFragemtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //初始化A
                if (aFragment == null) {
                    aFragment = new AFragment();
                }
                FragmentManager fm = getFragmentManager();
                // 开启Fragment事务
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.id_content, aFragment);
                transaction.commit();
            }
        });

        btnAFragmrnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到B
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                FragmentManager fm = getFragmentManager();
                // 开启Fragment事务
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.id_content, bFragment);
                transaction.commit();
            }
        });

        btnBFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到A
                if (aFragment == null) {
                    aFragment = new AFragment();
                }
                FragmentManager fm = getFragmentManager();
                // 开启Fragment事务
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.id_content, aFragment);
                transaction.commit();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life_Cycle", "------A:onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Life_Cycle", "------A:onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life_Cycle", "------A:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life_Cycle", "------A:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life_Cycle", "------A:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life_Cycle", "------A:onDestroy");
    }
}

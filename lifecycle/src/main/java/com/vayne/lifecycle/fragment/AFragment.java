package com.vayne.lifecycle.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vayne.lifecycle.R;

/**
 * @Author: chupengda
 * @CreateDate: 2018/1/14
 * @Description:
 */

public class AFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment_LifeCycle", "------A:onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment_LifeCycle", "------A:onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.e("Fragment_LifeCycle", "------A:onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragment_LifeCycle", "------A:onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment_LifeCycle", "------A:onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment_LifeCycle", "------A:onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment_LifeCycle", "------A:onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment_LifeCycle", "------A:onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment_LifeCycle", "------A:onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment_LifeCycle", "------A:onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment_LifeCycle", "------A:onDetach");
    }
}

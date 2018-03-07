package com.vayne.commonlib.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author: chupengda
 * @CreateDate: 2018/2/24
 * @Description:
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initARouter();
    }

    /**
     * 初始化ARouter
     */
    private void initARouter() {
        //ARouter初始
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(this);
    }
}

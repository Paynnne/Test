package com.vayne.redheart.route;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author: chupengda
 * @CreateDate: 2018/2/28
 * @Description:
 */

public class RouteIntentUtils {

    /**
     * 跳转到HeartLayoutActivity
     */
    public static void startHeartLayoutActivity(){

        ARouter.getInstance().build("/redheart_heartlayout/redheart_heartlayout_activity").navigation();

    }

    /**
     * 跳转到CustomHeartActivity
     */
    public static void startCustomHeartActivity(){

        ARouter.getInstance().build("/redheart_customheart/redheart_customheart_activity").navigation();

    }
}

package com.vayne.test.route;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author: chupengda
 * @CreateDate: 2018/2/24
 * @Description:
 */

public class RouteIntentUtils {

    /**
     * 跳转到生命周期
     */
    public static void startLifecycle() {
        ARouter.getInstance().build("/lifecycle_mainaa/lifecycle_mainaa_activity").navigation();
    }

    /**
     * 跳转到红心
     */
    public static void startRedHeart() {
        ARouter.getInstance().build("/redheart_main/redheart_main_activity").navigation();
    }


}

package pc.majian.cn.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * 类的描述
 * Created by Administrator on 2016/10/27.
 */
public class PackageInfomation {

    public static String getVersionName(Context context){

        PackageManager pm = context.getPackageManager() ;

        try {
            android.content.pm.PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);

            return packageInfo.versionName ;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null ;
    }
}

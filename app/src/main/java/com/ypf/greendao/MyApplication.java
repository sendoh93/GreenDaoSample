package com.ypf.greendao;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.ypf.greendao.db.dao.DaoMaster;
import com.ypf.greendao.db.utils.DatabaseConfiguration;

import org.greenrobot.greendao.database.Database;

/**
 * Created by pingfan.yang on 2017/4/1.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
       /*数据库配置*/
        DatabaseConfiguration.initialize(getApplicationContext(), "Nielsen.db", isDebug(),
                new DatabaseConfiguration.OnUpdateDatabaseCallback() {
                    @Override
                    public void onUpdateDatabaseCallback(Database db, int oldVersion, int newVersion) {
                        DaoMaster.dropAllTables(db, true);
                        DaoMaster.createAllTables(db, false);
                    }
                });
    }

    public boolean isDebug() {
        return getVersionName(getApplicationContext()).startsWith("D");
    }

    public static String getVersionName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}

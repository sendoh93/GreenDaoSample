package com.ypf.greendao.db.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.ypf.greendao.db.dao.DaoMaster;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.query.QueryBuilder;

/**
 * 数据库配置管理
 * Created by pingfan.yang on 2016/10/8.
 */
public final class DatabaseConfiguration {
    private static DatabaseOpenHelper mHelper;

    /**
     * database初始化
     *
     * @param context      context
     * @param databaseName 数据库名
     * @param factory      factory
     * @param isDebug      是否是debug模式
     * @param callback     数据库更新回调
     */
    public static void initialize(Context context, String databaseName, SQLiteDatabase.CursorFactory factory,
                                  boolean isDebug, final OnUpdateDatabaseCallback callback) {
        if (isDebug)
            mHelper = new DaoMaster.DevOpenHelper(context, databaseName, factory);
        else
            mHelper = new DaoMaster.OpenHelper(context, databaseName, factory) {
                @Override
                public void onUpgrade(Database db, int oldVersion, int newVersion) {
                    if (callback != null)
                        callback.onUpdateDatabaseCallback(db, oldVersion, newVersion);
                }
            };
        QueryBuilder.LOG_SQL = isDebug;
        QueryBuilder.LOG_VALUES = isDebug;
    }

    /**
     * database初始化
     *
     * @param context      context
     * @param databaseName 数据库名
     * @param isDebug      是否是debug模式
     * @param callback     数据库更新回调
     */
    public static void initialize(Context context, String databaseName, boolean isDebug
            , OnUpdateDatabaseCallback callback) {
        initialize(context, databaseName, null, isDebug, callback);
    }

    /**
     * 获取DatabaseOpenHelper实例
     */
    public static DatabaseOpenHelper getDatabaseOpenHelper() {
        return mHelper;
    }

    /**
     * 数据库更新回调
     * Created by chenkai.gu on 2016/10/8.
     */
    public interface OnUpdateDatabaseCallback {

        void onUpdateDatabaseCallback(Database db, int oldVersion, int newVersion);
    }
}

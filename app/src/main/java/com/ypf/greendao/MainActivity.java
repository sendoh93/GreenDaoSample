package com.ypf.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ypf.greendao.db.dao.ExecPlanDao;
import com.ypf.greendao.db.dao.UserDao;
import com.ypf.greendao.db.utils.DatabaseOperation;
import com.ypf.greendao.db.utils.ResultMapHelper;
import com.ypf.greendao.db.utils.SQLSelectBuilder;
import com.ypf.greendao.model.User;
import com.ypf.greendao.model.UserPlan;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SQLSelectBuilder builder;
    private UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userDao = (UserDao) DatabaseOperation.getEntityDao(User.class,false);
        normal();
    }

    private void normal() {
        // 单条增加
        // userDao.insert();
        // 一个集合类的增加
        userDao.insertInTx();
        //如果没有该条记录则增加，否则替换
        //userDao.insertOrReplace();

        //查询列表
        // userDao.queryBuilder().where().list();

        //原生语句查询：
        //DatabaseOperation.executeSql();

        //开启一个事务
       DatabaseOperation.batchTransactionOperation(new Runnable() {
           @Override
           public void run() {

           }
       });

        //多表查询
        builder = SQLSelectBuilder.newInstance().select(ResultMapHelper.getResultMap(UserPlan.class),true)
                .from(UserDao.TABLENAME,"u")
                .leftJoin(ExecPlanDao.TABLENAME,"e","u.user_id = e.user_id")
                .where(UserDao.Properties.UserId.columnName,"u")
                .eq("'1'",true);
        UserPlan userPlan = DatabaseOperation.rawQueryUnique(builder.build(),UserPlan.class,null);
        List<UserPlan> userPlanList = DatabaseOperation.rawQueryList(builder.build(),UserPlan.class);
    }
}

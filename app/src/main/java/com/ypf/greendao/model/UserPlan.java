package com.ypf.greendao.model;

import com.ypf.greendao.db.utils.Alias;

import java.io.Serializable;

/**
 * Created by pingfan.yang on 2017/3/29.
 */
public class UserPlan implements Serializable {
    @Alias(column = "u.user_id")
    private Integer userId;
    @Alias(column = "e.project_name")
    private String projectName;
    @Alias(column = "e.exec_plan_id")
    private Integer execPlanId;
}

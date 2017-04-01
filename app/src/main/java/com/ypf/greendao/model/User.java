package com.ypf.greendao.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;

import java.io.Serializable;

/**
 * Created by pingfan.yang on 2017/3/29.
 */
@Entity(nameInDb = "nielsen_sfa_user")
public class User implements Serializable{
    @Id(autoincrement = true)
    private Long id;// 自增型ID
    @Unique
    @NotNull
    @Property(nameInDb = "user_id")
    private Integer userId;// 自增型ID
    @Unique
    @NotNull
    @Property(nameInDb = "user_number")
    private String userNumber;// 员工编号
    @Property(nameInDb = "user_login_number")
    private String userLoginNumber;// 员工登陆用帐号
    @Property(nameInDb = "user_long_passwd")
    private String userLoginPasswd;// 员工登陆用密码
    @Property(nameInDb = "user_name")
    private String userName;// 员工姓名
    @Property(nameInDb = "user_eng_name")
    private String userEngName;// 员工英文名
    @Property(nameInDb = "super_visor_number")
    private String supervisorNumber;// 上级编号
    @Property(nameInDb = "user_email_address")
    private String userEmailAddress;// 员工邮箱地址
    @Property(nameInDb = "user_contact_info")
    private String userContactInfo;// 员工联系方式
    @Property(nameInDb = "user_passwd_flag")
    private String userPasswdFlag;// Y- 必须修改密码，初次使用或者重置密码后， N- 无需强制修改密码
    @Property(nameInDb = "create_by")
    private String createBy;// 创建人员
    @Property(nameInDb = "create_date")
    private String createDate;// 创建时间
    @Property(nameInDb = "update_by")
    private String updateBy;// 修改人员
    @Property(nameInDb = "update_date")
    private String updateDate;// 修改时间
    @Property(nameInDb = "mobile_login_number")
    private String mobileLoginNumber;// 手机登录用帐号
    @Property(nameInDb = "user_status_flag")
    private Integer userStatusFlag;// 1：有效  0：无效
    // ↑以上属性为SFA_USER字段
    @Property(nameInDb = "mobile_long_time")
    private Long mobileLogTime;//离线状态下手机端操作发生的时间
    @Property(nameInDb = "all_role_name")
    private String allRoleName;// 该user拥有的role字符串，每个role之间用"&"间隔

    @Generated(hash = 315847889)
    public User(Long id, @NotNull Integer userId, @NotNull String userNumber,
            String userLoginNumber, String userLoginPasswd, String userName,
            String userEngName, String supervisorNumber, String userEmailAddress,
            String userContactInfo, String userPasswdFlag, String createBy,
            String createDate, String updateBy, String updateDate,
            String mobileLoginNumber, Integer userStatusFlag, Long mobileLogTime,
            String allRoleName) {
        this.id = id;
        this.userId = userId;
        this.userNumber = userNumber;
        this.userLoginNumber = userLoginNumber;
        this.userLoginPasswd = userLoginPasswd;
        this.userName = userName;
        this.userEngName = userEngName;
        this.supervisorNumber = supervisorNumber;
        this.userEmailAddress = userEmailAddress;
        this.userContactInfo = userContactInfo;
        this.userPasswdFlag = userPasswdFlag;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.mobileLoginNumber = mobileLoginNumber;
        this.userStatusFlag = userStatusFlag;
        this.mobileLogTime = mobileLogTime;
        this.allRoleName = allRoleName;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserLoginNumber() {
        return userLoginNumber;
    }

    public void setUserLoginNumber(String userLoginNumber) {
        this.userLoginNumber = userLoginNumber;
    }

    public String getUserLoginPasswd() {
        return userLoginPasswd;
    }

    public void setUserLoginPasswd(String userLoginPasswd) {
        this.userLoginPasswd = userLoginPasswd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEngName() {
        return userEngName;
    }

    public void setUserEngName(String userEngName) {
        this.userEngName = userEngName;
    }

    public String getSupervisorNumber() {
        return supervisorNumber;
    }

    public void setSupervisorNumber(String supervisorNumber) {
        this.supervisorNumber = supervisorNumber;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public String getUserContactInfo() {
        return userContactInfo;
    }

    public void setUserContactInfo(String userContactInfo) {
        this.userContactInfo = userContactInfo;
    }

    public String getUserPasswdFlag() {
        return userPasswdFlag;
    }

    public void setUserPasswdFlag(String userPasswdFlag) {
        this.userPasswdFlag = userPasswdFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getMobileLoginNumber() {
        return mobileLoginNumber;
    }

    public void setMobileLoginNumber(String mobileLoginNumber) {
        this.mobileLoginNumber = mobileLoginNumber;
    }

    public Integer getUserStatusFlag() {
        return userStatusFlag;
    }

    public void setUserStatusFlag(Integer userStatusFlag) {
        this.userStatusFlag = userStatusFlag;
    }

    public Long getMobileLogTime() {
        return mobileLogTime;
    }

    public void setMobileLogTime(Long mobileLogTime) {
        this.mobileLogTime = mobileLogTime;
    }

    public String getAllRoleName() {
        return allRoleName;
    }

    public void setAllRoleName(String allRoleName) {
        this.allRoleName = allRoleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", userNumber='" + userNumber + '\'' +
                ", userLoginNumber='" + userLoginNumber + '\'' +
                ", userLoginPasswd='" + userLoginPasswd + '\'' +
                ", userName='" + userName + '\'' +
                ", userEngName='" + userEngName + '\'' +
                ", supervisorNumber='" + supervisorNumber + '\'' +
                ", userEmailAddress='" + userEmailAddress + '\'' +
                ", userContactInfo='" + userContactInfo + '\'' +
                ", userPasswdFlag='" + userPasswdFlag + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", mobileLoginNumber='" + mobileLoginNumber + '\'' +
                ", userStatusFlag=" + userStatusFlag +
                ", mobileLogTime=" + mobileLogTime +
                ", allRoleName='" + allRoleName + '\'' +
                '}';
    }
}

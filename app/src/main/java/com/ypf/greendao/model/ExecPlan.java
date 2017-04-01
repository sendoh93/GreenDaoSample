package com.ypf.greendao.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;

import java.io.Serializable;

/**
 * 执行计划实体类，在数据库SFA_VIEW_EXEC_PLAN_DETAIL视图中取字段
 *
 * @author null
 */
@Entity(nameInDb = "nielsen_sfa_exec_plan")
public class ExecPlan implements Serializable {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    @Property(nameInDb = "exec_plan_id")
    private Integer execPlanId;  //SFA_EXEC_PLAN表的自增型ID
    @Property(nameInDb = "period_id")
    private Integer periodId;// SFA_EXEC_PLAN表的(ID of SFA_SURVEY_PERIOD)
    @Property(nameInDb = "qnr_template_id")
    private Integer qnrTemplateId;// SFA_EXEC_PLAN表的(ID of SFA_QNR_TEMPLATE 问卷)
    @Property(nameInDb = "store_info_id")
    private Integer storeInfoId; // SFA_EXEC_PLAN表的(ID of SFA_STORE_INFO 门店)
    @Property(nameInDb = "store_original_info_id")
    private Integer storeOriginalInfoId; // 替换店铺时所用来存原先的店铺信息
    @Property(nameInDb = "user_id")
    private Integer userId; // SFA_EXEC_PLAN表的(ID of SFA_USER 人员)
    @Property(nameInDb = "plan_exec_date")
    private String planExecDate; // SFA_EXEC_PLAN表的PLAN_EXEC_DATE(计划执行时间)
    @Property(nameInDb = "qc_plan_flag")
    private Integer qcPlanFlag; // SFA_EXEC_PLAN表的(1 QC计划  0  普通调查员计划)
    @Property(nameInDb = "redo_plan_flag")
    private Integer redoPlanFlag;// SFA_EXEC_PLAN表的(1 督导要求重做计划 0 普通)
    @Property(nameInDb = "status")
    private String execPlanStatusFlag; // SFA_EXEC_PLAN表的(是否有效)
    @Property(nameInDb = "region")
    private String region;// SFA_REGION_INFO表的region(大区)
    @Property(nameInDb = "province")
    private String province;// SFA_REGION_INFO表的province(省名)
    @Property(nameInDb = "city")
    private String city; // SFA_REGION_INFO表的city(地级市)
    @Property(nameInDb = "country")
    private String country;//  private String country;// SFA_REGION_INFO表的country(县级市)
    @Property(nameInDb = "district")
    private String district;// private String district;// SFA_REGION_INFO表的district(区)
    @Property(nameInDb = "store_code")
    private String storeCode; //private String storeCode;// SFA_STORE_INFO表的store_code(店铺编号)
    @Property(nameInDb = "store_name")
    private String storeName;// private String storeName;// SFA_STORE_INFO表的store_name(店铺名称)
    @Property(nameInDb = "store_address")
    private String storeAddress; //private String storeAddress;// SFA_STORE_INFO表的store_address(店铺地址)
    @Property(nameInDb = "channel_abbr")
    private String channelAbbr;  // private String channelAbbr;// SFA_CHANNEL_DEF表的channel_abbr(渠道名称简写）
    @Property(nameInDb = "user_login_number")
    private String userLoginNumber;// SFA_USER表的user_login_number(员工登陆用帐号)
    @Property(nameInDb = "user_name")
    private String userName;// SFA_USER表的user_name(员工姓名)
    @Property(nameInDb = "qnr_name")
    private String qnrName;// SFA_QNR_TEMPLATE表的qnr_name(问卷详细名)
    @Property(nameInDb = "qnr_id")
    private Integer qnrId;// SFA_QNR_TEMPLATE表的ID(id)
    @Property(nameInDb = "qnr_path")
    private String qnrPath;//SFA_QNR_TEMPLATE表的QNR_PATH(问卷保存路径)
    @Property(nameInDb = "project_name")
    private String projectName;
    @Property(nameInDb = "dataround_name")
    private String dataroundName;
    @Property(nameInDb = "project_id")
    private Integer projectId;//SFA_PROJECT表的id(项目id)
    @Property(nameInDb = "investigate_condition")
    private Integer investigateCondition;
    @Property(nameInDb = "user_mobile_loginnumber")
    private String mobileLoginNumber;
    @Property(nameInDb = "data_round_order")
    private String dataroundOrder;
    @Property(nameInDb = "isAdd")
    private Integer storeIsAdd;

    @Generated(hash = 1256337994)
    public ExecPlan(Long id, Integer execPlanId, Integer periodId, Integer qnrTemplateId,
            Integer storeInfoId, Integer storeOriginalInfoId, Integer userId, String planExecDate,
            Integer qcPlanFlag, Integer redoPlanFlag, String execPlanStatusFlag, String region,
            String province, String city, String country, String district, String storeCode,
            String storeName, String storeAddress, String channelAbbr, String userLoginNumber,
            String userName, String qnrName, Integer qnrId, String qnrPath, String projectName,
            String dataroundName, Integer projectId, Integer investigateCondition,
            String mobileLoginNumber, String dataroundOrder, Integer storeIsAdd) {
        this.id = id;
        this.execPlanId = execPlanId;
        this.periodId = periodId;
        this.qnrTemplateId = qnrTemplateId;
        this.storeInfoId = storeInfoId;
        this.storeOriginalInfoId = storeOriginalInfoId;
        this.userId = userId;
        this.planExecDate = planExecDate;
        this.qcPlanFlag = qcPlanFlag;
        this.redoPlanFlag = redoPlanFlag;
        this.execPlanStatusFlag = execPlanStatusFlag;
        this.region = region;
        this.province = province;
        this.city = city;
        this.country = country;
        this.district = district;
        this.storeCode = storeCode;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.channelAbbr = channelAbbr;
        this.userLoginNumber = userLoginNumber;
        this.userName = userName;
        this.qnrName = qnrName;
        this.qnrId = qnrId;
        this.qnrPath = qnrPath;
        this.projectName = projectName;
        this.dataroundName = dataroundName;
        this.projectId = projectId;
        this.investigateCondition = investigateCondition;
        this.mobileLoginNumber = mobileLoginNumber;
        this.dataroundOrder = dataroundOrder;
        this.storeIsAdd = storeIsAdd;
    }

    @Generated(hash = 1221163513)
    public ExecPlan() {
    }

    @Override
    public String toString() {
        return "ExecPlan{" +
                "id=" + id +
                ", execPlanId=" + execPlanId +
                ", periodId=" + periodId +
                ", qnrTemplateId=" + qnrTemplateId +
                ", storeInfoId=" + storeInfoId +
                ", storeOriginalInfoId=" + storeOriginalInfoId +
                ", userId=" + userId +
                ", planExecDate='" + planExecDate + '\'' +
                ", qcPlanFlag=" + qcPlanFlag +
                ", redoPlanFlag=" + redoPlanFlag +
                ", execPlanStatusFlag='" + execPlanStatusFlag + '\'' +
                ", region='" + region + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", storeCode='" + storeCode + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", channelAbbr='" + channelAbbr + '\'' +
                ", userLoginNumber='" + userLoginNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", qnrName='" + qnrName + '\'' +
                ", qnrId=" + qnrId +
                ", qnrPath='" + qnrPath + '\'' +
                ", projectName='" + projectName + '\'' +
                ", dataroundName='" + dataroundName + '\'' +
                ", projectId=" + projectId +
                ", investigateCondition=" + investigateCondition +
                ", mobileLoginNumber='" + mobileLoginNumber + '\'' +
                ", dataroundOrder='" + dataroundOrder + '\'' +
                ", storeIsAdd=" + storeIsAdd +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getExecPlanId() {
        return execPlanId;
    }

    public void setExecPlanId(Integer execPlanId) {
        this.execPlanId = execPlanId;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Integer getQnrTemplateId() {
        return qnrTemplateId;
    }

    public void setQnrTemplateId(Integer qnrTemplateId) {
        this.qnrTemplateId = qnrTemplateId;
    }

    public Integer getStoreInfoId() {
        return storeInfoId;
    }

    public void setStoreInfoId(Integer storeInfoId) {
        this.storeInfoId = storeInfoId;
    }

    public Integer getStoreOriginalInfoId() {
        return storeOriginalInfoId;
    }

    public void setStoreOriginalInfoId(Integer storeOriginalInfoId) {
        this.storeOriginalInfoId = storeOriginalInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPlanExecDate() {
        return planExecDate;
    }

    public void setPlanExecDate(String planExecDate) {
        this.planExecDate = planExecDate;
    }

    public Integer getQcPlanFlag() {
        return qcPlanFlag;
    }

    public void setQcPlanFlag(Integer qcPlanFlag) {
        this.qcPlanFlag = qcPlanFlag;
    }

    public Integer getRedoPlanFlag() {
        return redoPlanFlag;
    }

    public void setRedoPlanFlag(Integer redoPlanFlag) {
        this.redoPlanFlag = redoPlanFlag;
    }

    public String getExecPlanStatusFlag() {
        return execPlanStatusFlag;
    }

    public void setExecPlanStatusFlag(String execPlanStatusFlag) {
        this.execPlanStatusFlag = execPlanStatusFlag;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getChannelAbbr() {
        return channelAbbr;
    }

    public void setChannelAbbr(String channelAbbr) {
        this.channelAbbr = channelAbbr;
    }

    public String getUserLoginNumber() {
        return userLoginNumber;
    }

    public void setUserLoginNumber(String userLoginNumber) {
        this.userLoginNumber = userLoginNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQnrName() {
        return qnrName;
    }

    public void setQnrName(String qnrName) {
        this.qnrName = qnrName;
    }

    public Integer getQnrId() {
        return qnrId;
    }

    public void setQnrId(Integer qnrId) {
        this.qnrId = qnrId;
    }

    public String getQnrPath() {
        return qnrPath;
    }

    public void setQnrPath(String qnrPath) {
        this.qnrPath = qnrPath;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDataroundName() {
        return dataroundName;
    }

    public void setDataroundName(String dataroundName) {
        this.dataroundName = dataroundName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getInvestigateCondition() {
        return investigateCondition;
    }

    public void setInvestigateCondition(Integer investigateCondition) {
        this.investigateCondition = investigateCondition;
    }

    public String getMobileLoginNumber() {
        return mobileLoginNumber;
    }

    public void setMobileLoginNumber(String mobileLoginNumber) {
        this.mobileLoginNumber = mobileLoginNumber;
    }

    public String getDataroundOrder() {
        return dataroundOrder;
    }

    public void setDataroundOrder(String dataroundOrder) {
        this.dataroundOrder = dataroundOrder;
    }

    public Integer getStoreIsAdd() {
        return storeIsAdd;
    }

    public void setStoreIsAdd(Integer storeIsAdd) {
        this.storeIsAdd = storeIsAdd;
    }
}

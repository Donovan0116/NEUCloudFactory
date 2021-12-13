package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class ProducePlan implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_suborder_id")
    private String pkSuborderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_administrator_useraccount")
    private String pkAdministratorUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_all_device_id")
    private String pkAllDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source Table: produce_plan")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_suborder_id")
    public String getPkSuborderId() {
        return pkSuborderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_suborder_id")
    public void setPkSuborderId(String pkSuborderId) {
        this.pkSuborderId = pkSuborderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_administrator_useraccount")
    public String getPkAdministratorUseraccount() {
        return pkAdministratorUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_administrator_useraccount")
    public void setPkAdministratorUseraccount(String pkAdministratorUseraccount) {
        this.pkAdministratorUseraccount = pkAdministratorUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_all_device_id")
    public String getPkAllDeviceId() {
        return pkAllDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.pk_all_device_id")
    public void setPkAllDeviceId(String pkAllDeviceId) {
        this.pkAllDeviceId = pkAllDeviceId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source Table: produce_plan")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", pkSuborderId=").append(pkSuborderId);
        sb.append(", pkAdministratorUseraccount=").append(pkAdministratorUseraccount);
        sb.append(", pkAllDeviceId=").append(pkAllDeviceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
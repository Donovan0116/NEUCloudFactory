package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoPlanList implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.order_state")
    private String orderState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source Table: vo_plan_list")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.order_state")
    public String getOrderState() {
        return orderState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.order_state")
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source Table: vo_plan_list")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", orderState=").append(orderState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
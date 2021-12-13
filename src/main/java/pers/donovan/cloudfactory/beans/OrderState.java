package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class OrderState implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.pk_order_state_id")
    private Byte pkOrderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.order_state_name")
    private String orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source Table: order_state")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.pk_order_state_id")
    public Byte getPkOrderStateId() {
        return pkOrderStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.pk_order_state_id")
    public void setPkOrderStateId(Byte pkOrderStateId) {
        this.pkOrderStateId = pkOrderStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.order_state_name")
    public String getOrderStateName() {
        return orderStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source field: order_state.order_state_name")
    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3735732+08:00", comments="Source Table: order_state")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderStateId=").append(pkOrderStateId);
        sb.append(", orderStateName=").append(orderStateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
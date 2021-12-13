package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoOrderStateName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4359479+08:00", comments="Source field: vo_order_state_name.order_state_name")
    private String orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4359479+08:00", comments="Source Table: vo_order_state_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4359479+08:00", comments="Source field: vo_order_state_name.order_state_name")
    public String getOrderStateName() {
        return orderStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4359479+08:00", comments="Source field: vo_order_state_name.order_state_name")
    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4359479+08:00", comments="Source Table: vo_order_state_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderStateName=").append(orderStateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
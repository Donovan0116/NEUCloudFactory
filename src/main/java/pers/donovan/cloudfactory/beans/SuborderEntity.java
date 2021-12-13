package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class SuborderEntity implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_suborder_id")
    private String pkSuborderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_id")
    private String productionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_num")
    private Short productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.finish_time")
    private Date finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.order_state_id")
    private Byte orderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source Table: suborder_entity")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_suborder_id")
    public String getPkSuborderId() {
        return pkSuborderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.pk_suborder_id")
    public void setPkSuborderId(String pkSuborderId) {
        this.pkSuborderId = pkSuborderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_id")
    public String getProductionId() {
        return productionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_id")
    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_num")
    public Short getProductionNum() {
        return productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3908972+08:00", comments="Source field: suborder_entity.production_num")
    public void setProductionNum(Short productionNum) {
        this.productionNum = productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.finish_time")
    public Date getFinishTime() {
        return finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.finish_time")
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.order_state_id")
    public Byte getOrderStateId() {
        return orderStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.order_state_id")
    public void setOrderStateId(Byte orderStateId) {
        this.orderStateId = orderStateId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source Table: suborder_entity")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", pkSuborderId=").append(pkSuborderId);
        sb.append(", productionId=").append(productionId);
        sb.append(", productionNum=").append(productionNum);
        sb.append(", startTime=").append(startTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", orderStateId=").append(orderStateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
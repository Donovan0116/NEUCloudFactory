package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class OrderEntity implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3695856+08:00", comments="Source field: order_entity.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.finish_time")
    private Date finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.dealer_useraccount")
    private String dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.dealer_address")
    private String dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.do_factory_name")
    private String doFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.order_state_id")
    private Byte orderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_id")
    private String productionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_num")
    private Short productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source Table: order_entity")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3695856+08:00", comments="Source field: order_entity.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.finish_time")
    public Date getFinishTime() {
        return finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.finish_time")
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.dealer_useraccount")
    public String getDealerUseraccount() {
        return dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.369785+08:00", comments="Source field: order_entity.dealer_useraccount")
    public void setDealerUseraccount(String dealerUseraccount) {
        this.dealerUseraccount = dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.dealer_address")
    public String getDealerAddress() {
        return dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.dealer_address")
    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.do_factory_name")
    public String getDoFactoryName() {
        return doFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.do_factory_name")
    public void setDoFactoryName(String doFactoryName) {
        this.doFactoryName = doFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.order_state_id")
    public Byte getOrderStateId() {
        return orderStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.order_state_id")
    public void setOrderStateId(Byte orderStateId) {
        this.orderStateId = orderStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_id")
    public String getProductionId() {
        return productionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_id")
    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_num")
    public Short getProductionNum() {
        return productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.production_num")
    public void setProductionNum(Short productionNum) {
        this.productionNum = productionNum;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source Table: order_entity")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", startTime=").append(startTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", dealerUseraccount=").append(dealerUseraccount);
        sb.append(", dealerAddress=").append(dealerAddress);
        sb.append(", doFactoryName=").append(doFactoryName);
        sb.append(", orderStateId=").append(orderStateId);
        sb.append(", productionId=").append(productionId);
        sb.append(", productionNum=").append(productionNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
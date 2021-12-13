package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class VoOrderEntity implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4104752+08:00", comments="Source field: vo_order_entity.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.finish_time")
    private Date finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_useraccount")
    private String dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_address")
    private String dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.do_factory_name")
    private String doFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.order_state_name")
    private String orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_name")
    private String productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_num")
    private Short productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.device_name")
    private String deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source Table: vo_order_entity")
    private static final long serialVersionUID = 1L;

    public VoOrderEntity(Short id, String pkOrderId, Date startTime, Date finishTime, String dealerUseraccount, String dealerAddress, String doFactoryName, String orderStateName, String productionName, Short productionNum, String deviceName) {
        this.id = id;
        this.pkOrderId = pkOrderId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.dealerUseraccount = dealerUseraccount;
        this.dealerAddress = dealerAddress;
        this.doFactoryName = doFactoryName;
        this.orderStateName = orderStateName;
        this.productionName = productionName;
        this.productionNum = productionNum;
        this.deviceName = deviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4104752+08:00", comments="Source field: vo_order_entity.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4104752+08:00", comments="Source field: vo_order_entity.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.finish_time")
    public Date getFinishTime() {
        return finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.finish_time")
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_useraccount")
    public String getDealerUseraccount() {
        return dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_useraccount")
    public void setDealerUseraccount(String dealerUseraccount) {
        this.dealerUseraccount = dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_address")
    public String getDealerAddress() {
        return dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.dealer_address")
    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.do_factory_name")
    public String getDoFactoryName() {
        return doFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.do_factory_name")
    public void setDoFactoryName(String doFactoryName) {
        this.doFactoryName = doFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.order_state_name")
    public String getOrderStateName() {
        return orderStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.order_state_name")
    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_name")
    public String getProductionName() {
        return productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_name")
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_num")
    public Short getProductionNum() {
        return productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.production_num")
    public void setProductionNum(Short productionNum) {
        this.productionNum = productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source field: vo_order_entity.device_name")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source Table: vo_order_entity")
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
        sb.append(", orderStateName=").append(orderStateName);
        sb.append(", productionName=").append(productionName);
        sb.append(", productionNum=").append(productionNum);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
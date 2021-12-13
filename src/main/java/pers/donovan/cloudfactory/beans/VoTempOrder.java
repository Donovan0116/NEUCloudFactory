package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class VoTempOrder implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_name")
    private String productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_num")
    private Short productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.finish_time")
    private Date finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.stop_time")
    private Date stopTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_useraccount")
    private String dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_address")
    private String dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.device_name")
    private String deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source Table: vo_temp_order")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_name")
    public String getProductionName() {
        return productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_name")
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_num")
    public Short getProductionNum() {
        return productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.production_num")
    public void setProductionNum(Short productionNum) {
        this.productionNum = productionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.finish_time")
    public Date getFinishTime() {
        return finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.finish_time")
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.stop_time")
    public Date getStopTime() {
        return stopTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.stop_time")
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_useraccount")
    public String getDealerUseraccount() {
        return dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_useraccount")
    public void setDealerUseraccount(String dealerUseraccount) {
        this.dealerUseraccount = dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_address")
    public String getDealerAddress() {
        return dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.dealer_address")
    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source field: vo_temp_order.device_name")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source Table: vo_temp_order")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", productionName=").append(productionName);
        sb.append(", productionNum=").append(productionNum);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", stopTime=").append(stopTime);
        sb.append(", dealerUseraccount=").append(dealerUseraccount);
        sb.append(", tel=").append(tel);
        sb.append(", dealerAddress=").append(dealerAddress);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package pers.donovan.cloudfactory.beans;

import java.util.Date;

public class form {
    private Date startTime;
    private String pkFactoryName;
    private String orderStateName;
    private String deviceName;

    public form(Date startTime, String pkFactoryName, String orderStateName, String deviceName) {
        this.startTime = startTime;
        this.pkFactoryName = pkFactoryName;
        this.orderStateName = orderStateName;
        this.deviceName = deviceName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getPkFactoryName() {
        return pkFactoryName;
    }

    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    public String getOrderStateName() {
        return orderStateName;
    }

    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}

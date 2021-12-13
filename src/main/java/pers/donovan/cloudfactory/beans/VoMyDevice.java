package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoMyDevice implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4174575+08:00", comments="Source field: vo_my_device.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.pk_factory_device_id")
    private String pkFactoryDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_name")
    private String factoryDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_type_name")
    private String deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_specification")
    private String factoryDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_state_name")
    private String deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.from_factory")
    private String fromFactory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source Table: vo_my_device")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.pk_factory_device_id")
    public String getPkFactoryDeviceId() {
        return pkFactoryDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.pk_factory_device_id")
    public void setPkFactoryDeviceId(String pkFactoryDeviceId) {
        this.pkFactoryDeviceId = pkFactoryDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_name")
    public String getFactoryDeviceName() {
        return factoryDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_name")
    public void setFactoryDeviceName(String factoryDeviceName) {
        this.factoryDeviceName = factoryDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_type_name")
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_type_name")
    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_specification")
    public String getFactoryDeviceSpecification() {
        return factoryDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.factory_device_specification")
    public void setFactoryDeviceSpecification(String factoryDeviceSpecification) {
        this.factoryDeviceSpecification = factoryDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_state_name")
    public String getDeviceStateName() {
        return deviceStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.device_state_name")
    public void setDeviceStateName(String deviceStateName) {
        this.deviceStateName = deviceStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.from_factory")
    public String getFromFactory() {
        return fromFactory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source field: vo_my_device.from_factory")
    public void setFromFactory(String fromFactory) {
        this.fromFactory = fromFactory;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.417804+08:00", comments="Source Table: vo_my_device")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkFactoryDeviceId=").append(pkFactoryDeviceId);
        sb.append(", factoryDeviceName=").append(factoryDeviceName);
        sb.append(", deviceTypeName=").append(deviceTypeName);
        sb.append(", factoryDeviceSpecification=").append(factoryDeviceSpecification);
        sb.append(", deviceStateName=").append(deviceStateName);
        sb.append(", fromFactory=").append(fromFactory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
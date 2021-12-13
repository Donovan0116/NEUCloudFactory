package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoRentDevice implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.pk_centre_device_id")
    private String pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_name")
    private String centreDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_type_name")
    private String deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_specification")
    private String centreDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_state_name")
    private String deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source Table: vo_rent_device")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.pk_centre_device_id")
    public String getPkCentreDeviceId() {
        return pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.pk_centre_device_id")
    public void setPkCentreDeviceId(String pkCentreDeviceId) {
        this.pkCentreDeviceId = pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_name")
    public String getCentreDeviceName() {
        return centreDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_name")
    public void setCentreDeviceName(String centreDeviceName) {
        this.centreDeviceName = centreDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_type_name")
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_type_name")
    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_specification")
    public String getCentreDeviceSpecification() {
        return centreDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.centre_device_specification")
    public void setCentreDeviceSpecification(String centreDeviceSpecification) {
        this.centreDeviceSpecification = centreDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_state_name")
    public String getDeviceStateName() {
        return deviceStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source field: vo_rent_device.device_state_name")
    public void setDeviceStateName(String deviceStateName) {
        this.deviceStateName = deviceStateName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source Table: vo_rent_device")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkCentreDeviceId=").append(pkCentreDeviceId);
        sb.append(", centreDeviceName=").append(centreDeviceName);
        sb.append(", deviceTypeName=").append(deviceTypeName);
        sb.append(", centreDeviceSpecification=").append(centreDeviceSpecification);
        sb.append(", deviceStateName=").append(deviceStateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
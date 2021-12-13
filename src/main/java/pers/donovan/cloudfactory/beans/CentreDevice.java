package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class CentreDevice implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.pk_centre_device_id")
    private String pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.centre_device_name")
    private String centreDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_type_id")
    private Byte centreDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_specification")
    private String centreDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_state_id")
    private Byte centreDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.rent_to_factory_name")
    private String rentToFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source Table: centre_device")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.pk_centre_device_id")
    public String getPkCentreDeviceId() {
        return pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source field: centre_device.pk_centre_device_id")
    public void setPkCentreDeviceId(String pkCentreDeviceId) {
        this.pkCentreDeviceId = pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_name")
    public String getCentreDeviceName() {
        return centreDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_name")
    public void setCentreDeviceName(String centreDeviceName) {
        this.centreDeviceName = centreDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_type_id")
    public Byte getCentreDeviceTypeId() {
        return centreDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_type_id")
    public void setCentreDeviceTypeId(Byte centreDeviceTypeId) {
        this.centreDeviceTypeId = centreDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_specification")
    public String getCentreDeviceSpecification() {
        return centreDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_specification")
    public void setCentreDeviceSpecification(String centreDeviceSpecification) {
        this.centreDeviceSpecification = centreDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_state_id")
    public Byte getCentreDeviceStateId() {
        return centreDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.centre_device_state_id")
    public void setCentreDeviceStateId(Byte centreDeviceStateId) {
        this.centreDeviceStateId = centreDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.rent_to_factory_name")
    public String getRentToFactoryName() {
        return rentToFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3366728+08:00", comments="Source field: centre_device.rent_to_factory_name")
    public void setRentToFactoryName(String rentToFactoryName) {
        this.rentToFactoryName = rentToFactoryName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3376696+08:00", comments="Source Table: centre_device")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkCentreDeviceId=").append(pkCentreDeviceId);
        sb.append(", centreDeviceName=").append(centreDeviceName);
        sb.append(", centreDeviceTypeId=").append(centreDeviceTypeId);
        sb.append(", centreDeviceSpecification=").append(centreDeviceSpecification);
        sb.append(", centreDeviceStateId=").append(centreDeviceStateId);
        sb.append(", rentToFactoryName=").append(rentToFactoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
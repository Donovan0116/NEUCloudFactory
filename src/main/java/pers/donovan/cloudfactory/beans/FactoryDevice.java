package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class FactoryDevice implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3646003+08:00", comments="Source field: factory_device.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.pk_factory_device_id")
    private String pkFactoryDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.factory_device_name")
    private String factoryDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.factory_device_type_id")
    private Byte factoryDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_specification")
    private String factoryDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_state_id")
    private Byte factoryDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.from_factory")
    private String fromFactory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source Table: factory_device")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3646003+08:00", comments="Source field: factory_device.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.pk_factory_device_id")
    public String getPkFactoryDeviceId() {
        return pkFactoryDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.pk_factory_device_id")
    public void setPkFactoryDeviceId(String pkFactoryDeviceId) {
        this.pkFactoryDeviceId = pkFactoryDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.factory_device_name")
    public String getFactoryDeviceName() {
        return factoryDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3651522+08:00", comments="Source field: factory_device.factory_device_name")
    public void setFactoryDeviceName(String factoryDeviceName) {
        this.factoryDeviceName = factoryDeviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_type_id")
    public Byte getFactoryDeviceTypeId() {
        return factoryDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_type_id")
    public void setFactoryDeviceTypeId(Byte factoryDeviceTypeId) {
        this.factoryDeviceTypeId = factoryDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_specification")
    public String getFactoryDeviceSpecification() {
        return factoryDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_specification")
    public void setFactoryDeviceSpecification(String factoryDeviceSpecification) {
        this.factoryDeviceSpecification = factoryDeviceSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_state_id")
    public Byte getFactoryDeviceStateId() {
        return factoryDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.factory_device_state_id")
    public void setFactoryDeviceStateId(Byte factoryDeviceStateId) {
        this.factoryDeviceStateId = factoryDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.from_factory")
    public String getFromFactory() {
        return fromFactory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source field: factory_device.from_factory")
    public void setFromFactory(String fromFactory) {
        this.fromFactory = fromFactory;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source Table: factory_device")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkFactoryDeviceId=").append(pkFactoryDeviceId);
        sb.append(", factoryDeviceName=").append(factoryDeviceName);
        sb.append(", factoryDeviceTypeId=").append(factoryDeviceTypeId);
        sb.append(", factoryDeviceSpecification=").append(factoryDeviceSpecification);
        sb.append(", factoryDeviceStateId=").append(factoryDeviceStateId);
        sb.append(", fromFactory=").append(fromFactory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
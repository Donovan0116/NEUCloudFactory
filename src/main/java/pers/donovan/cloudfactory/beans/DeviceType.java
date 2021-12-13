package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class DeviceType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.pk_device_type_id")
    private Byte pkDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.device_type_name")
    private String deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source Table: device_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.pk_device_type_id")
    public Byte getPkDeviceTypeId() {
        return pkDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.pk_device_type_id")
    public void setPkDeviceTypeId(Byte pkDeviceTypeId) {
        this.pkDeviceTypeId = pkDeviceTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3531049+08:00", comments="Source field: device_type.device_type_name")
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source field: device_type.device_type_name")
    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source Table: device_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkDeviceTypeId=").append(pkDeviceTypeId);
        sb.append(", deviceTypeName=").append(deviceTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
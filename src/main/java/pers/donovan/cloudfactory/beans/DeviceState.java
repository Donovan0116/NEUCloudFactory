package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class DeviceState implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3491702+08:00", comments="Source field: device_state.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3491702+08:00", comments="Source field: device_state.pk_device_state_id")
    private Byte pkDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.device_state_name")
    private String deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source Table: device_state")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3491702+08:00", comments="Source field: device_state.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3491702+08:00", comments="Source field: device_state.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.pk_device_state_id")
    public Byte getPkDeviceStateId() {
        return pkDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.pk_device_state_id")
    public void setPkDeviceStateId(Byte pkDeviceStateId) {
        this.pkDeviceStateId = pkDeviceStateId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.device_state_name")
    public String getDeviceStateName() {
        return deviceStateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.device_state_name")
    public void setDeviceStateName(String deviceStateName) {
        this.deviceStateName = deviceStateName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source Table: device_state")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkDeviceStateId=").append(pkDeviceStateId);
        sb.append(", deviceStateName=").append(deviceStateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
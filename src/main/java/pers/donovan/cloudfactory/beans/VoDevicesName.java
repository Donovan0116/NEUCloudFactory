package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoDevicesName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4330385+08:00", comments="Source field: vo_devices_name.device_name")
    private String deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4330385+08:00", comments="Source field: vo_devices_name.device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4330385+08:00", comments="Source field: vo_devices_name.device_name")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceName=").append(deviceName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
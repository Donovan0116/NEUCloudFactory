package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class AllDeviceId implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.pk_all_device_id")
    private String pkAllDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source Table: all_device_id")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.pk_all_device_id")
    public String getPkAllDeviceId() {
        return pkAllDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source field: all_device_id.pk_all_device_id")
    public void setPkAllDeviceId(String pkAllDeviceId) {
        this.pkAllDeviceId = pkAllDeviceId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3269409+08:00", comments="Source Table: all_device_id")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkAllDeviceId=").append(pkAllDeviceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
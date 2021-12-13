package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Rented implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_centre_device_id")
    private String pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_factory_name")
    private String pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.interval_time")
    private String intervalTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source Table: rented")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_centre_device_id")
    public String getPkCentreDeviceId() {
        return pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_centre_device_id")
    public void setPkCentreDeviceId(String pkCentreDeviceId) {
        this.pkCentreDeviceId = pkCentreDeviceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_factory_name")
    public String getPkFactoryName() {
        return pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.pk_factory_name")
    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3871162+08:00", comments="Source field: rented.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.interval_time")
    public String getIntervalTime() {
        return intervalTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.interval_time")
    public void setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source Table: rented")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkCentreDeviceId=").append(pkCentreDeviceId);
        sb.append(", pkFactoryName=").append(pkFactoryName);
        sb.append(", startTime=").append(startTime);
        sb.append(", intervalTime=").append(intervalTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
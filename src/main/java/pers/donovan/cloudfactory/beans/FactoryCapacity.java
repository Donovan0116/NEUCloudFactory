package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class FactoryCapacity implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3606129+08:00", comments="Source field: factory_capacity.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.pk_factory_name")
    private String pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.capacity")
    private Short capacity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source Table: factory_capacity")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3606129+08:00", comments="Source field: factory_capacity.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.pk_factory_name")
    public String getPkFactoryName() {
        return pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.pk_factory_name")
    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.capacity")
    public Short getCapacity() {
        return capacity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source field: factory_capacity.capacity")
    public void setCapacity(Short capacity) {
        this.capacity = capacity;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3610376+08:00", comments="Source Table: factory_capacity")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkFactoryName=").append(pkFactoryName);
        sb.append(", capacity=").append(capacity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
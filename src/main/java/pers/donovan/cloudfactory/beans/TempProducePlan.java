package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class TempProducePlan implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_order_id")
    private String pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_factory_name")
    private String pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source Table: temp_produce_plan")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_order_id")
    public String getPkOrderId() {
        return pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_order_id")
    public void setPkOrderId(String pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_factory_name")
    public String getPkFactoryName() {
        return pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source field: temp_produce_plan.pk_factory_name")
    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3985087+08:00", comments="Source Table: temp_produce_plan")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkOrderId=").append(pkOrderId);
        sb.append(", pkFactoryName=").append(pkFactoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
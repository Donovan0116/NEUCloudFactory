package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class Production implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.pk_production_id")
    private String pkProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.production_name")
    private String productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_type_id")
    private Byte productionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_specification")
    private String productionSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_brief")
    private String productionBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source Table: production")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.pk_production_id")
    public String getPkProductionId() {
        return pkProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source field: production.pk_production_id")
    public void setPkProductionId(String pkProductionId) {
        this.pkProductionId = pkProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_name")
    public String getProductionName() {
        return productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_name")
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_type_id")
    public Byte getProductionTypeId() {
        return productionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_type_id")
    public void setProductionTypeId(Byte productionTypeId) {
        this.productionTypeId = productionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_specification")
    public String getProductionSpecification() {
        return productionSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_specification")
    public void setProductionSpecification(String productionSpecification) {
        this.productionSpecification = productionSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_brief")
    public String getProductionBrief() {
        return productionBrief;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.production_brief")
    public void setProductionBrief(String productionBrief) {
        this.productionBrief = productionBrief;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source Table: production")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkProductionId=").append(pkProductionId);
        sb.append(", productionName=").append(productionName);
        sb.append(", productionTypeId=").append(productionTypeId);
        sb.append(", productionSpecification=").append(productionSpecification);
        sb.append(", productionBrief=").append(productionBrief);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
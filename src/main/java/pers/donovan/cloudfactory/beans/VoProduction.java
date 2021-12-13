package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoProduction implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4134689+08:00", comments="Source field: vo_production.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.pk_production_id")
    private String pkProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_name")
    private String productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_type_name")
    private String productionTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_specification")
    private String productionSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_brief")
    private String productionBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source Table: vo_production")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4134689+08:00", comments="Source field: vo_production.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.pk_production_id")
    public String getPkProductionId() {
        return pkProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.pk_production_id")
    public void setPkProductionId(String pkProductionId) {
        this.pkProductionId = pkProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_name")
    public String getProductionName() {
        return productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_name")
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_type_name")
    public String getProductionTypeName() {
        return productionTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4142172+08:00", comments="Source field: vo_production.production_type_name")
    public void setProductionTypeName(String productionTypeName) {
        this.productionTypeName = productionTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_specification")
    public String getProductionSpecification() {
        return productionSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_specification")
    public void setProductionSpecification(String productionSpecification) {
        this.productionSpecification = productionSpecification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_brief")
    public String getProductionBrief() {
        return productionBrief;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_brief")
    public void setProductionBrief(String productionBrief) {
        this.productionBrief = productionBrief;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source Table: vo_production")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkProductionId=").append(pkProductionId);
        sb.append(", productionName=").append(productionName);
        sb.append(", productionTypeName=").append(productionTypeName);
        sb.append(", productionSpecification=").append(productionSpecification);
        sb.append(", productionBrief=").append(productionBrief);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
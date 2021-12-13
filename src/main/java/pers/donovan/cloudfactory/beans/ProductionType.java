package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class ProductionType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source field: production_type.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3835476+08:00", comments="Source field: production_type.pk_production_type_id")
    private Byte pkProductionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source field: production_type.production_type_name")
    private String productionTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source Table: production_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source field: production_type.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3835476+08:00", comments="Source field: production_type.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3835476+08:00", comments="Source field: production_type.pk_production_type_id")
    public Byte getPkProductionTypeId() {
        return pkProductionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source field: production_type.pk_production_type_id")
    public void setPkProductionTypeId(Byte pkProductionTypeId) {
        this.pkProductionTypeId = pkProductionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source field: production_type.production_type_name")
    public String getProductionTypeName() {
        return productionTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source field: production_type.production_type_name")
    public void setProductionTypeName(String productionTypeName) {
        this.productionTypeName = productionTypeName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source Table: production_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkProductionTypeId=").append(pkProductionTypeId);
        sb.append(", productionTypeName=").append(productionTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
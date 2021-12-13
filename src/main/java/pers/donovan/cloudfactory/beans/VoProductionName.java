package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoProductionName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source field: vo_production_name.production_name")
    private String productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source field: vo_production_name.production_name")
    public String getProductionName() {
        return productionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source field: vo_production_name.production_name")
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productionName=").append(productionName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
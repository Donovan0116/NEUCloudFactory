package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class ContactAddress implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3411764+08:00", comments="Source field: contact_address.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_useraccount")
    private String dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_address")
    private String dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source Table: contact_address")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_useraccount")
    public String getDealerUseraccount() {
        return dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_useraccount")
    public void setDealerUseraccount(String dealerUseraccount) {
        this.dealerUseraccount = dealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_address")
    public String getDealerAddress() {
        return dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_address")
    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source Table: contact_address")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dealerUseraccount=").append(dealerUseraccount);
        sb.append(", dealerAddress=").append(dealerAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
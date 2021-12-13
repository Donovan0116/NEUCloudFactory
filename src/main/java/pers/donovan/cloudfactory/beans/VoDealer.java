package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoDealer implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.pk_useraccount")
    private String pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.dealer_address")
    private String dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.pk_useraccount")
    public String getPkUseraccount() {
        return pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.pk_useraccount")
    public void setPkUseraccount(String pkUseraccount) {
        this.pkUseraccount = pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4080955+08:00", comments="Source field: vo_dealer.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.dealer_address")
    public String getDealerAddress() {
        return dealerAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.dealer_address")
    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkUseraccount=").append(pkUseraccount);
        sb.append(", password=").append(password);
        sb.append(", tel=").append(tel);
        sb.append(", username=").append(username);
        sb.append(", dealerAddress=").append(dealerAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
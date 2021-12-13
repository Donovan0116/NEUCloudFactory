package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class VoAdministrator implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_useraccount")
    private String pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_factory_name")
    private String pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source Table: vo_administrator")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_useraccount")
    public String getPkUseraccount() {
        return pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_useraccount")
    public void setPkUseraccount(String pkUseraccount) {
        this.pkUseraccount = pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_factory_name")
    public String getPkFactoryName() {
        return pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.pk_factory_name")
    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source field: vo_administrator.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4014996+08:00", comments="Source Table: vo_administrator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkUseraccount=").append(pkUseraccount);
        sb.append(", pkFactoryName=").append(pkFactoryName);
        sb.append(", password=").append(password);
        sb.append(", tel=").append(tel);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class SuperAdministrator implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3942069+08:00", comments="Source field: super_administrator.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.pk_useraccount")
    private String pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.token")
    private String token;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source Table: super_administrator")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945174+08:00", comments="Source field: super_administrator.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.pk_useraccount")
    public String getPkUseraccount() {
        return pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.pk_useraccount")
    public void setPkUseraccount(String pkUseraccount) {
        this.pkUseraccount = pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.token")
    public String getToken() {
        return token;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source field: super_administrator.token")
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3945599+08:00", comments="Source Table: super_administrator")
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
        sb.append(", token=").append(token);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
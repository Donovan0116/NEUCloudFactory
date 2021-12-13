package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class Administrator implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2819826+08:00", comments="Source field: administrator.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2855781+08:00", comments="Source field: administrator.pk_useraccount")
    private String pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.token")
    private String token;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source Table: administrator")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2838187+08:00", comments="Source field: administrator.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2855781+08:00", comments="Source field: administrator.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.pk_useraccount")
    public String getPkUseraccount() {
        return pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.pk_useraccount")
    public void setPkUseraccount(String pkUseraccount) {
        this.pkUseraccount = pkUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2858144+08:00", comments="Source field: administrator.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.token")
    public String getToken() {
        return token;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source field: administrator.token")
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2868107+08:00", comments="Source Table: administrator")
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
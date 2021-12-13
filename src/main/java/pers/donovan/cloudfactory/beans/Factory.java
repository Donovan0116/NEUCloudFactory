package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import javax.annotation.Generated;

public class Factory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source field: factory.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.pk_factory_name")
    private String pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.factory_brief")
    private String factoryBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.administrator_useraccount")
    private String administratorUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.contact_user")
    private String contactUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.tel")
    private String tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.is_operation")
    private Byte isOperation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source Table: factory")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3566219+08:00", comments="Source field: factory.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.pk_factory_name")
    public String getPkFactoryName() {
        return pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.pk_factory_name")
    public void setPkFactoryName(String pkFactoryName) {
        this.pkFactoryName = pkFactoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.factory_brief")
    public String getFactoryBrief() {
        return factoryBrief;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.factory_brief")
    public void setFactoryBrief(String factoryBrief) {
        this.factoryBrief = factoryBrief;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.administrator_useraccount")
    public String getAdministratorUseraccount() {
        return administratorUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.administrator_useraccount")
    public void setAdministratorUseraccount(String administratorUseraccount) {
        this.administratorUseraccount = administratorUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.contact_user")
    public String getContactUser() {
        return contactUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.contact_user")
    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.tel")
    public String getTel() {
        return tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.tel")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.is_operation")
    public Byte getIsOperation() {
        return isOperation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source field: factory.is_operation")
    public void setIsOperation(Byte isOperation) {
        this.isOperation = isOperation;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3567346+08:00", comments="Source Table: factory")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkFactoryName=").append(pkFactoryName);
        sb.append(", factoryBrief=").append(factoryBrief);
        sb.append(", administratorUseraccount=").append(administratorUseraccount);
        sb.append(", contactUser=").append(contactUser);
        sb.append(", tel=").append(tel);
        sb.append(", isOperation=").append(isOperation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
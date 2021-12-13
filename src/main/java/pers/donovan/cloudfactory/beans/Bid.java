package pers.donovan.cloudfactory.beans;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Bid implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3296936+08:00", comments="Source field: bid.id")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3303882+08:00", comments="Source field: bid.pk_dealer_useraccount")
    private String pkDealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_administrator_useraccont")
    private String pkAdministratorUseraccont;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_temp_order_id")
    private String pkTempOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_start_time")
    private Date bidStartTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_finish_time")
    private Date bidFinishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_bid_useraccount")
    private String tempBidUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_production_id")
    private String tempProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.temp_production_num")
    private Short tempProductionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.finish_time")
    private Date finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source Table: bid")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3303882+08:00", comments="Source field: bid.id")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3303882+08:00", comments="Source field: bid.id")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3303882+08:00", comments="Source field: bid.pk_dealer_useraccount")
    public String getPkDealerUseraccount() {
        return pkDealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3303882+08:00", comments="Source field: bid.pk_dealer_useraccount")
    public void setPkDealerUseraccount(String pkDealerUseraccount) {
        this.pkDealerUseraccount = pkDealerUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_administrator_useraccont")
    public String getPkAdministratorUseraccont() {
        return pkAdministratorUseraccont;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_administrator_useraccont")
    public void setPkAdministratorUseraccont(String pkAdministratorUseraccont) {
        this.pkAdministratorUseraccont = pkAdministratorUseraccont;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_temp_order_id")
    public String getPkTempOrderId() {
        return pkTempOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.pk_temp_order_id")
    public void setPkTempOrderId(String pkTempOrderId) {
        this.pkTempOrderId = pkTempOrderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_start_time")
    public Date getBidStartTime() {
        return bidStartTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_start_time")
    public void setBidStartTime(Date bidStartTime) {
        this.bidStartTime = bidStartTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_finish_time")
    public Date getBidFinishTime() {
        return bidFinishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.bid_finish_time")
    public void setBidFinishTime(Date bidFinishTime) {
        this.bidFinishTime = bidFinishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_bid_useraccount")
    public String getTempBidUseraccount() {
        return tempBidUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_bid_useraccount")
    public void setTempBidUseraccount(String tempBidUseraccount) {
        this.tempBidUseraccount = tempBidUseraccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_production_id")
    public String getTempProductionId() {
        return tempProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3306908+08:00", comments="Source field: bid.temp_production_id")
    public void setTempProductionId(String tempProductionId) {
        this.tempProductionId = tempProductionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.temp_production_num")
    public Short getTempProductionNum() {
        return tempProductionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.temp_production_num")
    public void setTempProductionNum(Short tempProductionNum) {
        this.tempProductionNum = tempProductionNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.finish_time")
    public Date getFinishTime() {
        return finishTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source field: bid.finish_time")
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3316879+08:00", comments="Source Table: bid")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkDealerUseraccount=").append(pkDealerUseraccount);
        sb.append(", pkAdministratorUseraccont=").append(pkAdministratorUseraccont);
        sb.append(", pkTempOrderId=").append(pkTempOrderId);
        sb.append(", bidStartTime=").append(bidStartTime);
        sb.append(", bidFinishTime=").append(bidFinishTime);
        sb.append(", tempBidUseraccount=").append(tempBidUseraccount);
        sb.append(", tempProductionId=").append(tempProductionId);
        sb.append(", tempProductionNum=").append(tempProductionNum);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
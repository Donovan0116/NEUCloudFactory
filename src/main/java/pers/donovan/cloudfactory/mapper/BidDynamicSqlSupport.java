package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BidDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3324005+08:00", comments="Source Table: bid")
    public static final Bid bid = new Bid();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.id")
    public static final SqlColumn<Short> id = bid.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.pk_dealer_useraccount")
    public static final SqlColumn<String> pkDealerUseraccount = bid.pkDealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.pk_administrator_useraccont")
    public static final SqlColumn<String> pkAdministratorUseraccont = bid.pkAdministratorUseraccont;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.pk_temp_order_id")
    public static final SqlColumn<String> pkTempOrderId = bid.pkTempOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.bid_start_time")
    public static final SqlColumn<Date> bidStartTime = bid.bidStartTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.bid_finish_time")
    public static final SqlColumn<Date> bidFinishTime = bid.bidFinishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.temp_bid_useraccount")
    public static final SqlColumn<String> tempBidUseraccount = bid.tempBidUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.temp_production_id")
    public static final SqlColumn<String> tempProductionId = bid.tempProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.temp_production_num")
    public static final SqlColumn<Short> tempProductionNum = bid.tempProductionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source field: bid.finish_time")
    public static final SqlColumn<Date> finishTime = bid.finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3324005+08:00", comments="Source Table: bid")
    public static final class Bid extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkDealerUseraccount = column("pk_dealer_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> pkAdministratorUseraccont = column("pk_administrator_useraccont", JDBCType.VARCHAR);

        public final SqlColumn<String> pkTempOrderId = column("pk_temp_order_id", JDBCType.CHAR);

        public final SqlColumn<Date> bidStartTime = column("bid_start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> bidFinishTime = column("bid_finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> tempBidUseraccount = column("temp_bid_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> tempProductionId = column("temp_production_id", JDBCType.CHAR);

        public final SqlColumn<Short> tempProductionNum = column("temp_production_num", JDBCType.SMALLINT);

        public final SqlColumn<Date> finishTime = column("finish_time", JDBCType.TIMESTAMP);

        public Bid() {
            super("bid");
        }
    }
}
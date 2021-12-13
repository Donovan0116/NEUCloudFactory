package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoTempOrderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4205486+08:00", comments="Source Table: vo_temp_order")
    public static final VoTempOrder voTempOrder = new VoTempOrder();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.id")
    public static final SqlColumn<Short> id = voTempOrder.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.pk_order_id")
    public static final SqlColumn<String> pkOrderId = voTempOrder.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.production_name")
    public static final SqlColumn<String> productionName = voTempOrder.productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.production_num")
    public static final SqlColumn<Short> productionNum = voTempOrder.productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.finish_time")
    public static final SqlColumn<Date> finishTime = voTempOrder.finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.stop_time")
    public static final SqlColumn<Date> stopTime = voTempOrder.stopTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.dealer_useraccount")
    public static final SqlColumn<String> dealerUseraccount = voTempOrder.dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.tel")
    public static final SqlColumn<String> tel = voTempOrder.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.dealer_address")
    public static final SqlColumn<String> dealerAddress = voTempOrder.dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source field: vo_temp_order.device_name")
    public static final SqlColumn<String> deviceName = voTempOrder.deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source Table: vo_temp_order")
    public static final class VoTempOrder extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<String> productionName = column("production_name", JDBCType.VARCHAR);

        public final SqlColumn<Short> productionNum = column("production_num", JDBCType.SMALLINT);

        public final SqlColumn<Date> finishTime = column("finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> stopTime = column("stop_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> dealerUseraccount = column("dealer_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> dealerAddress = column("dealer_address", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceName = column("device_name", JDBCType.VARCHAR);

        public VoTempOrder() {
            super("vo_temp_order");
        }
    }
}
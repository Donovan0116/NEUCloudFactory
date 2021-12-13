package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoOrderEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4106336+08:00", comments="Source Table: vo_order_entity")
    public static final VoOrderEntity voOrderEntity = new VoOrderEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.id")
    public static final SqlColumn<Short> id = voOrderEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.pk_order_id")
    public static final SqlColumn<String> pkOrderId = voOrderEntity.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.start_time")
    public static final SqlColumn<Date> startTime = voOrderEntity.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.finish_time")
    public static final SqlColumn<Date> finishTime = voOrderEntity.finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.dealer_useraccount")
    public static final SqlColumn<String> dealerUseraccount = voOrderEntity.dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.dealer_address")
    public static final SqlColumn<String> dealerAddress = voOrderEntity.dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.do_factory_name")
    public static final SqlColumn<String> doFactoryName = voOrderEntity.doFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.order_state_name")
    public static final SqlColumn<String> orderStateName = voOrderEntity.orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.production_name")
    public static final SqlColumn<String> productionName = voOrderEntity.productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.production_num")
    public static final SqlColumn<Short> productionNum = voOrderEntity.productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source field: vo_order_entity.device_name")
    public static final SqlColumn<String> deviceName = voOrderEntity.deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    public static final class VoOrderEntity extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> finishTime = column("finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> dealerUseraccount = column("dealer_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> dealerAddress = column("dealer_address", JDBCType.VARCHAR);

        public final SqlColumn<String> doFactoryName = column("do_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<String> orderStateName = column("order_state_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productionName = column("production_name", JDBCType.VARCHAR);

        public final SqlColumn<Short> productionNum = column("production_num", JDBCType.SMALLINT);

        public final SqlColumn<String> deviceName = column("device_name", JDBCType.VARCHAR);

        public VoOrderEntity() {
            super("vo_order_entity");
        }
    }
}
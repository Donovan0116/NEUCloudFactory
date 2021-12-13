package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source Table: order_entity")
    public static final OrderEntity orderEntity = new OrderEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source field: order_entity.id")
    public static final SqlColumn<Short> id = orderEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.pk_order_id")
    public static final SqlColumn<String> pkOrderId = orderEntity.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.start_time")
    public static final SqlColumn<Date> startTime = orderEntity.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.finish_time")
    public static final SqlColumn<Date> finishTime = orderEntity.finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.dealer_useraccount")
    public static final SqlColumn<String> dealerUseraccount = orderEntity.dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.dealer_address")
    public static final SqlColumn<String> dealerAddress = orderEntity.dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.do_factory_name")
    public static final SqlColumn<String> doFactoryName = orderEntity.doFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.order_state_id")
    public static final SqlColumn<Byte> orderStateId = orderEntity.orderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.production_id")
    public static final SqlColumn<String> productionId = orderEntity.productionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3715796+08:00", comments="Source field: order_entity.production_num")
    public static final SqlColumn<Short> productionNum = orderEntity.productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3705821+08:00", comments="Source Table: order_entity")
    public static final class OrderEntity extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> finishTime = column("finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> dealerUseraccount = column("dealer_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> dealerAddress = column("dealer_address", JDBCType.VARCHAR);

        public final SqlColumn<String> doFactoryName = column("do_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> orderStateId = column("order_state_id", JDBCType.TINYINT);

        public final SqlColumn<String> productionId = column("production_id", JDBCType.VARCHAR);

        public final SqlColumn<Short> productionNum = column("production_num", JDBCType.SMALLINT);

        public OrderEntity() {
            super("order_entity");
        }
    }
}
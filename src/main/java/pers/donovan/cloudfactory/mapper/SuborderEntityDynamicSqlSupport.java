package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuborderEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source Table: suborder_entity")
    public static final SuborderEntity suborderEntity = new SuborderEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.id")
    public static final SqlColumn<Short> id = suborderEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.pk_order_id")
    public static final SqlColumn<String> pkOrderId = suborderEntity.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.pk_suborder_id")
    public static final SqlColumn<String> pkSuborderId = suborderEntity.pkSuborderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.production_id")
    public static final SqlColumn<String> productionId = suborderEntity.productionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source field: suborder_entity.production_num")
    public static final SqlColumn<Short> productionNum = suborderEntity.productionNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source field: suborder_entity.start_time")
    public static final SqlColumn<Date> startTime = suborderEntity.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source field: suborder_entity.finish_time")
    public static final SqlColumn<Date> finishTime = suborderEntity.finishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source field: suborder_entity.order_state_id")
    public static final SqlColumn<Byte> orderStateId = suborderEntity.orderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3915287+08:00", comments="Source Table: suborder_entity")
    public static final class SuborderEntity extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<String> pkSuborderId = column("pk_suborder_id", JDBCType.CHAR);

        public final SqlColumn<String> productionId = column("production_id", JDBCType.CHAR);

        public final SqlColumn<Short> productionNum = column("production_num", JDBCType.SMALLINT);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> finishTime = column("finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> orderStateId = column("order_state_id", JDBCType.TINYINT);

        public SuborderEntity() {
            super("suborder_entity");
        }
    }
}
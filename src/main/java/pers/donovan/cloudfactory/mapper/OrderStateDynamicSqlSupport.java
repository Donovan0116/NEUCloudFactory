package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderStateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    public static final OrderState orderState = new OrderState();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source field: order_state.id")
    public static final SqlColumn<Short> id = orderState.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source field: order_state.pk_order_state_id")
    public static final SqlColumn<Byte> pkOrderStateId = orderState.pkOrderStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source field: order_state.order_state_name")
    public static final SqlColumn<String> orderStateName = orderState.orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    public static final class OrderState extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<Byte> pkOrderStateId = column("pk_order_state_id", JDBCType.TINYINT);

        public final SqlColumn<String> orderStateName = column("order_state_name", JDBCType.VARCHAR);

        public OrderState() {
            super("order_state");
        }
    }
}
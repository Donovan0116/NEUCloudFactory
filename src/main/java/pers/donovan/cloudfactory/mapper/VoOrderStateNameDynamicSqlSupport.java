package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoOrderStateNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    public static final VoOrderStateName voOrderStateName = new VoOrderStateName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source field: vo_order_state_name.order_state_name")
    public static final SqlColumn<String> orderStateName = voOrderStateName.orderStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    public static final class VoOrderStateName extends SqlTable {
        public final SqlColumn<String> orderStateName = column("order_state_name", JDBCType.VARCHAR);

        public VoOrderStateName() {
            super("vo_order_state_name");
        }
    }
}
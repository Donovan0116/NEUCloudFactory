package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoPlanListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source Table: vo_plan_list")
    public static final VoPlanList voPlanList = new VoPlanList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.id")
    public static final SqlColumn<Short> id = voPlanList.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source field: vo_plan_list.pk_order_id")
    public static final SqlColumn<String> pkOrderId = voPlanList.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source field: vo_plan_list.order_state")
    public static final SqlColumn<String> orderState = voPlanList.orderState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4245581+08:00", comments="Source Table: vo_plan_list")
    public static final class VoPlanList extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<String> orderState = column("order_state", JDBCType.VARCHAR);

        public VoPlanList() {
            super("vo_plan_list");
        }
    }
}
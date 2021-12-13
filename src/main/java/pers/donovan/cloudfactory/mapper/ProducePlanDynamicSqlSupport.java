package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProducePlanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source Table: produce_plan")
    public static final ProducePlan producePlan = new ProducePlan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source field: produce_plan.id")
    public static final SqlColumn<Short> id = producePlan.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source field: produce_plan.pk_order_id")
    public static final SqlColumn<String> pkOrderId = producePlan.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source field: produce_plan.pk_suborder_id")
    public static final SqlColumn<String> pkSuborderId = producePlan.pkSuborderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source field: produce_plan.pk_administrator_useraccount")
    public static final SqlColumn<String> pkAdministratorUseraccount = producePlan.pkAdministratorUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source field: produce_plan.pk_all_device_id")
    public static final SqlColumn<String> pkAllDeviceId = producePlan.pkAllDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3765656+08:00", comments="Source Table: produce_plan")
    public static final class ProducePlan extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<String> pkSuborderId = column("pk_suborder_id", JDBCType.CHAR);

        public final SqlColumn<String> pkAdministratorUseraccount = column("pk_administrator_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> pkAllDeviceId = column("pk_all_device_id", JDBCType.CHAR);

        public ProducePlan() {
            super("produce_plan");
        }
    }
}
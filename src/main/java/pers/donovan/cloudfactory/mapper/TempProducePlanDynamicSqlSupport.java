package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TempProducePlanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3991799+08:00", comments="Source Table: temp_produce_plan")
    public static final TempProducePlan tempProducePlan = new TempProducePlan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3991799+08:00", comments="Source field: temp_produce_plan.id")
    public static final SqlColumn<Short> id = tempProducePlan.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source field: temp_produce_plan.pk_order_id")
    public static final SqlColumn<String> pkOrderId = tempProducePlan.pkOrderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source field: temp_produce_plan.pk_factory_name")
    public static final SqlColumn<String> pkFactoryName = tempProducePlan.pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3991799+08:00", comments="Source Table: temp_produce_plan")
    public static final class TempProducePlan extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkOrderId = column("pk_order_id", JDBCType.CHAR);

        public final SqlColumn<String> pkFactoryName = column("pk_factory_name", JDBCType.VARCHAR);

        public TempProducePlan() {
            super("temp_produce_plan");
        }
    }
}
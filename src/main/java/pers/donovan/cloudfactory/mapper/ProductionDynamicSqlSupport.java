package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProductionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source Table: production")
    public static final Production production = new Production();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.id")
    public static final SqlColumn<Short> id = production.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source field: production.pk_production_id")
    public static final SqlColumn<String> pkProductionId = production.pkProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.380555+08:00", comments="Source field: production.production_name")
    public static final SqlColumn<String> productionName = production.productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.380555+08:00", comments="Source field: production.production_type_id")
    public static final SqlColumn<Byte> productionTypeId = production.productionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.380793+08:00", comments="Source field: production.production_specification")
    public static final SqlColumn<String> productionSpecification = production.productionSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3808545+08:00", comments="Source field: production.production_brief")
    public static final SqlColumn<String> productionBrief = production.productionBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3795592+08:00", comments="Source Table: production")
    public static final class Production extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkProductionId = column("pk_production_id", JDBCType.CHAR);

        public final SqlColumn<String> productionName = column("production_name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> productionTypeId = column("production_type_id", JDBCType.TINYINT);

        public final SqlColumn<String> productionSpecification = column("production_specification", JDBCType.VARCHAR);

        public final SqlColumn<String> productionBrief = column("production_brief", JDBCType.VARCHAR);

        public Production() {
            super("production");
        }
    }
}
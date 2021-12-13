package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoProductionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source Table: vo_production")
    public static final VoProduction voProduction = new VoProduction();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.id")
    public static final SqlColumn<Short> id = voProduction.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.pk_production_id")
    public static final SqlColumn<String> pkProductionId = voProduction.pkProductionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source field: vo_production.production_name")
    public static final SqlColumn<String> productionName = voProduction.productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4154624+08:00", comments="Source field: vo_production.production_type_name")
    public static final SqlColumn<String> productionTypeName = voProduction.productionTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4154624+08:00", comments="Source field: vo_production.production_specification")
    public static final SqlColumn<String> productionSpecification = voProduction.productionSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4154624+08:00", comments="Source field: vo_production.production_brief")
    public static final SqlColumn<String> productionBrief = voProduction.productionBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4144647+08:00", comments="Source Table: vo_production")
    public static final class VoProduction extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkProductionId = column("pk_production_id", JDBCType.CHAR);

        public final SqlColumn<String> productionName = column("production_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productionTypeName = column("production_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productionSpecification = column("production_specification", JDBCType.VARCHAR);

        public final SqlColumn<String> productionBrief = column("production_brief", JDBCType.VARCHAR);

        public VoProduction() {
            super("vo_production");
        }
    }
}
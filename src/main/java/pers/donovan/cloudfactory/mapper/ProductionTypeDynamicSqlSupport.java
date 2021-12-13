package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProductionTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source Table: production_type")
    public static final ProductionType productionType = new ProductionType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source field: production_type.id")
    public static final SqlColumn<Short> id = productionType.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source field: production_type.pk_production_type_id")
    public static final SqlColumn<Byte> pkProductionTypeId = productionType.pkProductionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source field: production_type.production_type_name")
    public static final SqlColumn<String> productionTypeName = productionType.productionTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3837023+08:00", comments="Source Table: production_type")
    public static final class ProductionType extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<Byte> pkProductionTypeId = column("pk_production_type_id", JDBCType.TINYINT);

        public final SqlColumn<String> productionTypeName = column("production_type_name", JDBCType.VARCHAR);

        public ProductionType() {
            super("production_type");
        }
    }
}
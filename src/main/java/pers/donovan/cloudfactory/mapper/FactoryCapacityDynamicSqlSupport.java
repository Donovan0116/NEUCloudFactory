package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FactoryCapacityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source Table: factory_capacity")
    public static final FactoryCapacity factoryCapacity = new FactoryCapacity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source field: factory_capacity.id")
    public static final SqlColumn<Short> id = factoryCapacity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source field: factory_capacity.pk_factory_name")
    public static final SqlColumn<String> pkFactoryName = factoryCapacity.pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source field: factory_capacity.capacity")
    public static final SqlColumn<Short> capacity = factoryCapacity.capacity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source Table: factory_capacity")
    public static final class FactoryCapacity extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkFactoryName = column("pk_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<Short> capacity = column("capacity", JDBCType.SMALLINT);

        public FactoryCapacity() {
            super("factory_capacity");
        }
    }
}
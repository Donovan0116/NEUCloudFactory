package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FactoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3576198+08:00", comments="Source Table: factory")
    public static final Factory factory = new Factory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.id")
    public static final SqlColumn<Short> id = factory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.pk_factory_name")
    public static final SqlColumn<String> pkFactoryName = factory.pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.factory_brief")
    public static final SqlColumn<String> factoryBrief = factory.factoryBrief;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.administrator_useraccount")
    public static final SqlColumn<String> administratorUseraccount = factory.administratorUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.contact_user")
    public static final SqlColumn<String> contactUser = factory.contactUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source field: factory.tel")
    public static final SqlColumn<String> tel = factory.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source field: factory.is_operation")
    public static final SqlColumn<Byte> isOperation = factory.isOperation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.357853+08:00", comments="Source Table: factory")
    public static final class Factory extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkFactoryName = column("pk_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<String> factoryBrief = column("factory_brief", JDBCType.VARCHAR);

        public final SqlColumn<String> administratorUseraccount = column("administrator_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> contactUser = column("contact_user", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<Byte> isOperation = column("is_operation", JDBCType.TINYINT);

        public Factory() {
            super("factory");
        }
    }
}
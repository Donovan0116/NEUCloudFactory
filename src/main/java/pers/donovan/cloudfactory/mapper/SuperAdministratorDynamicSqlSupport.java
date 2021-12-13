package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuperAdministratorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3955157+08:00", comments="Source Table: super_administrator")
    public static final SuperAdministrator superAdministrator = new SuperAdministrator();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.id")
    public static final SqlColumn<Short> id = superAdministrator.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.pk_useraccount")
    public static final SqlColumn<String> pkUseraccount = superAdministrator.pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.password")
    public static final SqlColumn<String> password = superAdministrator.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.tel")
    public static final SqlColumn<String> tel = superAdministrator.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.username")
    public static final SqlColumn<String> username = superAdministrator.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source field: super_administrator.token")
    public static final SqlColumn<String> token = superAdministrator.token;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3955157+08:00", comments="Source Table: super_administrator")
    public static final class SuperAdministrator extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkUseraccount = column("pk_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> token = column("token", JDBCType.VARCHAR);

        public SuperAdministrator() {
            super("super_administrator");
        }
    }
}
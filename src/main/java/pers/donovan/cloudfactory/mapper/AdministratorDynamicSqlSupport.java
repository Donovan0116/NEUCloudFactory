package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AdministratorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.29905+08:00", comments="Source Table: administrator")
    public static final Administrator administrator = new Administrator();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.29905+08:00", comments="Source field: administrator.id")
    public static final SqlColumn<Short> id = administrator.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2998088+08:00", comments="Source field: administrator.pk_useraccount")
    public static final SqlColumn<String> pkUseraccount = administrator.pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2998088+08:00", comments="Source field: administrator.password")
    public static final SqlColumn<String> password = administrator.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.2998088+08:00", comments="Source field: administrator.tel")
    public static final SqlColumn<String> tel = administrator.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3008225+08:00", comments="Source field: administrator.username")
    public static final SqlColumn<String> username = administrator.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3008225+08:00", comments="Source field: administrator.token")
    public static final SqlColumn<String> token = administrator.token;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.29905+08:00", comments="Source Table: administrator")
    public static final class Administrator extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkUseraccount = column("pk_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> token = column("token", JDBCType.VARCHAR);

        public Administrator() {
            super("administrator");
        }
    }
}
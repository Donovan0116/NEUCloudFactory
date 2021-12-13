package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoAdministratorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    public static final VoAdministrator voAdministrator = new VoAdministrator();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.id")
    public static final SqlColumn<Short> id = voAdministrator.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.pk_useraccount")
    public static final SqlColumn<String> pkUseraccount = voAdministrator.pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.pk_factory_name")
    public static final SqlColumn<String> pkFactoryName = voAdministrator.pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.password")
    public static final SqlColumn<String> password = voAdministrator.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.tel")
    public static final SqlColumn<String> tel = voAdministrator.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source field: vo_administrator.username")
    public static final SqlColumn<String> username = voAdministrator.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    public static final class VoAdministrator extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkUseraccount = column("pk_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> pkFactoryName = column("pk_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public VoAdministrator() {
            super("vo_administrator");
        }
    }
}
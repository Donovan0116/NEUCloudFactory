package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DealerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3456506+08:00", comments="Source Table: dealer")
    public static final Dealer dealer = new Dealer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3462934+08:00", comments="Source field: dealer.id")
    public static final SqlColumn<Short> id = dealer.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3462934+08:00", comments="Source field: dealer.pk_useraccount")
    public static final SqlColumn<String> pkUseraccount = dealer.pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3466481+08:00", comments="Source field: dealer.password")
    public static final SqlColumn<String> password = dealer.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3466481+08:00", comments="Source field: dealer.tel")
    public static final SqlColumn<String> tel = dealer.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3466481+08:00", comments="Source field: dealer.username")
    public static final SqlColumn<String> username = dealer.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3466481+08:00", comments="Source field: dealer.token")
    public static final SqlColumn<String> token = dealer.token;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3462934+08:00", comments="Source Table: dealer")
    public static final class Dealer extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkUseraccount = column("pk_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> token = column("token", JDBCType.VARCHAR);

        public Dealer() {
            super("dealer");
        }
    }
}
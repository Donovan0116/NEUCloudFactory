package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoDealerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    public static final VoDealer voDealer = new VoDealer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.id")
    public static final SqlColumn<Short> id = voDealer.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.pk_useraccount")
    public static final SqlColumn<String> pkUseraccount = voDealer.pkUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.password")
    public static final SqlColumn<String> password = voDealer.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.tel")
    public static final SqlColumn<String> tel = voDealer.tel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.username")
    public static final SqlColumn<String> username = voDealer.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source field: vo_dealer.dealer_address")
    public static final SqlColumn<String> dealerAddress = voDealer.dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    public static final class VoDealer extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkUseraccount = column("pk_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("tel", JDBCType.CHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> dealerAddress = column("dealer_address", JDBCType.VARCHAR);

        public VoDealer() {
            super("vo_dealer");
        }
    }
}
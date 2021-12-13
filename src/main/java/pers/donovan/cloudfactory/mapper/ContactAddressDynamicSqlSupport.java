package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ContactAddressDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source Table: contact_address")
    public static final ContactAddress contactAddress = new ContactAddress();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.id")
    public static final SqlColumn<Short> id = contactAddress.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source field: contact_address.dealer_useraccount")
    public static final SqlColumn<String> dealerUseraccount = contactAddress.dealerUseraccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source field: contact_address.dealer_address")
    public static final SqlColumn<String> dealerAddress = contactAddress.dealerAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3416619+08:00", comments="Source Table: contact_address")
    public static final class ContactAddress extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> dealerUseraccount = column("dealer_useraccount", JDBCType.VARCHAR);

        public final SqlColumn<String> dealerAddress = column("dealer_address", JDBCType.VARCHAR);

        public ContactAddress() {
            super("contact_address");
        }
    }
}
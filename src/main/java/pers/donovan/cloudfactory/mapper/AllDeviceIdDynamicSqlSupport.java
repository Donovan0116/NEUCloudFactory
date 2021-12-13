package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AllDeviceIdDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    public static final AllDeviceId allDeviceId = new AllDeviceId();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source field: all_device_id.id")
    public static final SqlColumn<Short> id = allDeviceId.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source field: all_device_id.pk_all_device_id")
    public static final SqlColumn<String> pkAllDeviceId = allDeviceId.pkAllDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    public static final class AllDeviceId extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkAllDeviceId = column("pk_all_device_id", JDBCType.CHAR);

        public AllDeviceId() {
            super("all_device_id");
        }
    }
}
package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoDevicesNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    public static final VoDevicesName voDevicesName = new VoDevicesName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source field: vo_devices_name.device_name")
    public static final SqlColumn<String> deviceName = voDevicesName.deviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    public static final class VoDevicesName extends SqlTable {
        public final SqlColumn<String> deviceName = column("device_name", JDBCType.VARCHAR);

        public VoDevicesName() {
            super("vo_devices_name");
        }
    }
}
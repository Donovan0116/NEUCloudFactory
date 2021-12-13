package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DeviceStateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source Table: device_state")
    public static final DeviceState deviceState = new DeviceState();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.id")
    public static final SqlColumn<Short> id = deviceState.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.pk_device_state_id")
    public static final SqlColumn<Byte> pkDeviceStateId = deviceState.pkDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source field: device_state.device_state_name")
    public static final SqlColumn<String> deviceStateName = deviceState.deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3496409+08:00", comments="Source Table: device_state")
    public static final class DeviceState extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<Byte> pkDeviceStateId = column("pk_device_state_id", JDBCType.TINYINT);

        public final SqlColumn<String> deviceStateName = column("device_state_name", JDBCType.VARCHAR);

        public DeviceState() {
            super("device_state");
        }
    }
}
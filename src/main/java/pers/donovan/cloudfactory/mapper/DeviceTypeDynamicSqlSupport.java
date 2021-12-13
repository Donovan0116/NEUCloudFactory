package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DeviceTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source Table: device_type")
    public static final DeviceType deviceType = new DeviceType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source field: device_type.id")
    public static final SqlColumn<Short> id = deviceType.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source field: device_type.pk_device_type_id")
    public static final SqlColumn<Byte> pkDeviceTypeId = deviceType.pkDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source field: device_type.device_type_name")
    public static final SqlColumn<String> deviceTypeName = deviceType.deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source Table: device_type")
    public static final class DeviceType extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<Byte> pkDeviceTypeId = column("pk_device_type_id", JDBCType.TINYINT);

        public final SqlColumn<String> deviceTypeName = column("device_type_name", JDBCType.VARCHAR);

        public DeviceType() {
            super("device_type");
        }
    }
}
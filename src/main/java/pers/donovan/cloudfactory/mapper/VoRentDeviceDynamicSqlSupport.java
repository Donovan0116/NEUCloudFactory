package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoRentDeviceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4275069+08:00", comments="Source Table: vo_rent_device")
    public static final VoRentDevice voRentDevice = new VoRentDevice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.id")
    public static final SqlColumn<Short> id = voRentDevice.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.pk_centre_device_id")
    public static final SqlColumn<String> pkCentreDeviceId = voRentDevice.pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.centre_device_name")
    public static final SqlColumn<String> centreDeviceName = voRentDevice.centreDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.device_type_name")
    public static final SqlColumn<String> deviceTypeName = voRentDevice.deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.centre_device_specification")
    public static final SqlColumn<String> centreDeviceSpecification = voRentDevice.centreDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.428496+08:00", comments="Source field: vo_rent_device.device_state_name")
    public static final SqlColumn<String> deviceStateName = voRentDevice.deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4284271+08:00", comments="Source Table: vo_rent_device")
    public static final class VoRentDevice extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkCentreDeviceId = column("pk_centre_device_id", JDBCType.CHAR);

        public final SqlColumn<String> centreDeviceName = column("centre_device_name", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceTypeName = column("device_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> centreDeviceSpecification = column("centre_device_specification", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceStateName = column("device_state_name", JDBCType.VARCHAR);

        public VoRentDevice() {
            super("vo_rent_device");
        }
    }
}
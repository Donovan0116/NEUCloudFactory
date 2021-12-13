package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoCentreDeviceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source Table: vo_centre_device")
    public static final VoCentreDevice voCentreDevice = new VoCentreDevice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source field: vo_centre_device.id")
    public static final SqlColumn<Short> id = voCentreDevice.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source field: vo_centre_device.pk_centre_device_id")
    public static final SqlColumn<String> pkCentreDeviceId = voCentreDevice.pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source field: vo_centre_device.centre_device_name")
    public static final SqlColumn<String> centreDeviceName = voCentreDevice.centreDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source field: vo_centre_device.device_type_name")
    public static final SqlColumn<String> deviceTypeName = voCentreDevice.deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source field: vo_centre_device.centre_device_specification")
    public static final SqlColumn<String> centreDeviceSpecification = voCentreDevice.centreDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source field: vo_centre_device.device_state_name")
    public static final SqlColumn<String> deviceStateName = voCentreDevice.deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source field: vo_centre_device.rent_to_factory_name")
    public static final SqlColumn<String> rentToFactoryName = voCentreDevice.rentToFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.405488+08:00", comments="Source Table: vo_centre_device")
    public static final class VoCentreDevice extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkCentreDeviceId = column("pk_centre_device_id", JDBCType.CHAR);

        public final SqlColumn<String> centreDeviceName = column("centre_device_name", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceTypeName = column("device_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> centreDeviceSpecification = column("centre_device_specification", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceStateName = column("device_state_name", JDBCType.VARCHAR);

        public final SqlColumn<String> rentToFactoryName = column("rent_to_factory_name", JDBCType.VARCHAR);

        public VoCentreDevice() {
            super("vo_centre_device");
        }
    }
}
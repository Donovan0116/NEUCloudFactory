package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CentreDeviceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3380703+08:00", comments="Source Table: centre_device")
    public static final CentreDevice centreDevice = new CentreDevice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3380703+08:00", comments="Source field: centre_device.id")
    public static final SqlColumn<Short> id = centreDevice.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3380703+08:00", comments="Source field: centre_device.pk_centre_device_id")
    public static final SqlColumn<String> pkCentreDeviceId = centreDevice.pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source field: centre_device.centre_device_name")
    public static final SqlColumn<String> centreDeviceName = centreDevice.centreDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source field: centre_device.centre_device_type_id")
    public static final SqlColumn<Byte> centreDeviceTypeId = centreDevice.centreDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source field: centre_device.centre_device_specification")
    public static final SqlColumn<String> centreDeviceSpecification = centreDevice.centreDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source field: centre_device.centre_device_state_id")
    public static final SqlColumn<Byte> centreDeviceStateId = centreDevice.centreDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source field: centre_device.rent_to_factory_name")
    public static final SqlColumn<String> rentToFactoryName = centreDevice.rentToFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3380703+08:00", comments="Source Table: centre_device")
    public static final class CentreDevice extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkCentreDeviceId = column("pk_centre_device_id", JDBCType.CHAR);

        public final SqlColumn<String> centreDeviceName = column("centre_device_name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> centreDeviceTypeId = column("centre_device_type_id", JDBCType.TINYINT);

        public final SqlColumn<String> centreDeviceSpecification = column("centre_device_specification", JDBCType.VARCHAR);

        public final SqlColumn<Byte> centreDeviceStateId = column("centre_device_state_id", JDBCType.TINYINT);

        public final SqlColumn<String> rentToFactoryName = column("rent_to_factory_name", JDBCType.VARCHAR);

        public CentreDevice() {
            super("centre_device");
        }
    }
}
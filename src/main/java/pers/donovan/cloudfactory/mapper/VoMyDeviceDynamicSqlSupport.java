package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoMyDeviceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4184542+08:00", comments="Source Table: vo_my_device")
    public static final VoMyDevice voMyDevice = new VoMyDevice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.id")
    public static final SqlColumn<Short> id = voMyDevice.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.pk_factory_device_id")
    public static final SqlColumn<String> pkFactoryDeviceId = voMyDevice.pkFactoryDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.factory_device_name")
    public static final SqlColumn<String> factoryDeviceName = voMyDevice.factoryDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.device_type_name")
    public static final SqlColumn<String> deviceTypeName = voMyDevice.deviceTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.factory_device_specification")
    public static final SqlColumn<String> factoryDeviceSpecification = voMyDevice.factoryDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.device_state_name")
    public static final SqlColumn<String> deviceStateName = voMyDevice.deviceStateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source field: vo_my_device.from_factory")
    public static final SqlColumn<String> fromFactory = voMyDevice.fromFactory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    public static final class VoMyDevice extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkFactoryDeviceId = column("pk_factory_device_id", JDBCType.CHAR);

        public final SqlColumn<String> factoryDeviceName = column("factory_device_name", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceTypeName = column("device_type_name", JDBCType.VARCHAR);

        public final SqlColumn<String> factoryDeviceSpecification = column("factory_device_specification", JDBCType.VARCHAR);

        public final SqlColumn<String> deviceStateName = column("device_state_name", JDBCType.VARCHAR);

        public final SqlColumn<String> fromFactory = column("from_factory", JDBCType.VARCHAR);

        public VoMyDevice() {
            super("vo_my_device");
        }
    }
}
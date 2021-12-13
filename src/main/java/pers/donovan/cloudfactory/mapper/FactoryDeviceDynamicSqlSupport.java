package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FactoryDeviceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3655977+08:00", comments="Source Table: factory_device")
    public static final FactoryDevice factoryDevice = new FactoryDevice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.id")
    public static final SqlColumn<Short> id = factoryDevice.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.pk_factory_device_id")
    public static final SqlColumn<String> pkFactoryDeviceId = factoryDevice.pkFactoryDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.factory_device_name")
    public static final SqlColumn<String> factoryDeviceName = factoryDevice.factoryDeviceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.factory_device_type_id")
    public static final SqlColumn<Byte> factoryDeviceTypeId = factoryDevice.factoryDeviceTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.factory_device_specification")
    public static final SqlColumn<String> factoryDeviceSpecification = factoryDevice.factoryDeviceSpecification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.factory_device_state_id")
    public static final SqlColumn<Byte> factoryDeviceStateId = factoryDevice.factoryDeviceStateId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source field: factory_device.from_factory")
    public static final SqlColumn<String> fromFactory = factoryDevice.fromFactory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.366593+08:00", comments="Source Table: factory_device")
    public static final class FactoryDevice extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkFactoryDeviceId = column("pk_factory_device_id", JDBCType.CHAR);

        public final SqlColumn<String> factoryDeviceName = column("factory_device_name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> factoryDeviceTypeId = column("factory_device_type_id", JDBCType.TINYINT);

        public final SqlColumn<String> factoryDeviceSpecification = column("factory_device_specification", JDBCType.VARCHAR);

        public final SqlColumn<Byte> factoryDeviceStateId = column("factory_device_state_id", JDBCType.TINYINT);

        public final SqlColumn<String> fromFactory = column("from_factory", JDBCType.VARCHAR);

        public FactoryDevice() {
            super("factory_device");
        }
    }
}
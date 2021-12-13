package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RentedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source Table: rented")
    public static final Rented rented = new Rented();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.id")
    public static final SqlColumn<Short> id = rented.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.pk_centre_device_id")
    public static final SqlColumn<String> pkCentreDeviceId = rented.pkCentreDeviceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source field: rented.pk_factory_name")
    public static final SqlColumn<String> pkFactoryName = rented.pkFactoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3884178+08:00", comments="Source field: rented.start_time")
    public static final SqlColumn<Date> startTime = rented.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3884178+08:00", comments="Source field: rented.interval_time")
    public static final SqlColumn<String> intervalTime = rented.intervalTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3875362+08:00", comments="Source Table: rented")
    public static final class Rented extends SqlTable {
        public final SqlColumn<Short> id = column("id", JDBCType.SMALLINT);

        public final SqlColumn<String> pkCentreDeviceId = column("pk_centre_device_id", JDBCType.CHAR);

        public final SqlColumn<String> pkFactoryName = column("pk_factory_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> intervalTime = column("interval_time", JDBCType.VARCHAR);

        public Rented() {
            super("rented");
        }
    }
}
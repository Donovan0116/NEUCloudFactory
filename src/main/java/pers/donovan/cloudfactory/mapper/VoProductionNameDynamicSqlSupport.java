package pers.donovan.cloudfactory.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VoProductionNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    public static final VoProductionName voProductionName = new VoProductionName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source field: vo_production_name.production_name")
    public static final SqlColumn<String> productionName = voProductionName.productionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    public static final class VoProductionName extends SqlTable {
        public final SqlColumn<String> productionName = column("production_name", JDBCType.VARCHAR);

        public VoProductionName() {
            super("vo_production_name");
        }
    }
}
package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoDevicesNameDynamicSqlSupport.*;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import pers.donovan.cloudfactory.beans.VoDevicesName;

@Mapper
public interface VoDevicesNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    BasicColumn[] selectList = BasicColumn.columnList(deviceName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4339553+08:00", comments="Source Table: vo_devices_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.deviceName", before=false, resultType=String.class)
    int insert(InsertStatementProvider<VoDevicesName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoDevicesNameResult")
    Optional<VoDevicesName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoDevicesNameResult", value = {
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<VoDevicesName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voDevicesName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voDevicesName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default int deleteByPrimaryKey(String deviceName_) {
        return delete(c -> 
            c.where(deviceName, isEqualTo(deviceName_))
        );
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
//    default int insert(VoDevicesName record) {
//        return MyBatis3Utils.insert(this::insert, record, voDevicesName, c ->
//        );
//    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
//    default int insertSelective(VoDevicesName record) {
//        return MyBatis3Utils.insert(this::insert, record, voDevicesName, c ->
//        );
//    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default Optional<VoDevicesName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voDevicesName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default List<VoDevicesName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voDevicesName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default List<VoDevicesName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voDevicesName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voDevicesName, completer);
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
//    static UpdateDSL<UpdateModel> updateAllColumns(VoDevicesName record, UpdateDSL<UpdateModel> dsl) {
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4349523+08:00", comments="Source Table: vo_devices_name")
//    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoDevicesName record, UpdateDSL<UpdateModel> dsl) {
//    }
}
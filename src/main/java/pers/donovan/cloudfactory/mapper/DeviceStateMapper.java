package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.DeviceStateDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.DeviceState;

@Mapper
public interface DeviceStateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkDeviceStateId, deviceStateName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<DeviceState> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DeviceStateResult")
    Optional<DeviceState> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DeviceStateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_device_state_id", property="pkDeviceStateId", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="device_state_name", property="deviceStateName", jdbcType=JdbcType.VARCHAR)
    })
    List<DeviceState> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3506678+08:00", comments="Source Table: device_state")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default int deleteByPrimaryKey(Short id_, Byte pkDeviceStateId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkDeviceStateId, isEqualTo(pkDeviceStateId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default int insert(DeviceState record) {
        return MyBatis3Utils.insert(this::insert, record, deviceState, c ->
            c.map(pkDeviceStateId).toProperty("pkDeviceStateId")
            .map(deviceStateName).toProperty("deviceStateName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default int insertSelective(DeviceState record) {
        return MyBatis3Utils.insert(this::insert, record, deviceState, c ->
            c.map(pkDeviceStateId).toPropertyWhenPresent("pkDeviceStateId", record::getPkDeviceStateId)
            .map(deviceStateName).toPropertyWhenPresent("deviceStateName", record::getDeviceStateName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default Optional<DeviceState> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default List<DeviceState> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default List<DeviceState> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default Optional<DeviceState> selectByPrimaryKey(Short id_, Byte pkDeviceStateId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkDeviceStateId, isEqualTo(pkDeviceStateId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, deviceState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    static UpdateDSL<UpdateModel> updateAllColumns(DeviceState record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDeviceStateId).equalTo(record::getPkDeviceStateId)
                .set(deviceStateName).equalTo(record::getDeviceStateName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DeviceState record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDeviceStateId).equalToWhenPresent(record::getPkDeviceStateId)
                .set(deviceStateName).equalToWhenPresent(record::getDeviceStateName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.351634+08:00", comments="Source Table: device_state")
    default int updateByPrimaryKey(DeviceState record) {
        return update(c ->
            c.set(deviceStateName).equalTo(record::getDeviceStateName)
            .where(id, isEqualTo(record::getId))
            .and(pkDeviceStateId, isEqualTo(record::getPkDeviceStateId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3526321+08:00", comments="Source Table: device_state")
    default int updateByPrimaryKeySelective(DeviceState record) {
        return update(c ->
            c.set(deviceStateName).equalToWhenPresent(record::getDeviceStateName)
            .where(id, isEqualTo(record::getId))
            .and(pkDeviceStateId, isEqualTo(record::getPkDeviceStateId))
        );
    }
}
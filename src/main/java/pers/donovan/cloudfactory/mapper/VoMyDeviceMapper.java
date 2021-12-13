package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoMyDeviceDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoMyDevice;

@Mapper
public interface VoMyDeviceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkFactoryDeviceId, factoryDeviceName, deviceTypeName, factoryDeviceSpecification, deviceStateName, fromFactory);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoMyDevice> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoMyDeviceResult")
    Optional<VoMyDevice> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoMyDeviceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_factory_device_id", property="pkFactoryDeviceId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="factory_device_name", property="factoryDeviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_type_name", property="deviceTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_device_specification", property="factoryDeviceSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_state_name", property="deviceStateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="from_factory", property="fromFactory", jdbcType=JdbcType.VARCHAR)
    })
    List<VoMyDevice> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4185357+08:00", comments="Source Table: vo_my_device")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int deleteByPrimaryKey(Short id_, String pkFactoryDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkFactoryDeviceId, isEqualTo(pkFactoryDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int insert(VoMyDevice record) {
        return MyBatis3Utils.insert(this::insert, record, voMyDevice, c ->
            c.map(pkFactoryDeviceId).toProperty("pkFactoryDeviceId")
            .map(factoryDeviceName).toProperty("factoryDeviceName")
            .map(deviceTypeName).toProperty("deviceTypeName")
            .map(factoryDeviceSpecification).toProperty("factoryDeviceSpecification")
            .map(deviceStateName).toProperty("deviceStateName")
            .map(fromFactory).toProperty("fromFactory")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int insertSelective(VoMyDevice record) {
        return MyBatis3Utils.insert(this::insert, record, voMyDevice, c ->
            c.map(pkFactoryDeviceId).toPropertyWhenPresent("pkFactoryDeviceId", record::getPkFactoryDeviceId)
            .map(factoryDeviceName).toPropertyWhenPresent("factoryDeviceName", record::getFactoryDeviceName)
            .map(deviceTypeName).toPropertyWhenPresent("deviceTypeName", record::getDeviceTypeName)
            .map(factoryDeviceSpecification).toPropertyWhenPresent("factoryDeviceSpecification", record::getFactoryDeviceSpecification)
            .map(deviceStateName).toPropertyWhenPresent("deviceStateName", record::getDeviceStateName)
            .map(fromFactory).toPropertyWhenPresent("fromFactory", record::getFromFactory)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default Optional<VoMyDevice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default List<VoMyDevice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default List<VoMyDevice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default Optional<VoMyDevice> selectByPrimaryKey(Short id_, String pkFactoryDeviceId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkFactoryDeviceId, isEqualTo(pkFactoryDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voMyDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    static UpdateDSL<UpdateModel> updateAllColumns(VoMyDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryDeviceId).equalTo(record::getPkFactoryDeviceId)
                .set(factoryDeviceName).equalTo(record::getFactoryDeviceName)
                .set(deviceTypeName).equalTo(record::getDeviceTypeName)
                .set(factoryDeviceSpecification).equalTo(record::getFactoryDeviceSpecification)
                .set(deviceStateName).equalTo(record::getDeviceStateName)
                .set(fromFactory).equalTo(record::getFromFactory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoMyDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryDeviceId).equalToWhenPresent(record::getPkFactoryDeviceId)
                .set(factoryDeviceName).equalToWhenPresent(record::getFactoryDeviceName)
                .set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName)
                .set(factoryDeviceSpecification).equalToWhenPresent(record::getFactoryDeviceSpecification)
                .set(deviceStateName).equalToWhenPresent(record::getDeviceStateName)
                .set(fromFactory).equalToWhenPresent(record::getFromFactory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int updateByPrimaryKey(VoMyDevice record) {
        return update(c ->
            c.set(factoryDeviceName).equalTo(record::getFactoryDeviceName)
            .set(deviceTypeName).equalTo(record::getDeviceTypeName)
            .set(factoryDeviceSpecification).equalTo(record::getFactoryDeviceSpecification)
            .set(deviceStateName).equalTo(record::getDeviceStateName)
            .set(fromFactory).equalTo(record::getFromFactory)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryDeviceId, isEqualTo(record::getPkFactoryDeviceId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4194543+08:00", comments="Source Table: vo_my_device")
    default int updateByPrimaryKeySelective(VoMyDevice record) {
        return update(c ->
            c.set(factoryDeviceName).equalToWhenPresent(record::getFactoryDeviceName)
            .set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName)
            .set(factoryDeviceSpecification).equalToWhenPresent(record::getFactoryDeviceSpecification)
            .set(deviceStateName).equalToWhenPresent(record::getDeviceStateName)
            .set(fromFactory).equalToWhenPresent(record::getFromFactory)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryDeviceId, isEqualTo(record::getPkFactoryDeviceId))
        );
    }
}
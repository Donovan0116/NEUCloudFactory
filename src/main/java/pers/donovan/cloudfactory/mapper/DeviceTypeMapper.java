package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.DeviceTypeDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.DeviceType;

@Mapper
public interface DeviceTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkDeviceTypeId, deviceTypeName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3536293+08:00", comments="Source Table: device_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<DeviceType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DeviceTypeResult")
    Optional<DeviceType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DeviceTypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_device_type_id", property="pkDeviceTypeId", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="device_type_name", property="deviceTypeName", jdbcType=JdbcType.VARCHAR)
    })
    List<DeviceType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default int deleteByPrimaryKey(Short id_, Byte pkDeviceTypeId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkDeviceTypeId, isEqualTo(pkDeviceTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default int insert(DeviceType record) {
        return MyBatis3Utils.insert(this::insert, record, deviceType, c ->
            c.map(pkDeviceTypeId).toProperty("pkDeviceTypeId")
            .map(deviceTypeName).toProperty("deviceTypeName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default int insertSelective(DeviceType record) {
        return MyBatis3Utils.insert(this::insert, record, deviceType, c ->
            c.map(pkDeviceTypeId).toPropertyWhenPresent("pkDeviceTypeId", record::getPkDeviceTypeId)
            .map(deviceTypeName).toPropertyWhenPresent("deviceTypeName", record::getDeviceTypeName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default Optional<DeviceType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3546257+08:00", comments="Source Table: device_type")
    default List<DeviceType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    default List<DeviceType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    default Optional<DeviceType> selectByPrimaryKey(Short id_, Byte pkDeviceTypeId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkDeviceTypeId, isEqualTo(pkDeviceTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, deviceType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    static UpdateDSL<UpdateModel> updateAllColumns(DeviceType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDeviceTypeId).equalTo(record::getPkDeviceTypeId)
                .set(deviceTypeName).equalTo(record::getDeviceTypeName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DeviceType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDeviceTypeId).equalToWhenPresent(record::getPkDeviceTypeId)
                .set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    default int updateByPrimaryKey(DeviceType record) {
        return update(c ->
            c.set(deviceTypeName).equalTo(record::getDeviceTypeName)
            .where(id, isEqualTo(record::getId))
            .and(pkDeviceTypeId, isEqualTo(record::getPkDeviceTypeId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.355624+08:00", comments="Source Table: device_type")
    default int updateByPrimaryKeySelective(DeviceType record) {
        return update(c ->
            c.set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName)
            .where(id, isEqualTo(record::getId))
            .and(pkDeviceTypeId, isEqualTo(record::getPkDeviceTypeId))
        );
    }
}
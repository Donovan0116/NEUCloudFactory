package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoCentreDeviceDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoCentreDevice;

@Mapper
public interface VoCentreDeviceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkCentreDeviceId, centreDeviceName, deviceTypeName, centreDeviceSpecification, deviceStateName, rentToFactoryName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoCentreDevice> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoCentreDeviceResult")
    Optional<VoCentreDevice> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoCentreDeviceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_centre_device_id", property="pkCentreDeviceId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="centre_device_name", property="centreDeviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_type_name", property="deviceTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="centre_device_specification", property="centreDeviceSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_state_name", property="deviceStateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="rent_to_factory_name", property="rentToFactoryName", jdbcType=JdbcType.VARCHAR)
    })
    List<VoCentreDevice> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default int deleteByPrimaryKey(Short id_, String pkCentreDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default int insert(VoCentreDevice record) {
        return MyBatis3Utils.insert(this::insert, record, voCentreDevice, c ->
            c.map(pkCentreDeviceId).toProperty("pkCentreDeviceId")
            .map(centreDeviceName).toProperty("centreDeviceName")
            .map(deviceTypeName).toProperty("deviceTypeName")
            .map(centreDeviceSpecification).toProperty("centreDeviceSpecification")
            .map(deviceStateName).toProperty("deviceStateName")
            .map(rentToFactoryName).toProperty("rentToFactoryName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default int insertSelective(VoCentreDevice record) {
        return MyBatis3Utils.insert(this::insert, record, voCentreDevice, c ->
            c.map(pkCentreDeviceId).toPropertyWhenPresent("pkCentreDeviceId", record::getPkCentreDeviceId)
            .map(centreDeviceName).toPropertyWhenPresent("centreDeviceName", record::getCentreDeviceName)
            .map(deviceTypeName).toPropertyWhenPresent("deviceTypeName", record::getDeviceTypeName)
            .map(centreDeviceSpecification).toPropertyWhenPresent("centreDeviceSpecification", record::getCentreDeviceSpecification)
            .map(deviceStateName).toPropertyWhenPresent("deviceStateName", record::getDeviceStateName)
            .map(rentToFactoryName).toPropertyWhenPresent("rentToFactoryName", record::getRentToFactoryName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default Optional<VoCentreDevice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default List<VoCentreDevice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default List<VoCentreDevice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4064861+08:00", comments="Source Table: vo_centre_device")
    default Optional<VoCentreDevice> selectByPrimaryKey(Short id_, String pkCentreDeviceId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4074831+08:00", comments="Source Table: vo_centre_device")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voCentreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4074831+08:00", comments="Source Table: vo_centre_device")
    static UpdateDSL<UpdateModel> updateAllColumns(VoCentreDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalTo(record::getPkCentreDeviceId)
                .set(centreDeviceName).equalTo(record::getCentreDeviceName)
                .set(deviceTypeName).equalTo(record::getDeviceTypeName)
                .set(centreDeviceSpecification).equalTo(record::getCentreDeviceSpecification)
                .set(deviceStateName).equalTo(record::getDeviceStateName)
                .set(rentToFactoryName).equalTo(record::getRentToFactoryName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4074831+08:00", comments="Source Table: vo_centre_device")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoCentreDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalToWhenPresent(record::getPkCentreDeviceId)
                .set(centreDeviceName).equalToWhenPresent(record::getCentreDeviceName)
                .set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName)
                .set(centreDeviceSpecification).equalToWhenPresent(record::getCentreDeviceSpecification)
                .set(deviceStateName).equalToWhenPresent(record::getDeviceStateName)
                .set(rentToFactoryName).equalToWhenPresent(record::getRentToFactoryName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4074831+08:00", comments="Source Table: vo_centre_device")
    default int updateByPrimaryKey(VoCentreDevice record) {
        return update(c ->
            c.set(centreDeviceName).equalTo(record::getCentreDeviceName)
            .set(deviceTypeName).equalTo(record::getDeviceTypeName)
            .set(centreDeviceSpecification).equalTo(record::getCentreDeviceSpecification)
            .set(deviceStateName).equalTo(record::getDeviceStateName)
            .set(rentToFactoryName).equalTo(record::getRentToFactoryName)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4074831+08:00", comments="Source Table: vo_centre_device")
    default int updateByPrimaryKeySelective(VoCentreDevice record) {
        return update(c ->
            c.set(centreDeviceName).equalToWhenPresent(record::getCentreDeviceName)
            .set(deviceTypeName).equalToWhenPresent(record::getDeviceTypeName)
            .set(centreDeviceSpecification).equalToWhenPresent(record::getCentreDeviceSpecification)
            .set(deviceStateName).equalToWhenPresent(record::getDeviceStateName)
            .set(rentToFactoryName).equalToWhenPresent(record::getRentToFactoryName)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
        );
    }
}
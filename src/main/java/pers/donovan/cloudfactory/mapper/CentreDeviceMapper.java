package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.CentreDeviceDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.CentreDevice;

@Mapper
public interface CentreDeviceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkCentreDeviceId, centreDeviceName, centreDeviceTypeId, centreDeviceSpecification, centreDeviceStateId, rentToFactoryName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source Table: centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source Table: centre_device")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source Table: centre_device")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<CentreDevice> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source Table: centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CentreDeviceResult")
    Optional<CentreDevice> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3386682+08:00", comments="Source Table: centre_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CentreDeviceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_centre_device_id", property="pkCentreDeviceId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="centre_device_name", property="centreDeviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="centre_device_type_id", property="centreDeviceTypeId", jdbcType=JdbcType.TINYINT),
        @Result(column="centre_device_specification", property="centreDeviceSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="centre_device_state_id", property="centreDeviceStateId", jdbcType=JdbcType.TINYINT),
        @Result(column="rent_to_factory_name", property="rentToFactoryName", jdbcType=JdbcType.VARCHAR)
    })
    List<CentreDevice> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default int deleteByPrimaryKey(Short id_, String pkCentreDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default int insert(CentreDevice record) {
        return MyBatis3Utils.insert(this::insert, record, centreDevice, c ->
            c.map(pkCentreDeviceId).toProperty("pkCentreDeviceId")
            .map(centreDeviceName).toProperty("centreDeviceName")
            .map(centreDeviceTypeId).toProperty("centreDeviceTypeId")
            .map(centreDeviceSpecification).toProperty("centreDeviceSpecification")
            .map(centreDeviceStateId).toProperty("centreDeviceStateId")
            .map(rentToFactoryName).toProperty("rentToFactoryName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default int insertSelective(CentreDevice record) {
        return MyBatis3Utils.insert(this::insert, record, centreDevice, c ->
            c.map(pkCentreDeviceId).toPropertyWhenPresent("pkCentreDeviceId", record::getPkCentreDeviceId)
            .map(centreDeviceName).toPropertyWhenPresent("centreDeviceName", record::getCentreDeviceName)
            .map(centreDeviceTypeId).toPropertyWhenPresent("centreDeviceTypeId", record::getCentreDeviceTypeId)
            .map(centreDeviceSpecification).toPropertyWhenPresent("centreDeviceSpecification", record::getCentreDeviceSpecification)
            .map(centreDeviceStateId).toPropertyWhenPresent("centreDeviceStateId", record::getCentreDeviceStateId)
            .map(rentToFactoryName).toPropertyWhenPresent("rentToFactoryName", record::getRentToFactoryName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default Optional<CentreDevice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default List<CentreDevice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default List<CentreDevice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default Optional<CentreDevice> selectByPrimaryKey(Short id_, String pkCentreDeviceId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3396676+08:00", comments="Source Table: centre_device")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, centreDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3406645+08:00", comments="Source Table: centre_device")
    static UpdateDSL<UpdateModel> updateAllColumns(CentreDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalTo(record::getPkCentreDeviceId)
                .set(centreDeviceName).equalTo(record::getCentreDeviceName)
                .set(centreDeviceTypeId).equalTo(record::getCentreDeviceTypeId)
                .set(centreDeviceSpecification).equalTo(record::getCentreDeviceSpecification)
                .set(centreDeviceStateId).equalTo(record::getCentreDeviceStateId)
                .set(rentToFactoryName).equalTo(record::getRentToFactoryName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3406645+08:00", comments="Source Table: centre_device")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CentreDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalToWhenPresent(record::getPkCentreDeviceId)
                .set(centreDeviceName).equalToWhenPresent(record::getCentreDeviceName)
                .set(centreDeviceTypeId).equalToWhenPresent(record::getCentreDeviceTypeId)
                .set(centreDeviceSpecification).equalToWhenPresent(record::getCentreDeviceSpecification)
                .set(centreDeviceStateId).equalToWhenPresent(record::getCentreDeviceStateId)
                .set(rentToFactoryName).equalToWhenPresent(record::getRentToFactoryName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3406645+08:00", comments="Source Table: centre_device")
    default int updateByPrimaryKey(CentreDevice record) {
        return update(c ->
            c.set(centreDeviceName).equalTo(record::getCentreDeviceName)
            .set(centreDeviceTypeId).equalTo(record::getCentreDeviceTypeId)
            .set(centreDeviceSpecification).equalTo(record::getCentreDeviceSpecification)
            .set(centreDeviceStateId).equalTo(record::getCentreDeviceStateId)
            .set(rentToFactoryName).equalTo(record::getRentToFactoryName)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3406645+08:00", comments="Source Table: centre_device")
    default int updateByPrimaryKeySelective(CentreDevice record) {
        return update(c ->
            c.set(centreDeviceName).equalToWhenPresent(record::getCentreDeviceName)
            .set(centreDeviceTypeId).equalToWhenPresent(record::getCentreDeviceTypeId)
            .set(centreDeviceSpecification).equalToWhenPresent(record::getCentreDeviceSpecification)
            .set(centreDeviceStateId).equalToWhenPresent(record::getCentreDeviceStateId)
            .set(rentToFactoryName).equalToWhenPresent(record::getRentToFactoryName)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
        );
    }
}
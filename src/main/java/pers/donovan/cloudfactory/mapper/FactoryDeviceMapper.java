package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.FactoryDeviceDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.FactoryDevice;

@Mapper
public interface FactoryDeviceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkFactoryDeviceId, factoryDeviceName, factoryDeviceTypeId, factoryDeviceSpecification, factoryDeviceStateId, fromFactory);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source Table: factory_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source Table: factory_device")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source Table: factory_device")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<FactoryDevice> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3666878+08:00", comments="Source Table: factory_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FactoryDeviceResult")
    Optional<FactoryDevice> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3675927+08:00", comments="Source Table: factory_device")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FactoryDeviceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_factory_device_id", property="pkFactoryDeviceId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="factory_device_name", property="factoryDeviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_device_type_id", property="factoryDeviceTypeId", jdbcType=JdbcType.TINYINT),
        @Result(column="factory_device_specification", property="factoryDeviceSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="factory_device_state_id", property="factoryDeviceStateId", jdbcType=JdbcType.TINYINT),
        @Result(column="from_factory", property="fromFactory", jdbcType=JdbcType.VARCHAR)
    })
    List<FactoryDevice> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3675927+08:00", comments="Source Table: factory_device")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3675927+08:00", comments="Source Table: factory_device")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default int deleteByPrimaryKey(Short id_, String pkFactoryDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkFactoryDeviceId, isEqualTo(pkFactoryDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default int insert(FactoryDevice record) {
        return MyBatis3Utils.insert(this::insert, record, factoryDevice, c ->
            c.map(pkFactoryDeviceId).toProperty("pkFactoryDeviceId")
            .map(factoryDeviceName).toProperty("factoryDeviceName")
            .map(factoryDeviceTypeId).toProperty("factoryDeviceTypeId")
            .map(factoryDeviceSpecification).toProperty("factoryDeviceSpecification")
            .map(factoryDeviceStateId).toProperty("factoryDeviceStateId")
            .map(fromFactory).toProperty("fromFactory")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default int insertSelective(FactoryDevice record) {
        return MyBatis3Utils.insert(this::insert, record, factoryDevice, c ->
            c.map(pkFactoryDeviceId).toPropertyWhenPresent("pkFactoryDeviceId", record::getPkFactoryDeviceId)
            .map(factoryDeviceName).toPropertyWhenPresent("factoryDeviceName", record::getFactoryDeviceName)
            .map(factoryDeviceTypeId).toPropertyWhenPresent("factoryDeviceTypeId", record::getFactoryDeviceTypeId)
            .map(factoryDeviceSpecification).toPropertyWhenPresent("factoryDeviceSpecification", record::getFactoryDeviceSpecification)
            .map(factoryDeviceStateId).toPropertyWhenPresent("factoryDeviceStateId", record::getFactoryDeviceStateId)
            .map(fromFactory).toPropertyWhenPresent("fromFactory", record::getFromFactory)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default Optional<FactoryDevice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default List<FactoryDevice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default List<FactoryDevice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default Optional<FactoryDevice> selectByPrimaryKey(Short id_, String pkFactoryDeviceId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkFactoryDeviceId, isEqualTo(pkFactoryDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3678683+08:00", comments="Source Table: factory_device")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, factoryDevice, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3685869+08:00", comments="Source Table: factory_device")
    static UpdateDSL<UpdateModel> updateAllColumns(FactoryDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryDeviceId).equalTo(record::getPkFactoryDeviceId)
                .set(factoryDeviceName).equalTo(record::getFactoryDeviceName)
                .set(factoryDeviceTypeId).equalTo(record::getFactoryDeviceTypeId)
                .set(factoryDeviceSpecification).equalTo(record::getFactoryDeviceSpecification)
                .set(factoryDeviceStateId).equalTo(record::getFactoryDeviceStateId)
                .set(fromFactory).equalTo(record::getFromFactory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3685869+08:00", comments="Source Table: factory_device")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FactoryDevice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryDeviceId).equalToWhenPresent(record::getPkFactoryDeviceId)
                .set(factoryDeviceName).equalToWhenPresent(record::getFactoryDeviceName)
                .set(factoryDeviceTypeId).equalToWhenPresent(record::getFactoryDeviceTypeId)
                .set(factoryDeviceSpecification).equalToWhenPresent(record::getFactoryDeviceSpecification)
                .set(factoryDeviceStateId).equalToWhenPresent(record::getFactoryDeviceStateId)
                .set(fromFactory).equalToWhenPresent(record::getFromFactory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.368808+08:00", comments="Source Table: factory_device")
    default int updateByPrimaryKey(FactoryDevice record) {
        return update(c ->
            c.set(factoryDeviceName).equalTo(record::getFactoryDeviceName)
            .set(factoryDeviceTypeId).equalTo(record::getFactoryDeviceTypeId)
            .set(factoryDeviceSpecification).equalTo(record::getFactoryDeviceSpecification)
            .set(factoryDeviceStateId).equalTo(record::getFactoryDeviceStateId)
            .set(fromFactory).equalTo(record::getFromFactory)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryDeviceId, isEqualTo(record::getPkFactoryDeviceId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.368808+08:00", comments="Source Table: factory_device")
    default int updateByPrimaryKeySelective(FactoryDevice record) {
        return update(c ->
            c.set(factoryDeviceName).equalToWhenPresent(record::getFactoryDeviceName)
            .set(factoryDeviceTypeId).equalToWhenPresent(record::getFactoryDeviceTypeId)
            .set(factoryDeviceSpecification).equalToWhenPresent(record::getFactoryDeviceSpecification)
            .set(factoryDeviceStateId).equalToWhenPresent(record::getFactoryDeviceStateId)
            .set(fromFactory).equalToWhenPresent(record::getFromFactory)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryDeviceId, isEqualTo(record::getPkFactoryDeviceId))
        );
    }
}
package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.RentedDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.Rented;

@Mapper
public interface RentedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkCentreDeviceId, pkFactoryName, startTime, intervalTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<Rented> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RentedResult")
    Optional<Rented> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RentedResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_centre_device_id", property="pkCentreDeviceId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="pk_factory_name", property="pkFactoryName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="interval_time", property="intervalTime", jdbcType=JdbcType.VARCHAR)
    })
    List<Rented> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    default int deleteByPrimaryKey(Short id_, String pkCentreDeviceId_, String pkFactoryName_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    default int insert(Rented record) {
        return MyBatis3Utils.insert(this::insert, record, rented, c ->
            c.map(pkCentreDeviceId).toProperty("pkCentreDeviceId")
            .map(pkFactoryName).toProperty("pkFactoryName")
            .map(startTime).toProperty("startTime")
            .map(intervalTime).toProperty("intervalTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3885331+08:00", comments="Source Table: rented")
    default int insertSelective(Rented record) {
        return MyBatis3Utils.insert(this::insert, record, rented, c ->
            c.map(pkCentreDeviceId).toPropertyWhenPresent("pkCentreDeviceId", record::getPkCentreDeviceId)
            .map(pkFactoryName).toPropertyWhenPresent("pkFactoryName", record::getPkFactoryName)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(intervalTime).toPropertyWhenPresent("intervalTime", record::getIntervalTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    default Optional<Rented> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    default List<Rented> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    default List<Rented> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    default Optional<Rented> selectByPrimaryKey(Short id_, String pkCentreDeviceId_, String pkFactoryName_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkCentreDeviceId, isEqualTo(pkCentreDeviceId_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3895305+08:00", comments="Source Table: rented")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rented, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3899414+08:00", comments="Source Table: rented")
    static UpdateDSL<UpdateModel> updateAllColumns(Rented record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalTo(record::getPkCentreDeviceId)
                .set(pkFactoryName).equalTo(record::getPkFactoryName)
                .set(startTime).equalTo(record::getStartTime)
                .set(intervalTime).equalTo(record::getIntervalTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3899414+08:00", comments="Source Table: rented")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Rented record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkCentreDeviceId).equalToWhenPresent(record::getPkCentreDeviceId)
                .set(pkFactoryName).equalToWhenPresent(record::getPkFactoryName)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(intervalTime).equalToWhenPresent(record::getIntervalTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3899414+08:00", comments="Source Table: rented")
    default int updateByPrimaryKey(Rented record) {
        return update(c ->
            c.set(startTime).equalTo(record::getStartTime)
            .set(intervalTime).equalTo(record::getIntervalTime)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3899414+08:00", comments="Source Table: rented")
    default int updateByPrimaryKeySelective(Rented record) {
        return update(c ->
            c.set(startTime).equalToWhenPresent(record::getStartTime)
            .set(intervalTime).equalToWhenPresent(record::getIntervalTime)
            .where(id, isEqualTo(record::getId))
            .and(pkCentreDeviceId, isEqualTo(record::getPkCentreDeviceId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }
}
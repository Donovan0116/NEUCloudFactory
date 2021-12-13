package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoOrderEntityDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoOrderEntity;

@Mapper
public interface VoOrderEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, startTime, finishTime, dealerUseraccount, dealerAddress, doFactoryName, orderStateName, productionName, productionNum, deviceName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoOrderEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoOrderEntityResult")
    Optional<VoOrderEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoOrderEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="finish_time", property="finishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dealer_useraccount", property="dealerUseraccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealer_address", property="dealerAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="do_factory_name", property="doFactoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_state_name", property="orderStateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_name", property="productionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_num", property="productionNum", jdbcType=JdbcType.SMALLINT),
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR)
    })
    List<VoOrderEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4114833+08:00", comments="Source Table: vo_order_entity")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default int insert(VoOrderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, voOrderEntity, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(startTime).toProperty("startTime")
            .map(finishTime).toProperty("finishTime")
            .map(dealerUseraccount).toProperty("dealerUseraccount")
            .map(dealerAddress).toProperty("dealerAddress")
            .map(doFactoryName).toProperty("doFactoryName")
            .map(orderStateName).toProperty("orderStateName")
            .map(productionName).toProperty("productionName")
            .map(productionNum).toProperty("productionNum")
            .map(deviceName).toProperty("deviceName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default int insertSelective(VoOrderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, voOrderEntity, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(finishTime).toPropertyWhenPresent("finishTime", record::getFinishTime)
            .map(dealerUseraccount).toPropertyWhenPresent("dealerUseraccount", record::getDealerUseraccount)
            .map(dealerAddress).toPropertyWhenPresent("dealerAddress", record::getDealerAddress)
            .map(doFactoryName).toPropertyWhenPresent("doFactoryName", record::getDoFactoryName)
            .map(orderStateName).toPropertyWhenPresent("orderStateName", record::getOrderStateName)
            .map(productionName).toPropertyWhenPresent("productionName", record::getProductionName)
            .map(productionNum).toPropertyWhenPresent("productionNum", record::getProductionNum)
            .map(deviceName).toPropertyWhenPresent("deviceName", record::getDeviceName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default Optional<VoOrderEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default List<VoOrderEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default List<VoOrderEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default Optional<VoOrderEntity> selectByPrimaryKey(Short id_, String pkOrderId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voOrderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    static UpdateDSL<UpdateModel> updateAllColumns(VoOrderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(startTime).equalTo(record::getStartTime)
                .set(finishTime).equalTo(record::getFinishTime)
                .set(dealerUseraccount).equalTo(record::getDealerUseraccount)
                .set(dealerAddress).equalTo(record::getDealerAddress)
                .set(doFactoryName).equalTo(record::getDoFactoryName)
                .set(orderStateName).equalTo(record::getOrderStateName)
                .set(productionName).equalTo(record::getProductionName)
                .set(productionNum).equalTo(record::getProductionNum)
                .set(deviceName).equalTo(record::getDeviceName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoOrderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(finishTime).equalToWhenPresent(record::getFinishTime)
                .set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
                .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
                .set(doFactoryName).equalToWhenPresent(record::getDoFactoryName)
                .set(orderStateName).equalToWhenPresent(record::getOrderStateName)
                .set(productionName).equalToWhenPresent(record::getProductionName)
                .set(productionNum).equalToWhenPresent(record::getProductionNum)
                .set(deviceName).equalToWhenPresent(record::getDeviceName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4125529+08:00", comments="Source Table: vo_order_entity")
    default int updateByPrimaryKey(VoOrderEntity record) {
        return update(c ->
            c.set(startTime).equalTo(record::getStartTime)
            .set(finishTime).equalTo(record::getFinishTime)
            .set(dealerUseraccount).equalTo(record::getDealerUseraccount)
            .set(dealerAddress).equalTo(record::getDealerAddress)
            .set(doFactoryName).equalTo(record::getDoFactoryName)
            .set(orderStateName).equalTo(record::getOrderStateName)
            .set(productionName).equalTo(record::getProductionName)
            .set(productionNum).equalTo(record::getProductionNum)
            .set(deviceName).equalTo(record::getDeviceName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4134689+08:00", comments="Source Table: vo_order_entity")
    default int updateByPrimaryKeySelective(VoOrderEntity record) {
        return update(c ->
            c.set(startTime).equalToWhenPresent(record::getStartTime)
            .set(finishTime).equalToWhenPresent(record::getFinishTime)
            .set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
            .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
            .set(doFactoryName).equalToWhenPresent(record::getDoFactoryName)
            .set(orderStateName).equalToWhenPresent(record::getOrderStateName)
            .set(productionName).equalToWhenPresent(record::getProductionName)
            .set(productionNum).equalToWhenPresent(record::getProductionNum)
            .set(deviceName).equalToWhenPresent(record::getDeviceName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }
}
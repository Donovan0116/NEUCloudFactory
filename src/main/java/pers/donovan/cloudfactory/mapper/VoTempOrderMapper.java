package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoTempOrderDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoTempOrder;

@Mapper
public interface VoTempOrderMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, productionName, productionNum, finishTime, stopTime, dealerUseraccount, tel, dealerAddress, deviceName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4214455+08:00", comments="Source Table: vo_temp_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoTempOrder> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoTempOrderResult")
    Optional<VoTempOrder> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoTempOrderResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="production_name", property="productionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_num", property="productionNum", jdbcType=JdbcType.SMALLINT),
        @Result(column="finish_time", property="finishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="stop_time", property="stopTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="dealer_useraccount", property="dealerUseraccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="dealer_address", property="dealerAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR)
    })
    List<VoTempOrder> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default int insert(VoTempOrder record) {
        return MyBatis3Utils.insert(this::insert, record, voTempOrder, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(productionName).toProperty("productionName")
            .map(productionNum).toProperty("productionNum")
            .map(finishTime).toProperty("finishTime")
            .map(stopTime).toProperty("stopTime")
            .map(dealerUseraccount).toProperty("dealerUseraccount")
            .map(tel).toProperty("tel")
            .map(dealerAddress).toProperty("dealerAddress")
            .map(deviceName).toProperty("deviceName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default int insertSelective(VoTempOrder record) {
        return MyBatis3Utils.insert(this::insert, record, voTempOrder, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(productionName).toPropertyWhenPresent("productionName", record::getProductionName)
            .map(productionNum).toPropertyWhenPresent("productionNum", record::getProductionNum)
            .map(finishTime).toPropertyWhenPresent("finishTime", record::getFinishTime)
            .map(stopTime).toPropertyWhenPresent("stopTime", record::getStopTime)
            .map(dealerUseraccount).toPropertyWhenPresent("dealerUseraccount", record::getDealerUseraccount)
            .map(tel).toPropertyWhenPresent("tel", record::getTel)
            .map(dealerAddress).toPropertyWhenPresent("dealerAddress", record::getDealerAddress)
            .map(deviceName).toPropertyWhenPresent("deviceName", record::getDeviceName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4224429+08:00", comments="Source Table: vo_temp_order")
    default Optional<VoTempOrder> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default List<VoTempOrder> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default List<VoTempOrder> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default Optional<VoTempOrder> selectByPrimaryKey(Short id_, String pkOrderId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voTempOrder, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    static UpdateDSL<UpdateModel> updateAllColumns(VoTempOrder record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(productionName).equalTo(record::getProductionName)
                .set(productionNum).equalTo(record::getProductionNum)
                .set(finishTime).equalTo(record::getFinishTime)
                .set(stopTime).equalTo(record::getStopTime)
                .set(dealerUseraccount).equalTo(record::getDealerUseraccount)
                .set(tel).equalTo(record::getTel)
                .set(dealerAddress).equalTo(record::getDealerAddress)
                .set(deviceName).equalTo(record::getDeviceName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoTempOrder record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(productionName).equalToWhenPresent(record::getProductionName)
                .set(productionNum).equalToWhenPresent(record::getProductionNum)
                .set(finishTime).equalToWhenPresent(record::getFinishTime)
                .set(stopTime).equalToWhenPresent(record::getStopTime)
                .set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
                .set(deviceName).equalToWhenPresent(record::getDeviceName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default int updateByPrimaryKey(VoTempOrder record) {
        return update(c ->
            c.set(productionName).equalTo(record::getProductionName)
            .set(productionNum).equalTo(record::getProductionNum)
            .set(finishTime).equalTo(record::getFinishTime)
            .set(stopTime).equalTo(record::getStopTime)
            .set(dealerUseraccount).equalTo(record::getDealerUseraccount)
            .set(tel).equalTo(record::getTel)
            .set(dealerAddress).equalTo(record::getDealerAddress)
            .set(deviceName).equalTo(record::getDeviceName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4234405+08:00", comments="Source Table: vo_temp_order")
    default int updateByPrimaryKeySelective(VoTempOrder record) {
        return update(c ->
            c.set(productionName).equalToWhenPresent(record::getProductionName)
            .set(productionNum).equalToWhenPresent(record::getProductionNum)
            .set(finishTime).equalToWhenPresent(record::getFinishTime)
            .set(stopTime).equalToWhenPresent(record::getStopTime)
            .set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
            .set(tel).equalToWhenPresent(record::getTel)
            .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
            .set(deviceName).equalToWhenPresent(record::getDeviceName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }
}
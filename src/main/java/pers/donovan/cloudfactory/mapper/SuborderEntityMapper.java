package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.SuborderEntityDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.SuborderEntity;

@Mapper
public interface SuborderEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, pkSuborderId, productionId, productionNum, startTime, finishTime, orderStateId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<SuborderEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SuborderEntityResult")
    Optional<SuborderEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SuborderEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="pk_suborder_id", property="pkSuborderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="production_id", property="productionId", jdbcType=JdbcType.CHAR),
        @Result(column="production_num", property="productionNum", jdbcType=JdbcType.SMALLINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="finish_time", property="finishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_state_id", property="orderStateId", jdbcType=JdbcType.TINYINT)
    })
    List<SuborderEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_, String pkSuborderId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
            .and(pkSuborderId, isEqualTo(pkSuborderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default int insert(SuborderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, suborderEntity, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(pkSuborderId).toProperty("pkSuborderId")
            .map(productionId).toProperty("productionId")
            .map(productionNum).toProperty("productionNum")
            .map(startTime).toProperty("startTime")
            .map(finishTime).toProperty("finishTime")
            .map(orderStateId).toProperty("orderStateId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default int insertSelective(SuborderEntity record) {
        return MyBatis3Utils.insert(this::insert, record, suborderEntity, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(pkSuborderId).toPropertyWhenPresent("pkSuborderId", record::getPkSuborderId)
            .map(productionId).toPropertyWhenPresent("productionId", record::getProductionId)
            .map(productionNum).toPropertyWhenPresent("productionNum", record::getProductionNum)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(finishTime).toPropertyWhenPresent("finishTime", record::getFinishTime)
            .map(orderStateId).toPropertyWhenPresent("orderStateId", record::getOrderStateId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3925233+08:00", comments="Source Table: suborder_entity")
    default Optional<SuborderEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default List<SuborderEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default List<SuborderEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default Optional<SuborderEntity> selectByPrimaryKey(Short id_, String pkOrderId_, String pkSuborderId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
            .and(pkSuborderId, isEqualTo(pkSuborderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, suborderEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    static UpdateDSL<UpdateModel> updateAllColumns(SuborderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(pkSuborderId).equalTo(record::getPkSuborderId)
                .set(productionId).equalTo(record::getProductionId)
                .set(productionNum).equalTo(record::getProductionNum)
                .set(startTime).equalTo(record::getStartTime)
                .set(finishTime).equalTo(record::getFinishTime)
                .set(orderStateId).equalTo(record::getOrderStateId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SuborderEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(pkSuborderId).equalToWhenPresent(record::getPkSuborderId)
                .set(productionId).equalToWhenPresent(record::getProductionId)
                .set(productionNum).equalToWhenPresent(record::getProductionNum)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(finishTime).equalToWhenPresent(record::getFinishTime)
                .set(orderStateId).equalToWhenPresent(record::getOrderStateId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default int updateByPrimaryKey(SuborderEntity record) {
        return update(c ->
            c.set(productionId).equalTo(record::getProductionId)
            .set(productionNum).equalTo(record::getProductionNum)
            .set(startTime).equalTo(record::getStartTime)
            .set(finishTime).equalTo(record::getFinishTime)
            .set(orderStateId).equalTo(record::getOrderStateId)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
            .and(pkSuborderId, isEqualTo(record::getPkSuborderId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3935205+08:00", comments="Source Table: suborder_entity")
    default int updateByPrimaryKeySelective(SuborderEntity record) {
        return update(c ->
            c.set(productionId).equalToWhenPresent(record::getProductionId)
            .set(productionNum).equalToWhenPresent(record::getProductionNum)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(finishTime).equalToWhenPresent(record::getFinishTime)
            .set(orderStateId).equalToWhenPresent(record::getOrderStateId)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
            .and(pkSuborderId, isEqualTo(record::getPkSuborderId))
        );
    }
}
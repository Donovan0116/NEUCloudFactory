package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.OrderStateDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.OrderState;

@Mapper
public interface OrderStateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderStateId, orderStateName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<OrderState> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderStateResult")
    Optional<OrderState> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderStateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_state_id", property="pkOrderStateId", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="order_state_name", property="orderStateName", jdbcType=JdbcType.VARCHAR)
    })
    List<OrderState> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    default int deleteByPrimaryKey(Short id_, Byte pkOrderStateId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderStateId, isEqualTo(pkOrderStateId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3745733+08:00", comments="Source Table: order_state")
    default int insert(OrderState record) {
        return MyBatis3Utils.insert(this::insert, record, orderState, c ->
            c.map(pkOrderStateId).toProperty("pkOrderStateId")
            .map(orderStateName).toProperty("orderStateName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default int insertSelective(OrderState record) {
        return MyBatis3Utils.insert(this::insert, record, orderState, c ->
            c.map(pkOrderStateId).toPropertyWhenPresent("pkOrderStateId", record::getPkOrderStateId)
            .map(orderStateName).toPropertyWhenPresent("orderStateName", record::getOrderStateName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default Optional<OrderState> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default List<OrderState> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default List<OrderState> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default Optional<OrderState> selectByPrimaryKey(Short id_, Byte pkOrderStateId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkOrderStateId, isEqualTo(pkOrderStateId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderState, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderState record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderStateId).equalTo(record::getPkOrderStateId)
                .set(orderStateName).equalTo(record::getOrderStateName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderState record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderStateId).equalToWhenPresent(record::getPkOrderStateId)
                .set(orderStateName).equalToWhenPresent(record::getOrderStateName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default int updateByPrimaryKey(OrderState record) {
        return update(c ->
            c.set(orderStateName).equalTo(record::getOrderStateName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderStateId, isEqualTo(record::getPkOrderStateId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3755679+08:00", comments="Source Table: order_state")
    default int updateByPrimaryKeySelective(OrderState record) {
        return update(c ->
            c.set(orderStateName).equalToWhenPresent(record::getOrderStateName)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderStateId, isEqualTo(record::getPkOrderStateId))
        );
    }
}
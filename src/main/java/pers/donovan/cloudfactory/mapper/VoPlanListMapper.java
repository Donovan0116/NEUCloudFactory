package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoPlanListDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoPlanList;

@Mapper
public interface VoPlanListMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, orderState);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoPlanList> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoPlanListResult")
    Optional<VoPlanList> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoPlanListResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="order_state", property="orderState", jdbcType=JdbcType.VARCHAR)
    })
    List<VoPlanList> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    default int insert(VoPlanList record) {
        return MyBatis3Utils.insert(this::insert, record, voPlanList, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(orderState).toProperty("orderState")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4254351+08:00", comments="Source Table: vo_plan_list")
    default int insertSelective(VoPlanList record) {
        return MyBatis3Utils.insert(this::insert, record, voPlanList, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(orderState).toPropertyWhenPresent("orderState", record::getOrderState)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default Optional<VoPlanList> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default List<VoPlanList> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default List<VoPlanList> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default Optional<VoPlanList> selectByPrimaryKey(Short id_, String pkOrderId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voPlanList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    static UpdateDSL<UpdateModel> updateAllColumns(VoPlanList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(orderState).equalTo(record::getOrderState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoPlanList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(orderState).equalToWhenPresent(record::getOrderState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default int updateByPrimaryKey(VoPlanList record) {
        return update(c ->
            c.set(orderState).equalTo(record::getOrderState)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4264324+08:00", comments="Source Table: vo_plan_list")
    default int updateByPrimaryKeySelective(VoPlanList record) {
        return update(c ->
            c.set(orderState).equalToWhenPresent(record::getOrderState)
            .where(id, isEqualTo(record::getId))
            .and(pkOrderId, isEqualTo(record::getPkOrderId))
        );
    }
}
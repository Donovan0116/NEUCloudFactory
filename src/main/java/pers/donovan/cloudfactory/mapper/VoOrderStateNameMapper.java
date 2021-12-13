package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoOrderStateNameDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoOrderStateName;

@Mapper
public interface VoOrderStateNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
    BasicColumn[] selectList = BasicColumn.columnList(orderStateName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.orderStateName", before=false, resultType=String.class)
    int insert(InsertStatementProvider<VoOrderStateName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoOrderStateNameResult")
    Optional<VoOrderStateName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoOrderStateNameResult", value = {
        @Result(column="order_state_name", property="orderStateName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<VoOrderStateName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voOrderStateName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voOrderStateName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
    default int deleteByPrimaryKey(String orderStateName_) {
        return delete(c -> 
            c.where(orderStateName, isEqualTo(orderStateName_))
        );
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
//    default int insert(VoOrderStateName record) {
//        return MyBatis3Utils.insert(this::insert, record, voOrderStateName, c ->
//        );
//    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4369453+08:00", comments="Source Table: vo_order_state_name")
//    default int insertSelective(VoOrderStateName record) {
//        return MyBatis3Utils.insert(this::insert, record, voOrderStateName, c ->
//        );
//    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
    default Optional<VoOrderStateName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voOrderStateName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
    default List<VoOrderStateName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voOrderStateName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
    default List<VoOrderStateName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voOrderStateName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voOrderStateName, completer);
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
//    static UpdateDSL<UpdateModel> updateAllColumns(VoOrderStateName record, UpdateDSL<UpdateModel> dsl) {
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4379488+08:00", comments="Source Table: vo_order_state_name")
//    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoOrderStateName record, UpdateDSL<UpdateModel> dsl) {
//    }
}
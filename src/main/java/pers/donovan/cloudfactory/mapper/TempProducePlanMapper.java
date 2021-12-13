package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.TempProducePlanDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.TempProducePlan;

@Mapper
public interface TempProducePlanMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005016+08:00", comments="Source Table: temp_produce_plan")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, pkFactoryName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<TempProducePlan> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TempProducePlanResult")
    Optional<TempProducePlan> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TempProducePlanResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="pk_factory_name", property="pkFactoryName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<TempProducePlan> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_, String pkFactoryName_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    default int insert(TempProducePlan record) {
        return MyBatis3Utils.insert(this::insert, record, tempProducePlan, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(pkFactoryName).toProperty("pkFactoryName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3995153+08:00", comments="Source Table: temp_produce_plan")
    default int insertSelective(TempProducePlan record) {
        return MyBatis3Utils.insert(this::insert, record, tempProducePlan, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(pkFactoryName).toPropertyWhenPresent("pkFactoryName", record::getPkFactoryName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    default Optional<TempProducePlan> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    default List<TempProducePlan> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    default List<TempProducePlan> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tempProducePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    static UpdateDSL<UpdateModel> updateAllColumns(TempProducePlan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(pkFactoryName).equalTo(record::getPkFactoryName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4005491+08:00", comments="Source Table: temp_produce_plan")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TempProducePlan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(pkFactoryName).equalToWhenPresent(record::getPkFactoryName);
    }
}
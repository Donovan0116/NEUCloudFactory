package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.FactoryCapacityDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.FactoryCapacity;

@Mapper
public interface FactoryCapacityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkFactoryName, capacity);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source Table: factory_capacity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source Table: factory_capacity")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3616083+08:00", comments="Source Table: factory_capacity")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<FactoryCapacity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3626054+08:00", comments="Source Table: factory_capacity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FactoryCapacityResult")
    Optional<FactoryCapacity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FactoryCapacityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_factory_name", property="pkFactoryName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="capacity", property="capacity", jdbcType=JdbcType.SMALLINT)
    })
    List<FactoryCapacity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default int deleteByPrimaryKey(Short id_, String pkFactoryName_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default int insert(FactoryCapacity record) {
        return MyBatis3Utils.insert(this::insert, record, factoryCapacity, c ->
            c.map(pkFactoryName).toProperty("pkFactoryName")
            .map(capacity).toProperty("capacity")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default int insertSelective(FactoryCapacity record) {
        return MyBatis3Utils.insert(this::insert, record, factoryCapacity, c ->
            c.map(pkFactoryName).toPropertyWhenPresent("pkFactoryName", record::getPkFactoryName)
            .map(capacity).toPropertyWhenPresent("capacity", record::getCapacity)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3627123+08:00", comments="Source Table: factory_capacity")
    default Optional<FactoryCapacity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default List<FactoryCapacity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default List<FactoryCapacity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default Optional<FactoryCapacity> selectByPrimaryKey(Short id_, String pkFactoryName_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, factoryCapacity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    static UpdateDSL<UpdateModel> updateAllColumns(FactoryCapacity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryName).equalTo(record::getPkFactoryName)
                .set(capacity).equalTo(record::getCapacity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FactoryCapacity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryName).equalToWhenPresent(record::getPkFactoryName)
                .set(capacity).equalToWhenPresent(record::getCapacity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default int updateByPrimaryKey(FactoryCapacity record) {
        return update(c ->
            c.set(capacity).equalTo(record::getCapacity)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3636032+08:00", comments="Source Table: factory_capacity")
    default int updateByPrimaryKeySelective(FactoryCapacity record) {
        return update(c ->
            c.set(capacity).equalToWhenPresent(record::getCapacity)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }
}
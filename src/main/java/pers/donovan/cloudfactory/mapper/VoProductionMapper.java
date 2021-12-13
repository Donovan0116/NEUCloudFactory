package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoProductionDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoProduction;

@Mapper
public interface VoProductionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkProductionId, productionName, productionTypeName, productionSpecification, productionBrief);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4154624+08:00", comments="Source Table: vo_production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4154624+08:00", comments="Source Table: vo_production")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoProduction> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoProductionResult")
    Optional<VoProduction> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoProductionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_production_id", property="pkProductionId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="production_name", property="productionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_type_name", property="productionTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_specification", property="productionSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_brief", property="productionBrief", jdbcType=JdbcType.VARCHAR)
    })
    List<VoProduction> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4158857+08:00", comments="Source Table: vo_production")
    default int deleteByPrimaryKey(Short id_, String pkProductionId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkProductionId, isEqualTo(pkProductionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default int insert(VoProduction record) {
        return MyBatis3Utils.insert(this::insert, record, voProduction, c ->
            c.map(pkProductionId).toProperty("pkProductionId")
            .map(productionName).toProperty("productionName")
            .map(productionTypeName).toProperty("productionTypeName")
            .map(productionSpecification).toProperty("productionSpecification")
            .map(productionBrief).toProperty("productionBrief")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default int insertSelective(VoProduction record) {
        return MyBatis3Utils.insert(this::insert, record, voProduction, c ->
            c.map(pkProductionId).toPropertyWhenPresent("pkProductionId", record::getPkProductionId)
            .map(productionName).toPropertyWhenPresent("productionName", record::getProductionName)
            .map(productionTypeName).toPropertyWhenPresent("productionTypeName", record::getProductionTypeName)
            .map(productionSpecification).toPropertyWhenPresent("productionSpecification", record::getProductionSpecification)
            .map(productionBrief).toPropertyWhenPresent("productionBrief", record::getProductionBrief)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default Optional<VoProduction> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default List<VoProduction> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default List<VoProduction> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default Optional<VoProduction> selectByPrimaryKey(Short id_, String pkProductionId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkProductionId, isEqualTo(pkProductionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voProduction, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    static UpdateDSL<UpdateModel> updateAllColumns(VoProduction record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionId).equalTo(record::getPkProductionId)
                .set(productionName).equalTo(record::getProductionName)
                .set(productionTypeName).equalTo(record::getProductionTypeName)
                .set(productionSpecification).equalTo(record::getProductionSpecification)
                .set(productionBrief).equalTo(record::getProductionBrief);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoProduction record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionId).equalToWhenPresent(record::getPkProductionId)
                .set(productionName).equalToWhenPresent(record::getProductionName)
                .set(productionTypeName).equalToWhenPresent(record::getProductionTypeName)
                .set(productionSpecification).equalToWhenPresent(record::getProductionSpecification)
                .set(productionBrief).equalToWhenPresent(record::getProductionBrief);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default int updateByPrimaryKey(VoProduction record) {
        return update(c ->
            c.set(productionName).equalTo(record::getProductionName)
            .set(productionTypeName).equalTo(record::getProductionTypeName)
            .set(productionSpecification).equalTo(record::getProductionSpecification)
            .set(productionBrief).equalTo(record::getProductionBrief)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionId, isEqualTo(record::getPkProductionId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4164608+08:00", comments="Source Table: vo_production")
    default int updateByPrimaryKeySelective(VoProduction record) {
        return update(c ->
            c.set(productionName).equalToWhenPresent(record::getProductionName)
            .set(productionTypeName).equalToWhenPresent(record::getProductionTypeName)
            .set(productionSpecification).equalToWhenPresent(record::getProductionSpecification)
            .set(productionBrief).equalToWhenPresent(record::getProductionBrief)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionId, isEqualTo(record::getPkProductionId))
        );
    }
}
package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.ProductionDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.Production;

@Mapper
public interface ProductionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkProductionId, productionName, productionTypeId, productionSpecification, productionBrief);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3808545+08:00", comments="Source Table: production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3808545+08:00", comments="Source Table: production")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3808545+08:00", comments="Source Table: production")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<Production> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3808545+08:00", comments="Source Table: production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProductionResult")
    Optional<Production> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProductionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_production_id", property="pkProductionId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="production_name", property="productionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_type_id", property="productionTypeId", jdbcType=JdbcType.TINYINT),
        @Result(column="production_specification", property="productionSpecification", jdbcType=JdbcType.VARCHAR),
        @Result(column="production_brief", property="productionBrief", jdbcType=JdbcType.VARCHAR)
    })
    List<Production> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default int deleteByPrimaryKey(Short id_, String pkProductionId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkProductionId, isEqualTo(pkProductionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default int insert(Production record) {
        return MyBatis3Utils.insert(this::insert, record, production, c ->
            c.map(pkProductionId).toProperty("pkProductionId")
            .map(productionName).toProperty("productionName")
            .map(productionTypeId).toProperty("productionTypeId")
            .map(productionSpecification).toProperty("productionSpecification")
            .map(productionBrief).toProperty("productionBrief")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default int insertSelective(Production record) {
        return MyBatis3Utils.insert(this::insert, record, production, c ->
            c.map(pkProductionId).toPropertyWhenPresent("pkProductionId", record::getPkProductionId)
            .map(productionName).toPropertyWhenPresent("productionName", record::getProductionName)
            .map(productionTypeId).toPropertyWhenPresent("productionTypeId", record::getProductionTypeId)
            .map(productionSpecification).toPropertyWhenPresent("productionSpecification", record::getProductionSpecification)
            .map(productionBrief).toPropertyWhenPresent("productionBrief", record::getProductionBrief)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default Optional<Production> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default List<Production> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default List<Production> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default Optional<Production> selectByPrimaryKey(Short id_, String pkProductionId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkProductionId, isEqualTo(pkProductionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3815522+08:00", comments="Source Table: production")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, production, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source Table: production")
    static UpdateDSL<UpdateModel> updateAllColumns(Production record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionId).equalTo(record::getPkProductionId)
                .set(productionName).equalTo(record::getProductionName)
                .set(productionTypeId).equalTo(record::getProductionTypeId)
                .set(productionSpecification).equalTo(record::getProductionSpecification)
                .set(productionBrief).equalTo(record::getProductionBrief);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source Table: production")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Production record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionId).equalToWhenPresent(record::getPkProductionId)
                .set(productionName).equalToWhenPresent(record::getProductionName)
                .set(productionTypeId).equalToWhenPresent(record::getProductionTypeId)
                .set(productionSpecification).equalToWhenPresent(record::getProductionSpecification)
                .set(productionBrief).equalToWhenPresent(record::getProductionBrief);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source Table: production")
    default int updateByPrimaryKey(Production record) {
        return update(c ->
            c.set(productionName).equalTo(record::getProductionName)
            .set(productionTypeId).equalTo(record::getProductionTypeId)
            .set(productionSpecification).equalTo(record::getProductionSpecification)
            .set(productionBrief).equalTo(record::getProductionBrief)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionId, isEqualTo(record::getPkProductionId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3825755+08:00", comments="Source Table: production")
    default int updateByPrimaryKeySelective(Production record) {
        return update(c ->
            c.set(productionName).equalToWhenPresent(record::getProductionName)
            .set(productionTypeId).equalToWhenPresent(record::getProductionTypeId)
            .set(productionSpecification).equalToWhenPresent(record::getProductionSpecification)
            .set(productionBrief).equalToWhenPresent(record::getProductionBrief)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionId, isEqualTo(record::getPkProductionId))
        );
    }
}
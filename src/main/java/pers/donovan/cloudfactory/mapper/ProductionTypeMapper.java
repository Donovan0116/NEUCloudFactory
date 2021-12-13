package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.ProductionTypeDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.ProductionType;

@Mapper
public interface ProductionTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3855451+08:00", comments="Source Table: production_type")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkProductionTypeId, productionTypeName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<ProductionType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProductionTypeResult")
    Optional<ProductionType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProductionTypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_production_type_id", property="pkProductionTypeId", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="production_type_name", property="productionTypeName", jdbcType=JdbcType.VARCHAR)
    })
    List<ProductionType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    default int deleteByPrimaryKey(Short id_, Byte pkProductionTypeId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkProductionTypeId, isEqualTo(pkProductionTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    default int insert(ProductionType record) {
        return MyBatis3Utils.insert(this::insert, record, productionType, c ->
            c.map(pkProductionTypeId).toProperty("pkProductionTypeId")
            .map(productionTypeName).toProperty("productionTypeName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3845451+08:00", comments="Source Table: production_type")
    default int insertSelective(ProductionType record) {
        return MyBatis3Utils.insert(this::insert, record, productionType, c ->
            c.map(pkProductionTypeId).toPropertyWhenPresent("pkProductionTypeId", record::getPkProductionTypeId)
            .map(productionTypeName).toPropertyWhenPresent("productionTypeName", record::getProductionTypeName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3855451+08:00", comments="Source Table: production_type")
    default Optional<ProductionType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default List<ProductionType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default List<ProductionType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default Optional<ProductionType> selectByPrimaryKey(Short id_, Byte pkProductionTypeId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkProductionTypeId, isEqualTo(pkProductionTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, productionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    static UpdateDSL<UpdateModel> updateAllColumns(ProductionType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionTypeId).equalTo(record::getPkProductionTypeId)
                .set(productionTypeName).equalTo(record::getProductionTypeName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ProductionType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkProductionTypeId).equalToWhenPresent(record::getPkProductionTypeId)
                .set(productionTypeName).equalToWhenPresent(record::getProductionTypeName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default int updateByPrimaryKey(ProductionType record) {
        return update(c ->
            c.set(productionTypeName).equalTo(record::getProductionTypeName)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionTypeId, isEqualTo(record::getPkProductionTypeId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3857789+08:00", comments="Source Table: production_type")
    default int updateByPrimaryKeySelective(ProductionType record) {
        return update(c ->
            c.set(productionTypeName).equalToWhenPresent(record::getProductionTypeName)
            .where(id, isEqualTo(record::getId))
            .and(pkProductionTypeId, isEqualTo(record::getPkProductionTypeId))
        );
    }
}
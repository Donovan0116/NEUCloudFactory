package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoProductionNameDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoProductionName;

@Mapper
public interface VoProductionNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    BasicColumn[] selectList = BasicColumn.columnList(productionName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4309605+08:00", comments="Source Table: vo_production_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.productionName", before=false, resultType=String.class)
    int insert(InsertStatementProvider<VoProductionName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoProductionNameResult")
    Optional<VoProductionName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoProductionNameResult", value = {
        @Result(column="production_name", property="productionName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<VoProductionName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voProductionName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voProductionName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default int deleteByPrimaryKey(String productionName_) {
        return delete(c -> 
            c.where(productionName, isEqualTo(productionName_))
        );
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
//    default int insert(VoProductionName record) {
//        return MyBatis3Utils.insert(this::insert, record, voProductionName, c ->
//        );
//    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
//    default int insertSelective(VoProductionName record) {
//        return MyBatis3Utils.insert(this::insert, record, voProductionName, c ->
//        );
//    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default Optional<VoProductionName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voProductionName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default List<VoProductionName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voProductionName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default List<VoProductionName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voProductionName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voProductionName, completer);
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.431958+08:00", comments="Source Table: vo_production_name")
//    static UpdateDSL<UpdateModel> updateAllColumns(VoProductionName record, UpdateDSL<UpdateModel> dsl) {
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4330385+08:00", comments="Source Table: vo_production_name")
//    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoProductionName record, UpdateDSL<UpdateModel> dsl) {
//    }
}
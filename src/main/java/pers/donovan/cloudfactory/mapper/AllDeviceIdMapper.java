package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.AllDeviceIdDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.AllDeviceId;

@Mapper
public interface AllDeviceIdMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkAllDeviceId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<AllDeviceId> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AllDeviceIdResult")
    Optional<AllDeviceId> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3277736+08:00", comments="Source Table: all_device_id")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AllDeviceIdResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_all_device_id", property="pkAllDeviceId", jdbcType=JdbcType.CHAR, id=true)
    })
    List<AllDeviceId> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default int deleteByPrimaryKey(Short id_, String pkAllDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkAllDeviceId, isEqualTo(pkAllDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default int insert(AllDeviceId record) {
        return MyBatis3Utils.insert(this::insert, record, allDeviceId, c ->
            c.map(pkAllDeviceId).toProperty("pkAllDeviceId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default int insertSelective(AllDeviceId record) {
        return MyBatis3Utils.insert(this::insert, record, allDeviceId, c ->
            c.map(pkAllDeviceId).toPropertyWhenPresent("pkAllDeviceId", record::getPkAllDeviceId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default Optional<AllDeviceId> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default List<AllDeviceId> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3286966+08:00", comments="Source Table: all_device_id")
    default List<AllDeviceId> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3296936+08:00", comments="Source Table: all_device_id")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, allDeviceId, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3296936+08:00", comments="Source Table: all_device_id")
    static UpdateDSL<UpdateModel> updateAllColumns(AllDeviceId record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkAllDeviceId).equalTo(record::getPkAllDeviceId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3296936+08:00", comments="Source Table: all_device_id")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AllDeviceId record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkAllDeviceId).equalToWhenPresent(record::getPkAllDeviceId);
    }
}
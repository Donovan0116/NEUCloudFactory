package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.ProducePlanDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.ProducePlan;

@Mapper
public interface ProducePlanMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkOrderId, pkSuborderId, pkAdministratorUseraccount, pkAllDeviceId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<ProducePlan> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProducePlanResult")
    Optional<ProducePlan> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProducePlanResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_order_id", property="pkOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="pk_suborder_id", property="pkSuborderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="pk_administrator_useraccount", property="pkAdministratorUseraccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pk_all_device_id", property="pkAllDeviceId", jdbcType=JdbcType.CHAR, id=true)
    })
    List<ProducePlan> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default int deleteByPrimaryKey(Short id_, String pkOrderId_, String pkSuborderId_, String pkAdministratorUseraccount_, String pkAllDeviceId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkOrderId, isEqualTo(pkOrderId_))
            .and(pkSuborderId, isEqualTo(pkSuborderId_))
            .and(pkAdministratorUseraccount, isEqualTo(pkAdministratorUseraccount_))
            .and(pkAllDeviceId, isEqualTo(pkAllDeviceId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default int insert(ProducePlan record) {
        return MyBatis3Utils.insert(this::insert, record, producePlan, c ->
            c.map(pkOrderId).toProperty("pkOrderId")
            .map(pkSuborderId).toProperty("pkSuborderId")
            .map(pkAdministratorUseraccount).toProperty("pkAdministratorUseraccount")
            .map(pkAllDeviceId).toProperty("pkAllDeviceId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default int insertSelective(ProducePlan record) {
        return MyBatis3Utils.insert(this::insert, record, producePlan, c ->
            c.map(pkOrderId).toPropertyWhenPresent("pkOrderId", record::getPkOrderId)
            .map(pkSuborderId).toPropertyWhenPresent("pkSuborderId", record::getPkSuborderId)
            .map(pkAdministratorUseraccount).toPropertyWhenPresent("pkAdministratorUseraccount", record::getPkAdministratorUseraccount)
            .map(pkAllDeviceId).toPropertyWhenPresent("pkAllDeviceId", record::getPkAllDeviceId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3775654+08:00", comments="Source Table: produce_plan")
    default Optional<ProducePlan> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3785631+08:00", comments="Source Table: produce_plan")
    default List<ProducePlan> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3785631+08:00", comments="Source Table: produce_plan")
    default List<ProducePlan> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source Table: produce_plan")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, producePlan, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source Table: produce_plan")
    static UpdateDSL<UpdateModel> updateAllColumns(ProducePlan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalTo(record::getPkOrderId)
                .set(pkSuborderId).equalTo(record::getPkSuborderId)
                .set(pkAdministratorUseraccount).equalTo(record::getPkAdministratorUseraccount)
                .set(pkAllDeviceId).equalTo(record::getPkAllDeviceId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3787019+08:00", comments="Source Table: produce_plan")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ProducePlan record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkOrderId).equalToWhenPresent(record::getPkOrderId)
                .set(pkSuborderId).equalToWhenPresent(record::getPkSuborderId)
                .set(pkAdministratorUseraccount).equalToWhenPresent(record::getPkAdministratorUseraccount)
                .set(pkAllDeviceId).equalToWhenPresent(record::getPkAllDeviceId);
    }
}
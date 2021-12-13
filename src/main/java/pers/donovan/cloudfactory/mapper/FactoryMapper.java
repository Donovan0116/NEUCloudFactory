package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.FactoryDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.Factory;

@Mapper
public interface FactoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkFactoryName, factoryBrief, administratorUseraccount, contactUser, tel, isOperation);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<Factory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FactoryResult")
    Optional<Factory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FactoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_factory_name", property="pkFactoryName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="factory_brief", property="factoryBrief", jdbcType=JdbcType.VARCHAR),
        @Result(column="administrator_useraccount", property="administratorUseraccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_user", property="contactUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="is_operation", property="isOperation", jdbcType=JdbcType.TINYINT)
    })
    List<Factory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    default int deleteByPrimaryKey(Short id_, String pkFactoryName_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    default int insert(Factory record) {
        return MyBatis3Utils.insert(this::insert, record, factory, c ->
            c.map(pkFactoryName).toProperty("pkFactoryName")
            .map(factoryBrief).toProperty("factoryBrief")
            .map(administratorUseraccount).toProperty("administratorUseraccount")
            .map(contactUser).toProperty("contactUser")
            .map(tel).toProperty("tel")
            .map(isOperation).toProperty("isOperation")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3586171+08:00", comments="Source Table: factory")
    default int insertSelective(Factory record) {
        return MyBatis3Utils.insert(this::insert, record, factory, c ->
            c.map(pkFactoryName).toPropertyWhenPresent("pkFactoryName", record::getPkFactoryName)
            .map(factoryBrief).toPropertyWhenPresent("factoryBrief", record::getFactoryBrief)
            .map(administratorUseraccount).toPropertyWhenPresent("administratorUseraccount", record::getAdministratorUseraccount)
            .map(contactUser).toPropertyWhenPresent("contactUser", record::getContactUser)
            .map(tel).toPropertyWhenPresent("tel", record::getTel)
            .map(isOperation).toPropertyWhenPresent("isOperation", record::getIsOperation)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default Optional<Factory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default List<Factory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default List<Factory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default Optional<Factory> selectByPrimaryKey(Short id_, String pkFactoryName_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, factory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    static UpdateDSL<UpdateModel> updateAllColumns(Factory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryName).equalTo(record::getPkFactoryName)
                .set(factoryBrief).equalTo(record::getFactoryBrief)
                .set(administratorUseraccount).equalTo(record::getAdministratorUseraccount)
                .set(contactUser).equalTo(record::getContactUser)
                .set(tel).equalTo(record::getTel)
                .set(isOperation).equalTo(record::getIsOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Factory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkFactoryName).equalToWhenPresent(record::getPkFactoryName)
                .set(factoryBrief).equalToWhenPresent(record::getFactoryBrief)
                .set(administratorUseraccount).equalToWhenPresent(record::getAdministratorUseraccount)
                .set(contactUser).equalToWhenPresent(record::getContactUser)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(isOperation).equalToWhenPresent(record::getIsOperation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default int updateByPrimaryKey(Factory record) {
        return update(c ->
            c.set(factoryBrief).equalTo(record::getFactoryBrief)
            .set(administratorUseraccount).equalTo(record::getAdministratorUseraccount)
            .set(contactUser).equalTo(record::getContactUser)
            .set(tel).equalTo(record::getTel)
            .set(isOperation).equalTo(record::getIsOperation)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3596148+08:00", comments="Source Table: factory")
    default int updateByPrimaryKeySelective(Factory record) {
        return update(c ->
            c.set(factoryBrief).equalToWhenPresent(record::getFactoryBrief)
            .set(administratorUseraccount).equalToWhenPresent(record::getAdministratorUseraccount)
            .set(contactUser).equalToWhenPresent(record::getContactUser)
            .set(tel).equalToWhenPresent(record::getTel)
            .set(isOperation).equalToWhenPresent(record::getIsOperation)
            .where(id, isEqualTo(record::getId))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }
}
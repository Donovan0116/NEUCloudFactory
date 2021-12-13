package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.SuperAdministratorDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.SuperAdministrator;

@Mapper
public interface SuperAdministratorMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3970255+08:00", comments="Source Table: super_administrator")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkUseraccount, password, tel, username, token);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source Table: super_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source Table: super_administrator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source Table: super_administrator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<SuperAdministrator> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source Table: super_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SuperAdministratorResult")
    Optional<SuperAdministrator> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3956787+08:00", comments="Source Table: super_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SuperAdministratorResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_useraccount", property="pkUseraccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR)
    })
    List<SuperAdministrator> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3965156+08:00", comments="Source Table: super_administrator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3965156+08:00", comments="Source Table: super_administrator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3965156+08:00", comments="Source Table: super_administrator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3965156+08:00", comments="Source Table: super_administrator")
    default int deleteByPrimaryKey(Short id_, String pkUseraccount_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3965156+08:00", comments="Source Table: super_administrator")
    default int insert(SuperAdministrator record) {
        return MyBatis3Utils.insert(this::insert, record, superAdministrator, c ->
            c.map(pkUseraccount).toProperty("pkUseraccount")
            .map(password).toProperty("password")
            .map(tel).toProperty("tel")
            .map(username).toProperty("username")
            .map(token).toProperty("token")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3970255+08:00", comments="Source Table: super_administrator")
    default int insertSelective(SuperAdministrator record) {
        return MyBatis3Utils.insert(this::insert, record, superAdministrator, c ->
            c.map(pkUseraccount).toPropertyWhenPresent("pkUseraccount", record::getPkUseraccount)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(tel).toPropertyWhenPresent("tel", record::getTel)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(token).toPropertyWhenPresent("token", record::getToken)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3970255+08:00", comments="Source Table: super_administrator")
    default Optional<SuperAdministrator> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3970255+08:00", comments="Source Table: super_administrator")
    default List<SuperAdministrator> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3970255+08:00", comments="Source Table: super_administrator")
    default List<SuperAdministrator> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.39751+08:00", comments="Source Table: super_administrator")
    default Optional<SuperAdministrator> selectByPrimaryKey(Short id_, String pkUseraccount_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3975346+08:00", comments="Source Table: super_administrator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, superAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3975346+08:00", comments="Source Table: super_administrator")
    static UpdateDSL<UpdateModel> updateAllColumns(SuperAdministrator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalTo(record::getPkUseraccount)
                .set(password).equalTo(record::getPassword)
                .set(tel).equalTo(record::getTel)
                .set(username).equalTo(record::getUsername)
                .set(token).equalTo(record::getToken);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3975346+08:00", comments="Source Table: super_administrator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SuperAdministrator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalToWhenPresent(record::getPkUseraccount)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(token).equalToWhenPresent(record::getToken);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3975346+08:00", comments="Source Table: super_administrator")
    default int updateByPrimaryKey(SuperAdministrator record) {
        return update(c ->
            c.set(password).equalTo(record::getPassword)
            .set(tel).equalTo(record::getTel)
            .set(username).equalTo(record::getUsername)
            .set(token).equalTo(record::getToken)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3975346+08:00", comments="Source Table: super_administrator")
    default int updateByPrimaryKeySelective(SuperAdministrator record) {
        return update(c ->
            c.set(password).equalToWhenPresent(record::getPassword)
            .set(tel).equalToWhenPresent(record::getTel)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(token).equalToWhenPresent(record::getToken)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
        );
    }
}
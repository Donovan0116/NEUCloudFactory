package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoAdministratorDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoAdministrator;

@Mapper
public interface VoAdministratorMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkUseraccount, pkFactoryName, password, tel, username);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoAdministrator> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4025402+08:00", comments="Source Table: vo_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoAdministratorResult")
    Optional<VoAdministrator> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoAdministratorResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_useraccount", property="pkUseraccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pk_factory_name", property="pkFactoryName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<VoAdministrator> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default int deleteByPrimaryKey(Short id_, String pkUseraccount_, String pkFactoryName_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default int insert(VoAdministrator record) {
        return MyBatis3Utils.insert(this::insert, record, voAdministrator, c ->
            c.map(pkUseraccount).toProperty("pkUseraccount")
            .map(pkFactoryName).toProperty("pkFactoryName")
            .map(password).toProperty("password")
            .map(tel).toProperty("tel")
            .map(username).toProperty("username")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default int insertSelective(VoAdministrator record) {
        return MyBatis3Utils.insert(this::insert, record, voAdministrator, c ->
            c.map(pkUseraccount).toPropertyWhenPresent("pkUseraccount", record::getPkUseraccount)
            .map(pkFactoryName).toPropertyWhenPresent("pkFactoryName", record::getPkFactoryName)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(tel).toPropertyWhenPresent("tel", record::getTel)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default Optional<VoAdministrator> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default List<VoAdministrator> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default List<VoAdministrator> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default Optional<VoAdministrator> selectByPrimaryKey(Short id_, String pkUseraccount_, String pkFactoryName_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
            .and(pkFactoryName, isEqualTo(pkFactoryName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voAdministrator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4034935+08:00", comments="Source Table: vo_administrator")
    static UpdateDSL<UpdateModel> updateAllColumns(VoAdministrator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalTo(record::getPkUseraccount)
                .set(pkFactoryName).equalTo(record::getPkFactoryName)
                .set(password).equalTo(record::getPassword)
                .set(tel).equalTo(record::getTel)
                .set(username).equalTo(record::getUsername);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4044908+08:00", comments="Source Table: vo_administrator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoAdministrator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalToWhenPresent(record::getPkUseraccount)
                .set(pkFactoryName).equalToWhenPresent(record::getPkFactoryName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(username).equalToWhenPresent(record::getUsername);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4044908+08:00", comments="Source Table: vo_administrator")
    default int updateByPrimaryKey(VoAdministrator record) {
        return update(c ->
            c.set(password).equalTo(record::getPassword)
            .set(tel).equalTo(record::getTel)
            .set(username).equalTo(record::getUsername)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4044908+08:00", comments="Source Table: vo_administrator")
    default int updateByPrimaryKeySelective(VoAdministrator record) {
        return update(c ->
            c.set(password).equalToWhenPresent(record::getPassword)
            .set(tel).equalToWhenPresent(record::getTel)
            .set(username).equalToWhenPresent(record::getUsername)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
            .and(pkFactoryName, isEqualTo(record::getPkFactoryName))
        );
    }
}
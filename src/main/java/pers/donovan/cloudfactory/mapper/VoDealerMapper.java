package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.VoDealerDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.VoDealer;

@Mapper
public interface VoDealerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkUseraccount, password, tel, username, dealerAddress);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<VoDealer> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VoDealerResult")
    Optional<VoDealer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4084802+08:00", comments="Source Table: vo_dealer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VoDealerResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_useraccount", property="pkUseraccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="tel", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealer_address", property="dealerAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<VoDealer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int deleteByPrimaryKey(Short id_, String pkUseraccount_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int insert(VoDealer record) {
        return MyBatis3Utils.insert(this::insert, record, voDealer, c ->
            c.map(pkUseraccount).toProperty("pkUseraccount")
            .map(password).toProperty("password")
            .map(tel).toProperty("tel")
            .map(username).toProperty("username")
            .map(dealerAddress).toProperty("dealerAddress")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int insertSelective(VoDealer record) {
        return MyBatis3Utils.insert(this::insert, record, voDealer, c ->
            c.map(pkUseraccount).toPropertyWhenPresent("pkUseraccount", record::getPkUseraccount)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(tel).toPropertyWhenPresent("tel", record::getTel)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(dealerAddress).toPropertyWhenPresent("dealerAddress", record::getDealerAddress)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default Optional<VoDealer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default List<VoDealer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default List<VoDealer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default Optional<VoDealer> selectByPrimaryKey(Short id_, String pkUseraccount_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkUseraccount, isEqualTo(pkUseraccount_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, voDealer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    static UpdateDSL<UpdateModel> updateAllColumns(VoDealer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalTo(record::getPkUseraccount)
                .set(password).equalTo(record::getPassword)
                .set(tel).equalTo(record::getTel)
                .set(username).equalTo(record::getUsername)
                .set(dealerAddress).equalTo(record::getDealerAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VoDealer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkUseraccount).equalToWhenPresent(record::getPkUseraccount)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(tel).equalToWhenPresent(record::getTel)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(dealerAddress).equalToWhenPresent(record::getDealerAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int updateByPrimaryKey(VoDealer record) {
        return update(c ->
            c.set(password).equalTo(record::getPassword)
            .set(tel).equalTo(record::getTel)
            .set(username).equalTo(record::getUsername)
            .set(dealerAddress).equalTo(record::getDealerAddress)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.4094779+08:00", comments="Source Table: vo_dealer")
    default int updateByPrimaryKeySelective(VoDealer record) {
        return update(c ->
            c.set(password).equalToWhenPresent(record::getPassword)
            .set(tel).equalToWhenPresent(record::getTel)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
            .where(id, isEqualTo(record::getId))
            .and(pkUseraccount, isEqualTo(record::getPkUseraccount))
        );
    }
}
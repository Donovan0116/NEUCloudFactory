package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.ContactAddressDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.ContactAddress;

@Mapper
public interface ContactAddressMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    BasicColumn[] selectList = BasicColumn.columnList(id, dealerUseraccount, dealerAddress);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<ContactAddress> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ContactAddressResult")
    Optional<ContactAddress> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ContactAddressResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="dealer_useraccount", property="dealerUseraccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealer_address", property="dealerAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<ContactAddress> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    default int deleteByPrimaryKey(Short id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3426586+08:00", comments="Source Table: contact_address")
    default int insert(ContactAddress record) {
        return MyBatis3Utils.insert(this::insert, record, contactAddress, c ->
            c.map(dealerUseraccount).toProperty("dealerUseraccount")
            .map(dealerAddress).toProperty("dealerAddress")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default int insertSelective(ContactAddress record) {
        return MyBatis3Utils.insert(this::insert, record, contactAddress, c ->
            c.map(dealerUseraccount).toPropertyWhenPresent("dealerUseraccount", record::getDealerUseraccount)
            .map(dealerAddress).toPropertyWhenPresent("dealerAddress", record::getDealerAddress)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default Optional<ContactAddress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default List<ContactAddress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default List<ContactAddress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default Optional<ContactAddress> selectByPrimaryKey(Short id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, contactAddress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    static UpdateDSL<UpdateModel> updateAllColumns(ContactAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dealerUseraccount).equalTo(record::getDealerUseraccount)
                .set(dealerAddress).equalTo(record::getDealerAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ContactAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
                .set(dealerAddress).equalToWhenPresent(record::getDealerAddress);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3436566+08:00", comments="Source Table: contact_address")
    default int updateByPrimaryKey(ContactAddress record) {
        return update(c ->
            c.set(dealerUseraccount).equalTo(record::getDealerUseraccount)
            .set(dealerAddress).equalTo(record::getDealerAddress)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3445408+08:00", comments="Source Table: contact_address")
    default int updateByPrimaryKeySelective(ContactAddress record) {
        return update(c ->
            c.set(dealerUseraccount).equalToWhenPresent(record::getDealerUseraccount)
            .set(dealerAddress).equalToWhenPresent(record::getDealerAddress)
            .where(id, isEqualTo(record::getId))
        );
    }
}
package pers.donovan.cloudfactory.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static pers.donovan.cloudfactory.mapper.BidDynamicSqlSupport.*;

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
import pers.donovan.cloudfactory.beans.Bid;

@Mapper
public interface BidMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    BasicColumn[] selectList = BasicColumn.columnList(id, pkDealerUseraccount, pkAdministratorUseraccont, pkTempOrderId, bidStartTime, bidFinishTime, tempBidUseraccount, tempProductionId, tempProductionNum, finishTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source Table: bid")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3326857+08:00", comments="Source Table: bid")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Short.class)
    int insert(InsertStatementProvider<Bid> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BidResult")
    Optional<Bid> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BidResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="pk_dealer_useraccount", property="pkDealerUseraccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pk_administrator_useraccont", property="pkAdministratorUseraccont", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pk_temp_order_id", property="pkTempOrderId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="bid_start_time", property="bidStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bid_finish_time", property="bidFinishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="temp_bid_useraccount", property="tempBidUseraccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="temp_production_id", property="tempProductionId", jdbcType=JdbcType.CHAR),
        @Result(column="temp_production_num", property="tempProductionNum", jdbcType=JdbcType.SMALLINT),
        @Result(column="finish_time", property="finishTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Bid> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    default int deleteByPrimaryKey(Short id_, String pkDealerUseraccount_, String pkAdministratorUseraccont_, String pkTempOrderId_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(pkDealerUseraccount, isEqualTo(pkDealerUseraccount_))
            .and(pkAdministratorUseraccont, isEqualTo(pkAdministratorUseraccont_))
            .and(pkTempOrderId, isEqualTo(pkTempOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    default int insert(Bid record) {
        return MyBatis3Utils.insert(this::insert, record, bid, c ->
            c.map(pkDealerUseraccount).toProperty("pkDealerUseraccount")
            .map(pkAdministratorUseraccont).toProperty("pkAdministratorUseraccont")
            .map(pkTempOrderId).toProperty("pkTempOrderId")
            .map(bidStartTime).toProperty("bidStartTime")
            .map(bidFinishTime).toProperty("bidFinishTime")
            .map(tempBidUseraccount).toProperty("tempBidUseraccount")
            .map(tempProductionId).toProperty("tempProductionId")
            .map(tempProductionNum).toProperty("tempProductionNum")
            .map(finishTime).toProperty("finishTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3336818+08:00", comments="Source Table: bid")
    default int insertSelective(Bid record) {
        return MyBatis3Utils.insert(this::insert, record, bid, c ->
            c.map(pkDealerUseraccount).toPropertyWhenPresent("pkDealerUseraccount", record::getPkDealerUseraccount)
            .map(pkAdministratorUseraccont).toPropertyWhenPresent("pkAdministratorUseraccont", record::getPkAdministratorUseraccont)
            .map(pkTempOrderId).toPropertyWhenPresent("pkTempOrderId", record::getPkTempOrderId)
            .map(bidStartTime).toPropertyWhenPresent("bidStartTime", record::getBidStartTime)
            .map(bidFinishTime).toPropertyWhenPresent("bidFinishTime", record::getBidFinishTime)
            .map(tempBidUseraccount).toPropertyWhenPresent("tempBidUseraccount", record::getTempBidUseraccount)
            .map(tempProductionId).toPropertyWhenPresent("tempProductionId", record::getTempProductionId)
            .map(tempProductionNum).toPropertyWhenPresent("tempProductionNum", record::getTempProductionNum)
            .map(finishTime).toPropertyWhenPresent("finishTime", record::getFinishTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default Optional<Bid> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default List<Bid> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default List<Bid> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default Optional<Bid> selectByPrimaryKey(Short id_, String pkDealerUseraccount_, String pkAdministratorUseraccont_, String pkTempOrderId_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(pkDealerUseraccount, isEqualTo(pkDealerUseraccount_))
            .and(pkAdministratorUseraccont, isEqualTo(pkAdministratorUseraccont_))
            .and(pkTempOrderId, isEqualTo(pkTempOrderId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bid, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    static UpdateDSL<UpdateModel> updateAllColumns(Bid record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDealerUseraccount).equalTo(record::getPkDealerUseraccount)
                .set(pkAdministratorUseraccont).equalTo(record::getPkAdministratorUseraccont)
                .set(pkTempOrderId).equalTo(record::getPkTempOrderId)
                .set(bidStartTime).equalTo(record::getBidStartTime)
                .set(bidFinishTime).equalTo(record::getBidFinishTime)
                .set(tempBidUseraccount).equalTo(record::getTempBidUseraccount)
                .set(tempProductionId).equalTo(record::getTempProductionId)
                .set(tempProductionNum).equalTo(record::getTempProductionNum)
                .set(finishTime).equalTo(record::getFinishTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Bid record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pkDealerUseraccount).equalToWhenPresent(record::getPkDealerUseraccount)
                .set(pkAdministratorUseraccont).equalToWhenPresent(record::getPkAdministratorUseraccont)
                .set(pkTempOrderId).equalToWhenPresent(record::getPkTempOrderId)
                .set(bidStartTime).equalToWhenPresent(record::getBidStartTime)
                .set(bidFinishTime).equalToWhenPresent(record::getBidFinishTime)
                .set(tempBidUseraccount).equalToWhenPresent(record::getTempBidUseraccount)
                .set(tempProductionId).equalToWhenPresent(record::getTempProductionId)
                .set(tempProductionNum).equalToWhenPresent(record::getTempProductionNum)
                .set(finishTime).equalToWhenPresent(record::getFinishTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3347524+08:00", comments="Source Table: bid")
    default int updateByPrimaryKey(Bid record) {
        return update(c ->
            c.set(bidStartTime).equalTo(record::getBidStartTime)
            .set(bidFinishTime).equalTo(record::getBidFinishTime)
            .set(tempBidUseraccount).equalTo(record::getTempBidUseraccount)
            .set(tempProductionId).equalTo(record::getTempProductionId)
            .set(tempProductionNum).equalTo(record::getTempProductionNum)
            .set(finishTime).equalTo(record::getFinishTime)
            .where(id, isEqualTo(record::getId))
            .and(pkDealerUseraccount, isEqualTo(record::getPkDealerUseraccount))
            .and(pkAdministratorUseraccont, isEqualTo(record::getPkAdministratorUseraccont))
            .and(pkTempOrderId, isEqualTo(record::getPkTempOrderId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-07-20T09:48:37.3356782+08:00", comments="Source Table: bid")
    default int updateByPrimaryKeySelective(Bid record) {
        return update(c ->
            c.set(bidStartTime).equalToWhenPresent(record::getBidStartTime)
            .set(bidFinishTime).equalToWhenPresent(record::getBidFinishTime)
            .set(tempBidUseraccount).equalToWhenPresent(record::getTempBidUseraccount)
            .set(tempProductionId).equalToWhenPresent(record::getTempProductionId)
            .set(tempProductionNum).equalToWhenPresent(record::getTempProductionNum)
            .set(finishTime).equalToWhenPresent(record::getFinishTime)
            .where(id, isEqualTo(record::getId))
            .and(pkDealerUseraccount, isEqualTo(record::getPkDealerUseraccount))
            .and(pkAdministratorUseraccont, isEqualTo(record::getPkAdministratorUseraccont))
            .and(pkTempOrderId, isEqualTo(record::getPkTempOrderId))
        );
    }
}
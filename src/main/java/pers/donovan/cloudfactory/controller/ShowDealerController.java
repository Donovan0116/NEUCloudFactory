package pers.donovan.cloudfactory.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.donovan.cloudfactory.beans.VoTempOrder;
import pers.donovan.cloudfactory.mapper.VoTempOrderDynamicSqlSupport;
import pers.donovan.cloudfactory.mapper.VoTempOrderMapper;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.select;

@RestController
public class ShowDealerController {

    private final VoTempOrderMapper voTempOrderMapper;

    @Autowired
    public ShowDealerController(VoTempOrderMapper voTempOrderMapper) {

        this.voTempOrderMapper = voTempOrderMapper;
    }

    @RequestMapping("/my_orders/{page}/{size}")
    @ResponseBody
    public PageInfo<?> my_orders(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(VoTempOrderDynamicSqlSupport.id, VoTempOrderDynamicSqlSupport.pkOrderId, VoTempOrderDynamicSqlSupport.productionName, VoTempOrderDynamicSqlSupport.productionNum, VoTempOrderDynamicSqlSupport.finishTime, VoTempOrderDynamicSqlSupport.stopTime, VoTempOrderDynamicSqlSupport.dealerUseraccount, VoTempOrderDynamicSqlSupport.tel, VoTempOrderDynamicSqlSupport.dealerAddress)
                        .from(VoTempOrderDynamicSqlSupport.voTempOrder)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoTempOrder> list = voTempOrderMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }


}

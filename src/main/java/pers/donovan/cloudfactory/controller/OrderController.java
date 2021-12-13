package pers.donovan.cloudfactory.controller;


import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.donovan.cloudfactory.beans.*;
import pers.donovan.cloudfactory.mapper.*;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@RestController
public class OrderController {

    private final VoTempOrderMapper voTempOrderMapper;
    private final VoProductionNameMapper voProductionNameMapper;
    private final VoOrderEntityMapper voOrderEntityMapper;
    private final VoOrderStateNameMapper voOrderStateNameMapper;
    private final VoDevicesNameMapper voDevicesNameMapper;

    @Autowired
    public OrderController(VoTempOrderMapper voTempOrderMapper, VoProductionNameMapper voProductionNameMapper, VoOrderEntityMapper voOrderEntityMapper, VoOrderStateNameMapper voOrderStateNameMapper, VoDevicesNameMapper voDevicesNameMapper) {

        this.voTempOrderMapper = voTempOrderMapper;
        this.voProductionNameMapper = voProductionNameMapper;
        this.voOrderEntityMapper = voOrderEntityMapper;
        this.voOrderStateNameMapper = voOrderStateNameMapper;
        this.voDevicesNameMapper = voDevicesNameMapper;
    }

    @PostMapping("/create_order")
    public String create_order(@RequestBody VoTempOrder voTempOrder) {
        voTempOrderMapper.insert(voTempOrder);
        return "success";
    }

    @RequestMapping("/get_production_names")
    @ResponseBody
    public List<VoProductionName> get_production_names() {
        SelectStatementProvider selectStatementProvider =
                select(ProductionDynamicSqlSupport.productionName)
                        .from(ProductionDynamicSqlSupport.production)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        return voProductionNameMapper.selectMany(selectStatementProvider);
    }

    @PostMapping("/plan_order_form/{id}")
    public String plan_order_form(@RequestBody form thisForm, @PathVariable("id") Short id) {
        UpdateStatementProvider updateStatementProvider =
                update(VoOrderEntityDynamicSqlSupport.voOrderEntity)
                        .set(VoOrderEntityDynamicSqlSupport.startTime).equalTo(thisForm.getStartTime())
                        .set(VoOrderEntityDynamicSqlSupport.doFactoryName).equalTo(thisForm.getPkFactoryName())
                        .set(VoOrderEntityDynamicSqlSupport.orderStateName).equalTo(thisForm.getOrderStateName())
                        .set(VoOrderEntityDynamicSqlSupport.deviceName).equalTo(thisForm.getDeviceName())
                        .where(VoOrderEntityDynamicSqlSupport.id, isEqualTo(id))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        voOrderEntityMapper.update(updateStatementProvider);
        return "success";
    }

    @GetMapping("/get_states")
    @ResponseBody
    public List<VoOrderStateName> get_states() {
        SelectStatementProvider selectStatementProvider =
                select(OrderStateDynamicSqlSupport.orderStateName)
                        .from(OrderStateDynamicSqlSupport.orderState)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        return voOrderStateNameMapper.selectMany(selectStatementProvider);
    }

    @GetMapping("/get_devices_name/{current_user}")
    @ResponseBody
    public List<VoDevicesName> get_devices_name(@PathVariable("current_user") String pkUseraccount) {
        SelectStatementProvider selectStatementProvider =
                select(FactoryDeviceDynamicSqlSupport.factoryDeviceName)
                        .from(FactoryDeviceDynamicSqlSupport.factoryDevice)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);

        List<VoDevicesName> list1 = voDevicesNameMapper.selectMany(selectStatementProvider);

        SelectStatementProvider selectStatementProvider1 =
                select(CentreDeviceDynamicSqlSupport.centreDeviceName)
                        .from(CentreDeviceDynamicSqlSupport.centreDevice)
                        .join(FactoryDynamicSqlSupport.factory)
                        .on(FactoryDynamicSqlSupport.pkFactoryName, equalTo(CentreDeviceDynamicSqlSupport.rentToFactoryName))
                        .where(FactoryDynamicSqlSupport.administratorUseraccount, isEqualTo(pkUseraccount))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoDevicesName> list2 = voDevicesNameMapper.selectMany(selectStatementProvider1);

        list1.addAll(list2);
        return list1;
    }


}

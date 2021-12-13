package pers.donovan.cloudfactory.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.donovan.cloudfactory.beans.*;
import pers.donovan.cloudfactory.mapper.*;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@RestController
public class ShowAdminController {
    private final VoMyDeviceMapper voMyDeviceMapper;
    private final VoRentDeviceMapper voRentDeviceMapper;
    private final VoTempOrderMapper voTempOrderMapper;
    private final VoPlanListMapper voPlanListMapper;
    private final VoOrderEntityMapper voOrderEntityMapper;


    @Autowired
    public ShowAdminController(VoMyDeviceMapper voMyDeviceMapper, VoRentDeviceMapper voRentDeviceMapper, VoTempOrderMapper voTempOrderMapper, VoPlanListMapper voPlanListMapper, VoOrderEntityMapper voOrderEntityMapper) {

        this.voMyDeviceMapper = voMyDeviceMapper;
        this.voRentDeviceMapper = voRentDeviceMapper;
        this.voTempOrderMapper = voTempOrderMapper;
        this.voPlanListMapper = voPlanListMapper;
        this.voOrderEntityMapper = voOrderEntityMapper;
    }

    @RequestMapping("/devices/{page}/{size}")
    @ResponseBody
    public PageInfo<?> devices(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(FactoryDeviceDynamicSqlSupport.id, FactoryDeviceDynamicSqlSupport.pkFactoryDeviceId, FactoryDeviceDynamicSqlSupport.factoryDeviceName, DeviceTypeDynamicSqlSupport.deviceTypeName, FactoryDeviceDynamicSqlSupport.factoryDeviceSpecification, DeviceStateDynamicSqlSupport.deviceStateName, FactoryDeviceDynamicSqlSupport.fromFactory)
                        .from(FactoryDeviceDynamicSqlSupport.factoryDevice)
                        .join(DeviceStateDynamicSqlSupport.deviceState)
                        .on(DeviceStateDynamicSqlSupport.pkDeviceStateId, equalTo(FactoryDeviceDynamicSqlSupport.factoryDeviceStateId))
                        .join(DeviceTypeDynamicSqlSupport.deviceType)
                        .on(FactoryDeviceDynamicSqlSupport.factoryDeviceTypeId, equalTo(DeviceTypeDynamicSqlSupport.pkDeviceTypeId))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoMyDevice> list = voMyDeviceMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/rent_devices/{current_user}/{page}/{size}")
    @ResponseBody
    public PageInfo<?> rent_devices(@PathVariable("current_user") String pkUseraccount, @PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(CentreDeviceDynamicSqlSupport.id, CentreDeviceDynamicSqlSupport.pkCentreDeviceId, CentreDeviceDynamicSqlSupport.centreDeviceName, DeviceTypeDynamicSqlSupport.deviceTypeName, CentreDeviceDynamicSqlSupport.centreDeviceSpecification, DeviceStateDynamicSqlSupport.deviceStateName)
                        .from(CentreDeviceDynamicSqlSupport.centreDevice)
                        .join(DeviceStateDynamicSqlSupport.deviceState)
                        .on(DeviceStateDynamicSqlSupport.pkDeviceStateId, equalTo(CentreDeviceDynamicSqlSupport.centreDeviceStateId))
                        .join(DeviceTypeDynamicSqlSupport.deviceType)
                        .on(DeviceTypeDynamicSqlSupport.pkDeviceTypeId, equalTo(CentreDeviceDynamicSqlSupport.centreDeviceTypeId))
                        .join(FactoryDynamicSqlSupport.factory)
                        .on(FactoryDynamicSqlSupport.pkFactoryName, equalTo(CentreDeviceDynamicSqlSupport.rentToFactoryName))
                        .where(FactoryDynamicSqlSupport.administratorUseraccount, isEqualTo(pkUseraccount))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoRentDevice> list = voRentDeviceMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/get_order/{page}/{size}")
    @ResponseBody
    public PageInfo<?> get_order(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(VoTempOrderDynamicSqlSupport.id, VoTempOrderDynamicSqlSupport.pkOrderId, VoTempOrderDynamicSqlSupport.productionName, VoTempOrderDynamicSqlSupport.productionNum, VoTempOrderDynamicSqlSupport.finishTime, VoTempOrderDynamicSqlSupport.stopTime, VoTempOrderDynamicSqlSupport.dealerUseraccount, VoTempOrderDynamicSqlSupport.tel, VoTempOrderDynamicSqlSupport.dealerAddress)
                        .from(VoTempOrderDynamicSqlSupport.voTempOrder)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoTempOrder> list = voTempOrderMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/plan_order/{page}/{size}")
    @ResponseBody
    public PageInfo<?> plan_order(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(VoOrderEntityDynamicSqlSupport.id, VoOrderEntityDynamicSqlSupport.pkOrderId, VoOrderEntityDynamicSqlSupport.startTime, VoOrderEntityDynamicSqlSupport.finishTime, VoOrderEntityDynamicSqlSupport.dealerUseraccount, VoOrderEntityDynamicSqlSupport.dealerAddress, VoOrderEntityDynamicSqlSupport.doFactoryName, VoOrderEntityDynamicSqlSupport.orderStateName, VoOrderEntityDynamicSqlSupport.productionName, VoOrderEntityDynamicSqlSupport.productionNum, VoOrderEntityDynamicSqlSupport.deviceName)
                        .from(VoOrderEntityDynamicSqlSupport.voOrderEntity)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoOrderEntity> list = voOrderEntityMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @PostMapping("/back_order")
    public String back_order(@RequestBody VoTempOrder voTempOrder) {
        voTempOrderMapper.delete(c -> c.where(VoTempOrderDynamicSqlSupport.id, isEqualTo(voTempOrder.getId())));
        VoOrderEntity voOrderEntity = new VoOrderEntity(voTempOrder.getId(), voTempOrder.getPkOrderId(), null, voTempOrder.getFinishTime(), voTempOrder.getDealerUseraccount(), voTempOrder.getDealerAddress(), null, null, voTempOrder.getProductionName(), voTempOrder.getProductionNum(), null);
        voOrderEntityMapper.insert(voOrderEntity);
        return "success";
    }




}

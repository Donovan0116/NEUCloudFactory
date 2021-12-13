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
public class ShowSuperAdminController {

    private final VoAdministratorMapper voAdministratorMapper;
    private final VoDealerMapper voDealerMapper;
    private final FactoryMapper factoryMapper;
    private final ProductionTypeMapper productionTypeMapper;
    private final DeviceTypeMapper deviceTypeMapper;
    private final VoCentreDeviceMapper voCentreDeviceMapper;
    private final VoOrderEntityMapper voOrderEntityMapper;
    private final VoProductionMapper voProductionMapper;


    @Autowired
    public ShowSuperAdminController(VoAdministratorMapper voAdministratorMapper, VoDealerMapper voDealerMapper, FactoryMapper factoryMapper, ProductionTypeMapper productionTypeMapper, DeviceTypeMapper deviceTypeMapper, VoCentreDeviceMapper voCentreDeviceMapper, VoOrderEntityMapper voOrderEntityMapper, VoProductionMapper voProductionMapper) {
        this.voAdministratorMapper = voAdministratorMapper;
        this.voDealerMapper = voDealerMapper;
        this.factoryMapper = factoryMapper;
        this.productionTypeMapper = productionTypeMapper;
        this.deviceTypeMapper = deviceTypeMapper;
        this.voCentreDeviceMapper = voCentreDeviceMapper;
        this.voOrderEntityMapper = voOrderEntityMapper;
        this.voProductionMapper = voProductionMapper;
    }


    @RequestMapping("/admin_manage/{page}/{size}")
    @ResponseBody
    public PageInfo<?> admin_manage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(AdministratorDynamicSqlSupport.id, AdministratorDynamicSqlSupport.username, AdministratorDynamicSqlSupport.pkUseraccount, AdministratorDynamicSqlSupport.password, AdministratorDynamicSqlSupport.tel, FactoryDynamicSqlSupport.pkFactoryName)
                        .from(AdministratorDynamicSqlSupport.administrator)
                        .join(FactoryDynamicSqlSupport.factory)
                        .on(FactoryDynamicSqlSupport.administratorUseraccount, equalTo(AdministratorDynamicSqlSupport.pkUseraccount))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoAdministrator> list = voAdministratorMapper.selectMany(selectStatementProvider);
        System.out.println(list);
        return new PageInfo<>(list);
    }

    @RequestMapping("/dealer_manage/{page}/{size}")
    @ResponseBody
    public PageInfo<?> dealer_manage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(DealerDynamicSqlSupport.id, DealerDynamicSqlSupport.username, DealerDynamicSqlSupport.pkUseraccount, DealerDynamicSqlSupport.password, DealerDynamicSqlSupport.tel)
                        .from(DealerDynamicSqlSupport.dealer)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoDealer> list = voDealerMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/factory_info/{page}/{size}")
    @ResponseBody
    public PageInfo<?> factory_info(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(FactoryDynamicSqlSupport.id, FactoryDynamicSqlSupport.pkFactoryName, FactoryDynamicSqlSupport.factoryBrief, FactoryDynamicSqlSupport.administratorUseraccount, FactoryDynamicSqlSupport.contactUser, FactoryDynamicSqlSupport.tel, FactoryDynamicSqlSupport.isOperation)
                        .from(FactoryDynamicSqlSupport.factory)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<Factory> list = factoryMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/production_type/{page}/{size}")
    @ResponseBody
    public PageInfo<?> production_type(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(ProductionTypeDynamicSqlSupport.id, ProductionTypeDynamicSqlSupport.pkProductionTypeId, ProductionTypeDynamicSqlSupport.productionTypeName)
                        .from(ProductionTypeDynamicSqlSupport.productionType)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<ProductionType> list = productionTypeMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/production_info/{page}/{size}")
    @ResponseBody
    public PageInfo<?> production_info(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(ProductionDynamicSqlSupport.id, ProductionDynamicSqlSupport.pkProductionId, ProductionDynamicSqlSupport.productionName, ProductionTypeDynamicSqlSupport.productionTypeName, ProductionDynamicSqlSupport.productionSpecification, ProductionDynamicSqlSupport.productionBrief)
                        .from(ProductionDynamicSqlSupport.production)
                        .join(ProductionTypeDynamicSqlSupport.productionType)
                        .on(ProductionDynamicSqlSupport.productionTypeId, equalTo(ProductionTypeDynamicSqlSupport.pkProductionTypeId))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoProduction> list = voProductionMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/centre_device_type/{page}/{size}")
    @ResponseBody
    public PageInfo<?> centre_device_type(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(DeviceTypeDynamicSqlSupport.id, DeviceTypeDynamicSqlSupport.pkDeviceTypeId, DeviceTypeDynamicSqlSupport.deviceTypeName)
                        .from(DeviceTypeDynamicSqlSupport.deviceType)
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<DeviceType> list = deviceTypeMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/centre_device/{page}/{size}")
    @ResponseBody
    public PageInfo<?> centre_device(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(CentreDeviceDynamicSqlSupport.id,CentreDeviceDynamicSqlSupport.pkCentreDeviceId,CentreDeviceDynamicSqlSupport.centreDeviceName,DeviceTypeDynamicSqlSupport.deviceTypeName,CentreDeviceDynamicSqlSupport.centreDeviceSpecification,DeviceStateDynamicSqlSupport.deviceStateName,CentreDeviceDynamicSqlSupport.rentToFactoryName)
                        .from(CentreDeviceDynamicSqlSupport.centreDevice)
                        .join(DeviceStateDynamicSqlSupport.deviceState)
                        .on(CentreDeviceDynamicSqlSupport.centreDeviceStateId,equalTo(DeviceStateDynamicSqlSupport.pkDeviceStateId))
                        .join(DeviceTypeDynamicSqlSupport.deviceType)
                        .on(DeviceTypeDynamicSqlSupport.pkDeviceTypeId,equalTo(CentreDeviceDynamicSqlSupport.centreDeviceTypeId))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoCentreDevice> list = voCentreDeviceMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

    @RequestMapping("/order_info/{page}/{size}")
    @ResponseBody
    public PageInfo<?> order_info(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageHelper.startPage(page, size);
        SelectStatementProvider selectStatementProvider =
                select(OrderEntityDynamicSqlSupport.id,OrderEntityDynamicSqlSupport.pkOrderId,OrderEntityDynamicSqlSupport.startTime,OrderEntityDynamicSqlSupport.finishTime,OrderEntityDynamicSqlSupport.dealerUseraccount,OrderEntityDynamicSqlSupport.dealerAddress,OrderEntityDynamicSqlSupport.doFactoryName,OrderStateDynamicSqlSupport.orderStateName)
                        .from(OrderEntityDynamicSqlSupport.orderEntity)
                        .join(OrderStateDynamicSqlSupport.orderState)
                        .on(OrderStateDynamicSqlSupport.pkOrderStateId,equalTo(OrderEntityDynamicSqlSupport.orderStateId))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        List<VoOrderEntity> list = voOrderEntityMapper.selectMany(selectStatementProvider);
        return new PageInfo<>(list);
    }

}

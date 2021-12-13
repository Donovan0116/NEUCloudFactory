package pers.donovan.cloudfactory.controller;

import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.donovan.cloudfactory.mapper.*;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@RestController
public class DeleteController {

    private final AdministratorMapper administratorMapper;
    private final DealerMapper dealerMapper;
    private final FactoryMapper factoryMapper;


    @Autowired
    public DeleteController(AdministratorMapper administratorMapper, DealerMapper dealerMapper, FactoryMapper factoryMapper) {

        this.administratorMapper = administratorMapper;
        this.dealerMapper = dealerMapper;
        this.factoryMapper = factoryMapper;
    }

    @RequestMapping("/adminDeletedByID/{id}/{pkUseraccount}")
    @ResponseBody
    public void adminDeletedByID(@PathVariable("id") Short id, @PathVariable("pkUseraccount") String pkUseraccount) {
        Byte state = 0;
        administratorMapper.delete(c -> c.where(AdministratorDynamicSqlSupport.id, isEqualTo(id)));
        UpdateStatementProvider updateStatementProvider =
                update(FactoryDynamicSqlSupport.factory)
                        .set(FactoryDynamicSqlSupport.isOperation).equalTo(state)
                        .set(FactoryDynamicSqlSupport.administratorUseraccount).equalToNull()
                        .where(FactoryDynamicSqlSupport.administratorUseraccount,isEqualTo(pkUseraccount))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        factoryMapper.update(updateStatementProvider);
    }

    @RequestMapping("/dealerDeletedByID/{id}")
    @ResponseBody
    public void dealerDeletedByID(@PathVariable("id") Short id) {
        dealerMapper.delete(c -> c.where(DealerDynamicSqlSupport.id, isEqualTo(id)));
    }


}

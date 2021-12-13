package pers.donovan.cloudfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.donovan.cloudfactory.beans.Administrator;
import pers.donovan.cloudfactory.beans.Dealer;
import pers.donovan.cloudfactory.mapper.AdministratorDynamicSqlSupport;
import pers.donovan.cloudfactory.mapper.AdministratorMapper;
import pers.donovan.cloudfactory.mapper.DealerDynamicSqlSupport;
import pers.donovan.cloudfactory.mapper.DealerMapper;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.Optional;

@RestController
public class RegController {
    private final AdministratorMapper administratorMapper;
    private final DealerMapper dealerMapper;


    @Autowired
    public RegController(AdministratorMapper administratorMapper, DealerMapper dealerMapper) {
        this.administratorMapper = administratorMapper;
        this.dealerMapper = dealerMapper;
    }

    @PostMapping("/admin_reg")
    public String Reg(@RequestBody Administrator administrator) {
        Optional<Administrator> administrator1 = administratorMapper.selectOne(c -> c.where(AdministratorDynamicSqlSupport.pkUseraccount, isEqualTo(administrator.getPkUseraccount())));
        if (administrator1.isPresent()) {
            return "fail";
        }
        administratorMapper.insert(administrator);
        return "success";
    }

    @PostMapping("/dealer_reg")
    public String Reg(@RequestBody Dealer dealer) {
        Optional<Dealer> dealer1 = dealerMapper.selectOne(c -> c.where(DealerDynamicSqlSupport.pkUseraccount, isEqualTo(dealer.getPkUseraccount())));
        if (dealer1.isPresent()) {
            return "fail";
        }
        dealerMapper.insert(dealer);
        return "success";
    }


}

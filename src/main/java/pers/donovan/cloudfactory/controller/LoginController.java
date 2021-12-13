package pers.donovan.cloudfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.donovan.cloudfactory.beans.Administrator;
import pers.donovan.cloudfactory.beans.Dealer;
import pers.donovan.cloudfactory.beans.SuperAdministrator;
import pers.donovan.cloudfactory.beans.User;
import pers.donovan.cloudfactory.mapper.*;
import pers.donovan.cloudfactory.util.JwtUtils;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@RestController
public class LoginController {
    private final AdministratorMapper administratorMapper;
    private final DealerMapper dealerMapper;
    private final SuperAdministratorMapper superAdministratorMapper;

    @Autowired
    public LoginController(AdministratorMapper administratorMapper, DealerMapper dealerMapper, SuperAdministratorMapper superAdministratorMapper) {
        this.administratorMapper = administratorMapper;
        this.dealerMapper = dealerMapper;
        this.superAdministratorMapper = superAdministratorMapper;
    }

    @PostMapping("/login")
    public Object Login(@RequestBody User user) {
        //传过来的json对象转换成User，Beans中的User目的就在于临时产生，用于登录

        //查询成功后，存一个token，并上传给vue的服务器
        //完成！通过测试了，我太开心了我敲
        Optional<Administrator> user1 = administratorMapper.selectOne(c -> c.where(AdministratorDynamicSqlSupport.pkUseraccount, isEqualTo(user.getPkUseraccount())).and(AdministratorDynamicSqlSupport.password, isEqualTo(user.getPassword())));
        Optional<Dealer> user2 = dealerMapper.selectOne(c -> c.where(DealerDynamicSqlSupport.pkUseraccount, isEqualTo(user.getPkUseraccount())).and(DealerDynamicSqlSupport.password, isEqualTo(user.getPassword())));
        Optional<SuperAdministrator> user3 = superAdministratorMapper.selectOne(c -> c.where(SuperAdministratorDynamicSqlSupport.pkUseraccount, isEqualTo(user.getPkUseraccount())).and(SuperAdministratorDynamicSqlSupport.password, isEqualTo(user.getPassword())));

        if (user1.isPresent()) {
            Administrator administrator = user1.get();
            administrator.setToken(JwtUtils.createToken(administrator.getUsername(), "administrator"));
            return administrator;
        } else if (user2.isPresent()) {
            Dealer dealer = user2.get();
            dealer.setToken(JwtUtils.createToken(dealer.getUsername(), "dealer"));
            return dealer;
        } else if (user3.isPresent()) {
            SuperAdministrator superAdministrator = user3.get();
            superAdministrator.setToken(JwtUtils.createToken(superAdministrator.getUsername(), "super_administrator"));
            return superAdministrator;
        } else {
            return user;
        }
    }
}

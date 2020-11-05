package com.jus.tian.controller.accountController;

import com.jus.tian.domain.Account;
import com.jus.tian.service.accountService.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

/**
 * @Auther: JusChui
 * @Date: 2020/11/5 15:20
 * @Description:
 * Account的Controller层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层Controller执行...");
        //调用service的findAll方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }

    @RequestMapping(path = "/saveAccount", method = {RequestMethod.POST})
    public String saveAccount(Account account){
        account.setId(UUID.randomUUID().toString().replace("-",""));
        accountService.saveAccount(account);
        return "success";
    }
}

package com.jus.tian.service.accountService;

import com.jus.tian.domain.Account;

import java.util.List;

/**
 * Account的service层接口
 */
public interface IAccountService {

    //查询所有账户
    public List<Account> findAll();

    //保存Account信息
    public void saveAccount(Account account);
}

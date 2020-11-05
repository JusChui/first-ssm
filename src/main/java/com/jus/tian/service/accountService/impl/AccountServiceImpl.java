package com.jus.tian.service.accountService.impl;

import com.jus.tian.dao.accountDao.IAccountDao;
import com.jus.tian.domain.Account;
import com.jus.tian.service.accountService.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: JusChui
 * @Date: 2020/11/5 15:18
 * @Description:
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账户信息...");
        return accountDao.findAll();
    }

    @Transactional
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("业务层：保存账户信息...");
    }
}

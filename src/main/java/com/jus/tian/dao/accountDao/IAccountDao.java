package com.jus.tian.dao.accountDao;


import com.jus.tian.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Account的dao接口
 */
@Repository
public interface IAccountDao {

    //查询所有账户
//    @Select("select * from accounts_spring")
    List<Account> findAll();

    //保存Account信息
//    @Insert("insert into accounts_spring(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}

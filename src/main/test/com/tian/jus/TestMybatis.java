package com.tian.jus;

import com.jus.tian.dao.accountDao.IAccountDao;
import com.jus.tian.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: JusChui
 * @Date: 2020/11/5 16:36
 * @Description:
 */
public class TestMybatis {

    @Test
    public void run() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession sqlSession =
                sessionFactory.openSession();
        //获取到代理对象
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i));
        }
    }

    @Test
    public void runSave() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession sqlSession =
                sessionFactory.openSession();
        //获取到代理对象
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        Account account = new Account();
//        account.setId();
        account.setName("jjj");
        account.setMoney(2800f);
        accountDao.saveAccount(account);
        sqlSession.commit();
    }
}

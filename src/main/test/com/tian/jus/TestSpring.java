package com.tian.jus;

import com.jus.tian.service.accountService.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: JusChui
 * @Date: 2020/11/5 15:26
 * @Description:
 */
public class TestSpring {

    @Test
    public void run(){
        //加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        //调用方法
        accountService.findAll();
    }
}

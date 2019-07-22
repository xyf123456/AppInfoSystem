package com.bdqn.appInfo.service;

import com.bdqn.appInfo.pojo.Info;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext.xml")
public class AppInfoServiceTest {
    private Logger logger = Logger.getLogger(this.getClass());
    private ApplicationContext context = null;
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAppInfo() throws Exception {
        AppInfoService appInfoService= (AppInfoService) context.getBean("appInfoService");
        Info info=appInfoService.getAppInfo(null,null);
        logger.info(info.getApkname()+"————"+info.getDevid());
    }

}
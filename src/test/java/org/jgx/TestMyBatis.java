package org.jgx;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.jgx.bo.Veterinary;
import org.jgx.bo.ZhidaoQuestion;
import org.jgx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by JiangGuagnxing on 2016/12/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //    private ApplicationContext ac = null;
    @Resource
    private UserService userService;

//    @Before
//    public void before() {
//        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        userService = (UserService) ac.getBean("userService");
//    }

    @Test
    public void test1() {
        ZhidaoQuestion zhidaoQuestion = userService.getZQById(9L);
        Veterinary veterinary = userService.getViById(1L);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(zhidaoQuestion));
        logger.info(JSON.toJSONString(veterinary));
    }
}

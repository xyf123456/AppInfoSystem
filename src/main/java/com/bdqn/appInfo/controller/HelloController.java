package com.bdqn.appInfo.controller;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.exception.CommonReturnType;
import com.bdqn.appInfo.exception.EmBusinessError;
import com.bdqn.appInfo.pojo.Dev_User;
import com.bdqn.appInfo.service.Dev_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Description: 测试控制器
 * @Author: xyf
 * @Date 2019/7/18 15:14
 */
@Controller
@RequestMapping("test")
public class HelloController {


    @Autowired
    private Dev_UserService dev_userService;
    /**
     * @Description: 测试部署
     * @param: []
     * @return: java.lang.Object
     * @Date: 2019/07/18 15:21
     */
    @RequestMapping("/hello")
    @ResponseBody
    public Object world(){

        return CommonReturnType.create("hello world");
    }

    @RequestMapping("/findDev_user/{dev_userId}")
    @ResponseBody
    public Object findDev_user(@PathVariable("dev_userId") Long dev_userId) throws BusinessExcpetion {
        Dev_User user=dev_userService.findDevUserById(dev_userId);
        if (user==null){
            throw  new BusinessExcpetion(EmBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnType.create(user);
    }

}

package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Back_User;

/**
 * @ClassName: Back_UserService
 * @Description: 后台用户业务接口
 * @Author: xyf
 * @Date 2019/7/18 16:11
 */
public interface Back_UserService {

    /**
     * @Description: 登录
     * @param: [usercode, userpassword]
     * @return: com.bdqn.appInfo.pojo.Back_User
     * @Date: 2019/07/18 16:31
     */
    Back_User login(String usercode, String userpassword)throws BusinessExcpetion;
}

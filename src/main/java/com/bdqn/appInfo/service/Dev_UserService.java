package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Dev_User;

/**
 * @ClassName: Dev_UserService
 * @Description: 开发用户业务接口
 * @Author: xyf
 * @Date 2019/7/18 15:19
 */
public interface Dev_UserService {

    /**
     * @Description: 查找到DevUser
     * @param: [dev_userId]
     * @return: com.bdqn.appInfo.pojo.Dev_User
     * @Date: 2019/07/18 15:26
     */
    Dev_User findDevUserById(Long dev_userId) throws BusinessExcpetion;
}

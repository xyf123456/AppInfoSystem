package com.bdqn.appInfo.service.impl;

import com.bdqn.appInfo.dao.Back_UserMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Back_User;
import com.bdqn.appInfo.service.Back_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: Back_UserServiceImpl
 * @Description: 后台用户业务接口
 * @Author: xyf
 * @Date 2019/7/18 16:12
 */
@Service
@Transactional
public class Back_UserServiceImpl implements Back_UserService {

    @Autowired
    private Back_UserMapper back_userMapper;

    /**
     * @param usercode
     * @param userpassword
     * @Description: 登录
     * @param: [usercode, userpassword]
     * @return: com.bdqn.appInfo.pojo.Back_User
     * @Date: 2019/07/18 16:31
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Back_User login(String usercode, String userpassword) throws BusinessExcpetion {
        Back_User user = back_userMapper.selectByCodeAndPwd(usercode, userpassword);
        if (user == null) {
            return null;
        }
        return user;
    }
}

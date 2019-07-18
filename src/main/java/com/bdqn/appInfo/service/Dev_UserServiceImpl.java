package com.bdqn.appInfo.service;

import com.bdqn.appInfo.dao.Dev_UserMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Dev_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: Dev_UserServiceImpl
 * @Description: 开发用户业务接口实现类
 * @Author: xyf
 * @Date 2019/7/18 15:20
 */
@Service
@Transactional
public class Dev_UserServiceImpl implements Dev_UserService {

    @Autowired
    private Dev_UserMapper dev_userMapper;

    /**
     * @param dev_userId
     * @Description: 查找到DevUser
     * @param: [dev_userId]
     * @return: com.bdqn.appInfo.pojo.Dev_User
     * @Date: 2019/07/18 15:26
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Dev_User findDevUserById(Long dev_userId) throws BusinessExcpetion {
        Dev_User dev_user = dev_userMapper.selectByPrimaryKey(dev_userId);
        if (dev_user == null) {
            return null;
        }
        return dev_user;
    }
}

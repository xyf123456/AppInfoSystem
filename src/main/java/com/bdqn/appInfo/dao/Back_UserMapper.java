package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.Back_User;

public interface Back_UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Back_User record);

    int insertSelective(Back_User record);

    Back_User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Back_User record);

    int updateByPrimaryKey(Back_User record);
}
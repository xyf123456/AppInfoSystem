package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.Dev_User;
import org.apache.ibatis.annotations.Param;

public interface Dev_UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dev_User record);

    int insertSelective(Dev_User record);

    Dev_User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dev_User record);

    int updateByPrimaryKey(Dev_User record);

    Dev_User selectByDevCodeAndPwd(@Param("devcode") String devcode,@Param("devpassword") String devpassword);
}
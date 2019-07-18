package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.Back_User;
import org.apache.ibatis.annotations.Param;

public interface Back_UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Back_User record);

    int insertSelective(Back_User record);

    Back_User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Back_User record);

    int updateByPrimaryKey(Back_User record);

    /**
     * @Description: 通过usercode+userpassword查找到后台登录用户
     * @param: [usercode, userpassword]
     * @return: com.bdqn.appInfo.pojo.Back_User
     * @Date: 2019/07/18 16:34
     */
    Back_User selectByCodeAndPwd(@Param("usercode") String usercode,@Param("userpassword") String userpassword);
}
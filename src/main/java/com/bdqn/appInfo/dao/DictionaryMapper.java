package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.Dictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    /**
     * @Description: 获取不同的类型信息
     * @param: [typeCode]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Dictionary>
     * @Date: 2019/07/19 16:50
     */
    List<Dictionary> selectByTypeCode(@Param("typeCode") String typeCode);
}
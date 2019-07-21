package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @ClassName: CategoryMapper
 * @Description: 类别数据访问接口
 * @Author: xyf
 * @Date 2019/7/19 17:00
 */
public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    /**
     * @Description: 根据父类id查询类别信息
     * @param: [parentId]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Category>
     * @Date: 2019/07/19 16:59
     */
    List<Category> selectByParentId(@Param("parentId") Integer parentId);
}
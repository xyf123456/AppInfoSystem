package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Category;

import java.util.List;

/**
 * @ClassName: CategoryService
 * @Description: 分类的业务接口
 * @Author: xyf
 * @Date 2019/7/19 16:54
 */
public interface CategoryService {

    /**
     * @Description: 根据父类的id获取类别信息
     * @param: [parentId]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Category>
     * @Date: 2019/07/19 16:56
     */
    List<Category> getAppCategoryListByParentId(Integer parentId)throws BusinessExcpetion;
}

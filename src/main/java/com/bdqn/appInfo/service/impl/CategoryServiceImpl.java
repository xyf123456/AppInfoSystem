package com.bdqn.appInfo.service.impl;

import com.bdqn.appInfo.dao.CategoryMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Category;
import com.bdqn.appInfo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: CategoryServiceImpl
 * @Description: 分类的业务接口实现类
 * @Author: xyf
 * @Date 2019/7/19 16:55
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * @param parentId
     * @Description: 根据父类的id获取类别信息
     * @param: [parentId]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Category>
     * @Date: 2019/07/19 16:56
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Category> getAppCategoryListByParentId(Integer parentId) throws BusinessExcpetion {
        List<Category> categoryList = categoryMapper.selectByParentId(parentId);
        if (categoryList == null) {
            return null;
        }
        return categoryList;
    }
}

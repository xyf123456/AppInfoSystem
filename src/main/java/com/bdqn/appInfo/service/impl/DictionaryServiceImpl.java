package com.bdqn.appInfo.service.impl;

import com.bdqn.appInfo.dao.DictionaryMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Dictionary;
import com.bdqn.appInfo.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: DictionaryServiceImpl
 * @Description: 数据字典接口实现类
 * @Author: xyf
 * @Date 2019/7/19 16:40
 */
@Service
@Transactional
public class DictionaryServiceImpl implements DictionaryService{

    @Autowired
    private DictionaryMapper dictionaryMapper;
    /**
     * @param typeCode
     * @Description: 获取数据字典信息（根据typeCode类型编码）
     * @param: [typeCode]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Dictionary>
     * @Date: 2019/07/19 16:48
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Dictionary> getDataDictionaryList(String typeCode) throws BusinessExcpetion {
        List<Dictionary> dictionaryList =  dictionaryMapper.selectByTypeCode(typeCode);
        if (dictionaryList==null){
            return null;
        }
        return dictionaryList;
    }
}

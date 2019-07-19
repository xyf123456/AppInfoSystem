package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Dictionary;

import java.util.List;

/**
 * @ClassName: DictionaryService
 * @Description: 数据字典接口
 * @Author: xyf
 * @Date 2019/7/19 16:40
 */
public interface DictionaryService {
    /**
     * @Description: 获取数据字典信息（根据typeCode类型编码）
     * @param: [typeCode]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Dictionary>
     * @Date: 2019/07/19 16:48
     */
    List<Dictionary> getDataDictionaryList(String typeCode) throws BusinessExcpetion;
}

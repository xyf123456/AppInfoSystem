package com.bdqn.appInfo.service.impl;

import com.bdqn.appInfo.dao.InfoMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Info;
import com.bdqn.appInfo.service.AppInfoService;
import com.sun.deploy.ui.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: AppInfoServiceImpl
 * @Description: App相关的业务接口实现类
 * @Author: xyf
 * @Date 2019/7/19 15:22
 */
@Service
@Transactional
public class AppInfoServiceImpl implements AppInfoService {

    @Autowired
    private InfoMapper infoMapper;

    /**
     * @param querySoftwareName
     * @param queryStatus
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param queryFlatformId
     * @param devId
     * @Description: 获取app的数量
     * @param: [querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId]
     * @return: int
     * @Date: 2019/07/19 15:24
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAppInfoCount(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Long devId) throws BusinessExcpetion {
        return infoMapper.selectAppInfoCount(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId);
    }

    /**
     * @param querySoftwareName
     * @param queryStatus
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param queryFlatformId
     * @param devId
     * @param currentPageNo
     * @param pageSize
     * @Description: 查询APP的信息
     * @param: [querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId, currentPageNo, pageSize]
     * @return: java.util.List<com.sun.deploy.ui.AppInfo>
     * @Date: 2019/07/19 15:45
     */
    @Override
    public List<AppInfo> getAppInfoList(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Long devId, Integer currentPageNo, int pageSize) throws BusinessExcpetion {
        List<AppInfo> appInfoList=infoMapper.selectAppInfoList(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId,(currentPageNo-1)*pageSize,pageSize);
        if (appInfoList==null){
            return null;
        }
        return appInfoList;
    }
}

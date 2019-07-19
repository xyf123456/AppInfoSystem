package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.sun.deploy.ui.AppInfo;

import java.util.List;

/**
 * @ClassName: AppInfoService
 * @Description: App相关的业务接口
 * @Author: xyf
 * @Date 2019/7/19 15:21
 */
public interface AppInfoService {

    /**
     * @Description: 获取app的数量
     * @param: [querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId]
     * @return: int
     * @Date: 2019/07/19 15:24
     */
    int getAppInfoCount(String querySoftwareName,
                        Integer queryStatus,
                        Integer queryCategoryLevel1,
                        Integer queryCategoryLevel2,
                        Integer queryCategoryLevel3,
                        Integer queryFlatformId, Long devId) throws BusinessExcpetion;

    /**
     * @Description: 查询APP的信息
     * @param: [querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId, currentPageNo, pageSize]
     * @return: java.util.List<com.sun.deploy.ui.AppInfo>
     * @Date: 2019/07/19 15:45
     */
    List<AppInfo> getAppInfoList(String querySoftwareName,
                                 Integer queryStatus,
                                 Integer queryCategoryLevel1,
                                 Integer queryCategoryLevel2,
                                 Integer queryCategoryLevel3,
                                 Integer queryFlatformId,
                                 Long devId,
                                 Integer currentPageNo,
                                 int pageSize)throws BusinessExcpetion;
}

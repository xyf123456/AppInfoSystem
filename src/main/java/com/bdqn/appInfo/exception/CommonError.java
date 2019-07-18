package com.bdqn.appInfo.exception;
/**
 * @ClassName: CommonError
 * @Description: 全局错误接口
 * @Author: xyf
 * @Date 2019/7/13 12:25
 */
public interface CommonError {

    /**
     * @ Description:获取错误的错误代码
     * @params:  * @Param:
     * @return:int
     **/
    int getErrorCode();


    /**
     * @ Description:获取错误的错误信息
     * @params:  * @Param:
     * @return:java.lang.String
     **/
    String getErrMsg();


    /**
     * @Description: 手动设置错误的业务信息(通过定制化的方式处理一些通用的错误类型)
     * @param: [errMsg]
     * @return: com.bdqn.exception.CommonError
     * @Date: 2019/07/13 12:26
     */
    CommonError setErrMsg(String errMsg);
}

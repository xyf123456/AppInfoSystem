package com.bdqn.appInfo.exception;

/**
 * @ClassName: BusinessExcpetion
 * @Description: 业务异常类(包装器业务异常类实现)
 * @Author: xyf
 * @Date 2019/7/13 12:27
 */
public class BusinessExcpetion extends Exception implements CommonError {

    private CommonError commonError;//这里的CommonError本质是CommonError的实现类EmBusinessError


    /**
     * create by: xyf
     * description: 直接接受EmBusinessError的传参用于构造业务异常
     * create time: 下午 9:23 2018/12/19 0019
     *
     * @return
     * @Param: commonError
     */
    public BusinessExcpetion(CommonError commonError) {
        super();//必须需要显示调用super()方法，因为这里没有写无参的构造方法
        this.commonError = commonError;
    }

    /**
     * create by: xyf
     * description: 接受自定义errMsg的方式构造业务异常
     * create time: 下午 9:26 2018/12/19 0019
     * 下午 9:30 2018/12/19 0019  * @P * @Param: commonError
     *
     * @Param: errMsg
     */
    public BusinessExcpetion(CommonError commonError, String errMsg) throws BusinessExcpetion {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }


    /**
     * @ Description:获取错误的错误代码
     * @params: * @Param:
     * @return:int
     **/
    @Override
    public int getErrorCode() {
        return commonError.getErrorCode();
    }

    /**
     * @ Description:获取错误的错误信息
     * @params: * @Param:
     * @return:java.lang.String
     **/
    @Override
    public String getErrMsg() {
        return commonError.getErrMsg();
    }

    /**
     * @param errMsg
     * @Description: 手动设置错误的业务信息(通过定制化的方式处理一些通用的错误类型)
     * @param: [errMsg]
     * @return: com.bdqn.exception.CommonError
     * @Date: 2019/07/13 12:26
     */
    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}

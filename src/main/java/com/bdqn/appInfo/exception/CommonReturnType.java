package com.bdqn.appInfo.exception;

/**
 * @ClassName: CommonReturnType
 * @Description: 通用的返回类型
 * @Author: xyf
 * @Date 2019/7/13 12:11
 */
public class CommonReturnType {

    //表名对应请求的处理结果为success或fail
    private String status;

    //若status=success,则data内返回前端需要的JSON数据
    //若status=fail,则data内返回通用的错误码格式（已在其他类或接口中定义）
    private Object data;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CommonReturnType() {
    }

    /**
     * @Description:这个方法的意义：如果返回的结果不带status，则返回的status为success
     * @param: [result]
     * @return: com.bdqn.response.CommonReturnType
     * @Date: 2019/07/13 12:18
     */
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    /**
     * @Description:构造通用返回数据类型
     * @param: [result, status]
     * @return: com.bdqn.response.CommonReturnType
     * @Date: 2019/07/13 12:17
     */
    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
}

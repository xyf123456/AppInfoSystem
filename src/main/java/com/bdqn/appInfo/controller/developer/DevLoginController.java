package com.bdqn.appInfo.controller.developer;

import com.bdqn.appInfo.controller.backend.UserLoginController;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Back_User;
import com.bdqn.appInfo.pojo.Dev_User;
import com.bdqn.appInfo.service.Dev_UserService;
import com.bdqn.appInfo.utils.Constants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: DevLoginController
 * @Description:
 * @Author: xyf
 * @Date 2019/7/19 14:01
 */
@Controller
@RequestMapping(value="/dev")
public class DevLoginController {
    private Logger logger = Logger.getLogger(DevLoginController.class);

    @Autowired
    private Dev_UserService dev_userService;
    /**
     * @Description: 跳转到登录界面
     * @param: []
     * @return: java.lang.String
     * @Date: 2019/07/18 16:15
     */
    @RequestMapping(value="/login")
    public String login(){
        logger.debug("LoginController welcome AppInfoSystem backend==================");
        return "devlogin";
    }

    /**
     * @Description: 处理开发者的登录
     * @param: [devcode, devpassword, request, session]
     * @return: java.lang.String
     * @Date: 2019/07/19 14:12
     */
    @RequestMapping(value="/doLogin")
    public String doLogin(@RequestParam String devcode,
                          @RequestParam String devpassword,
                          HttpServletRequest request,
                          HttpSession session) throws BusinessExcpetion {
        Dev_User user=dev_userService.login(devcode,devpassword);
        if (user!=null){
            session.setAttribute(Constants.DEVUSER_SESSION, user);
            //页面跳转（main.jsp）
            return "redirect:/dev/flatform/main";
        }else {
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("error", "用户名或密码不正确");
            return "devlogin";
        }
    }

    /**
     * @Description: 跳转到开发者平台中心
     * @param: [session]
     * @return: java.lang.String
     * @Date: 2019/07/19 14:08
     */
    @RequestMapping(value="/flatform/main")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.DEVUSER_SESSION) == null){
            return "redirect:/dev/login";
        }
        return "developer/main";
    }

    /**
     * @Description:  超管退出系统
     * @param: [session]
     * @return: java.lang.String
     * @Date: 2019/07/19 14:11
     */
    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.DEVUSER_SESSION);
        return "devlogin";
    }
}

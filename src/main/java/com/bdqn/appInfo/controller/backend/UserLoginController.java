package com.bdqn.appInfo.controller.backend;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.Back_User;
import com.bdqn.appInfo.pojo.Dev_User;
import com.bdqn.appInfo.service.Back_UserService;
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
 * @ClassName: UserLoginController
 * @Description:
 * @Author: xyf
 * @Date 2019/7/18 16:02
 */
@Controller
@RequestMapping(value="/manager")
public class UserLoginController {

    private Logger logger = Logger.getLogger(UserLoginController.class);

    @Autowired
    private Back_UserService back_userService;
    /**
     * @Description: 跳转到登录界面
     * @param: []
     * @return: java.lang.String
     * @Date: 2019/07/18 16:15
     */
    @RequestMapping(value="/login")
    public String login(){
        logger.debug("LoginController welcome AppInfoSystem backend==================");
        return "backendlogin";
    }

    @RequestMapping(value="/doLogin")
    public String doLogin(@RequestParam String usercode,
                          @RequestParam String userpassword,
                          HttpServletRequest request,
                          HttpSession session) throws BusinessExcpetion {
        Back_User  user=back_userService.login(usercode,userpassword);
        if (user!=null){
            session.setAttribute(Constants.USER_SESSION, user);
            //页面跳转（main.jsp）
            return "redirect:/manager/backend/main";
        }else {
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("error", "用户名或密码不正确");
            return "backendlogin";
        }

    }

    @RequestMapping(value="/backend/main")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.USER_SESSION) == null){
            return "redirect:/manager/login";
        }
        return "backend/main";
    }

    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.USER_SESSION);
        return "backendlogin";
    }
}

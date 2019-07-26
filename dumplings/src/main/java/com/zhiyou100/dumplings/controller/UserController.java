package com.zhiyou100.dumplings.controller;

import com.zhiyou100.dumplings.common.Result;
import com.zhiyou100.dumplings.common.ResultGenerator;
import com.zhiyou100.dumplings.entity.User;
import com.zhiyou100.dumplings.service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Classname UserController
 * @Description TODO
 * @Author Knight
 * @Date 2019/6/15 11:55
 * @Version 2.0
 **/
@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user, HttpServletRequest request){
        Result result = ResultGenerator.genFailResult("登录失败");
        if (StringUtils.isEmpty(user.getName()) || StringUtils.isEmpty(user.getPassword())) {
            result.setMessage("请填写登录信息！");
        }
        User loginUser = userService.login(user);
        if (loginUser != null) {
            HttpSession session = request.getSession();//获取session并将userName存入session对象
            session.setAttribute("userName", loginUser.getName());
            result = ResultGenerator.genSuccessResult(loginUser);
        }
        return result;
    }
}

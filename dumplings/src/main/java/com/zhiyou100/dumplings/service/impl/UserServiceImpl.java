package com.zhiyou100.dumplings.service.impl;

import com.zhiyou100.dumplings.entity.User;
import com.zhiyou100.dumplings.mapper.UserMapper;
import com.zhiyou100.dumplings.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Author Knight
 * @Date 2019/6/15 11:59
 * @Version 2.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User loginUser = userMapper.queryByName(user.getName());
        if(loginUser != null && loginUser.getPassword().equals(user.getPassword())){
            return loginUser;
        }else{
            return null;
        }
    }
}

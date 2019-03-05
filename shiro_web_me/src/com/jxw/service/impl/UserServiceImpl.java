package com.jxw.service.impl;


import com.jxw.mapper.UserMapper;
import com.jxw.pojo.User;
import com.jxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserMapper userMapper;

    @Override
    public String getPassword(String name) {
        // TODO Auto-generated method stub
        User u  = userMapper.getByName(name);
        if(null==u)
            return null;
        return u.getPassword();
    }
}

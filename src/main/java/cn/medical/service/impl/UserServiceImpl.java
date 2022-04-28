package cn.medical.service.impl;

import cn.medical.dao.UserMapper;
import cn.medical.pojo.User;
import cn.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public User selectUserByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        return user;
    }

}

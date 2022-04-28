package cn.medical.service;

import cn.medical.pojo.User;


public interface UserService {
    public User selectUserByUsername(String username);
}

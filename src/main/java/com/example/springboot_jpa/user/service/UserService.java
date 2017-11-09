package com.example.springboot_jpa.user.service;

import com.example.springboot_jpa.user.entity.User;

/**
 * Created by yaokai on 2017/11/7.
 */
public interface UserService {
    User save(User user);
    int updateUser(double mount,long id);
}

package com.example.springboot_jpa.user.service.imp;

import com.example.springboot_jpa.user.entity.User;
import com.example.springboot_jpa.user.repository.UserRepository;
import com.example.springboot_jpa.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yaokai on 2017/11/7.
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public User save(User user) {
        User u = userRepository.save(user);
        return u;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int updateUser(double mount, long id) {
        return userRepository.updateUser(mount,id);
    }
}

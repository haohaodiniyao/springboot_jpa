package com.example.springboot_jpa.user.service;

import com.example.springboot_jpa.user.entity.Student;
import com.example.springboot_jpa.user.entity.User;

/**
 * Created by yaokai on 2017/11/7.
 */
public interface StudentService {
    Student save(Student student);
    int updateNameById(String name, long id);
}

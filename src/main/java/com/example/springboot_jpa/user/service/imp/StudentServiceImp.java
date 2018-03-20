package com.example.springboot_jpa.user.service.imp;

import com.example.springboot_jpa.user.entity.Student;
import com.example.springboot_jpa.user.entity.User;
import com.example.springboot_jpa.user.repository.StudentRepository;
import com.example.springboot_jpa.user.repository.UserRepository;
import com.example.springboot_jpa.user.service.StudentService;
import com.example.springboot_jpa.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by yaokai on 2017/11/7.
 */
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Student save(Student student) {

        Student s = studentRepository.save(student);
        return s;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int updateNameById(String name, long id) {
//        int a = studentRepository.updateNameById(name,id);
        int a = 100;
        return a;
    }

}

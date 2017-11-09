package com.example.springboot_jpa.log.service.imp;

import com.example.springboot_jpa.log.entity.Log;
import com.example.springboot_jpa.log.repository.LogRepository;
import com.example.springboot_jpa.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yaokai on 2017/11/7.
 */
public class LogServiceImp implements LogService {
    @Autowired
    private LogRepository logRepository;
    @Override
    public Log save(Log log) {
        return logRepository.save(log);
    }
}

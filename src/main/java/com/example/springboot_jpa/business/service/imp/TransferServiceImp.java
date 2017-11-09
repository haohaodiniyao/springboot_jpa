package com.example.springboot_jpa.business.service.imp;

import com.example.springboot_jpa.business.service.TransferService;
import com.example.springboot_jpa.log.entity.Log;
import com.example.springboot_jpa.log.service.LogService;
import com.example.springboot_jpa.sequence.repository.GenerateSequenceRepository;
import com.example.springboot_jpa.sequence.service.SequenceService;
import com.example.springboot_jpa.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaokai on 2017/11/7.
 */
@Service
public class TransferServiceImp implements TransferService {
    @Autowired
    private SequenceService sequenceService;
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;
    @Override
    public void transfer(int from, int to, double money, long seqId) {
          seqId = sequenceService.getSeqId();
          int line = userService.updateUser(money,from);
          Log log = new Log();
        log.setFrom(from);
        log.setTo(to);
        log.setMoney(money);
        logService.save()
//        userService
    }
}

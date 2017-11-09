package com.example.springboot_jpa.sequence.service.imp;

import com.example.springboot_jpa.sequence.entity.GenerateSequence;
import com.example.springboot_jpa.sequence.repository.GenerateSequenceRepository;
import com.example.springboot_jpa.sequence.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaokai on 2017/11/7.
 */
@Service
public class SequenceServiceImp implements SequenceService {
    @Autowired
    private GenerateSequenceRepository generateSequenceRepository;
    @Override
    public long getSeqId() {
        GenerateSequence generateSequence = new GenerateSequence();
        generateSequenceRepository.save(generateSequence);
        return generateSequence.getId();
    }
}

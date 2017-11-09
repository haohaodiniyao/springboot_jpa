package com.example.springboot_jpa.business.service;

/**
 * Created by yaokai on 2017/11/7.
 */
public interface TransferService {
    void transfer(int from,int to,double money,long seqId);
}

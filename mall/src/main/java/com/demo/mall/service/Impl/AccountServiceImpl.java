package com.demo.mall.service.Impl;

import com.demo.mall.service.NotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl  {
    /*
    @Resource
    AccountMapper accountMapper;

    Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Override
    public Account getAccount(String userId) {
        return accountMapper.getAccount(userId);
    }

    @Override
    public int updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }

    @Override
    public int insertAccount(Account account) {
        return accountMapper.insertAccount(account);
    }

    @Override
    public int deleteAccount(Account account) {
        return accountMapper.deleteAccount(account);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void pay(String userId, float payMoney) {
        Account account = accountMapper.getAccount(userId);
        float afterMoney = account.getMoney() - payMoney;
        String msg = "";
        if(afterMoney < 0){
            msg = "账户余额不足，下单失败";
            logger.error(msg);
            throw new RuntimeException(msg);
        }
        account.setMoney(afterMoney);
        if(accountMapper.updateAccount(account) == 0){
            msg = "未更新账户余额";
            logger.error(msg);
            throw new RuntimeException(msg);
        }
    }*/
}

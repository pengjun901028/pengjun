package com.mser.service;

import com.mser.mongodb.dao.BaseDao;
import com.mser.mongodb.entity.Authentications;
import com.mser.mysql.dao.IUserDao;
import com.mser.redis.dao.CacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    CacheDao cacheDao;//缓存
    @Autowired
    IUserDao userDao;//mysl
    @Autowired
    BaseDao baseDao;
    //mongodb

    public void redis() {
        cacheDao.singleSave(CacheDao.TOKEN, "this is toeken");
        userDao.addUserInfo("liuyue", "123456");
        Authentications entity = new Authentications();//mongodb
        entity.setApplyTime(75876856L);
        entity.setEmail("164236942@qq.com");
        entity.setStatus(0);
        entity.setUser_id(12L);
        entity.setApplyTime(655315115L);
        baseDao.save(entity);
    }
}

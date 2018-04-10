package com.mser.mysql.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    void addUserInfo(@Param("name") String name, @Param("password") String password);
}

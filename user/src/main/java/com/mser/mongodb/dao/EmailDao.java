package com.mser.mongodb.dao;

import com.mser.mongodb.dao.BaseDao;
import com.mser.mongodb.entity.Email;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @methodDesc: 功能描述:(邮箱dao)
 * @author:彭俊
 * @createTime:2017/12/7 10:13
 * @copyright:九湃网络科技(上海)有限公司
 */
@Repository
public class EmailDao extends BaseDao {
    /**
     * 查询某个邮箱时间区段发送的内容
     *
     * @param email
     * @param startTime
     * @param endTime
     * @return
     */
    public List<Email> emailCount(String email, Integer type, long startTime, long endTime) {
        return mongoTemplate.find(
                new Query()
                        .addCriteria(new Criteria("email").is(email))
                        .addCriteria(new Criteria("type").is(type))
                        .addCriteria(new Criteria("sendDate").gte(startTime).lte(endTime)),
                Email.class);
    }
}

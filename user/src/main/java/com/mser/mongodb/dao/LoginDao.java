package com.mser.mongodb.dao;

import com.mser.mongodb.dao.BaseDao;
import com.mser.mongodb.entity.Login;
import org.springframework.data.domain.Sort;
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
public class LoginDao extends BaseDao {
    /**
     * 最近登录时间
     *
     * @param email
     * @return
     */
    public List<Login> find(String email) {
        return mongoTemplate.find(
                new Query()
                        .addCriteria(new Criteria("email").is(email))
                        .with(new Sort(Sort.Direction.DESC, "time")).limit(10),
                Login.class);
    }

    public List<Login> findLoginRecord(String email, Long startTime, Long endTime) {
        Criteria criteria = new Criteria();
        Criteria a1 = new Criteria();
        if(email != null){
            a1 = Criteria.where("email").is(email);
        }
        Criteria a2 = new Criteria();
        if(startTime != null){
            a1 = Criteria.where("time").gte(startTime);
        }
        Criteria a3 = new Criteria();
        if(endTime != null){
            a2 = Criteria.where("time").lte(endTime);
        }
        criteria.andOperator(a1,a2,a3);
        return mongoTemplate.find(Query.query(criteria).with(new Sort(Sort.Direction.DESC, "time")).limit(10),Login.class);
    }
}

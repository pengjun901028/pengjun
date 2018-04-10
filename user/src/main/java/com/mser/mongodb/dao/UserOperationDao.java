package com.mser.mongodb.dao;

import com.mser.mongodb.dao.BaseDao;
import com.mser.mongodb.entity.UserOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserOperationDao extends BaseDao {

    public void addUserOpera(UserOperation operation){
        mongoTemplate.save(operation);
    }

    public List<UserOperation> findUserOperation(Long userId, int type, Long startTime, Long endTime, int offset, int limit){
        Criteria criteria = new Criteria();
        Criteria a1 = new Criteria();
        if(startTime != null){
            a1 = Criteria.where("createDate").gte(startTime);
        }
        Criteria a2 = new Criteria();
        if(endTime != null){
            a2 = Criteria.where("createDate").lte(endTime);
        }
        Criteria a3 = new Criteria();
        if (type != 0){
            Criteria.where("type").is(type);
        }
        criteria.andOperator(getCriteria("userId",userId)
                ,a1
                ,a2
                ,a3);
        return mongoTemplate.find(Query.query(criteria).skip(offset).limit(limit),UserOperation.class);
    }

    public int countOperation(Long userId,int type,Long startTime, Long endTime){
        Criteria criteria = new Criteria();
        Criteria a1 = new Criteria();
        if(startTime != null){
            a1 = Criteria.where("createDate").gte(startTime);
        }
        Criteria a2 = new Criteria();
        if(endTime != null){
            a2 = Criteria.where("createDate").lte(endTime);
        }
        Criteria a3 = new Criteria();
        if (type != 0){
            Criteria.where("type").is(type);
        }
        criteria.andOperator(getCriteria("userId",userId)
                ,a1
                ,a2
                ,a3);
        return (int) mongoTemplate.count(
                Query.query(criteria),
                UserOperation.class
        );
    }

    public Criteria getCriteria(String colName,Object value){
        Criteria criteria = new Criteria();
        if(value == null){
            return criteria;
        }
        return Criteria.where(colName).is(value);
    }





}

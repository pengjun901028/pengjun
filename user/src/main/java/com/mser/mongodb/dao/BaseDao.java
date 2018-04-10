package com.mser.mongodb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sunson on 2017/7/1.
 */
@Repository
public class BaseDao {

    @Autowired
    protected MongoTemplate mongoTemplate;

    public <T> long count(Class<T> clazz) {
        return mongoTemplate.count(new Query(), clazz);
    }

    public <T> boolean exists(Class<T> clazz) {
        return mongoTemplate.collectionExists(clazz);
    }

    public <T> List<T> listAll(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }

    public <T> void save(T entity) {
        mongoTemplate.save(entity);
    }

    public <T> void saveAll(List<T> entities) {
        mongoTemplate.insertAll(entities);
    }
}

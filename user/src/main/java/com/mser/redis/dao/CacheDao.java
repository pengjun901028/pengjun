package com.mser.redis.dao;

import com.mser.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Repository
public class CacheDao {

    //用户Token
    public static String TOKEN = "USER:TOKEN:%s";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private StringRedisTemplate stringRedisTemplate;



   /* public void testAdd(long userId,long newsId){
        *//*News news = new News();
        news.setNewsId(newsId);
        news.setTitle("测试");
        news.setStatus(0);*//*
        String setKey = String.format("coin168:%d",userId);
        String hashKey = String.format("coin168:news");

       SetOperations<String, String> stringStringSetOperations = stringRedisTemplate.opsForSet();
        stringStringSetOperations.add(setKey,String.valueOf(news.getNewsId()));
        String key = String.valueOf(userId)+":"+String.valueOf(news.getNewsId());

        HashOperations<String, Object, Object> hash = stringRedisTemplate.opsForHash();
        hash.put(hashKey,key, JSON.toJSONString(news));

    }

    public void test2(long userId,long newsId){
        String hashKey = String.format("coin168:news");
        String key = String.valueOf(userId)+":"+String.valueOf(newsId);
        BoundHashOperations<String, Object, Object> hashOps = stringRedisTemplate.boundHashOps(hashKey);
       Object o = hashOps.get(key);
        if(null != o){
            News news = (News)JSON.parseObject(o.toString(),News.class);
            news.setStatus(1);
            hashOps.put(key,JSON.toJSONString(news));
        }
    }*/

    /* public void testAdd(long userId,long newsId){
         String key = String.format("coin168:%d",userId);
         SetOperations<String, String> stringStringSetOperations = stringRedisTemplate.opsForSet();
         stringStringSetOperations.add(key,String.valueOf(newsId));
     }

     public void testGet(long userId){
         String key = String.format("coin168:%d",userId);
         Set<String> members = stringRedisTemplate.boundSetOps(key).members();
     }*/

    /**
     * 统计key
     * @param key
     * @return
     */
    public int count(String key) {//"USER:TOKEN:*"
        Set<String> keys = stringRedisTemplate.opsForValue().getOperations().keys(key);
        return keys.size();
    }

    /**
     * 字符串
     *
     * @param key
     * @param value
     */
    public void singleSave(String key, String value) {
        singleSave(key, value, 0);
    }

    /**
     * 对象
     *
     * @param key
     * @param value
     */
    public void singleSave(String key, Object value) {
        singleSave(key, value, 0);
    }

    /**
     * @param key
     * @param value
     * @param second 有效期（单位：秒），为0则不设置时效
     */
    public void singleSave(String key, Object value, int second) {
        if (second <= 0) {
            stringRedisTemplate.opsForValue().set(key, JsonUtil.obj2String(value));
        } else {
            BoundValueOperations<String, String> boundValueOperations = stringRedisTemplate.boundValueOps(key);
            boundValueOperations.set(JsonUtil.obj2String(value), second, TimeUnit.SECONDS);
        }
    }

    /**
     * 获取缓存数据
     *
     * @param key
     * @return
     */
    public <T> T singleGet(String key, Class<T> clazz) {
        return JsonUtil.string2Obj(stringRedisTemplate.opsForValue().get(key), clazz);
    }

    /**
     * 获取缓存数据
     *
     * @param key
     * @return
     */
    public String singleGet(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }


    /**
     * 删除缓存数据
     *
     * @param key
     */
    public void singleDelete(String key) {
        stringRedisTemplate.delete(key);
    }
}

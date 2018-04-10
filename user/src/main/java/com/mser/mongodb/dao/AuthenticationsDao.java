/*
package mongodb.dao;

import mongodb.entity.Authentications;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

*/
/**
 * Created by pj on 2017/12/1.
 *//*

@Repository
public class AuthenticationsDao extends BaseDao {
    */
/**
     * 新增
     *
     * @param authentications
     *//*

    public void save(Authentications authentications) {
        mongoTemplate.save(authentications);
    }

    */
/**
     * 根据用户ID查询
     *
     * @param userId
     * @return
     *//*

    public List<Authentications> findByUser(long userId) {
        return mongoTemplate.find(Query.query(Criteria.where("user_id").is(userId)), Authentications.class);
    }

    */
/**
     * 根据用户ID、等级查询、状态,类型
     *
     * @param userId
     * @param level
     * @return
     *//*

    public Authentications findByUserAndLevel(Long userId, Integer level, Integer status, Integer type) {
        Query query = new Query();
        if (userId != null && userId > 0L) {
            query.addCriteria(new Criteria("user_id").is(userId));
        }
        if (level != null) {
            query.addCriteria(new Criteria("auths_level").is(level));
        }
        if (status != null) {
            query.addCriteria(new Criteria("status").is(status));
        }
        if (type != null) {
            query.addCriteria(new Criteria("auths_type").is(type));
        }
        return mongoTemplate.findOne(query, Authentications.class);
    }

    */
/**
     * 根据Id
     *
     * @return
     *//*

    public Authentications findById(String id) {
        return mongoTemplate.findOne(Query.query(Criteria.where("_id").is(id)), Authentications.class);
    }

    */
/**
     * 个人审核详情
     *
     * @return
     *//*

    public Authentications findByUid(String UID, int level) {
        return mongoTemplate.findOne(Query.query(Criteria.where("user_id").is(UID).and("auths_level").is(level)).
                with(new Sort(Sort.Direction.DESC, "applyTime")).limit(1), Authentications.class);
    }


    */
/**
     * @param dto
     * @return
     *//*

    public List<Authentications> findPage(KYCDto dto) {
        Query query = new Query();
        if (dto.getLevel() != null) {
            query.addCriteria(new Criteria("auths_level").is(dto.getLevel()));
        } else {
            query.addCriteria(new Criteria("auths_level").in(Authentications.LEVEL_TWO, Authentications.LEVEL_INIT, Authentications.LEVEL_THREE));
        }
        if (dto.getStatus() != null) {
            query.addCriteria(new Criteria("status").is(dto.getStatus()));
        } else {
            query.addCriteria(new Criteria("status").in(Authentications.STATUS_INIT, Authentications.STATUS_PASS, Authentications.STATUS_NO_PASS));
        }
        if (!StringUtils.isEmpty(dto.getEmail())) {
            query.addCriteria(new Criteria("email").regex(dto.getEmail()));
        }
        if (dto.getType() != null) {
            query.addCriteria(new Criteria("auths_type").is(dto.getType()));
        } else {
            query.addCriteria(new Criteria("auths_type").in(Authentications.TYPE_EN, Authentications.TYPE_CN));
        }
        return mongoTemplate.find(query.with(new Sort(Sort.Direction.DESC, "level")).skip(dto.getOffset()).limit(dto.getLimit()), Authentications.class);
    }

    */
/**
     * 查询总数
     *//*

    public Long count(KYCDto dto) {
        Query query = new Query();
        if (dto.getLevel() != null) {
            query.addCriteria(new Criteria("auths_level").is(dto.getLevel()));
        } else {
            query.addCriteria(new Criteria("auths_level").in(Authentications.LEVEL_TWO, Authentications.LEVEL_INIT, Authentications.LEVEL_THREE));
        }
        if (dto.getStatus() != null) {
            query.addCriteria(new Criteria("status").is(dto.getStatus()));
        } else {
            query.addCriteria(new Criteria("status").in(Authentications.STATUS_INIT, Authentications.STATUS_PASS, Authentications.STATUS_NO_PASS));
        }
        if (!StringUtils.isEmpty(dto.getEmail())) {
            query.addCriteria(new Criteria("email").regex(dto.getEmail()));
        }
        if (dto.getType() != null) {
            query.addCriteria(new Criteria("auths_type").is(dto.getType()));
        } else {
            query.addCriteria(new Criteria("auths_type").in(Authentications.TYPE_EN, Authentications.TYPE_CN));
        }
        return mongoTemplate.count(query, Authentications.class);
    }

    */
/**
     * 修改审核状态
     *
     * @param id
     * @param status
     *//*

    public void updateStatus(String id, int status) {
        Authentications authentications = mongoTemplate.findOne(Query.query(Criteria.where("id").is(id)), Authentications.class);
        if (null != authentications) {
            authentications.setStatus(status);
            mongoTemplate.save(authentications);
        }
    }


    */
/**
     * 网关KYC详情
     *
     * @param level
     * @return
     *//*

    public Authentications findByUserAndLevel(Long userId, Integer level, Integer type) {
        Query query = new Query();
        if (userId != null && userId > 0L) {
            query.addCriteria(new Criteria("user_id").is(userId));
        }
        if (level != null) {
            query.addCriteria(new Criteria("auths_level").is(level));
        }
        if (type != null) {
            query.addCriteria(new Criteria("auths_type").is(type));
        }
        List<Authentications> list = mongoTemplate.find
                (query.with(new Sort(Sort.Direction.DESC, "applyTime")).limit(1), Authentications.class);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }
}
*/

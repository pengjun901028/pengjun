/*
package mongodb.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

*/
/**
 * Created by mby on 2017/12/1.
 *//*

@Repository
public class AuthenticationsLogDao extends BaseDao {

    */
/**
     * 新增
     *
     * @param authentications
     *//*

    public void save(AuthenticationsLog authentications) {
        mongoTemplate.save(authentications);
    }

    */
/**
     * @param dto
     * @return
     *//*

    public List<AuthenticationsLog> findPage(KYCDto dto) {
        Query query = new Query();
        if (dto.getLevel() != null) {
            query.addCriteria(new Criteria("level").is(dto.getLevel()));
        } else {
            query.addCriteria(new Criteria("level").in(Authentications.LEVEL_TWO, Authentications.LEVEL_INIT, Authentications.LEVEL_THREE));
        }
        if (dto.getStatus() != null) {
            query.addCriteria(new Criteria("status").is(dto.getStatus()));
        } else {
            query.addCriteria(new Criteria("status").in(Authentications.STATUS_INIT, Authentications.STATUS_PASS, Authentications.STATUS_NO_PASS));
        }
        if (!StringUtils.isEmpty(dto.getEmail())) {
            query.addCriteria(new Criteria("applyUser").regex(dto.getEmail()));
        }
        if (!StringUtils.isEmpty(dto.getAdmin())) {
            query.addCriteria(new Criteria("admin").regex(dto.getAdmin()));
        }
        if (dto.getType() != null) {
            query.addCriteria(new Criteria("type").is(dto.getType()));
        } else {
            query.addCriteria(new Criteria("type").in(Authentications.TYPE_EN, Authentications.TYPE_CN));
        }
        return mongoTemplate.find(query.with(new Sort(Sort.Direction.DESC, "verifyTime")).skip(dto.getOffset()).limit(dto.getLimit()), AuthenticationsLog.class);
    }

    */
/**
     * 查询总数
     *//*

    public Long count(KYCDto dto) {
        Query query = new Query();
        if (dto.getLevel() != null) {
            query.addCriteria(new Criteria("level").is(dto.getLevel()));
        } else {
            query.addCriteria(new Criteria("level").in(Authentications.LEVEL_TWO, Authentications.LEVEL_INIT, Authentications.LEVEL_THREE));
        }
        if (dto.getStatus() != null) {
            query.addCriteria(new Criteria("status").is(dto.getStatus()));
        } else {
            query.addCriteria(new Criteria("status").in(Authentications.STATUS_INIT, Authentications.STATUS_PASS, Authentications.STATUS_NO_PASS));
        }
        if (!StringUtils.isEmpty(dto.getEmail())) {
            query.addCriteria(new Criteria("applyUser").regex(dto.getEmail()));
        }
        if (!StringUtils.isEmpty(dto.getAdmin())) {
            query.addCriteria(new Criteria("admin").regex(dto.getAdmin()));
        }
        if (dto.getType() != null) {
            query.addCriteria(new Criteria("type").is(dto.getType()));
        } else {
            query.addCriteria(new Criteria("type").in(Authentications.TYPE_EN, Authentications.TYPE_CN));
        }
        return mongoTemplate.count(query, AuthenticationsLog.class);
    }

}
*/

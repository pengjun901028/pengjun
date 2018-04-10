package com.mser.mysql.dao.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @methodDesc: 功能描述:(推荐人)
 * @author:彭俊
 * @param: ${tags}
 * @createTime:2017/12/11 16:36
 * @copyright:九湃网络科技(上海)有限公司
 */
@Getter
@Setter
@ToString
public class Reference {
    private Long userId;
    private String email;
    private Integer kyc;
    private Long coinencyId;
    private Integer num;
    private Date create_time;

}

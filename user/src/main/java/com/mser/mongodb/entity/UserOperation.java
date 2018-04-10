package com.mser.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@ToString
@Document(collection = "user_operation_log")
public class UserOperation {
    private Long userId;//用户ID
    private Date createTime;//创建时间(显示)
    private Long createDate;//创建时间(条件查询)
    private String ipAddres;//IP地址
    private int type;//操作类型
    private String remarks;//备注
    private String startTime;//开始时间
    private String endTime;//开始时间

}

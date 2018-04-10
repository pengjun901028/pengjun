package com.mser.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 邮件发送记录(次数限制，发送记录)
 *  pj
 */
@Document(collection = "user_email_log")
@Getter
@Setter
public class Email{


    @Indexed
    String email;//邮箱

    String title;//标题

    String content;//内容

    Long sendDate;//发送时间

    Integer type;//发送类型 注册


}

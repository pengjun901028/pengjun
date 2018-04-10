package com.mser.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by pj on 2017/7/1.
 */
@Document(collection = "user_login_log")
@Setter
@Getter
public class Login{

    String email;

    String ip;//ip

    String province;//省

    String city;//市

    String adress;//具体地址

    Integer loginType;//0 pc ,1 安卓,2 IOS

    Long time;//yyyy-mm-dd HH:MM:SS


}

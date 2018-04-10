package com.mser.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by mby on 2017/12/1.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_kyc")
public class Authentications<T> implements Serializable {
    public static final int LEVEL_INIT = 0;
    public static final int LEVEL_TWO = 1;
    public static final int LEVEL_THREE = 2;
    public static final int TYPE_CN = 0;
    public static final int TYPE_EN = 1;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_PASS = 1;
    public static final int STATUS_NO_PASS = 2;
    //无
    public static final int emtity = -1;


    @Id
    private String id;

    private long user_id;

    private int auths_type;//{0国内 1 国外}

    private int auths_level;//(认证等级{国内{1,2}} 国外{1,2,3})

    private int status; //审核状态 {0=初始提交 1=审核通过 2=审核不通过}

    private String email;//账户

    private long applyTime;//申请时间

    private T auths_detail;//详情

}

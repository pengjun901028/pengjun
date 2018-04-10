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
@Document(collection = "user_kyc_log")
public class AuthenticationsLog<T> implements Serializable {
    @Id
    private String id;

    private String applyUser;//申请人

    private Integer type;//{0国内 1 国外}

    private Long applyTime;//申请时间

    private Integer level;//申请等级

    private String admin;//审核人

    private Long verifyTime;//审核时间

    private Integer status; //审核结果

    private String kycId;//详情ID
}

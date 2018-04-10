package com.mser.mysql.dao.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserInfo implements Serializable {
    private Long userId;//id
    private String country;//国家
    private String countryCode;//国家编码
    private String firstName;//姓
    private String lastName;//名
    private String bankCode;//银行卡
    private String bankCodeImgA;//银行正面照
    private String bankCodeImgB;//银行反面照
    private String idCard;//身份证
    private String idCardImgA;//身份证正面
    private String idCardImgB;//身份证反面
    private String birthday;//生日
    private String mobile;// 手机号
    private String address;//居住地址
    private String bankAddress;//居住地址
    private String subbranch;//支行名称
    private String passportCard;//护照
    private String passportImageA;//护照A面图片
    private String passportImageB;//护照B面图片
    private String addressImage;//地址

}

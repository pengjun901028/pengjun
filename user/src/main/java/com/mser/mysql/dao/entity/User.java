package com.mser.mysql.dao.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    public static int STATUS_OK = 10;
    public static int STATUS_BLOCKED = 90;
    public static int kyc1 = 0;
    public static int kyc2 = 1;
    public static int kyc3 = 2;
    public static int cn_type = 0;//国内
    public static int en_type = 1;

    private String name;
    private String password;

}

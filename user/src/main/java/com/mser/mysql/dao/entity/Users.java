package com.mser.mysql.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private Long id;
    private String country;
    private String email;
    private Long coninId;
    private Integer kyc;
    private Integer type;
    private String lastLoginIp;
    private String lastLoginTime;
    private Long referenceId;
    private Integer status;
    private String createTime;
    private String firstName;
    private String lastName;
    private String mobile;
}

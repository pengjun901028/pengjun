package com.mser.redis;

public class ECacheType {
    //注册验证码
    public static String REGISTER = "USER:REGISTER:%s";
    public static Integer REGISTER_TYPE = 1;
    //找回密码验证码
    public static String FORGETPASSWORD = "USER:FORGETPASSWORD:%s";
    public static Integer FORGETPASSWORD_TYPE = 2;
    //找回资金验证码
    public static String FORGETMONEYPASSWORD = "USER:FORGETMONEYPASSWORD:%s";
    public static Integer FORGETMONEYPASSWORD_TYPE = 3;
    //设置资金密码
    public static String SETMONEYPASSWORD = "USER:SETMONEYPASSWORD:%s";
    public static Integer SETMONEYPASSWORD_TYPE = 4;
    //数字币提现
    public static String COINWITHDROW = "USER:COINWITHDROW:%s";
    public static Integer COINWITHDROW_TYPE = 5;
    //法币提现
    public static String LEGALWITHDROW = "USER:LEGALWITHDROW:%s";
    public static Integer LEGALWITHDROW_TYPE = 6;
    //用户Token
    public static String TOKEN = "USER:TOKEN:%s";


}

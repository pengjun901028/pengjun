package com.mser.mysql;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by mby on 2017/12/6.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MySQLDataSourceConfig.class, MySQLMyBatisConfig.class})
public @interface EnableCoin168MySQL {
}

package com.mser.mysql;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mby on 2017/12/6.
 */
@Configuration
@AutoConfigureAfter(MySQLDataSourceConfig.class)
public class MySQLMyBatisConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurerBean() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.mser.mysql");
        return mapperScannerConfigurer;
    }
}

package com.mser.mysql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 *
 */
@Configuration
public class MySQLDataSourceConfig {


    @Value("${hikari.serverName:localhost}")
    String hikariServerName;
    @Value("${hikari.port:3306}")
    int hikariPort;
    @Value("${hikari.databaseName}")
    String hikariDatabaseName;
    @Value("${hikari.user}")
    String hikariUser;
    @Value("${hikari.password}")
    String hikariPassword;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(100);
        config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        config.addDataSourceProperty("serverName", hikariServerName);
        config.addDataSourceProperty("port", hikariPort);
        config.addDataSourceProperty("databaseName", hikariDatabaseName);
        config.addDataSourceProperty("user", hikariUser);
        config.addDataSourceProperty("password", hikariPassword);

        config.addDataSourceProperty("useUnicode", "true");
        config.addDataSourceProperty("characterEncoding", "utf8");
        return new HikariDataSource(config);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/com/mser/mysql/**/dao/impl/*Impl.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}

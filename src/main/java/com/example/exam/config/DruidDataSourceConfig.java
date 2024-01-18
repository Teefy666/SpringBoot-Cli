package com.example.exam.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author : TTF
 * @date : 2024/1/18
 */
@Configuration
public class DruidDataSourceConfig {

    @Primary
    @Bean(name = "dataSource")
    public DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}

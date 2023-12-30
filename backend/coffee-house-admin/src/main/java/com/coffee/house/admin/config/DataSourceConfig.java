package com.coffee.house.admin.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean 
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://ue4uuqw7iic473ch:n2IiCoUdcRWUKcB4DDje@bfvtumeszmirowbkk6dc-mysql.services.clever-cloud.com:3306/bfvtumeszmirowbkk6dc");
        dataSourceBuilder.username("ue4uuqw7iic473ch");
        dataSourceBuilder.password("ue4uuqw7iic473ch");
        return dataSourceBuilder.build();
    }
}
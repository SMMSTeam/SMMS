package com.example.demo.config;


import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class C3P0Config {
	
	public C3P0Config() {
		System.out.println("c3p0 config done");
	}
		
	@Bean                          //(name="datasouce")
	@ConfigurationProperties(prefix="c3p0")
	public DataSource dataSource() {
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}

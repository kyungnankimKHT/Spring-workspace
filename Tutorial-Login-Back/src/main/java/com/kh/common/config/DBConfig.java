package com.kh.common.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



//설정
@Configuration // = 컴퓨터 설정 = 컴퓨터 구성

// @PropertySource : properties 파일의 내용을 이용하겠다는 어노테이션
// 다른 properties 파일도 추가하고싶다면 어노테이션을 계속추가
// @PropertySource("classpath:/config2.properties")
// @PropertySource("classpath:/config3.properties")
@PropertySource("classpath:/config.properties")
public class DBConfig {

	@Autowired
	private ApplicationContext applicationContext; //폴더 흐름
	//import org.springframework.context.ApplicationContext; 
	
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	// properties 파일의 내용을 이용해서  생성되는 bean을 설정하는 어노테이션
	// prefix = 시작 위치를 지정해서 spring.datasource.hikari로 시작하는 설정을 모두 적용
	// spring.datasource.hikari = Oracle DataBase 연결할 때 사용하는 풀
	// 빠르고 가벼워 사용
	public HikariConfig hikariConfig() { //-> 주소 설정만
		return new HikariConfig();
	}
	
	@Bean //Spring Context 스프링 안에서 관리되고 있는 기능이다 라는 설정
	 // ->연결된 DB를 스프링에서 관리하겠다. 관리하는 용도로 등록한 것
	public DataSource dataSource(HikariConfig config) {
		DataSource dataSource = new HikariDataSource(config);
		return dataSource;
	}
	
	////////// MyBatis 설정 추가 ////////// 
}









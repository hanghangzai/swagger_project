package com.lh.swag;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = "com.lh.swag.dao")
public class SwagApplication{

	/*@Override--部署war
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SwagApplication.class);
	}
*/

	public static void main(String[] args) {
		SpringApplication.run(SwagApplication.class, args);
	}
}

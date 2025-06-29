package com.gl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.gl.*")
public class WebMvcConfig
{
//	@Bean
//	public ViewResolver getViewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
//	
	@Bean
	DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/books");
		ds.setPassword("root");
		ds.setUsername("root");
		
		return ds;	
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DriverManagerDataSource ds) {
		return new JdbcTemplate(getDataSource());
		
	}
	
//	@Bean
//	public UserDaoImpl getUserDao()
//	{
//		return new UserDaoImpl(getDataSource());
//	}
//	
//	@Bean
//	public BookDaoImpl getBookDao()
//	{
//		return new BookDaoImpl(getDataSource());
//	}
}

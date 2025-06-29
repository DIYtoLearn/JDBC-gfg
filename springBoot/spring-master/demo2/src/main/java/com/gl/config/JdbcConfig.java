package com.gl.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.gl.controller.TodoController;
import com.gl.repo.TodoDaoImpl;
import com.gl.service.TodoServiceImpl;

@Configuration	
@ComponentScan(basePackages={"com.gl.config"})
@EnableWebMvc
public class JdbcConfig extends WebMvcConfigurerAdapter
{
	
	  public ViewResolver getViewResolver(){
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	     
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
	@Bean("dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() 
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
	   return jdbcTemplate;
	}
	
	@Bean("dao")
	public TodoDaoImpl getTodoDaoImpl() 
	{
		
		
	   return new TodoDaoImpl(getJdbcTemplate());
	}
	
	@Bean("service")
	public TodoServiceImpl getTodoServiceImpl() 
	{
		
		
	   return new TodoServiceImpl();//getTodoDaoImpl()
	}
	
	@Bean("controller")
	public TodoController getTodoController() 
	{
		
		
	   return new TodoController(getTodoDaoImpl());//getTodoServiceImpl()
	}


}
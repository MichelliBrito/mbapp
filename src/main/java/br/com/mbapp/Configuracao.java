package br.com.mbapp;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SpringBootApplication
public class Configuracao extends WebMvcConfigurerAdapter{

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Configuracao.class, args);
    }
	
	@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mbappweb");
        dataSource.setUsername("root");
        dataSource.setPassword("Michelli14");
        return dataSource;
    }
	
}

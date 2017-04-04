package br.com.mbapp;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SpringBootApplication
public class Configuracao extends WebMvcConfigurerAdapter{

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Configuracao.class, args);
    }
	
//	@Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/mbappweb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Michelli14");
//        return dataSource;
//    }
//	
//	@Bean
//	@Profile("dev")
//	public JpaVendorAdapter jpaVendorAdapter(){//cria um bean Hibernate
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.MYSQL);
//		adapter.setShowSql(false);//mostrar codigo sql no console.
//		adapter.setGenerateDdl(true);//habilita para que o hibernate crie as tabelas automaticamente, pois já estamos usando o flyway para isso.
//		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//		return adapter;
//	}
	
	@Bean
	@Profile("prod")
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://ec2-54-235-123-159.compute-1.amazonaws.com:5432/d4rir18f73tdnm");
        dataSource.setUsername("zvnvotqtguaxkw");
        dataSource.setPassword("9ee3a230201c5f01bc0edfea50f6bcb7ee727f24d499cf2522006d7aeb43bbf2");
        return dataSource;
    }

    @Bean
    private Properties aditionalProperties(){
        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        props.setProperty("hibernate.show_sql", "false");
        props.setProperty("hibernate.hbm2ddl.auto", "update");
        return props;
    }
	
}

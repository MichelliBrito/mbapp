package br.com.mbapp;



import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
//	public JpaVendorAdapter jpaVendorAdapter(){//cria um bean Hibernate
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.MYSQL);
//		adapter.setShowSql(true);//mostrar codigo sql no console.
//		adapter.setGenerateDdl(true);//habilita para que o hibernate crie as tabelas automaticamente.
//		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//		return adapter;
//	}
	
}

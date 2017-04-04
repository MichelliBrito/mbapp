package br.com.mbapp;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("prod")
public class JpaConfigProd {

	 @Bean
	    public DataSource dataSource()throws URISyntaxException{
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.postgresql.Driver");

	        URI dbUrl = new URI(Environment.DATASOURCE);


	        dataSource.setUrl("jdbc:postgresql://"+dbUrl.getHost()+":"+dbUrl.getPort()+dbUrl.getPath());
	        dataSource.setUsername(dbUrl.getUserInfo().split(":")[0]);
	        dataSource.setPassword(dbUrl.getUserInfo().split(":")[1]);

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

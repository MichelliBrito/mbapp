package br.com.mbapp;





import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	 @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication()
             .withUser("admin").password("123456").roles("ADMIN");
     }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	    .antMatchers("/cadastro").hasRole("ADMIN")
	    .antMatchers("/home").permitAll()
	    .antMatchers("/{titulo}").permitAll()
	    .anyRequest().authenticated()
	    .and().formLogin()
	    .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
    public void configure(WebSecurity builder) throws Exception {
        builder.ignoring().antMatchers("/bootstrap/**",
        		"/images/**", "/style/**");
    }
	
}

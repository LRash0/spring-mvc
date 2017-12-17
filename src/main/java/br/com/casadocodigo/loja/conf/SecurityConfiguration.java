package br.com.casadocodigo.loja.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService users;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

	http.authorizeRequests().antMatchers("/produtos/form").hasRole("ADMIN").antMatchers("/").permitAll()
		.anyRequest().authenticated().and().formLogin().and().logout().and().exceptionHandling()
		.accessDeniedPage("/WEB-INF/views/erros/403.jsp");
	// .antMatchers("auth/registration/**").permitAll();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN").and().withUser("user")
		.password("123").roles("USER");

    }
}

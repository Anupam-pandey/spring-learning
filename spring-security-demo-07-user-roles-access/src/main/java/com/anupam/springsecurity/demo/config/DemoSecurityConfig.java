package com.anupam.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@EnableWebSecurity
@Configuration
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").hasRole("emp")
		.antMatchers("/leaders/**").hasRole("mgr")
		.antMatchers("/systems/**").hasRole("admin")
		.and().formLogin().
		loginPage("/showMyLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll()
		.and().logout().permitAll().and().exceptionHandling().accessDeniedPage("/access-denied");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(users.username("anu").password("123").roles("admin","emp"))
		.withUser(users.username("pam").password("123").roles("mgr","emp"))
		.withUser(users.username("pand").password("123").roles("emp","staff"));
		
	}

}

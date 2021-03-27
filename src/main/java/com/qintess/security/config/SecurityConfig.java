package com.qintess.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/").permitAll()
		
			.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/login/novo")
				.defaultSuccessUrl("/", true)
				.failureUrl("/login")
				.permitAll()
			.and()
				.logout()
				.logoutSuccessUrl("/");
	}
	
	

}

package com.defect.tracker.server.service.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.passwordEncoder(new BCryptPasswordEncoder())
		.withUser("san")
		.password("$2y$10$WYI8/0dTM5y.0VZKCEbFWuU1Y39zOx6V3oFj6EZvh6AGXp0T.VQVK")
		.roles("ADMIN")
		.and()
		.withUser("user")
		.password("$2y$10$WYI8/0dTM5y.0VZKCEbFWuU1Y39zOx6V3oFj6EZvh6AGXp0T.VQVK")
		.roles("USER")
		;
	}
//admin//$10$WYI8/0dTM5y.0VZKCEbFWuU1Y39zOx6V3oFj6EZvh6AGXp0T.VQVK
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests();
//		.antMatchers("/**").permitAll()
//		.antMatchers(HttpMethod.POST,"/project").hasAnyRole("ADMIN")
////		.antMatchers("/**").hasRole("ADMIN")
//		.antMatchers("/module").hasRole("USER")
//		.anyRequest().authenticated()
//		.and()
//		.httpBasic()
//		;
	}

}

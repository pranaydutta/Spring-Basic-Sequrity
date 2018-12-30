package com.sb.seq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSequrityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("nitish").password("nitish@26").roles("admin");
		auth.inMemoryAuthentication().withUser("pranay").password("kumar").roles("user");
		
	}
	
	//Security for any API
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//	}
	
	
	//Security based on url
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("admin").anyRequest().fullyAuthenticated().and().httpBasic();
		
	}
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder()
	{
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}

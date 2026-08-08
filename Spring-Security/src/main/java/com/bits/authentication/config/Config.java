package com.bits.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.Builder;

@Configuration

public  class Config{
	
	@Bean
	public SecurityFilterChain  chain(HttpSecurity http) {
		
		http.authorizeHttpRequests(auth ->auth.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService us(PasswordEncoder passwordEncoder){
		
		UserDetails user = User.withUsername("suhas").password(passwordEncoder.encode("41234")).roles("user").build();
		
		 return new InMemoryUserDetailsManager(user);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	 return new BCryptPasswordEncoder();
	}
	
}
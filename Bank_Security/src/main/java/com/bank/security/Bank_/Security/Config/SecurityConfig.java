package com.bank.security.Bank_.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	@Bean
	public UserDetailsService userdetailservice() throws Exception {
		UserDetails  user = User.withUsername("suhas")
				.password("{noop}12345")
				.roles("USER")
				.build();
		
	
	
	UserDetails  admin = User.withUsername("suhass")
			.password("{noop}1234567")
			.roles("ADMIN")
			.build();
	return new InMemoryUserDetailsManager(user,admin);
}

	
	@Bean
	public SecurityFilterChain chain(HttpSecurity http) throws Exception {
		http
		 .authorizeHttpRequests(auth -> auth
				 .requestMatchers("/").permitAll()
				 .requestMatchers("/admin").hasAllRoles("ADMIN")
				 .anyRequest().authenticated()
				 )
		 .httpBasic(httpBasic ->{});
		 return http.build();
		 
	}

}

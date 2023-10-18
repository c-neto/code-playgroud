package br.org.celiolemos.service;

import java.util.Arrays;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@TestConfiguration
public class SpringSecurityWebAuxTestConfig {

	@Bean(name = "r")
	@Primary
	public UserDetailsService userDetailsService() {
		User basicUser = new User("Basic User", "password",
				Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("PERM_FOO_READ")));

		return new InMemoryUserDetailsManager(basicUser);
	}
}
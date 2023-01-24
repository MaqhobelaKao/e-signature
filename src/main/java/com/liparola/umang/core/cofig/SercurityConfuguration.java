package com.liparola.umang.core.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpClient;

@Configuration
@EnableWebSecurity
public class SercurityConfuguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(auth -> {
            auth.requestMatchers("/user/**").hasAnyAuthority("CUSTOMER", "ADMIN");
            auth.requestMatchers("/user/**").hasAnyRole("USER", "ADMIN");
            auth.requestMatchers("/admin/**").hasRole("ADMIM");
            auth.requestMatchers("/login", "/register", "/plugins/**", "/dist/**", "/home").permitAll();
        }).formLogin(form -> {
            form.loginPage("/login");
        }).build();
    }

    @Bean
    public AuthenticationManager authenticationManager(){
        return new authenticationManager()
    }
}

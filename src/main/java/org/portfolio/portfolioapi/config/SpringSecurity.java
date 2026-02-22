package org.portfolio.portfolioapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SpringSecurity {
    @Bean
    public HttpSecurity configure(HttpSecurity http) throws Exception {
        http.csrf(csrfz -> csrfz.disable())
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().permitAll()).build();
        return http;
    }
}

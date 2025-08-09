package com.pointer.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/api/app/v1/user/register", "/api/app/v1/user/login").permitAll()
                // Swagger3 相关路径放行
                .antMatchers("/swagger-ui/**", "/swagger-ui.html", "/v3/api-docs/**", "/swagger-resources/**", "/webjars/**").permitAll()
                // 管理端登录接口
                .antMatchers("/api/admin/v1/auth/login").permitAll()
                // 管理端接口需要管理员权限（后续可以通过注解控制）
                .antMatchers("/api/admin/**").authenticated()
                // 用户端接口需要用户权限
                .antMatchers("/api/app/**").authenticated()
                .anyRequest().authenticated();
        return http.build();
    }
} 
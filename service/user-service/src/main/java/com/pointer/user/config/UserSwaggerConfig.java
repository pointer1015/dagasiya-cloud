package com.pointer.user.config;

import com.pointer.common.config.SwaggerBaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class UserSwaggerConfig extends SwaggerBaseConfig {

    @Bean
    public Docket userApi() {
        return createDocket("用户服务接口", "com.pointer.user.controller")
                .apiInfo(new ApiInfoBuilder().title("用户服务API").build());
    }
}

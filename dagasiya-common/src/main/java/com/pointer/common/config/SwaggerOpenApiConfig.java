package com.pointer.common.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@SpringBootConfiguration
public class SwaggerOpenApiConfig {

    /***
     * 构建Swagger3.0文档说明
     * @return 返回 OpenAPI
     */
    @Bean
    public OpenAPI customAPI() {
        // 联系人信息(contact)，构建API的联系人信息，用于描述API开发者的联系信息，包括名称、URL、邮箱等
        // name：文档的发布者名称 url：文档发布者的网站地址，一般为企业网站 email：文档发布者的电子邮箱

        Contact contact = new Contact()
                .name("pointer1015")
                .email("laoshifu02@outlook.com")
                .url("laoshifu.fun")
                .extensions(new HashMap<String, Object>());

        // 授权许可信息(license)，用于描述API的授权许可信息，包括名称、URL等；假设当前的授权信息为Apache 2.0的开源标准
        License license = new License()
                .name("Apache 2.0")
                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                .identifier("Apache-2.0")
                .extensions(new HashMap<String,Object>());

        //创建Api帮助文档的描述信息、联系人信息(contact)、授权许可信息(license)
        Info info = new Info()
                .title("Dagasiya-cloud-API") //API接口文档标题
                .description("Dagasiya-cloud-API接口文档")  //文档描述
                .version("1.0.0")  // 接口版本
                .termsOfService("Apache License 2.0") // 服务条款地
                .license(license) // 授权许可
                .contact(contact); // 联系人信息

        return  new OpenAPI()
                .openapi("3.0.1")
                .info(info);
    }
}

package com.example.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置文件 
 * @author DoubleLi
 * @time 2019年1月11日
 * 
 */
@Component 
@EnableSwagger2 
public class Swagger2   {
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
    	return new ApiInfo(
                "demo api",
                "接口描述",
                "1.0",
                "TERMS OF SERVICE URL",
                new Contact("yjb","URL","2478683913@qq.com"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
    


}
package com.mjt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * projectName: logistics
 *
 * @author: 马江涛
 * time:2020/10/04  14:18
 * desription:swagger配置类
 */
@Configuration//标记是一个配置文件
@EnableSwagger2//是否开启swagger2的注解
public class SwaggerConfig {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("片场项目的在线接口文档").//设置标题
                contact(new Contact("Java2004","http://baidu.com","java2004@163.com"))
                .version("0.1").description("这是一个在线接口文档，可以直接查看接口的信息并且可以实现接口的测试")
                .build();
    }
    //构建Swagger 对象
    @Bean //使用Spring IOC创建实例
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).//指定生成那种类型的文档
                apiInfo(createAI())//文档信息
                .select().apis(RequestHandlerSelectors.basePackage("com.mjt.controller")).//扫描接口所在的包
                build();
    }
}
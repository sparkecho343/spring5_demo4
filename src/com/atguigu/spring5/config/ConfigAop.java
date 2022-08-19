package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author kasio
 * @create 2022-01-02 17:58
 */
//用配置类代替配置xml文件
@Configuration
@ComponentScan(basePackages = {"com.atguigu"})  //开启注解扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)  //开启Aspect生成代理对象
public class ConfigAop {
}

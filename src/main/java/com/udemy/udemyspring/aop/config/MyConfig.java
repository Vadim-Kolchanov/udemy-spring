package com.udemy.udemyspring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.udemy.udemyspring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}

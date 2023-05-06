package com.ritu.spring.scope;
@Component
@Scope("prototype")
public class Employee {
}
AppConfig.java
@Configuration
@ComponentScan("com.arun.spring.scope")
public class AppConfig {
}

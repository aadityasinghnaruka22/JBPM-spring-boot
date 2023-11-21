package com.ebit.kieServerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ebit.kieServerTest")
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class KieServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KieServerTestApplication.class, args);
	}
}

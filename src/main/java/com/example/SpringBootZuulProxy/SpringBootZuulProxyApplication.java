package com.example.SpringBootZuulProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulProxyApplication.class, args);
	}

}

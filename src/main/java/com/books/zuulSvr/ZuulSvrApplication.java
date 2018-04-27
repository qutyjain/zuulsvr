package com.books.zuulSvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulSvrApplication.class, args);
	}
}

package com.sb.seq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSequrityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSequrityApplication.class, args);
	}

}


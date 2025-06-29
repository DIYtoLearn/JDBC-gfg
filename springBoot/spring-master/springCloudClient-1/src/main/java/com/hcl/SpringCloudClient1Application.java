package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication

public class SpringCloudClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClient1Application.class, args);
	}

}

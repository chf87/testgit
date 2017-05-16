package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		SpringApplication sa = new SpringApplication(DemoApplication.class);
		sa.setBannerMode(Banner.Mode.OFF);
		sa.run(args);
	}
}

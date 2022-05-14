package com.genspark.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class OnlineShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password ="123";
		String enccoderPass= encoder.encode(password);
		System.out.println(enccoderPass);

	}

}

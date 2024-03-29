package com.coffee.house.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.coffee.house.models")
public class CoffeeHouseAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeHouseAdminApplication.class, args);
	}

}

package com.pandemiek.banneton;

import org.springframework.boot.SpringApplication;

public class TestBannetonApplication {

	public static void main(String[] args) {
		SpringApplication.from(BannetonApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

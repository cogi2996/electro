package com.change.electro;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class ElectroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectroApplication.class, args);
	}
	@Bean
	@Transactional
	public CommandLineRunner commandLineRunner() {
		return args -> {
			try {
				System.out.println("ket noi thanh cong");
				// Do your database operations here
			} catch (Exception e) {
				System.err.println("Ket noi that bai" + e.getMessage());
			}
		};
	}

}

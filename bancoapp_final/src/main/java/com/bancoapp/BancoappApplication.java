//Aplicação

package com.bancoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages={"com.bancoapp.modelos"})
public class BancoappApplication {
	public static void main(String[] args) {
		SpringApplication.run(BancoappApplication.class, args);
	}

}

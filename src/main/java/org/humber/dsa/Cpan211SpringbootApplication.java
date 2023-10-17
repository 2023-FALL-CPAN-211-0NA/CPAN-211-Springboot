package org.humber.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Cpan211SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cpan211SpringbootApplication.class, args);
	}

}

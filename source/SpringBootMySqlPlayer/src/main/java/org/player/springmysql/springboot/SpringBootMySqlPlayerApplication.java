package org.player.springmysql.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "org.player.springmysql.springboot.repository")
@SpringBootApplication
public class SpringBootMySqlPlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlPlayerApplication.class, args);
	}

}

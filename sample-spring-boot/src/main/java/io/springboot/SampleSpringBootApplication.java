package io.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"io.springboot"})
@EntityScan(basePackages = {"io.springboot"})
public class SampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

}

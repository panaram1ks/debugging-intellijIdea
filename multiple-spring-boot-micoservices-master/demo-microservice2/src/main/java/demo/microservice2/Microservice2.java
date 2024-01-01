package demo.microservice2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Microservice2 {

	private final static Logger LOGGER = LoggerFactory.getLogger(Microservice2.class);

	public static void main(String[] args) {
		SpringApplication.run(Microservice2.class, args);
		LOGGER.info("Springboot Microservice2 started successfully.");
	}

	// Configuring the restTemplate object.
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

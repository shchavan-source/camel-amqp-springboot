package org.redhat.demo.amqpdemo;

import org.apache.camel.component.amqp.AMQPConnectionDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AmqpdemoApplication {

	@Value("${amqp.username}")
	private String username;

	@Value("${amqp.password}")
	private String password;

	@Value("${amqp.url}")
	private String url;

	public static void main(String[] args) {
		SpringApplication.run(AmqpdemoApplication.class, args);
	}

	@Bean
	AMQPConnectionDetails securedAmqpConnection() {
		return new AMQPConnectionDetails(url, username, password);
	}

}

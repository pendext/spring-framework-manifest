package com.manifestcorp.bootcamp.framework;

import com.manifestcorp.bootcamp.framework.database.CustomerRepository;
import com.manifestcorp.bootcamp.framework.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository) {
        return (args) -> {
            customerRepository.save(new Customer("Bela", "Fleck"));
            customerRepository.save(new Customer("Chris", "Thile"));
            customerRepository.save(new Customer("Lindsay", "Lou"));
            customerRepository.save(new Customer("Dusty", "Roads"));
            customerRepository.save(new Customer("Andrew", "Marlin"));
        };
    }

}

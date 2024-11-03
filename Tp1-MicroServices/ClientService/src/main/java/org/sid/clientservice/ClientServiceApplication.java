package org.sid.clientservice;

import org.sid.clientservice.entities.Client;
import org.sid.clientservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(1L, "Rabab SELIMANI",Float.parseFloat("23")));
            clientRepository.save(new Client(2L, "Amal RAMI", Float.parseFloat("22")));
            clientRepository.save(new Client(3L, "Samir SAFI", Float.parseFloat("25")));
        };
    }
}


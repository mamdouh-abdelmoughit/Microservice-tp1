package org.sid.voitureservice;

import org.sid.voitureservice.Entities.Client;
import org.sid.voitureservice.Entities.Voiture;
import org.sid.voitureservice.Repositories.VoitureRepository;
import org.sid.voitureservice.Services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class VoitureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository, ClientService
            clientService){
        return args-> {
            Client c1 = clientService.clientById(2L);
            Client c2 = clientService.clientById(1L);
            System.out.println("**************************");
            System.out.println("Id est :" + c2.getId());
            System.out.println("Nom est :" + c2.getNom());
            System.out.println("Age est :" + c2.getAge());
            System.out.println("**************************");
            System.out.println("**************************");
            System.out.println("Id est :" + c1.getId());
            System.out.println("Nom est :" + c1.getNom());
            System.out.println("Age est :" + c1.getAge());
            System.out.println("**************************");
            voitureRepository.save(new Voiture(Long.parseLong("1"),  "A 25 333", "Toyota","Corolla", 1L, c2));
            voitureRepository.save(new Voiture(Long.parseLong("2"),  "B 6 3456","Renault", "Megane", 1L, c2));
            voitureRepository.save(new Voiture(Long.parseLong("3"),  "A 55 4444","Peugeot", "301", 2L, c1));
        };
    }
}

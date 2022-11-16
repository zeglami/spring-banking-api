package me.zegit;

import me.zegit.entities.Compte;
import me.zegit.eums.TypeCompe;
import me.zegit.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringBankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBankingApiApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
    return args -> {
      compteRepository.save(new Compte(null, 900, new Date(), TypeCompe.COURANT));
      compteRepository.save(new Compte(null, 900, new Date(), TypeCompe.EPARGNE));
      compteRepository
          .findAll()
          .forEach(
              cp -> {
                System.out.println("Code: "+cp.getCode());
                System.out.println("Type: "+cp.getType());
              });
    };
	}
}

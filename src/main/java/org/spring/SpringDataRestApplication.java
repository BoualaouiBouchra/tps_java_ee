package org.spring;

import java.util.Arrays;

import org.spring.modele.Proprietaire;
import org.spring.modele.ProprietaireRepo;
import org.spring.modele.Voiture;
import org.spring.modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class SpringDataRestApplication {

	@Autowired
	private VoitureRepo repository;
	@Autowired
	ProprietaireRepo proprietaireRepo;
	
	public static void main(String[] args) {
	// modifie_pour_tp_git
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(){
	return args -> {
	repository.save(new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000));
	repository.save(new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000));
	repository.save(new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000));
	};
	}*/
	@Bean
	CommandLineRunner runner(){
		return args -> {
			Proprietaire proprietaire1 = new Proprietaire("Ali" , "Hassan");
			Proprietaire proprietaire2 = new Proprietaire("Najat" , "Bani");
			proprietaireRepo.save(proprietaire1);
			proprietaireRepo.save(proprietaire2);
			repository.save(new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000,proprietaire1));
			repository.save(new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000,proprietaire1));
			repository.save(new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000,proprietaire2));
		};
		}
	
	
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
	

}

package it.emanuele.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.emanuele.Studente;
import it.emanuele.Matricola;

@Configuration
@ComponentScan(basePackageClasses = Studente.class)


public class Config {
	Scanner s = new Scanner(System.in);
	String codiceMatricola= null;
	@Bean
    public Matricola getcodiceMatricola() {
		System.out.println("Inserisci la Matricola");
		codiceMatricola = s.nextLine();
        return new Matricola(codiceMatricola);
    }
}
package it.emanuele;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.emanuele.spring.Config;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Studente studente = context.getBean( Studente.class);
		System.out.println(studente);
		
		
	}

}

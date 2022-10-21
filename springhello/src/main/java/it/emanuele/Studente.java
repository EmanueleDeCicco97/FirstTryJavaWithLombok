package it.emanuele;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Studente {
   
	
	private Matricola matricola;
	
	public Studente(Matricola matricola) {
		
		this.matricola=matricola;
	}
}
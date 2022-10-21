package it.emanuele;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Matricola {
	
	private String codiceMatricola;
	
	public Matricola(String codiceMatricola) {
		
		this.codiceMatricola=codiceMatricola;
	}
}
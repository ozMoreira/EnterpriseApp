package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {
	
	public static void main(String[] args) {
		
		//Fabrica de Gerenciador de entidades
											//name da persistence unit no persistence.xml
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Fechar o recurso
		fabrica.close();
	}
}
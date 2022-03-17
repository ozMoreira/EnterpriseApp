package br.com.fiap.jpa.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Artista;
import br.com.fiap.jpa.entity.GeneroMusica;

public class ExemploCadastro {
	
	public static void main(String[] args) {
		//obter uma fabrica
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
		
		//obter um entity manager
		EntityManager em = emf.createEntityManager();
		
		//Criar um artista
		Artista artista = new Artista("Zezinho",LocalDate.of(1912, 12, 12), null, GeneroMusica.SERTANEJO, true, true, 50);
		
		//Persist
		em.persist(artista);
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		//fechar
		em.close();
		emf.close();

		
	}

}

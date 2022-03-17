package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Alimento;

public class TesteColecoes {
	
	public static void main(String[] args) {
		
		//Criar uma lista de alimentos
		//Lista -> os elementos possuem posições e permite valores repetidos
		List<Alimento> lista = new ArrayList<>();
		
		//Adicionar 2 alimentos na lista
		Alimento alimento = new Alimento("Arroz", true, 100);
		lista.add(alimento);
		
		lista.add(alimento); //adicionar um valor repetido
		
		//Instancia um alimento e adiciona na lista
		lista.add(new Alimento("Churros", false, 500));
		
		//Exibir os dados da lista
		System.out.println("FOR");
		for (int i=0; i < lista.size() ; i++) {
			System.out.println(lista.get(i));//recuperar um item da lista pelo index
		}
		
		System.out.println("FOREACH");
		for (Alimento item : lista) {
			System.out.println(item);
		}
		
		//Criar um conjunto de alimentos
		//Conjunto -> os elementos não possuem posição e não permite valores repetidos
		Set<Alimento> conjunto = new HashSet<Alimento>();
		
		//Adicionar 3 alimentos, sendo 1 repetido
		conjunto.add(alimento);
		conjunto.add(alimento);//valor repetido
		conjunto.add(new Alimento("Laranja", false, 50));
		
		//Exibir os alimentos do conjunto
		System.out.println("CONJUNTO");
		for (Alimento item : conjunto) {
			System.out.println(item);
		}
		
		//Criar um mapa com a chave do tipo Integer e o valor do tipo alimento
		Map<Integer, Alimento> mapa = new HashMap<Integer,Alimento>();
		
		//Adicionar 2 alimentos no mapa
		mapa.put(123, alimento);
		mapa.put(321, new Alimento("Bolacha", false, 150));
		
		//adicionando um valor em uma chave que já existe
		//mapa.put(321, alimento); //substituiu o valor da chave
		
		System.out.println("MAPA");
		//Recuperar um alimento pela chave
		System.out.println(mapa.get(321));
		
		//Recuperar as chaves mapeadas
		Set<Integer> chaves = mapa.keySet();
		
		//Exibir as chaves e valores do mapeamento
		for (Integer chave : chaves) {
			System.out.println(chave + " " + mapa.get(chave));
		}
		
	}//main
}//class
package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import br.com.fiap.anotacao.Coluna;
import br.com.fiap.model.Veiculo;

public class Exemplo {

	public static void main(String[] args) {
		//Instanciar um Veiculo
		Veiculo veiculo = new Veiculo();
		
		//Recuperar o nome da classe e exibir
		System.out.println(veiculo.getClass().getName());
		
		//Recuperar os atributos do objeto
		Field[] atributos = veiculo.getClass().getDeclaredFields();
		
		System.out.println("ATRIBUTOS:");
		//Exibir o nome dos atributos e o tipo
		for (Field item : atributos) {
			System.out.println(item.getName() + " - " + item.getType());
			//Recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			//Exibir os valores dos parâmetros da anotação @Coluna
			System.out.println("Nome da coluna: " + anotacao.nome());
			System.out.println("Chave primária? " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho() + "\n");
		}
		
		//Recuperar os métodos
		Method[] metodos = veiculo.getClass().getDeclaredMethods();
		
		System.out.println("MÉTODOS:");
		//Exibir o nome dos métodos
		for (Method item : metodos) {
			System.out.println(item.getName());
		}
		
	}//main
}//class
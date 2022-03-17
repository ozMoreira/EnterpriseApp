package br.com.fiap.revisao.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.revisao.model.Alimento;
import br.com.fiap.revisao.model.Fornecedor;
import br.com.fiap.revisao.model.Organico;
import br.com.fiap.revisao.model.OrigemAlimento;

public class Teste {

	//Criar o método main: main + CTRL + espaço
	public static void main(String[] args) {
		
		//Instanciar um Alimento
		Alimento churros = new Alimento("Churros doce de leite", false, 300);
		
		//Colocar informações nos atributos do objeto
//		churros.setNome("Churros doce de leite");
//		churros.setSalgado(false);
//		churros.setValorCalorico(300);
		
		//Chamar os métodos e exibir o resultado
		System.out.println("A qtd total de calorias: " + churros.calcularValorCalorico(2, true));
		System.out.println("A qtd total de calorias: " + churros.calcularValorCalorico(2));
		System.out.println("Nome ok? " + churros.validarNome());
		
		System.out.println(churros);
		
		//Instanciar um Organico
		Organico tomate = new Organico("Tomate", false, 50, "Piracicaba");
		
		//Chamar os métodos e exibir o resultado
		System.out.println("A qtd total de calorias: " + tomate.calcularValorCalorico(10));
		System.out.println("Nome ok? " + tomate.validarNome());
		
		System.out.println(tomate);
		
		//Organico laranja = new Alimento("Laranja"); Não compila!
		Alimento alface = new Organico("Alface");
		
		System.out.println("Nome ok? " + alface.validarNome()); //Organico -> false
		
		System.out.println(alface);
		
		//Criar uma lista de fornecedores
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		
		//Adicionar dois fornecedores
		fornecedores.add(new Fornecedor(1, "Alimentos LTDA"));
		fornecedores.add(new Fornecedor(2, "Dois irmãos LTDA"));
		
		//Criar um alimento com todos os dados
		Alimento miojo = new Alimento("Miojo", true, 100, 
										LocalDate.of(2024, 1, 18), OrigemAlimento.VEGETAL, fornecedores);
		
		//Exibir os dados do alimento
		System.out.println(miojo);
		
		//Exibir os dados dos fornecedores do alimento
		System.out.println("FORNECEDORES");
		for (Fornecedor item : miojo.getFornecedores()) {
			System.out.println(item);
		}
		
	}//main
}//class
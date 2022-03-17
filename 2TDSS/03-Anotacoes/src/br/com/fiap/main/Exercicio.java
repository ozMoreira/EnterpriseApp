package br.com.fiap.main;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Veiculo;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um aluno
		Aluno aluno = new Aluno();
		
		//Instanciar um Orm
		Orm orm = new Orm();
		
		//Chamar o método pesquisar para o aluno e exibir o resultado
		System.out.println(orm.pesquisar(aluno));
		
		//Instanciar o Veiculo
		Veiculo veiculo = new Veiculo();
		
		//Chamar o método pesquisar para o veículo e exibir o resultado
		System.out.println(orm.pesquisar(veiculo));
		
	}
}

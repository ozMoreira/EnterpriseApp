package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	//1-Criar a anotação @Tabela
	//2-Criar a classe Aluno e utilizar a anotação
	//3-Implementar o método pesquisar da classe Orm
	//4-Criar uma classe com método main para testar o método de pesquisa
	
	/**
	 * Recupera o valor do parâmetro nome da anotação @Tabela e retorna o SQL
	 * @param obj
	 * @return SQL para pesquisar todos os registros da tabela
	 */
	public String pesquisar(Object obj) {
		//Recuperar a anotação @Tabela
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		//Recuperar o parâmetro nome da anotação
		String nome = anotacao.nome();
		//concatenar com o nome da tabela
		return "SELECT * FROM " + nome; 
	}
	
}
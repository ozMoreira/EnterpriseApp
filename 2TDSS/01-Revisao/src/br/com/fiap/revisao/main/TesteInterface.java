package br.com.fiap.revisao.main;

import br.com.fiap.revisao.dao.AlimentoDao;
import br.com.fiap.revisao.dao.AlimentoMySqlDao;
import br.com.fiap.revisao.model.Alimento;

public class TesteInterface {

	public static void main(String[] args) {
		
		//Declarar uma variável do tipo AlimentoDao e instanciar uma classe
		AlimentoDao dao = new AlimentoMySqlDao();
		
		//Chamar o método cadastrar
		dao.cadastrar(new Alimento("Churros"));
		
		//Chamar o método listar..
		dao.listar();
		
	}
}
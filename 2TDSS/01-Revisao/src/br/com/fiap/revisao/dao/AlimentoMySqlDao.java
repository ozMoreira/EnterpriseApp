package br.com.fiap.revisao.dao;

import java.util.List;

import br.com.fiap.revisao.model.Alimento;

public class AlimentoMySqlDao implements AlimentoDao {

	@Override
	public void cadastrar(Alimento alimento) {
		System.out.println("Cadastrando no MySql");
	}

	@Override
	public List<Alimento> listar() {
		System.out.println("Listando do MySql");
		return null;
	}

}

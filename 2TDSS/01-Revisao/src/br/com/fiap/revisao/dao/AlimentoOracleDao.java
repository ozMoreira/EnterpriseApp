package br.com.fiap.revisao.dao;

import java.util.List;

import br.com.fiap.revisao.model.Alimento;

public class AlimentoOracleDao implements AlimentoDao {

	@Override
	public void cadastrar(Alimento alimento) {
		System.out.println("Cadastrando no oracle..");
	}

	@Override
	public List<Alimento> listar() {
		System.out.println("Listando do oracle...");
		return null;
	}

}

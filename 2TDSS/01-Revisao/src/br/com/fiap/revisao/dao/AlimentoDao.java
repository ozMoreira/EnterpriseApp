package br.com.fiap.revisao.dao;

import java.util.List;
import br.com.fiap.revisao.model.Alimento;

//Interfaces -> define as regras, métodos que as classes devem implementar (CONTRATO)
//Interface: diminui o acoplamento (dependência) entre os objetos
public interface AlimentoDao {

	void cadastrar(Alimento alimento);
	
	List<Alimento> listar();
	
}
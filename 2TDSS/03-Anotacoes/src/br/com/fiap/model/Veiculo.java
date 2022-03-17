package br.com.fiap.model;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome = "TB_VEICULO")
public class Veiculo {

	@Coluna(nome = "cd_veiculo", chave = true)
	private int codigo;
	
	@Coluna(nome = "ds_tipo", tamanho = 20)
	private String tipo;
	
	@Coluna(nome = "vl_veiculo")
	private double valor;
	
	@Coluna(nome = "nr_capacidade")
	private int capacidade;

	@Coluna(nome = "")
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
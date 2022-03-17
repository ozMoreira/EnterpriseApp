package br.com.fiap.revisao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Alimento {
	
	//Modificadores de acesso
	//private -> somente a classe
	//default/package -> a classe e classes do mesmo pacote
	//protected -> a classe, classes do mesmo pacote e classes filhas 
	//public -> todos
	
	//Atributos
	//Valores padrões: Referência -> null; números -> 0; boolean -> false
	private String nome;
	private boolean salgado;
	protected float valorCalorico;
	
	private LocalDate dataValidade;
	
	//Define a origem
	private OrigemAlimento origemAlimento;
	
	private List<Fornecedor> fornecedores;
	
	//Construtores -> métodos especiais utilizados na instaciação da classe
	//1- Tem o mesmo nome da classe
	//2- Não tem retorno, nem void
	
	public Alimento(String nome) {
		super();
		this.nome = nome;
	}
	
	//Criar um construtor com todos os atributos
	public Alimento(String nome, boolean salgado, float valorCalorico) {
		this(nome); //chama o construtor que recebe o nome
		this.salgado = salgado;
		this.valorCalorico = valorCalorico;
	}
	
	public Alimento(String nome, boolean salgado, float valorCalorico, 
			LocalDate dataValidade, OrigemAlimento origemAlimento, List<Fornecedor> fornecedores) {
		this(nome, salgado, valorCalorico);
		this.dataValidade = dataValidade;
		this.origemAlimento = origemAlimento;
		this.fornecedores = fornecedores;
	}
	
	//public Alimento() {}
	
	//Métodos
	
	//Sobrescrever o método toString() para exibir os dados do alimento
	@Override
	public String toString() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Nome: " + nome + (salgado?" Salgado":" Doce") 
				+ " Valor calórico: " + valorCalorico 
				+ " Validade: " + (dataValidade==null?"Nda":dataValidade.format(formatador)) +
				" Origem: " + origemAlimento;
	}
	
	public double calcularValorCalorico(int quantidade) {
		//Retornar o valor calórico total
		return valorCalorico * quantidade;
	}
	
	//Sobrecarga (Overload) -> método com o mesmo nome e parâmetros diferentes
	//Parâmetros diferentes-> no tipo, ou quantidade
	public double calcularValorCalorico(int quantidade, boolean frito) {
		//Retornar o valor calórico total com 50% a mais se for frito
		//return frito ? (valorCalorico * quantidade) * 1.5 : valorCalorico * quantidade;
		return frito ? calcularValorCalorico(quantidade) * 1.5 : calcularValorCalorico(quantidade);
	}
	
	public boolean validarNome(int qtd) {
		//Valida se o nome possui mais caracteres do que o parâmetro informado
		return nome.length() > qtd;
	}
	
	public boolean validarNome() {
		//Valida se o nome possui mais de 3 caracteres
//		if  (nome.length() > 3)
//			return true;
//		else
//			return false;
//		return nome.length() > 3 ? true : false;
		return nome.length() > 3;
	}
	
	//Getters e Setters - Criar um get e set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public boolean isSalgado() {
		return salgado;
	}

	public void setSalgado(boolean salgado) {
		this.salgado = salgado;
	}

	public float getValorCalorico() {
		return valorCalorico;
	}

	public void setValorCalorico(float valorCalorico) {
		this.valorCalorico = valorCalorico;
	}

	public OrigemAlimento getOrigemAlimento() {
		return origemAlimento;
	}

	public void setOrigemAlimento(OrigemAlimento origemAlimento) {
		this.origemAlimento = origemAlimento;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}

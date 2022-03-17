package br.com.fiap.revisao.model;

//Herança
//Object <- Alimento <- Organico

//É uma herança -> É um?
//É um atributo/associação -> Tem um?
public class Organico extends Alimento {

	//Atributos
	private String origem;
	
	private TipoOrganico tipo;
	
	//Construtores, são herdados? não
	//O construtor da classe filha precisa chamar um construtor do pai
	
	//Criar o construtor que chama o construtor do pai
	public Organico(String nome) {
		super(nome);//chama o construtor do pai
	}
	
	//Criar o construtor que recebe todos os parâmetros
	public Organico(String nome, boolean salgado, float valorCalorico, String origem) {
		super(nome, salgado, valorCalorico);
		this.origem = origem;
	}

	//Métodos
	
	//@Override
	public String toString() {
		return super.toString() + " Origem: " + origem;
	}
	
	//Sobrescrita (Override) -> mesmo método do pai implementado na classe filha
	public double calcularValorCalorico(int quantidade) {
		//Calcular o valor total menos 20%
		//return quantidade * valorCalorico * 0.8;
		return super.calcularValorCalorico(quantidade) * 0.8;
	}
	
	//Sobrescrever o método validarNome() para validar o nome com mais de 10 caracteres
	//@Override
	public boolean validarNome() {
		//return nome.length() > 10;
		return super.validarNome(10);
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public TipoOrganico getTipo() {
		return tipo;
	}

	public void setTipo(TipoOrganico tipo) {
		this.tipo = tipo;
	}
	
}
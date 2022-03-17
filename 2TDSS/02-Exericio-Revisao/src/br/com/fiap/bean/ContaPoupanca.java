package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ContaInvestimento {
	
	//Atributo
	private float taxa;
	
	//Constante
	//final -> não permite alterar o valor, no método -> não pode ser sobrescrito,
	//na classe -> não pode ser herdada
	//static -> define o elemento da classe e não do objeto
	public static final float RENDIMENTO = 0.06f;

	//Construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, 
																			float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	//Métodos
	@Override 	
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}

	@Override // @Override -> garante a sobrescrita do método
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se o saldo é suficiente para o saque, junto da taxa de retirada
		if (valor + taxa > saldo) {
			throw new SaldoInsuficienteException(saldo - taxa);
		}
		saldo -= valor + taxa;
	}

//	@Override
//	public void depositar(double valor) {
//		saldo += valor;
//	}

	//Getters e Setters
	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}

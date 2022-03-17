package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	//Atributo
	private TipoConta tipo;
	
	//Construtores CTRL + 3 -> gcuf
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, 
													double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	//Métodos
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		//Validar se a conta é comum e o saldo fica negativo depois do saque
		if (tipo == TipoConta.COMUM && valor > saldo) {
			throw new SaldoInsuficienteException(saldo);
		}
		saldo -= valor;
	}

//	@Override
//	public void depositar(double valor) {
//		saldo += valor;
//	}

	//Getters e Setters
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}

package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

//Classe abstrata
//1- Não pode ser instanciada
//2- Pode ter métodos abstratos (sem implementação)
public abstract class Conta {

	// Atributos
	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	protected double saldo;// = 100;

	//Construtores (CTRL + 3 -> gcuf)
	public Conta() {}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	//Métodos
	public abstract void retirar(double valor) throws SaldoInsuficienteException;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	// Getters e Setters (CTRL + 3 -> ggas)
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
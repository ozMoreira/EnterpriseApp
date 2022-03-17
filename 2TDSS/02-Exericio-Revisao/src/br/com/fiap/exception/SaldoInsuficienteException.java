package br.com.fiap.exception;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente, saldo disponível: " + valor);
	}
	
}
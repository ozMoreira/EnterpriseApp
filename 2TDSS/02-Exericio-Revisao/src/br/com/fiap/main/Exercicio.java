package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(1,  12, 
				new GregorianCalendar(2010, Calendar.JANUARY, 10), 100, TipoConta.COMUM);
		
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(1, 23, Calendar.getInstance(), 200, 2);
		
		//Chamar o método depositar da conta corrente
		cc.depositar(100);
		
		//Exibir o saldo
		System.out.println("Saldo cc: " + cc.getSaldo());
		
		//Chamar o método depositar da conta poupança
		cp.depositar(100);
		
		//Exibir o saldo
		System.out.println("Saldo poupança: " + cp.getSaldo());
		
		try {
			//Chamar o método retirar da conta corrente
			cc.retirar(100);
			
			//Exibir o sado
			System.out.println("Novo saldo cc: " + cc.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		try { 
			//Chamar o método retirar da conta poupança
			cp.retirar(200);

			//Exibir o saldo
			System.out.println("Novo saldo poupança: " + cp.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		//Criar uma lista de conta corrente
		List<ContaCorrente> lista = new ArrayList<>();
		
		//Adicionar 3 contas
		lista.add(cc);
		lista.add(new ContaCorrente(1, 123, new GregorianCalendar(2010, Calendar.APRIL, 1), 990, TipoConta.ESPECIAL));
		lista.add(new ContaCorrente(1, 432, new GregorianCalendar(1999, Calendar.JULY, 4), 89, TipoConta.PREMIUM));
		
		//Exibir o saldo das contas
		System.out.println("Saldos:");
		for (ContaCorrente item : lista) {
			System.out.println(item.getSaldo());
		}
		
	}//main
}//class
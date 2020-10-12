package br.ufpb.sistemaBanco;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		String nome = "João";
		String cpf = "123";
		Date nascimento = new Date();
		Cliente cliente1 = new Cliente(nome, cpf, nascimento);
		ContaCorrente conta1 = new ContaCorrente(cliente1, 1);
		//ContaCorrente conta2 = new ContaCorrente(cliente2, 2);
		System.out.println(cliente1);
		System.out.println("Saldo da conta 1: "+conta1.verSaldo());
		conta1.deposito(40);
		System.out.println("Saldo da conta 1: "+conta1.verSaldo());
		//System.out.println("Saldo da conta 2: "+conta2.verSaldo());
		System.out.println("Tentativa de saque maior que saldo:  "+conta1.saque(30));
	}

}

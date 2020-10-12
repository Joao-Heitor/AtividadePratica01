package br.ufpb.sistemaBanco;

public class ContaCorrente {

	Cliente cliente;
	private int numConta;
	private double saldo;

	public ContaCorrente(Cliente cliente, int numero) {
		this.cliente = cliente;
		this.numConta = numero;
		this.saldo = 0;

	}

	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}

	public boolean saque(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	public double verSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return cliente;
	}

	public void setTitular(Cliente titular) {
		this.cliente = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + cliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
}

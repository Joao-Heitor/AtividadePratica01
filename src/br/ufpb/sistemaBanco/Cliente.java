package br.ufpb.sistemaBanco;

import java.util.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private Date nascimento;
	private int agencia;
	private int conta;
	
	public Cliente(String p_nome, String p_cpf, Date p_nascimento) {
		nome = p_nome;
		cpf = p_cpf;
		nascimento = p_nascimento;

	}
	public void vincularAgencia(int n_agencia) {
		agencia = n_agencia;
	}
	public void vincularConta(int n_conta) {
		conta = n_conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", agencia=" + agencia
				+ ", conta=" + conta + "]";
	}
	
}
    
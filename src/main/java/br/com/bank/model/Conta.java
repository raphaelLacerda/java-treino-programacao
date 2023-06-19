package br.com.bank.model;


public class Conta {

	private double saldo;
	private String cpf;

	public Conta(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}
}

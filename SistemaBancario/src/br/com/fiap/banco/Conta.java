package br.com.fiap.banco;


public class Conta {

	// Atributos de classe
	int agencia;
	int numero;
	double saldo;
	
	// Construtor padrão
	public Conta() {
		
	}
	
	// Construtor de classe
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * Depositar da classe Conta
	 * @param valor a ser depositado
	 */
	public void depositar(double valor) {
		
		this.saldo += valor;
		
		
	}
	
	public void retirar(double valor) {
		
		this.saldo -= valor;		
		
	}
	
	public double verificarSaldo() {
		
		return this.saldo;
		
	}
	
	
}

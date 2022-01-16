package br.com.fiap.banco;

/**
 * 
 * @author Nicolas Unger
 * @version 1.0
 *
 */


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
	
	/**
	 * Retira um valor do saldo da Conta
	 * @param valor
	 * @see depositar
	 */
	
	public void retirar(double valor) {
		
		this.saldo -= valor;		
		
	}
	
	
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	public double verificarSaldo() {
		
		return this.saldo;
		
	}
	
	
}

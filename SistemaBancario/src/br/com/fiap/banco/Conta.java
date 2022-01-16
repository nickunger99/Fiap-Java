package br.com.fiap.banco;

import java.io.Serializable;

/**
 * 
 * @author Nicolas Unger
 * @version 1.0
 *
 */


public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributos de classe
	private int agencia;
	private int numero;
	private double saldo;
	
	// Construtor padrão
	public Conta() {
		
	}
	
	// Construtor de classe
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
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
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	
}

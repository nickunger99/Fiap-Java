package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		// Objeto com construtor padr�o
		Conta cc = new Conta();
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 321;
		 
		cc.depositar(1000);
		System.out.println(cc.verificarSaldo());
	
		// Objeto com construtor de classe
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
}

}
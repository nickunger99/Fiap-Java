package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		// Objeto com construtor padrão
		/*
		 * Conta cc1 = new Conta(); cc1.depositar(50.0); cc1.setAgencia(123);
		 * cc1.setNumero(321);
		 * 
		 * cc1.depositar(1000); System.out.println(cc1.getSaldo());
		 * 
		 * // Objeto com construtor de classe Conta poupanca = new Conta(111, 222,
		 * 1000); poupanca.retirar(50);
		 * 
		 * System.out.println(poupanca.getSaldo());
		 */
		
		
		/*
		 * ContaCorrente cc = new ContaCorrente(); cc.setAgencia(1111);
		 * cc.setNumero(2222); cc.setTipo("PF"); cc.setChequeEspecial(1000);
		 * 
		 * System.out.println(cc.getAgencia()); System.out.println(cc.getNumero());
		 * System.out.println(cc.getTipo()); System.out.println(cc.getChequeEspecial());
		 * 
		 * Conta conta = new Conta(); Conta cc2 = new ContaCorrente();
		 * 
		 * ContaCorrente c1 = (ContaCorrente) cc2;
		 * 
		 * if (conta instanceof ContaCorrente) { ContaCorrente c2 = (ContaCorrente)
		 * conta; }
		 */
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta 1: " + conta1.getSaldo());
		System.out.println("Conta 2: " + conta2.getSaldo());
		System.out.println("Conta 3: " + conta3.getSaldo());
		
 }

}
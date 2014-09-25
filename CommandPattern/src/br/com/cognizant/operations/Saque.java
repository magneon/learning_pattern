package br.com.cognizant.operations;

public class Saque {

	public void sacar(String nome, Double valor) {
		if (nome != null && valor > 0) {
			System.out.println("Saque no valor de R$ " + valor + " realizado com sucesso!");
		} else {
			System.out.println("Saldo indisponível!");
		}
	}
	
}

package br.com.cognizant.operations;

public class Transferencia {

	public void transferirPara(String nome, Double valor) {
		if (nome != null && valor > 0) {
			System.out.println("Transfer�ncia de R$ " + valor + " para " + nome + " realizada com sucesso!");
		} else {
			System.out.println("Saldo indispon�vel!");
		}
	}
	
}

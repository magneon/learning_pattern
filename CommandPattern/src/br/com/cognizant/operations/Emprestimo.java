package br.com.cognizant.operations;

public class Emprestimo {
	
	public Boolean verificarLimiteCredito(String nome) {
		if (nome != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void solicitarEmprestimo(Double valor, String nome) {
		if (verificarLimiteCredito(nome)) {
			System.out.println("Empréstimo no valor de R$ " + valor + " para " + nome + " foi concedido com sucesso!");
		} else {
			System.out.println("Não possui limite de crédito!");
		}
	}
	
}

package br.com.cognizant.operations;

public class CartaoCredito {
	
	public String solicitarCartaoCredito(String nome, String cpf) {
		return "----> Emitindo cart�o de cr�dito para " + nome + " com CPF: " + cpf;
	}
	
	public String comprarComCredito(String produto, Double valor) {
		return "----> Compra do produto " + produto + " com o valor R$ " + valor + " efetuada com sucesso!";
	}
	
	public Boolean pagarFatura(Double valorFatura) {
		if (valorFatura > 0) {
			return true;
		} else {
			return false;
		}
	}
}

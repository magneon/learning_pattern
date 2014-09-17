package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.CartaoCredito;

public class PagarFaturaCommand implements Command {

	private CartaoCredito cartaoCredito;
	private Double valorFatura;
	
	public PagarFaturaCommand(final CartaoCredito cartaoCredito, final Double valorFatura) {
		this.cartaoCredito = cartaoCredito;
	}
	
	@Override
	public void execute() {
		this.cartaoCredito.pagarFatura(valorFatura);
	}

}

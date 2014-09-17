package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.CartaoCredito;

public class ComprarComCreditoCommand implements Command {
	private CartaoCredito cartaoCredito;
	private String produto;
	private Double valor;
	
	public ComprarComCreditoCommand(final CartaoCredito cartaoCredito, final String produto, final Double valor) {
		this.cartaoCredito = cartaoCredito;
		this.produto = produto;
		this.valor = valor;
	}
	
	@Override
	public void execute() {
		System.out.println(this.cartaoCredito.comprarComCredito(produto, valor));
	}

}

package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.CartaoCredito;

public class SolicitaCartaoCreditoCommand implements Command {
	private CartaoCredito cartaoCredito;
	private String nome;
	private String cpf;
	
	public SolicitaCartaoCreditoCommand(final CartaoCredito cartaoCredito, final String nome, final String cpf) {
		this.cartaoCredito = cartaoCredito;
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public void execute() {
		System.out.println(this.cartaoCredito.solicitarCartaoCredito(nome, cpf));
	}

}

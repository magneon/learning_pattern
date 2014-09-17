package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Saque;

public class SacarCommand implements Command {
	
	private Saque saque;
	private String nome;
	private Double valor;
	
	public SacarCommand(final Saque saque, final String nome, final Double valor) {
		this.saque = saque;
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public void execute() {
		this.saque.sacar(nome, valor);
	}

}

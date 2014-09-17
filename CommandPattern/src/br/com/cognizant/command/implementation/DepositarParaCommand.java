package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Deposito;

public class DepositarParaCommand implements Command {

	private Deposito deposito;
	private String nome;
	private Double valor;
	
	public DepositarParaCommand(final Deposito deposito, final String nome, final Double valor) {
		this.deposito = deposito;
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public void execute() {
		this.deposito.depositarPara(nome, valor);
	}

}

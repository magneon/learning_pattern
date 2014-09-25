package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Transferencia;

public class TransferirParaCommand implements Command{
	
	private Transferencia transferencia;
	private String nome;
	private Double valor;
	
	public TransferirParaCommand(final Transferencia transferencia, final String nome, final Double valor) {
		this.transferencia = transferencia;
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public void execute() {
		this.transferencia.transferirPara(nome, valor);
	}
	
}

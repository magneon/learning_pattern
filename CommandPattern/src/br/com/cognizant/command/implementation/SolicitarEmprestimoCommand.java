package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Emprestimo;

public class SolicitarEmprestimoCommand implements Command {
	
	private Emprestimo emprestimo;
	private Double valor;
	private String nome;
	
	public SolicitarEmprestimoCommand(final Emprestimo emprestimo, final Double valor, final String nome) {
		this.emprestimo = emprestimo;
		this.valor = valor;
		this.nome = nome;
	}
	
	@Override
	public void execute() {
		this.emprestimo.solicitarEmprestimo(valor, nome);
	}

}

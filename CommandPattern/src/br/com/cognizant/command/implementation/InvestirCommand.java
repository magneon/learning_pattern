package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Investimento;

public class InvestirCommand implements Command {
	
	private Investimento investimento;
	private String tipoInvestimento;
	private Double valor;

	public InvestirCommand(final Investimento investimento, final String tipoInvestimento, final Double valor) {
		this.investimento = investimento;
		this.tipoInvestimento = tipoInvestimento;
		this.valor = valor;
	}
	
	@Override
	public void execute() {
		this.investimento.investir(tipoInvestimento, valor);
	}

}

package br.com.cognizant.atmtest;

import br.com.cognizant.atm.ATM;
import br.com.cognizant.command.implementation.ConsultarExtratoCommand;
import br.com.cognizant.command.implementation.InvestirCommand;
import br.com.cognizant.command.implementation.SacarCommand;
import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Extrato;
import br.com.cognizant.operations.Investimento;
import br.com.cognizant.operations.Saque;

public class TerminalATM {
	public static void main(String[] args) {
		
		Extrato extratoOperacao = new Extrato();
		Saque saqueOperacao = new Saque();
		Investimento investimentoOperacao = new Investimento();
		
		Command consultarExtratoCommand = new ConsultarExtratoCommand(extratoOperacao);
		Command saqueCommand = new SacarCommand(saqueOperacao, "Rafael", 10.0);
		Command investirCommand = new InvestirCommand(investimentoOperacao, "Poupança", 10000.0);

		ATM atm = new ATM();		
		atm.iniciarATM();		
		atm.carregarOperacoes(consultarExtratoCommand);
		atm.carregarOperacoes(saqueCommand);
		atm.carregarOperacoes(investirCommand);
		atm.iniciarOperacao(0);
		atm.iniciarOperacao(1);
		atm.iniciarOperacao(2);
	}
}

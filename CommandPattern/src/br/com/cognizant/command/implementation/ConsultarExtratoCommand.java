package br.com.cognizant.command.implementation;

import br.com.cognizant.command.interfaces.Command;
import br.com.cognizant.operations.Extrato;

public class ConsultarExtratoCommand implements Command {
	private Extrato extrato;
	
	public ConsultarExtratoCommand(final Extrato extrato) {
		this.extrato = extrato;
	}

	@Override
	public void execute() {
		System.out.println(this.extrato.consultarExtrato());
	}

}

package br.com.cognizant.atm;

import br.com.cognizant.command.interfaces.Command;

public class ATM {
	
	/*
	Object [] operacoes;
	*/
	Command [] operacoes;
	Integer ultimoSlotVazio = 0;
	
	public void iniciarATM() {
		operacoes = new Command[3];
	}
	
	public void carregarOperacoes(Command command) {
		if (ultimoSlotVazio < 3 && operacoes[ultimoSlotVazio] == null) {
			operacoes[ultimoSlotVazio] = command;
			ultimoSlotVazio++;
		} else {
			if (ultimoSlotVazio == 3) {
				System.out.println("Não é possível inserir mais operações.");
			} else {
				ultimoSlotVazio++;
				carregarOperacoes(command);
			}
		}
	}
		
	/*
	public void iniciarOperacao(Integer operacao) {
		if (operacoes[operacao] instanceof CartaoCredito) {
			CartaoCredito cartaoCredito = (CartaoCredito)operacoes[operacao];
			
			System.out.println(cartaoCredito.comprarComCredito("Qualquer coisa", 10.0));
		} else if (operacoes[operacao] instanceof Deposito) {
			Deposito deposito = (Deposito)operacoes[operacao];
			
			deposito.depositarPara("Rafael", 10.0);
		} else if (operacoes[operacao] instanceof Emprestimo) {
			Emprestimo emprestimo = (Emprestimo)operacoes[operacao];
			
			emprestimo.solicitarEmprestimo(100.0, "Rafael");
		} else if (operacoes[operacao] instanceof Extrato) {
			Extrato extrato = (Extrato)operacoes[operacao];
			
			System.out.println(extrato.consultarExtrato());
		} else if (operacoes[operacao] instanceof Saque) {
			Saque saque = (Saque)operacoes[operacao];
			
			saque.sacar("Rafael", 100.5);
		} else if (operacoes[operacao] instanceof Transferencia) {
			Transferencia transferencia = (Transferencia)operacoes[operacao];
			
			transferencia.transferirPara("Rafael", 1000.0);
		} else if (operacoes[operacao] instanceof Investimento) {
			Investimento investimento = (Investimento)operacoes[operacao];
			
			investimento.investir("Poupança", 100000.0);
		}
	}
	*/
	
	public void iniciarOperacao(Integer operacao) {
		operacoes[operacao].execute();
	}
	
}

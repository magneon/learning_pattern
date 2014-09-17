package br.com.cognizant.test;

import br.com.cognizant.interfaces.TelefoneCelular;
import br.com.cognizant.interfaces.TelefoneFixo;
import br.com.cognizant.interfaces.implementation.IPhone;
import br.com.cognizant.interfaces.implementation.TelefoneCelularFixoAdapter;
import br.com.cognizant.interfaces.implementation.TelefoneFixoCelularAdapter;
import br.com.cognizant.interfaces.implementation.TelefoneFixoEmbratel;

public class Pessoa {
	
	public void utilizarTelefone(TelefoneFixo telefoneFixo) {
		telefoneFixo.pressionarTecla();
		telefoneFixo.discarComTecladoFisico();
		System.out.println("Desligando ligação...");
		System.out.println(telefoneFixo.tocarTelefone());
		System.out.println(telefoneFixo.atenderLigacaoTirandoDoGancho());
	}
	
	public void utilizarCelular(TelefoneCelular telefoneCelular) {
		telefoneCelular.tocarTecla();
		telefoneCelular.discarComTecladoVirtual();
		System.out.println("Desligando ligação...");
		System.out.println(telefoneCelular.tocarCelular());
		System.out.println(telefoneCelular.atenderLigacao());		
	}
	
	public static void main(String[] args) {
		/** Implementação normal de Telefone Fixo */
		TelefoneFixo telefone = new TelefoneFixoEmbratel();
		Pessoa pessoa = new Pessoa();
		pessoa.utilizarTelefone(telefone);
		
		System.out.println("\nUtilizando o celular... \n");
		
		/** Implementação normal de Telefone Celular */
		TelefoneCelular celular = new IPhone();
		pessoa.utilizarCelular(celular);
		
		System.out.println("\nUtilizando um fixo adaptado em celular...\n");
		
		/** Implementação de Telefone Fixo adaptado para Celular */
		TelefoneCelular celularAdapter = new TelefoneFixoCelularAdapter(telefone);
		pessoa.utilizarCelular(celularAdapter);
		
		System.out.println("\nUtilizando um celular adaptado em fixo...\n");
		
		/** Implementação de Telefone Celular adaptado para Fixo */
		TelefoneFixo telefoneAdapter = new TelefoneCelularFixoAdapter(celular);
		pessoa.utilizarTelefone(telefoneAdapter);
	}
}

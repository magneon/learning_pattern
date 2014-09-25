package br.com.cognizant.test;

import br.com.cognizant.component.Carro;
import br.com.cognizant.component.implementation.Cerato;
import br.com.cognizant.component.implementation.Corsa;
import br.com.cognizant.decorator.implementation.ArCondicionado;
import br.com.cognizant.decorator.implementation.CaboDeFreio;
import br.com.cognizant.decorator.implementation.CambioAutomatico;
import br.com.cognizant.decorator.implementation.FreioABS;
import br.com.cognizant.decorator.implementation.Valvula;
import br.com.cognizant.decorator.implementation.Vela;

public class Concessionaria {
	public static void main(String[] args) {
		
		/**
		 * Defini��o do carro Corsa com Decorator's limitados
		 */
		Carro corsa = new Corsa();		
		corsa = new Valvula(corsa);
		corsa = new Vela(corsa);
		corsa = new CaboDeFreio(corsa);
		corsa = new ArCondicionado(corsa);
		
		/**
		 * Defini��o do carro Cerato com Decorator's avan�ados
		 */
		Carro cerato = new Cerato();		
		cerato = new Valvula(cerato);
		cerato = new Vela(cerato);
		cerato = new CaboDeFreio(cerato);
		cerato = new FreioABS(cerato);
		cerato = new CambioAutomatico(cerato);
		cerato = new ArCondicionado(cerato);
		
		/**
		 * Impress�o do conte�do + pre�o do Corsa
		 */
		System.out.println(corsa.getNome() + ", pre�o: R$ " + corsa.getPreco());
		
		/**
		 * Impress�o do conte�do + pre�o do Cerato
		 */
		System.out.println(cerato.getNome() + ", pre�o: R$ " + cerato.getPreco());
		
	}
}

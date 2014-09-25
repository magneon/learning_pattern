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
		 * Definição do carro Corsa com Decorator's limitados
		 */
		Carro corsa = new Corsa();		
		corsa = new Valvula(corsa);
		corsa = new Vela(corsa);
		corsa = new CaboDeFreio(corsa);
		corsa = new ArCondicionado(corsa);
		
		/**
		 * Definição do carro Cerato com Decorator's avançados
		 */
		Carro cerato = new Cerato();		
		cerato = new Valvula(cerato);
		cerato = new Vela(cerato);
		cerato = new CaboDeFreio(cerato);
		cerato = new FreioABS(cerato);
		cerato = new CambioAutomatico(cerato);
		cerato = new ArCondicionado(cerato);
		
		/**
		 * Impressão do conteúdo + preço do Corsa
		 */
		System.out.println(corsa.getNome() + ", preço: R$ " + corsa.getPreco());
		
		/**
		 * Impressão do conteúdo + preço do Cerato
		 */
		System.out.println(cerato.getNome() + ", preço: R$ " + cerato.getPreco());
		
	}
}

package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeMochaBranco extends Bebida {

	@Override
	public String getNome() {
		return "Café Mocha Branco";
	}

	@Override
	public Double getPreco() {
		return 6.0;
	}

}

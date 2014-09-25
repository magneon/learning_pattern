package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeLatte extends Bebida {

	@Override
	public String getNome() {
		return "Café Latte";
	}

	@Override
	public Double getPreco() {
		return 3.50;
	}

}

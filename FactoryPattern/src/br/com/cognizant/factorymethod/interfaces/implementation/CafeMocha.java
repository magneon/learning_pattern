package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeMocha extends Bebida {

	@Override
	public String getNome() {
		return "Café Mocha ";
	}

	@Override
	public Double getPreco() {
		return 4.0;
	}

}

package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeMarshmallow extends Bebida {

	@Override
	public String getNome() {
		return "Café Marshmallow";
	}

	@Override
	public Double getPreco() {
		return 5.00;
	}

}

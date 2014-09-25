package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeExpresso extends Bebida {

	@Override
	public String getNome() {
		return "Café Expresso ";
	}

	@Override
	public Double getPreco() {
		return 3.0;
	}

}

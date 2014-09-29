package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;

public class CafeMachiatto extends Bebida {

	@Override
	public String getNome() {
		return "Caf� Machiatto";
	}

	@Override
	public Double getPreco() {
		return 4.20;
	}

}

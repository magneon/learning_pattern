package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeFactory;

public class FranzCafeFactory implements CafeFactory {

	@Override
	public Bebida criarCafe(String pedido) {
		if (pedido.equalsIgnoreCase("cafe latte")) {
			return new CafeLatte();
		} else if (pedido.equalsIgnoreCase("cafe machiatto")) {
			return new CafeMachiatto();
		} else if (pedido.equalsIgnoreCase("cafe marshmallow")) {
			return new CafeMarshmallow();
		} else {
			return null;
		}
	}

}

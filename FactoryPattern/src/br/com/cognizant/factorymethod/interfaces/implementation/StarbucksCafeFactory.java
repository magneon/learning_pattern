package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeFactory;

public class StarbucksCafeFactory implements CafeFactory {

	@Override
	public Bebida criarCafe(String pedido) {
		if (pedido.equalsIgnoreCase("mochabranco")) {
			return new CafeMochaBranco();
		} else if (pedido.equalsIgnoreCase("mocha")) {
			return new CafeMocha();
		} else if (pedido.equalsIgnoreCase("expresso")) {
			return new CafeExpresso();
		} else {
			return null;
		}
	}

}

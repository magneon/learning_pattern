package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class ChantillyDecorator extends CafeDecorator {
	
	public ChantillyDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Chantilly");
	}

	@Override
	public Double getPreco() {
		return 1.0 + this.bebida.getPreco();
	}

}

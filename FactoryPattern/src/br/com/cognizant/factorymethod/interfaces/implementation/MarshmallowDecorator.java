package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class MarshmallowDecorator extends CafeDecorator {
	
	public MarshmallowDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Marshmallow");
	}

	@Override
	public Double getPreco() {
		return 1.5 + this.bebida.getPreco();
	}

}

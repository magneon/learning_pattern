package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class MentaDecorator extends CafeDecorator {
	
	public MentaDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Menta");
	}

	@Override
	public Double getPreco() {
		return 0.5 + this.bebida.getPreco();
	}

}

package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class CremeDeAvelaDecorator extends CafeDecorator {
	
	public CremeDeAvelaDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Creme de Avelã");
	}

	@Override
	public Double getPreco() {
		return 2.0 + this.bebida.getPreco();
	}

}

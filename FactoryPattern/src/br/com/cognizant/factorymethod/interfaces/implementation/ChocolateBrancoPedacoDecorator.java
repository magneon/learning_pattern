package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class ChocolateBrancoPedacoDecorator extends CafeDecorator {
	
	public ChocolateBrancoPedacoDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Chocolate Branco Peda�os");
	}

	@Override
	public Double getPreco() {
		return 2.0 + this.bebida.getPreco();
	}

}

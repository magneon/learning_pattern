package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.CafeDecorator;

public class ChocolateLeitePedacoDecorator extends CafeDecorator {
	
	public ChocolateLeitePedacoDecorator(Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return this.bebida.getNome().concat(", Chocolate ao Leite Pedaço");
	}

	@Override
	public Double getPreco() {
		return 1.60 + this.bebida.getPreco();
	}

}

package br.com.cognizant.decorator.implementation;

import br.com.cognizant.component.Carro;
import br.com.cognizant.decorator.PecaDecorator;

public class ArCondicionado extends PecaDecorator {

	public ArCondicionado(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String getNome() {
		return this.carro.getNome().concat(", contém Ar Condicionado");
	}

	@Override
	public Double getPreco() {
		return 500.0 + this.carro.getPreco();
	}

	@Override
	public String getCor() {
		return this.cor;
	}

	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}

}

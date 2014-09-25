package br.com.cognizant.decorator.implementation;

import br.com.cognizant.component.Carro;
import br.com.cognizant.decorator.PecaDecorator;

public class CaboDeFreio extends PecaDecorator {
	
	public CaboDeFreio(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String getNome() {
		return this.carro.getNome().concat(" contém Cabo de Freio");
	}

	@Override
	public Double getPreco() {
		return 40.5 + this.carro.getPreco();
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

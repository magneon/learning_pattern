package br.com.cognizant.decorator.implementation;

import br.com.cognizant.component.Carro;
import br.com.cognizant.decorator.PecaDecorator;

public class FreioABS extends PecaDecorator {
	
	public FreioABS(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String getNome() {
		return this.carro.getNome().concat(" contém Freio ABS");
	}

	@Override
	public Double getPreco() {
		return 350.0 + this.carro.getPreco();
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

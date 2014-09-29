/**
 * 
 */
package br.com.cognizant.decorator.implementation;

import br.com.cognizant.component.Carro;
import br.com.cognizant.decorator.PecaDecorator;

/**
 * @author Atelier Photo
 *
 */
public class Vela extends PecaDecorator {
	
	public Vela(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String getNome() {
		return this.carro.getNome().concat(" contém Vela");
	}

	@Override
	public Double getPreco() {
		return 10.0 + this.carro.getPreco();
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

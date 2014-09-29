/**
 * 
 */
package br.com.cognizant.component.implementation;

import br.com.cognizant.component.Carro;

/**
 * @author Atelier Photo
 *
 */
public class Corsa extends Carro {

	@Override
	public String getNome() {
		return "Corsa";
	}

	@Override
	public Double getPreco() {
		return 15000.0;
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

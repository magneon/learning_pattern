/**
 * 
 */
package br.com.cognizant.interfaces.decorator;

import br.com.cognizant.interfaces.Bebida;
import br.com.cognizant.interfaces.BebidaDecorator;

/**
 * @author 414488
 *
 */
public class CanelaDecorator extends BebidaDecorator {
	
	public CanelaDecorator(final Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public Double calcularPrecoBebida() {
		return new Double("1.50") + this.bebida.calcularPrecoBebida();
	}

	@Override
	public String descreverProduto() {
		return this.bebida.descreverProduto().concat(", Canela");
	}

}

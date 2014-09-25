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
public class CremeDecorator extends BebidaDecorator {
	
	public CremeDecorator(final Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public Double calcularPrecoBebida() {
		return new Double("2.50") + this.bebida.calcularPrecoBebida();
	}

	@Override
	public String descreverProduto() {
		return this.bebida.descreverProduto().concat(", Creme");
	}

}

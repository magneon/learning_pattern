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
public class MarshmallowDecorator extends BebidaDecorator {
	
	public MarshmallowDecorator(final Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public Double calcularPrecoBebida() {
		return new Double("1.00") + this.bebida.calcularPrecoBebida();
	}

	@Override
	public String descreverProduto() {
		return this.bebida.descreverProduto().concat(", Marshmallow");
	}

}

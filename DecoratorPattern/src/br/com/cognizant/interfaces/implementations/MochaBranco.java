/**
 * 
 */
package br.com.cognizant.interfaces.implementations;

import br.com.cognizant.interfaces.Bebida;

/**
 * @author 414488
 *
 */
public class MochaBranco implements Bebida {

	@Override
	public Double calcularPrecoBebida() {
		return new Double("5.90");
	}

	@Override
	public String descreverProduto() {
		return new String("Café Mocha Branco");
	}

}

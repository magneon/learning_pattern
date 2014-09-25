/**
 * 
 */
package br.com.cognizant.interfaces.implementations;

import br.com.cognizant.interfaces.Bebida;

/**
 * @author 414488
 *
 */
public class Caramelizado implements Bebida {

	@Override
	public Double calcularPrecoBebida() {
		return new Double("4.50");
	}

	@Override
	public String descreverProduto() {
		return new String("Café Caramelizado");
	}

}

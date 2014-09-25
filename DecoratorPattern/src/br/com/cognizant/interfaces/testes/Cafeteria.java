/**
 * 
 */
package br.com.cognizant.interfaces.testes;

import br.com.cognizant.interfaces.Bebida;
import br.com.cognizant.interfaces.decorator.CanelaDecorator;
import br.com.cognizant.interfaces.decorator.CremeDecorator;
import br.com.cognizant.interfaces.decorator.MarshmallowDecorator;
import br.com.cognizant.interfaces.implementations.Caramelizado;
import br.com.cognizant.interfaces.implementations.MochaBranco;

/**
 * @author 414488
 *
 */
public class Cafeteria {
	
	public static void main(String[] args) {
		
		/** Criação de uma bebida Mocha Branco Decorator */
		Bebida mochaBranco = new MochaBranco();
		mochaBranco = new MarshmallowDecorator(mochaBranco);
		mochaBranco = new CremeDecorator(mochaBranco);
		mochaBranco = new CanelaDecorator(mochaBranco);
		
		/** Criação de uma bebida Caramelizada Decorator */
		Bebida caramelizado = new Caramelizado();
		caramelizado = new MarshmallowDecorator(caramelizado);
		caramelizado = new CremeDecorator(caramelizado);
		caramelizado = new CanelaDecorator(caramelizado);
		
		System.out.println(mochaBranco.descreverProduto() + ", preço: R$ " + String.format("%.2f", mochaBranco.calcularPrecoBebida()));
		System.out.println(caramelizado.descreverProduto() + ", preço: R$ " + String.format("%.2f", caramelizado.calcularPrecoBebida()));
		
	}
	
}

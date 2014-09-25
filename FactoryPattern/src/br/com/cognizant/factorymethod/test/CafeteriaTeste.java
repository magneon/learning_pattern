package br.com.cognizant.factorymethod.test;

import br.com.cognizant.factorymethod.interfaces.Bebida;
import br.com.cognizant.factorymethod.interfaces.Cafeteria;
import br.com.cognizant.factorymethod.interfaces.implementation.CremeDeAvelaDecorator;
import br.com.cognizant.factorymethod.interfaces.implementation.FranzCafe;
import br.com.cognizant.factorymethod.interfaces.implementation.FranzCafeFactory;
import br.com.cognizant.factorymethod.interfaces.implementation.MarshmallowDecorator;
import br.com.cognizant.factorymethod.interfaces.implementation.MentaDecorator;
import br.com.cognizant.factorymethod.interfaces.implementation.Starbucks;
import br.com.cognizant.factorymethod.interfaces.implementation.StarbucksCafeFactory;

public class CafeteriaTeste {
	public static void main(String[] args) {
		/** Definição da Cafeteria Starbucks */
		Cafeteria starbucks = new Starbucks(new StarbucksCafeFactory());		
		Bebida mochaBranco = starbucks.prepararCafe("mochabranco");
		mochaBranco = new MarshmallowDecorator(mochaBranco);
		mochaBranco = new MentaDecorator(mochaBranco);
		mochaBranco = new CremeDeAvelaDecorator(mochaBranco);
		
		System.out.println("Saindo um " + mochaBranco.getNome());
		System.out.println(starbucks.totalizarPedido(mochaBranco));
		
		/** Definição da Cafeteria Fran's Café */
		Cafeteria fransCafe = new FranzCafe(new FranzCafeFactory());		
		Bebida cafeMarshmallow = fransCafe.prepararCafe("cafe marshmallow");
		cafeMarshmallow = new MarshmallowDecorator(cafeMarshmallow);
		cafeMarshmallow = new MentaDecorator(cafeMarshmallow);
		cafeMarshmallow = new CremeDeAvelaDecorator(cafeMarshmallow);
		
		System.out.println("Saindo um " + cafeMarshmallow.getNome());
		System.out.println(fransCafe.totalizarPedido(cafeMarshmallow));
	}
}

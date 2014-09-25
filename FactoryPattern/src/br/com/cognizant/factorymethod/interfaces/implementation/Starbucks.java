package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.CafeFactory;
import br.com.cognizant.factorymethod.interfaces.Cafeteria;

public class Starbucks extends Cafeteria {
	
	public Starbucks(CafeFactory cafeFactory) {
		this.cafeFactory = cafeFactory;
	}
	
}

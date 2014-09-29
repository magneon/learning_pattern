package br.com.cognizant.factorymethod.interfaces.implementation;

import br.com.cognizant.factorymethod.interfaces.CafeFactory;
import br.com.cognizant.factorymethod.interfaces.Cafeteria;

public class FranzCafe extends Cafeteria {
	
	public FranzCafe(CafeFactory cafeFactory) {
		this.cafeFactory = cafeFactory;
	}

}

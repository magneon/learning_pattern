package br.com.cognizant.interfaces.composite;

import br.com.cognizant.interfaces.MenuComponent;

public class Garconete {

	private MenuComponent menuComponent;
	
	public Garconete(final MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}
	
	public void imprimirMenu() {
		this.menuComponent.imprimir();
	}
	
}

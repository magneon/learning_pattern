package br.com.cognizant.factorymethod.interfaces;

public interface CafeFactory {
	
	Bebida criarCafe(String pedido);
	
}

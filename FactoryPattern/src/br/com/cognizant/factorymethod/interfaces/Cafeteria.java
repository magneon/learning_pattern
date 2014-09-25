package br.com.cognizant.factorymethod.interfaces;

public abstract class Cafeteria {
	
	protected CafeFactory cafeFactory;
	
	public final Bebida prepararCafe(String pedido) {
		Bebida bebida = this.cafeFactory.criarCafe(pedido);
		
		System.out.println("Preparando a base do café " + bebida.getNome());
		
		return bebida;
	}
	
	public final String totalizarPedido(Bebida bebida) {
		return "Total do pedido: " + bebida.getPreco();
	}
	
}

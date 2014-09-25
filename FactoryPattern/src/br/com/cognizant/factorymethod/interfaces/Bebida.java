package br.com.cognizant.factorymethod.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {
	
	private String nome;
	
	private Double preco;	
	
	private List<Bebida> listaDeIngredientes;
	
	public abstract String getNome();
	
	public abstract Double getPreco();	
	
	public final List<String> getIngredientes() {
		List<String> ingredientes = new ArrayList<String>();
		
		for (Bebida bebida : listaDeIngredientes) {
			ingredientes.add(bebida.getNome());
		}
		
		return ingredientes;
	}
}

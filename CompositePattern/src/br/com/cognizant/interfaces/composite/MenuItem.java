package br.com.cognizant.interfaces.composite;

import br.com.cognizant.interfaces.MenuComponent;

public class MenuItem extends MenuComponent {
	
	private String nome;
	
	private Double preco;
	
	private Boolean vegetariano;
	
	public MenuItem(final String nome, final Double preco, final Boolean vegetariano) {
		this.nome = nome;
		this.preco = preco;
		this.vegetariano = vegetariano;
	}
	
	@Override
	public String getNome() {	
		return this.nome;
	}
	
	@Override
	public Double getPreco() {
		return this.preco;
	}
	
	@Override
	public Boolean isVegetariano() {
		return this.vegetariano;
	}
	
	@Override
	public void imprimir() {
		System.out.print("    # " + this.getNome());

		if (isVegetariano()) {
			System.out.print(" [V]");
		}
		
		System.out.printf("%s%.2f\n"," ---- R$ ",this.getPreco());
		
	}
	
}

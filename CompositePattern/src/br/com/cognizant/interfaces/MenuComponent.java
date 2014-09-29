package br.com.cognizant.interfaces;

public abstract class MenuComponent {

	public String getNome() {
		throw new UnsupportedOperationException();
	}
	
	public Double getPreco() {
		throw new UnsupportedOperationException();
	}
	
	public Boolean isVegetariano() {
		throw new UnsupportedOperationException();
	}
	
	public void adicionar(MenuComponent menuComponente) {
		throw new UnsupportedOperationException();
	}
	
	public void remover (MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void imprimir() {
		throw new UnsupportedOperationException();
	}
}

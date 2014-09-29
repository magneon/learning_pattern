/**
 * 
 */
package br.com.cognizant.interfaces.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.cognizant.interfaces.MenuComponent;

/**
 * @author 414488
 *
 */
public class Menu extends MenuComponent {
	
	private List<MenuComponent> menus = new ArrayList<MenuComponent>();
	private String nome;
	
	public Menu(final String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public void adicionar(MenuComponent menuComponente) {
		menus.add(menuComponente);
	}
	
	@Override
	public void remover(MenuComponent menuComponent) {
		menus.remove(menuComponent);
	}
	
	@Override
	public void imprimir() {
		System.out.print("Menu: " + this.getNome() + "\n");
		
		Iterator<MenuComponent> iterator = menus.iterator();
		
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.imprimir();
		}
	}
}

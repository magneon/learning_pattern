package br.com.cognizant.interfaces.composite.test;

import br.com.cognizant.interfaces.MenuComponent;
import br.com.cognizant.interfaces.composite.Garconete;
import br.com.cognizant.interfaces.composite.Menu;
import br.com.cognizant.interfaces.composite.MenuItem;

public class MenusTestDrive {

	public static void main(String[] args) {
		
		/* Criação dos menus individuais */
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
		
		MenuComponent dinerMenu = new Menu("DINNER MENU");
		
		MenuComponent cafeMenu = new Menu("CAFE MENU");
		
		/* Criação do agrupamento de menus */
		MenuComponent menus = new Menu("TODOS OS MENUS");
		
		/* Inclusão dos menus no agrupamento de menus */
		menus.adicionar(pancakeHouseMenu);
		menus.adicionar(dinerMenu);
		menus.adicionar(cafeMenu);
		
		/* Criação dos itens de menu para cada menu */
		pancakeHouseMenu.adicionar(new MenuItem("Panqueca caseira", 2.99, true));
		pancakeHouseMenu.adicionar(new MenuItem("Panqueca de carne", 3.99, false));
		
		dinerMenu.adicionar(new MenuItem("X burger", 4.99, false));
		dinerMenu.adicionar(new MenuItem("X salada", 3.99, false));
		
		cafeMenu.adicionar(new MenuItem("Café pequeno", 0.99, true));
		cafeMenu.adicionar(new MenuItem("Café com creme médio", 1.99, true));
		
		/* Criação do submenu do restaurante */
		MenuComponent dessertMenu = new Menu("SOBREMESAS");
		
		/* Criação dos itens de menu do submenu */
		dessertMenu.adicionar(new MenuItem("Pavê", 4.99, false));
		dessertMenu.adicionar(new MenuItem("Torta Holandesa", 6.99, false));
		dessertMenu.adicionar(new MenuItem("Torta de Maçã", 1.99, false));
		dessertMenu.adicionar(new MenuItem("Gelatina", 0.50, false));
		
		/* Atribuição do submenu ao menu do restaurante */
		dinerMenu.adicionar(dessertMenu);
		
		/* Criação do cliente dos menus [Garçonete] */
		Garconete garconete = new Garconete(menus);
		garconete.imprimirMenu();
	}
	
}

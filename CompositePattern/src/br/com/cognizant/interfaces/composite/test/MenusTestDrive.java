package br.com.cognizant.interfaces.composite.test;

import br.com.cognizant.interfaces.MenuComponent;
import br.com.cognizant.interfaces.composite.Garconete;
import br.com.cognizant.interfaces.composite.Menu;
import br.com.cognizant.interfaces.composite.MenuItem;

public class MenusTestDrive {

	public static void main(String[] args) {
		
		/* Cria��o dos menus individuais */
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
		
		MenuComponent dinerMenu = new Menu("DINNER MENU");
		
		MenuComponent cafeMenu = new Menu("CAFE MENU");
		
		/* Cria��o do agrupamento de menus */
		MenuComponent menus = new Menu("TODOS OS MENUS");
		
		/* Inclus�o dos menus no agrupamento de menus */
		menus.adicionar(pancakeHouseMenu);
		menus.adicionar(dinerMenu);
		menus.adicionar(cafeMenu);
		
		/* Cria��o dos itens de menu para cada menu */
		pancakeHouseMenu.adicionar(new MenuItem("Panqueca caseira", 2.99, true));
		pancakeHouseMenu.adicionar(new MenuItem("Panqueca de carne", 3.99, false));
		
		dinerMenu.adicionar(new MenuItem("X burger", 4.99, false));
		dinerMenu.adicionar(new MenuItem("X salada", 3.99, false));
		
		cafeMenu.adicionar(new MenuItem("Caf� pequeno", 0.99, true));
		cafeMenu.adicionar(new MenuItem("Caf� com creme m�dio", 1.99, true));
		
		/* Cria��o do submenu do restaurante */
		MenuComponent dessertMenu = new Menu("SOBREMESAS");
		
		/* Cria��o dos itens de menu do submenu */
		dessertMenu.adicionar(new MenuItem("Pav�", 4.99, false));
		dessertMenu.adicionar(new MenuItem("Torta Holandesa", 6.99, false));
		dessertMenu.adicionar(new MenuItem("Torta de Ma��", 1.99, false));
		dessertMenu.adicionar(new MenuItem("Gelatina", 0.50, false));
		
		/* Atribui��o do submenu ao menu do restaurante */
		dinerMenu.adicionar(dessertMenu);
		
		/* Cria��o do cliente dos menus [Gar�onete] */
		Garconete garconete = new Garconete(menus);
		garconete.imprimirMenu();
	}
	
}

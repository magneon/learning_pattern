package br.com.cognizant.singleton;

public class Presidente {
	private static Presidente presidente;
	
	private Presidente() {
		System.out.println("Instanciando um Presidente... ");
	}
	
	public static synchronized Presidente getInstance() {
		if (presidente == null) {
			presidente = new Presidente();
		}
		
		return presidente;
	}
}

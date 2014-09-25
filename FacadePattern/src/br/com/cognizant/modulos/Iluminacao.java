package br.com.cognizant.modulos;

public class Iluminacao {
	private Integer iluminacao = new Integer("100");
	
	public void ligarLuz() {
		System.out.println("Ligando ilumina��o...");
		this.iluminacao = new Integer("100");
	}
	
	public void baixarIluminacao(Integer valor) {
		this.iluminacao -= valor;
		System.out.println("Baixando a ilumina��o em " + valor + " %, novo valor da ilumina��o " + this.iluminacao);
	}
	
	public void aumentarIluminacao(Integer valor) {
		this.iluminacao += valor;
		System.out.println("Aumentando a ilumina��o em " + valor + " %, novo valor da ilumina��o " + this.iluminacao);
	}
	
	public void desligarLuz() {
		System.out.println("Desligando iluminacao...");
		this.iluminacao = new Integer("0");
	}
	
}

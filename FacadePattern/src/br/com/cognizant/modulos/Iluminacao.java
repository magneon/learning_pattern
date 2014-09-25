package br.com.cognizant.modulos;

public class Iluminacao {
	private Integer iluminacao = new Integer("100");
	
	public void ligarLuz() {
		System.out.println("Ligando iluminação...");
		this.iluminacao = new Integer("100");
	}
	
	public void baixarIluminacao(Integer valor) {
		this.iluminacao -= valor;
		System.out.println("Baixando a iluminação em " + valor + " %, novo valor da iluminação " + this.iluminacao);
	}
	
	public void aumentarIluminacao(Integer valor) {
		this.iluminacao += valor;
		System.out.println("Aumentando a iluminação em " + valor + " %, novo valor da iluminação " + this.iluminacao);
	}
	
	public void desligarLuz() {
		System.out.println("Desligando iluminacao...");
		this.iluminacao = new Integer("0");
	}
	
}

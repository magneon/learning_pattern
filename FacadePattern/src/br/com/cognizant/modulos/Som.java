package br.com.cognizant.modulos;

public class Som {
	
	private Integer volume;
	
	public void ligarSom() {
		System.out.println("Ligando som...");
	}
	
	public void conectarPendrive() {
		System.out.println("Conectando dispositivo de músicas pendrive...");
	}
	
	public void aumentarVolume(Integer valor) {
		this.volume = valor;
		System.out.println("Aumentando volume para " + this.volume + " decibéis...");
	}
	
	public void diminuirVolume(Integer valor) {
		this.volume -= valor;
		System.out.println("Diminuindo " + valor + " decibéis do volume atual. Volume novo " + volume);
	}
	
	public void desconectarPendrive() {
		System.out.println("Desconectando dispositivo de músicas pendrive...");
	}
	
	public void desligarSom() {
		System.out.println("Desligando som...");
	}
}

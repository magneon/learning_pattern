package br.com.cognizant.operations;

public class Deposito {
	
	public void depositarPara(String nome, Double valor) {
		if (nome != null && valor > 0) {
			System.out.println("Dep�sito realizado com sucesso!");
		} else {
			System.out.println("Falha ao realizar dep�sito!");
		}
	}
	
}

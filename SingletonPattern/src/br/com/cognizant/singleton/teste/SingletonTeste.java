package br.com.cognizant.singleton.teste;

import br.com.cognizant.singleton.Presidente;



public class SingletonTeste {
	public static void main(String[] args) {
		while(true) {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					Presidente.getInstance();
				}
				
			});
			
			thread.start();
		}
	}
}

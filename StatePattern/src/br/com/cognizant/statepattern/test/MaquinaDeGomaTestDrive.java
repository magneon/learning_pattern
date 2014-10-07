package br.com.cognizant.statepattern.test;

import br.com.cognizant.statepattern.old.MaquinaDeGoma;

public class MaquinaDeGomaTestDrive {
	
	public static void main(String[] args) {
		
		MaquinaDeGoma maquinaDeGoma = new MaquinaDeGoma(10);		
		System.out.println(maquinaDeGoma);		
		
		/** Testando os estados da máquina independentemente		
		maquinaDeGoma.inserirMoeda();		
		System.out.println(maquinaDeGoma);
		
		maquinaDeGoma.ejetarMoeda();		
		System.out.println(maquinaDeGoma);
		
		maquinaDeGoma.puxarAlavanca();		
		System.out.println(maquinaDeGoma);
		
		maquinaDeGoma.dispensarGoma();		
		System.out.println(maquinaDeGoma);
		 */
		
		/** Testando comportamento ideal do sistema 
		maquinaDeGoma.inserirMoeda();		
		maquinaDeGoma.puxarAlavanca();		
		System.out.println(maquinaDeGoma);
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.ejetarMoeda();
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.ejetarMoeda();
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		*/
		
		/** Testando o jogo */
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		maquinaDeGoma.inserirMoeda();
		maquinaDeGoma.puxarAlavanca();
		
		System.out.println(maquinaDeGoma);
	}
	
}

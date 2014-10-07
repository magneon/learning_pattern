package br.com.cognizant.statepattern.test;

import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class MaquinaDeGomaNovaTestDrive {

	public static void main(String[] args) {
		
		MaquinaDeGomaNova maquinaNova = new MaquinaDeGomaNova(10);
		System.out.println(maquinaNova);
		
		maquinaNova.inserirMoeda();		
		System.out.println(maquinaNova);
		
		maquinaNova.inserirMoeda();
		System.out.println(maquinaNova);
		
		maquinaNova.ejetarMoeda();
		System.out.println(maquinaNova);
		
		maquinaNova.inserirMoeda();
		System.out.println(maquinaNova);
		
		maquinaNova.puxarAlavanca();
		System.out.println(maquinaNova);
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();
		
		maquinaNova.inserirMoeda();
		maquinaNova.puxarAlavanca();		
	}
	
}

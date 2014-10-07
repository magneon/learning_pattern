package br.com.cognizant.statepattern.states;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class EsgotadoState extends State {
	private MaquinaDeGomaNova maquinaDeGomaNova;
	
	public EsgotadoState(final MaquinaDeGomaNova maquinaDeGomaNova) {
		this.maquinaDeGomaNova = maquinaDeGomaNova;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Não é possível inserir moedas, pois a máquina está vazia!");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Não é possível ejetar moedas, pois a máquina está vazia!");
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("Não é possível acionar a alavanca, pois a máquina está vazia!");
	}

	@Override
	public void dispensarGoma() {
		System.out.println("Não é possível dispensar gomas, pois a máquina está vazia!");
	}

	@Override
	public String toString() {
		return "ESGOTADO";
	}
	
}

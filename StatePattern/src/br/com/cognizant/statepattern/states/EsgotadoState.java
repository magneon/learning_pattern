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
		System.out.println("N�o � poss�vel inserir moedas, pois a m�quina est� vazia!");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("N�o � poss�vel ejetar moedas, pois a m�quina est� vazia!");
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("N�o � poss�vel acionar a alavanca, pois a m�quina est� vazia!");
	}

	@Override
	public void dispensarGoma() {
		System.out.println("N�o � poss�vel dispensar gomas, pois a m�quina est� vazia!");
	}

	@Override
	public String toString() {
		return "ESGOTADO";
	}
	
}

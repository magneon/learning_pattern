package br.com.cognizant.statepattern.states;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class SemMoedaState extends State {

	private MaquinaDeGomaNova maquinaDeGomaNova;
	
	public SemMoedaState(final MaquinaDeGomaNova maquinaDeGomaNova) {
		this.maquinaDeGomaNova = maquinaDeGomaNova;
	}
	
	@Override
	public void inserirMoeda() {
		System.out.println("Inserindo a moeda...");
		this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getComMoedaState());
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("N�o � poss�vel remover uma moeda que n�o foi inserida!");
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("N�o � poss�vel acionar a alavanca sem moedas!");
	}

	@Override
	public void dispensarGoma() {
		System.out.println("N�o � poss�vel receber gomas sem pagar!");
	}
	
	@Override
	public String toString() {
		return "SEM MOEDAS";
	}

}

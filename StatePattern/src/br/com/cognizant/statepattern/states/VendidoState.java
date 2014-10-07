package br.com.cognizant.statepattern.states;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class VendidoState extends State {
	
	private MaquinaDeGomaNova maquinaDeGomaNova;
	
	public VendidoState(final MaquinaDeGomaNova maquinaDeGomaNova) {
		this.maquinaDeGomaNova = maquinaDeGomaNova;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Aguarde... sua goma está saindo...");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Não é possível devolver a moeda depois que a alavanca foi acionada...");
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("Acionar a alavanca duas vezes não lhe garante duas gomas...");
	}

	@Override
	public void dispensarGoma() {	
		Integer quantidadeDeGomas = this.maquinaDeGomaNova.getQuantidadeDeGomas();
		
		System.out.println("Dispensando goma...");
		quantidadeDeGomas = quantidadeDeGomas - 1;
		this.maquinaDeGomaNova.setQuantidadeDeGomas(quantidadeDeGomas);

		if (quantidadeDeGomas > 0) {
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getSemMoedaState());
			System.out.println("Quantidade de gomas atual: " + this.maquinaDeGomaNova.getQuantidadeDeGomas());
		} else {
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getEsgotadoState());
		}
	}
	
	@Override
	public String toString() {
		return "VENDIDO";
	}
}

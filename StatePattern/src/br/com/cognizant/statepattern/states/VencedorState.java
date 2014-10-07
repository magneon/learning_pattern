package br.com.cognizant.statepattern.states;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class VencedorState extends State {
	private MaquinaDeGomaNova maquinaDeGomaNova;
	
	public VencedorState(final MaquinaDeGomaNova maquinaDeGomaNova) {
		this.maquinaDeGomaNova = maquinaDeGomaNova;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Não é possível inserir moedas, sua goma extra está chegando...");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Não é possível ejetar moedas, sua goma extra está chegando...");
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("Não é possível acionar a alavanca, sua goma extra está chegando...");
	}

	@Override
	public void dispensarGoma() {
		System.out.println("Dispensando goma extra...");
		Integer quantidadeDeGomas = this.maquinaDeGomaNova.getQuantidadeDeGomas();
		
		quantidadeDeGomas = quantidadeDeGomas - 1;
		this.maquinaDeGomaNova.setQuantidadeDeGomas(quantidadeDeGomas);
		
		if (this.maquinaDeGomaNova.getQuantidadeDeGomas() > 0) {
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getSemMoedaState());
			System.out.println("Quantidade de gomas atual: " + this.maquinaDeGomaNova.getQuantidadeDeGomas());
		} else {
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getEsgotadoState());
		}
	}

}

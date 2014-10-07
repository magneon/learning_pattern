package br.com.cognizant.statepattern.states;

import java.util.Random;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.old.MaquinaDeGomaNova;

public class ComMoedaState extends State {
	
	private MaquinaDeGomaNova maquinaDeGomaNova;
	private Random numeroRandomico = new Random(System.currentTimeMillis());
	
	public ComMoedaState(final MaquinaDeGomaNova maquinaDeGomaNova) {
		this.maquinaDeGomaNova = maquinaDeGomaNova;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Não é possível inserir duas moedas...");
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Ejetando moeda...");
		this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getSemMoedaState());
	}

	@Override
	public void puxarAlavanca() {
		System.out.println("Acionando a alavanca...");
		Integer numeroAleatorio = numeroRandomico.nextInt(10);
		
		if ((numeroAleatorio == 0) && (this.maquinaDeGomaNova.getQuantidadeDeGomas() > 1)) {
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getVencedorState());
		} else {		
			this.maquinaDeGomaNova.setEstadoAtual(this.maquinaDeGomaNova.getVendidoState());
		}
	}

	@Override
	public void dispensarGoma() {
		System.out.println("Para receber a goma, acione a alavanca...");
	}
	
	@Override
	public String toString() {
		return "COM MOEDAS";
	}

}

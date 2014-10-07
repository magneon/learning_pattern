package br.com.cognizant.statepattern.old;

import br.com.cognizant.statepattern.interfaces.State;
import br.com.cognizant.statepattern.states.ComMoedaState;
import br.com.cognizant.statepattern.states.EsgotadoState;
import br.com.cognizant.statepattern.states.SemMoedaState;
import br.com.cognizant.statepattern.states.VencedorState;
import br.com.cognizant.statepattern.states.VendidoState;

public class MaquinaDeGomaNova {

	private State esgotadoState;
	
	private State semMoedaState;
	
	private State comMoedaState;
	
	private State vendidoState;
	
	private State vencedorState;
	
	private State estadoAtual;
	
	private Integer quantidadeDeGomas;
	
	public MaquinaDeGomaNova(final Integer quantidadeDeGomasIniciais) {
		this.quantidadeDeGomas = quantidadeDeGomasIniciais;
		
		esgotadoState = new EsgotadoState(this);
		semMoedaState = new SemMoedaState(this);
		comMoedaState = new ComMoedaState(this);
		vendidoState = new VendidoState(this);
		vencedorState = new VencedorState(this);
		estadoAtual = semMoedaState;
	}

	public State getEsgotadoState() {
		return esgotadoState;
	}

	public void setEsgotadoState(State esgotadoState) {
		this.esgotadoState = esgotadoState;
	}

	public State getSemMoedaState() {
		return semMoedaState;
	}

	public void setSemMoedaState(State semMoedaState) {
		this.semMoedaState = semMoedaState;
	}

	public State getComMoedaState() {
		return comMoedaState;
	}

	public void setComMoedaState(State comMoedaState) {
		this.comMoedaState = comMoedaState;
	}

	public State getVendidoState() {
		return vendidoState;
	}

	public void setVendidoState(State vendidoState) {
		this.vendidoState = vendidoState;
	}

	public State getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public Integer getQuantidadeDeGomas() {
		return quantidadeDeGomas;
	}

	public void setQuantidadeDeGomas(Integer quantidadeDeGomas) {
		this.quantidadeDeGomas = quantidadeDeGomas;
	}
	
	public State getVencedorState() {
		return vencedorState;
	}

	public void setVencedorState(State vencedorState) {
		this.vencedorState = vencedorState;
	}

	public void inserirMoeda() {
		this.estadoAtual.inserirMoeda();
	}
	
	public void ejetarMoeda() {
		this.estadoAtual.ejetarMoeda();
	}
	
	public void puxarAlavanca() {
		this.estadoAtual.puxarAlavanca();
		this.estadoAtual.dispensarGoma();
	}
	
	@Override
	public String toString() {
		return this.estadoAtual.toString();
	}
}

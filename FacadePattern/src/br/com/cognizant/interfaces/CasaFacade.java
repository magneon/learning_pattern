package br.com.cognizant.interfaces;

import br.com.cognizant.modulos.Cama;
import br.com.cognizant.modulos.Hidromassagem;
import br.com.cognizant.modulos.Iluminacao;
import br.com.cognizant.modulos.Notebook;
import br.com.cognizant.modulos.Som;

public class CasaFacade {
	private Iluminacao iluminacao;
	private Hidromassagem hidromassagem;
	private Som som;
	private Cama cama;
	private Notebook notebook;

	public CasaFacade(final Iluminacao iluminacao, final Hidromassagem hidromassagem, final Som som, final Cama cama, final Notebook notebook) {
		this.iluminacao = iluminacao;
		this.hidromassagem = hidromassagem;
		this.som = som;
		this.cama = cama;
		this.notebook = notebook;
	}
	
	public void ligarModulos() {
		this.iluminacao.ligarLuz();
		this.iluminacao.baixarIluminacao(80);
		
		this.hidromassagem.encher();
		this.hidromassagem.dissiparEspuma();
		this.hidromassagem.ligarHidromassagem();
		
		this.som.ligarSom();
		this.som.conectarPendrive();
		this.som.aumentarVolume(60);
		
		this.cama.aquecerCama();
		
		this.notebook.ligar();
	}
	
	public void desligarModulos() {
		this.iluminacao.aumentarIluminacao(80);
		
		this.hidromassagem.desligarHidromassagem();
		this.hidromassagem.esvaziarHidro();
		
		this.som.desconectarPendrive();
		this.som.desligarSom();
	}
	
}

package br.com.cognizant.modulos.teste;

import br.com.cognizant.interfaces.CasaFacade;
import br.com.cognizant.modulos.Cama;
import br.com.cognizant.modulos.Hidromassagem;
import br.com.cognizant.modulos.Iluminacao;
import br.com.cognizant.modulos.Notebook;
import br.com.cognizant.modulos.Som;

public class Casa {
	
	public static void main(String[] args) {
		
		/** Criando as instâncias automatizadas */
		System.out.println("Chegando em casa... \n");
		Cama cama = new Cama();
		Hidromassagem hidromassagem = new Hidromassagem();
		Iluminacao iluminacao = new Iluminacao();
		Notebook notebook = new Notebook();
		Som som = new Som();
		
		/** Preparando a iluminação 
		iluminacao.ligarLuz();
		iluminacao.baixarIluminacao(80);
		*/
		
		/** Preparando a hidromassagem 
		hidromassagem.encher();
		hidromassagem.dissiparEspuma();
		hidromassagem.ligarHidromassagem();
		*/
		
		/** Preparando o som 
		som.ligarSom();
		som.conectarPendrive();
		som.aumentarVolume(70);
		*/
		
		/** Preparando a cama 
		cama.aquecerCama();
		*/
		
		/** Preparando o notebook 
		notebook.ligar();
		*/
		
		//System.out.println("\n30 minutos depois...\n");
		
		/** Depois do banho voltar a iluminação ao ideal 
		iluminacao.aumentarIluminacao(80);
		*/
		
		/** Desligar a hidromassagem 
		hidromassagem.desligarHidromassagem();
		hidromassagem.esvaziarHidro();
		*/
		
		/** Desligar o som 
		som.desconectarPendrive();
		som.desligarSom();
		*/
		
		/** Controlando módulos pelo padrão fachada */
		CasaFacade casaAutomatizada = new CasaFacade(iluminacao, hidromassagem, som, cama, notebook);
		casaAutomatizada.ligarModulos();
		System.out.println("\n30 minutos depois...\n");
		casaAutomatizada.desligarModulos();
	}
	
}

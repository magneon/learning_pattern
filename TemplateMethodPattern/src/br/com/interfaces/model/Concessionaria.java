package br.com.interfaces.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "concessionaria")
public class Concessionaria {
	
	private List<Carro> listaDeCarros;

	/**
	 * @return the listaDeCarros
	 */
	@XmlElement(name = "carros")
	public List<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	/**
	 * @param listaDeCarros the listaDeCarros to set
	 */
	public void setListaDeCarros(List<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}
	
	
	
}

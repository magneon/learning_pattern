package br.com.interfaces.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "carro")
public class Carro {
	private String marca;
	private String modelo;
	private String cor;	
	private Double preco;	
	private Integer quantidadePortas;

	/**
	 * @return the marca
	 */
	@XmlElement(name = "montadora")
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	@XmlElement(name = "modelo")
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the cor
	 */
	@XmlElement(name = "coloracao")
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the preco
	 */
	@XmlElement(name = "valor")
	public Double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/**
	 * @return the quantidadePortas
	 */
	@XmlElement(name = "qtdPortas")
	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	/**
	 * @param quantidadePortas the quantidadePortas to set
	 */
	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}	
}

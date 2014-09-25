/**
 * 
 */
package br.com.cognizant.component;

/**
 * @author Atelier Photo
 *
 */
public abstract class Carro {
	
	protected String nome;
	
	protected Double preco;
	
	protected String cor;
	
	public abstract String getNome();
	
	public abstract Double getPreco();
	
	public abstract String getCor();
	
	public abstract void setCor(String cor);

}

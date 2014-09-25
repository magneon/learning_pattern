/**
 * 
 */
package br.com.cognizant.interfaces;

/**
 * @author 414488
 *
 */
public interface TelefoneFixo {

	/**
	 * Pressionar tecla.
	 *
	 * @return true, if successful
	 */
	public boolean pressionarTecla();
	
	/**
	 * Discar com teclado fisico.
	 */
	public void discarComTecladoFisico();
	
	/**
	 * Atender ligacao tirando do gancho.
	 *
	 * @return the string
	 */
	public String atenderLigacaoTirandoDoGancho();
	
	/**
	 * Tocar telefone.
	 *
	 * @return the string
	 */
	public String tocarTelefone();
	
}

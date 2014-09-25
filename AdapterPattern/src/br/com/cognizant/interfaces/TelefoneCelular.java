/**
 * 
 */
package br.com.cognizant.interfaces;

/**
 * @author 414488
 *
 */
public interface TelefoneCelular {
	
	/**
	 * Tocar tecla.
	 *
	 * @return true, if successful
	 */
	public boolean tocarTecla();
	
	/**
	 * Discar com teclado virtual.
	 */
	public void discarComTecladoVirtual();
	
	/**
	 * Atender ligacao.
	 *
	 * @return the string
	 */
	public String atenderLigacao();
	
	/**
	 * Tocar celular.
	 *
	 * @return the string
	 */
	public String tocarCelular();
	
	/**
	 * Enviar sms.
	 *
	 * @return true, if successful
	 * @throws UnsupportedOperationException the unsupported operation exception
	 */
	public boolean enviarSMS() throws UnsupportedOperationException;
	
	/**
	 * Enviar mms.
	 *
	 * @return true, if successful
	 * @throws UnsupportedOperationException the unsupported operation exception
	 */
	public boolean enviarMMS() throws UnsupportedOperationException;
	
	/**
	 * Tirar foto.
	 *
	 * @return true, if successful
	 * @throws UnsupportedOperationException the unsupported operation exception
	 */
	public boolean tirarFoto() throws UnsupportedOperationException;

}

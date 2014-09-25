/**
 * 
 */
package br.com.cognizant.interfaces.implementation;

import br.com.cognizant.interfaces.TelefoneCelular;

/**
 * @author 414488
 *
 */
public class IPhone implements TelefoneCelular {

	@Override
	public boolean tocarTecla() {
		return false;
	}

	@Override
	public void discarComTecladoVirtual() {
		System.out.println("Discando com o teclado virtual...");
	}

	@Override
	public String atenderLigacao() {
		return "Atendendo ligação...";
	}

	@Override
	public String tocarCelular() {
		return "Tocando...";
	}

	@Override
	public boolean enviarSMS() {
		return true;
	}

	@Override
	public boolean enviarMMS() {
		return true;
	}

	@Override
	public boolean tirarFoto() {
		return true;
	}

}

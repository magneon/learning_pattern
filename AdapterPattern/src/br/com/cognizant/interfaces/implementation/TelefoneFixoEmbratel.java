/**
 * 
 */
package br.com.cognizant.interfaces.implementation;

import br.com.cognizant.interfaces.TelefoneFixo;

/**
 * @author 414488
 *
 */
public class TelefoneFixoEmbratel implements TelefoneFixo {

	@Override
	public boolean pressionarTecla() {
		return false;
	}

	@Override
	public void discarComTecladoFisico() {
		System.out.println("Discando com teclado físico...");
	}

	@Override
	public String atenderLigacaoTirandoDoGancho() {
		return "Atendendo ligação, puxando telefone do ganho...";
	}

	@Override
	public String tocarTelefone() {
		return "Telefone tocando...";
	}

}

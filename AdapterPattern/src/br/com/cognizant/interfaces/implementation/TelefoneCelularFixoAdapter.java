/**
 * 
 */
package br.com.cognizant.interfaces.implementation;

import br.com.cognizant.interfaces.TelefoneCelular;
import br.com.cognizant.interfaces.TelefoneFixo;

/**
 * @author 414488
 *
 */
public class TelefoneCelularFixoAdapter implements TelefoneFixo {
	
	private TelefoneCelular telefoneCelular;
	
	public TelefoneCelularFixoAdapter(TelefoneCelular telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	@Override
	public boolean pressionarTecla() {
		return this.telefoneCelular.tocarTecla();
	}

	@Override
	public void discarComTecladoFisico() {
		this.telefoneCelular.discarComTecladoVirtual();
	}

	@Override
	public String atenderLigacaoTirandoDoGancho() {
		return this.telefoneCelular.atenderLigacao();
	}

	@Override
	public String tocarTelefone() {
		return this.telefoneCelular.tocarCelular();
	}

}

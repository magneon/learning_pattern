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
public class TelefoneFixoCelularAdapter implements TelefoneCelular {
	private TelefoneFixo telefoneFixo;
	
	public TelefoneFixoCelularAdapter(TelefoneFixo telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	@Override
	public boolean tocarTecla() {
		return this.telefoneFixo.pressionarTecla();
	}

	@Override
	public void discarComTecladoVirtual() {
		this.telefoneFixo.discarComTecladoFisico();
	}

	@Override
	public String atenderLigacao() {
		return this.telefoneFixo.atenderLigacaoTirandoDoGancho();
	}

	@Override
	public String tocarCelular() {
		return this.telefoneFixo.tocarTelefone();
	}

	@Override
	public boolean enviarSMS() throws UnsupportedOperationException {		
		throw new UnsupportedOperationException("Operação não disponível");
	}

	@Override
	public boolean enviarMMS() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não disponível");
	}

	@Override
	public boolean tirarFoto() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não disponível");
	}

}

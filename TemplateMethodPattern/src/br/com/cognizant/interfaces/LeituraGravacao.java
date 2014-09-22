/**
 * 
 */
package br.com.cognizant.interfaces;

import java.io.File;

/**
 * @author 414488
 *
 */
public abstract class LeituraGravacao {
	protected String path;
	
	protected String dadosParaGravacao;
	
	protected File arquivoParaLeitura;
	
	protected File arquivoParaGravacao;

	public final void finalizarLeituraGravacao() {
		obterArquivoParaLeitura(path);
		
		lerArquivo();
		
		gravarDadosNaSaida();
	}
	
	final void obterArquivoParaLeitura(final String path) {
		File arquivoParaLeitura = new File(path);
		
		if (verificarExistenciaDoArquivo(arquivoParaLeitura)) {
			setArquivoParaLeitura(arquivoParaLeitura);
		}
		
	}
	
	protected final Boolean verificarExistenciaDoArquivo(final File file) {
		if (!file.exists()) {
			return false;
		}
		
		return true;
	}
	
	protected abstract void lerArquivo();
	
	protected abstract void gravarDadosNaSaida();
	
	public final void setArquivoParaLeitura(File arquivoParaLeitura) {
		this.arquivoParaLeitura = arquivoParaLeitura;
	}
	
	public final File getArquivoParaLeitura() {
		return arquivoParaLeitura;
	}
	
}
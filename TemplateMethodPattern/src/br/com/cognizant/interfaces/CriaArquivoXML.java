/**
 * 
 */
package br.com.cognizant.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 414488
 *
 */
public class CriaArquivoXML extends LeituraGravacao {
	
	public CriaArquivoXML(final String caminhoDoArquivo) {
		this.path = caminhoDoArquivo;
	}

	@Override
	protected void lerArquivo() {
		try {
			
			BufferedReader leitor = new BufferedReader(new FileReader(arquivoParaLeitura));
			
			while (leitor.readLine() != null) {
				
			}
		} catch (FileNotFoundException fnfe) {

		} catch (IOException ioe) {
			
		}
	}

	@Override
	protected void gravarDadosNaSaida(final File arquivoParaGravacao) {

	}

}

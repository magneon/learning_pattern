package br.com.cognizant.interfaces.implementation.teste;

import java.util.Random;

import br.com.cognizant.interfaces.LeituraGravacao;
import br.com.cognizant.interfaces.implementation.CriaArquivoXML;
import br.com.interfaces.model.Concessionaria;

public class LeituraGravacaoTeste {
	public static void main(String[] args) {
		
		Random randomico = new Random();
		
		Concessionaria concessionaria = new Concessionaria();
		
		LeituraGravacao leituraGravacao = new CriaArquivoXML("C:\\arquivo_leitura.txt", "C:\\arquivo_"+randomico.nextLong()+".xml", concessionaria);
		leituraGravacao.finalizarLeituraGravacao();
	}
}

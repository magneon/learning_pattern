/**
 * 
 */
package br.com.cognizant.interfaces.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.cognizant.interfaces.LeituraGravacao;
import br.com.interfaces.model.Carro;
import br.com.interfaces.model.Concessionaria;

/**
 * @author 414488
 *
 */
public class CriaArquivoXML extends LeituraGravacao {
	private List<Carro> objetosConvertidos = new ArrayList<Carro>();
	
	private Object objetoParaConversao;
	
	public CriaArquivoXML(final String caminhoArquivoDeEntrada, final String caminhoArquivoSaida, final Object objetoParaConversao) {
		this.path = caminhoArquivoDeEntrada;
		this.arquivoParaGravacao = new File(caminhoArquivoSaida);
		this.objetoParaConversao = objetoParaConversao;
	}

	@Override
	protected void lerArquivo() {
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(arquivoParaLeitura));
			String linhaOriginal = null;
			while((linhaOriginal = leitor.readLine()) != null) {			
				objetosConvertidos.add(obterCarroDoArquivo(linhaOriginal));
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void gravarDadosNaSaida() {		
		Concessionaria concessionaria = preencherListaDeCarros(objetoParaConversao, objetosConvertidos);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(this.objetoParaConversao.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(concessionaria, arquivoParaGravacao);
		} catch (JAXBException jaxbe) {
			jaxbe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Concessionaria preencherListaDeCarros(final Object objetoParaConversao, final List<Carro> listaDeCarros) {
		if (objetoParaConversao instanceof Concessionaria) {
			Concessionaria concessionaria = (Concessionaria)objetoParaConversao;
			concessionaria.setListaDeCarros(listaDeCarros);
			return concessionaria;
		}
		
		return null;
	}
	
	private Carro obterCarroDoArquivo(final String linhaArquivo) {
		Carro carro = new Carro();
		
		String [] atributosDoCarro = linhaArquivo.split(";");
		
		preencherAtributosDoCarro(atributosDoCarro, carro);
		
		return carro;
	}
	
	private void preencherAtributosDoCarro(final String [] atributosDoCarro, final Carro carro) {
		preencherMarcaDoCarro(atributosDoCarro, carro);
		
		preencherModeloDoCarro(atributosDoCarro, carro);
		
		preencherCorDoCarro(atributosDoCarro, carro);
		
		preencherPrecoDoCarro(atributosDoCarro, carro);
		
		preencherQuantidadePortasDoCarro(atributosDoCarro, carro);
	}

	private void preencherQuantidadePortasDoCarro(final String[] atributosDoCarro, final Carro carro) {
		boolean naoEncontrei = true;
		
		while (naoEncontrei) {
			for (String atributo : atributosDoCarro) {
				if (atributo.contains("quantidadePortas")) {
					carro.setQuantidadePortas(Integer.parseInt(atributo.split("\\=")[1]));
					naoEncontrei = false;
					break;
				}
			}
		}
	}

	private void preencherPrecoDoCarro(final String[] atributosDoCarro, final Carro carro) {
		boolean naoEncontrei = true;
		
		while (naoEncontrei) {
			for (String atributo : atributosDoCarro) {
				if (atributo.contains("preco")) {
					carro.setPreco(Double.parseDouble(atributo.split("\\=")[1]));
					naoEncontrei = false;
					break;
				}
			}
		}
	}

	private void preencherCorDoCarro(final String[] atributosDoCarro, final Carro carro) {
		boolean naoEncontrei = true;
		
		while (naoEncontrei) {
			for(String atributo : atributosDoCarro) {
				if (atributo.contains("cor")) {
					carro.setCor(atributo.split("\\=")[1]);
					naoEncontrei = false;
					break;
				}
			}
		}
	}

	private void preencherModeloDoCarro(final String[] atributosDoCarro, final Carro carro) {
		boolean naoEncontrei = true;
		
		while (naoEncontrei) {
			for (String atributo : atributosDoCarro) {
				if (atributo.contains("modelo")) {
					carro.setModelo(atributo.split("\\=")[1]);
					naoEncontrei = false;
					break;
				}
			}
		}
	}

	private void preencherMarcaDoCarro(final String[] atributosDoCarro, final Carro carro) {
		boolean naoEncontrei = true;
		
		while(naoEncontrei) {
			for (String atributo : atributosDoCarro) {
				if (atributo.contains("marca")) {
					carro.setMarca(atributo.split("\\=")[1]);
					naoEncontrei = false;
					break;
				}
			}
		}
	}
}

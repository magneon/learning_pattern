package br.com.cognizant.statepattern.old;

import java.util.Random;

public class MaquinaDeGoma {

	private static final Integer ESGOTADO = 0;
	
	private static final Integer SEM_MOEDA = 1;
	
	private static final Integer COM_MOEDA = 2;
	
	private static final Integer VENDIDO = 3;
	
	/** Ao inserir um estado novo, é necessário mudar TODOS os métodos */
	private static final Integer VENCEDOR = 4;
	
	private Integer quantidadeDeGomas = 0;
	
	private Integer estado = ESGOTADO;
	
	public MaquinaDeGoma(final Integer quantidadeInicialDeGomas) {
		this.quantidadeDeGomas = quantidadeInicialDeGomas;
		
		this.estado = SEM_MOEDA;
	}
	
	public void inserirMoeda(){
		if (this.estado == ESGOTADO) {
			System.out.println("Não é possível inserir uma moeda. Máquina esgotada.");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("Recebendo moeda...");
			
			this.estado = COM_MOEDA;
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Não é possível inserir duas moedas...");
		} else if (this.estado == VENDIDO) {
			System.out.println("Aguarde até que a goma seja dispensada...");
		} /** Inclusão da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("Aguarde até que as gomas sejam dispensadas...");
		}
	}
	
	public void ejetarMoeda(){
		if (this.estado == ESGOTADO) {
			System.out.println("Não é possível devolver uma moeda que não foi inserida...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("Não é possível devolver uma moeda que não foi inserida...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Devolvendo moeda...");
			
			this.estado = SEM_MOEDA;
		} else if (this.estado == VENDIDO) {
			System.out.println("Não é possível devolver a moeda, pois a goma já foi entregue...");
		} /** Inclusão da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("Não é possível devolver a moeda, pois as gomas já estão à caminho...");
		}
	}
	
	public void puxarAlavanca(){
		if (this.estado == ESGOTADO) {
			System.out.println("Não é possível acionar a alavanca, pois a máquina está esgotada...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("Não é possível acionar a alavanca sem antes inserir uma moeda...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Acionando a alavanca...");
			
			/** Inclusão do jogo de 10% para uma nova goma */
			Random randomNum = new Random(System.currentTimeMillis());
			Integer vencedor = randomNum.nextInt(10);
			if ((vencedor == 0) && (this.quantidadeDeGomas > 1)) {
				this.estado = VENCEDOR;
				this.dispensarGoma();
			}
			
			this.estado = VENDIDO;
			this.dispensarGoma();
		} else if (this.estado == VENDIDO) {
			System.out.println("Aguarde... A goma está a caminho...");
		} /** Inclusão da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("Aguarde... A goma está a caminho...");
		}
	}
	
	public void dispensarGoma(){
		if (this.estado == ESGOTADO) {
			System.out.println("Não é possível dispensar uma goma, pois estas acabaram...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("Não é possível dispensar uma goma, pois não há moedas...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Aguarde... A goma está a caminho...");
		} else if (this.estado == VENDIDO) {
			System.out.println("A goma está sendo entregue...");
			this.quantidadeDeGomas = this.quantidadeDeGomas - 1;
			System.out.println("Quantidade atual de gomas: " + this.quantidadeDeGomas);
			if (this.quantidadeDeGomas > 0) {
				this.estado = SEM_MOEDA;
			} else {
				this.estado = ESGOTADO;
			}
		} /** Inclusão da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			this.quantidadeDeGomas = this.quantidadeDeGomas - 1;
			System.out.println("Parabéns! Você é o VENCEDOR, e receberá duas gomas ao invés de uma!");
		}
	}
	
	@Override
	public String toString() {
		if (this.estado == ESGOTADO) {
			return "ESGOTADO";
		} else if (this.estado == SEM_MOEDA) {
			return "SEM MOEDA";
		} else if (this.estado == COM_MOEDA) {
			return "COM MOEDA";
		} else if (this.estado == VENDIDO) {
			return "VENDIDO";
		} else if (this.estado == VENCEDOR){
			return "VENCEDOR";
		} else {
			return "";
		}
	}
	
}

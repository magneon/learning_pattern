package br.com.cognizant.statepattern.old;

import java.util.Random;

public class MaquinaDeGoma {

	private static final Integer ESGOTADO = 0;
	
	private static final Integer SEM_MOEDA = 1;
	
	private static final Integer COM_MOEDA = 2;
	
	private static final Integer VENDIDO = 3;
	
	/** Ao inserir um estado novo, � necess�rio mudar TODOS os m�todos */
	private static final Integer VENCEDOR = 4;
	
	private Integer quantidadeDeGomas = 0;
	
	private Integer estado = ESGOTADO;
	
	public MaquinaDeGoma(final Integer quantidadeInicialDeGomas) {
		this.quantidadeDeGomas = quantidadeInicialDeGomas;
		
		this.estado = SEM_MOEDA;
	}
	
	public void inserirMoeda(){
		if (this.estado == ESGOTADO) {
			System.out.println("N�o � poss�vel inserir uma moeda. M�quina esgotada.");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("Recebendo moeda...");
			
			this.estado = COM_MOEDA;
		} else if (this.estado == COM_MOEDA) {
			System.out.println("N�o � poss�vel inserir duas moedas...");
		} else if (this.estado == VENDIDO) {
			System.out.println("Aguarde at� que a goma seja dispensada...");
		} /** Inclus�o da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("Aguarde at� que as gomas sejam dispensadas...");
		}
	}
	
	public void ejetarMoeda(){
		if (this.estado == ESGOTADO) {
			System.out.println("N�o � poss�vel devolver uma moeda que n�o foi inserida...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("N�o � poss�vel devolver uma moeda que n�o foi inserida...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Devolvendo moeda...");
			
			this.estado = SEM_MOEDA;
		} else if (this.estado == VENDIDO) {
			System.out.println("N�o � poss�vel devolver a moeda, pois a goma j� foi entregue...");
		} /** Inclus�o da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("N�o � poss�vel devolver a moeda, pois as gomas j� est�o � caminho...");
		}
	}
	
	public void puxarAlavanca(){
		if (this.estado == ESGOTADO) {
			System.out.println("N�o � poss�vel acionar a alavanca, pois a m�quina est� esgotada...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("N�o � poss�vel acionar a alavanca sem antes inserir uma moeda...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Acionando a alavanca...");
			
			/** Inclus�o do jogo de 10% para uma nova goma */
			Random randomNum = new Random(System.currentTimeMillis());
			Integer vencedor = randomNum.nextInt(10);
			if ((vencedor == 0) && (this.quantidadeDeGomas > 1)) {
				this.estado = VENCEDOR;
				this.dispensarGoma();
			}
			
			this.estado = VENDIDO;
			this.dispensarGoma();
		} else if (this.estado == VENDIDO) {
			System.out.println("Aguarde... A goma est� a caminho...");
		} /** Inclus�o da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			System.out.println("Aguarde... A goma est� a caminho...");
		}
	}
	
	public void dispensarGoma(){
		if (this.estado == ESGOTADO) {
			System.out.println("N�o � poss�vel dispensar uma goma, pois estas acabaram...");
		} else if (this.estado == SEM_MOEDA) {
			System.out.println("N�o � poss�vel dispensar uma goma, pois n�o h� moedas...");
		} else if (this.estado == COM_MOEDA) {
			System.out.println("Aguarde... A goma est� a caminho...");
		} else if (this.estado == VENDIDO) {
			System.out.println("A goma est� sendo entregue...");
			this.quantidadeDeGomas = this.quantidadeDeGomas - 1;
			System.out.println("Quantidade atual de gomas: " + this.quantidadeDeGomas);
			if (this.quantidadeDeGomas > 0) {
				this.estado = SEM_MOEDA;
			} else {
				this.estado = ESGOTADO;
			}
		} /** Inclus�o da condicional do novo estado */ else if (this.estado == VENCEDOR) {
			this.quantidadeDeGomas = this.quantidadeDeGomas - 1;
			System.out.println("Parab�ns! Voc� � o VENCEDOR, e receber� duas gomas ao inv�s de uma!");
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

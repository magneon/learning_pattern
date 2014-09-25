package br.com.cognizant.operations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Extrato {
	
	public String consultarExtrato() {
		Random random = new Random();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("------------- EXTRATO -------------");
		sb.append("\n\n");
		
		for (int i = 0; i < 15; i++) {
			sb.append("[Lançamento " + i + "] " + df.format(new Date()) + " - VALOR: R$ " + random.nextDouble() + "\n");
		}
		
		return sb.toString();
	}
	
}

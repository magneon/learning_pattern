package br.com.cognizant.iterator;

import java.util.HashMap;
import java.util.Map;

public class MercadoTestDrive {
	
	public static void main(String[] args) {
		
		ItemDaCompra item1 = new ItemDaCompra();
		item1.setNome("Sabão em pó");
		item1.setPreco(3.90);
		
		ItemDaCompra item2 = new ItemDaCompra();
		item2.setNome("Pão");
		item2.setPreco(0.30);
		
		ItemDaCompra item3 = new ItemDaCompra();
		item3.setNome("Carne");
		item3.setPreco(9.90);
		
		Map<String, ItemDaCompra> listaDeCompras = new HashMap<String, ItemDaCompra>();
		listaDeCompras.put(item1.getNome(), item1);
		listaDeCompras.put(item2.getNome(), item2);
		listaDeCompras.put(item3.getNome(), item3);
		
		HashmapIterator hashMapIterator = new HashmapIterator(listaDeCompras);
		
		while (hashMapIterator.hasNext()) {
			System.out.println(hashMapIterator.next());
		}
		
	}
	
}

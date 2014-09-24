package br.com.cognizant.iterator;

import java.util.Map;

public class HashmapIterator implements Iterator{
	private Map<? extends Object, ? extends Object> myMap;
	private int position;
	
	public HashmapIterator(final Map<? extends Object, ? extends Object> hashMap) {
		this.myMap = hashMap;
	}

	@Override
	public boolean hasNext() {
		if (myMap.size() == position) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public Object next() {
		Object conteudo = myMap.keySet().toArray()[position];
		position += 1;
		return conteudo;
	}
	
}

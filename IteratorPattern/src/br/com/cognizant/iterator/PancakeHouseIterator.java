/**
 * 
 */
package br.com.cognizant.iterator;

import java.awt.MenuItem;
import java.util.Iterator;
import java.util.List;

/**
 * @author 414488
 *
 */
public class PancakeHouseIterator implements Iterator {
	private List<MenuItem> menuItems;
	private Integer position;
	
	public PancakeHouseIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position += 1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	};
	
	@Override
	public void remove() {}

}

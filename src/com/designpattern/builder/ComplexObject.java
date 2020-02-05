package com.designpattern.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.designpattern.builder.model.IProduct;

public class ComplexObject {
	
	private List<IProduct> children = new ArrayList<>();
	
	public String getParts() {
		Iterator<IProduct> iterator = children.iterator();
		String str = "ComplexObject made up of ";
		while (iterator.hasNext()) {
			str += iterator.next().getName() + " ";
		}
		return str;
	}
	
	public boolean add(IProduct product) {
		return children.add(product);
	}
	
	public Iterator<IProduct> iterator() {
		return children.iterator();
	}
}
